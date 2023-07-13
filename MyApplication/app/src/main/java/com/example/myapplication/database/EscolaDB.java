package com.example.myapplication.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.myapplication.modal.Matematica;

public class EscolaDB extends SQLiteOpenHelper {
    private static final String DB_NAME = "escola.db";
    private static final int DB_VERSION = 1;

    Cursor cursor;

    SQLiteDatabase db;

    public EscolaDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
    }

    public void onCreate(SQLiteDatabase db) {
        String sqlTabelaMatematica = "CREATE TABLE Matematica (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nomeAluno TEXT," +
                "notaMatematicaPrimeiroBimestre FLOAT, " +
                "notaMatematicaSegundoBimestre FLOAT," +
                "notaMatematicaTerceiroBimestre FLOAT," +
                "notaMatematicaQuartoBimestre FLOAT," +
                "resultado TEXT)";
        db.execSQL(sqlTabelaMatematica);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    // Matematica
    public void salvar(Matematica notaMatematica) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("nomeAluno", notaMatematica.getNomeDoAluno());
        dados.put("notaMatematicaPrimeiroBimestre", notaMatematica.getNotaPrimeiroBimestre());
        dados.put("notaMatematicaSegundoBimestre", notaMatematica.getNotaSegundoBimestre());
        dados.put("notaMatematicaTerceiroBimestre", notaMatematica.getNotaTerceiroBimestre());
        dados.put("notaMatematicaQuartoBimestre", notaMatematica.getNotaQuartoBimestre());
        dados.put("resultado", notaMatematica.getResultadoMedia());

        db.insert("Escola", null, dados);
    }

}
