package com.example.myapplication.controller;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.myapplication.database.EscolaDB;
import com.example.myapplication.modal.Matematica;
import com.example.myapplication.view.MainActivity;

public class MatematicaController extends EscolaDB {
    private EscolaDB escolaDB;

    public MatematicaController(MainActivity activity) {
        super(activity);
        escolaDB = new EscolaDB(activity);
    }

    @SuppressLint("LongLogTag")
    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_ControllerMatematica", "ControllerMatematica Iniciado");
        return super.toString();
    }

    public void salvar(Matematica notaMatematica) {
        ContentValues dados = new ContentValues();

        dados.put("nomeAluno", notaMatematica.getNomeDoAluno());
        dados.put("materia", "Matematica");
        dados.put("notaMatematicaPrimeiroBimestre", notaMatematica.getNotaPrimeiroBimestre());
        dados.put("notaMatematicaSegundoBimestre", notaMatematica.getNotaSegundoBimestre());
        dados.put("notaMatematicaTerceiroBimestre", notaMatematica.getNotaTerceiroBimestre());
        dados.put("notaMatematicaQuartoBimestre", notaMatematica.getNotaQuartoBimestre());
        dados.put("resultado", notaMatematica.getResultadoMedia());

        SQLiteDatabase db = escolaDB.getWritableDatabase();
        db.insert("Escola", null, dados);
        db.close();
    }
}
