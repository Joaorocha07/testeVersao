package com.example.appescolarversaotres.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class EscolaDB extends SQLiteOpenHelper {
    private static final String NOME_BANCO = "escola.db";
    private static final int VERSAO_BANCO = 1;

    public EscolaDB(Context context) {
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Escola (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nomeAluno TEXT," +
                "materia TEXT," +
                "notaPrimeiroBimestre TEXT," +
                "notaSegundoBimestre TEXT," +
                "notaTerceiroBimestre TEXT," +
                "notaQuartoBimestre TEXT," +
                "resultado TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Escola");
        onCreate(db);
    }
}
