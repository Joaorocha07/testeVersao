package com.example.myapplication.modal;

public class Matematica {
    private String nomeDoAluno;
    private String notaPrimeiroBimestre;
    private String notaSegundoBimestre;
    private String notaTerceiroBimestre;
    private String notaQuartoBimestre;
    private String resultadoMedia;

    public Matematica() {

    }

    public Matematica(String nomeDoAluno, String notaPrimeiroBimestre, String notaSegundoBimestre, String notaTerceiroBimestre, String notaQuartoBimestre, String resultadoMedia) {
        this.nomeDoAluno = nomeDoAluno;
        this.notaPrimeiroBimestre = notaPrimeiroBimestre;
        this.notaSegundoBimestre = notaSegundoBimestre;
        this.notaTerceiroBimestre = notaTerceiroBimestre;
        this.notaQuartoBimestre = notaQuartoBimestre;
        this.resultadoMedia = resultadoMedia;
    }

    public String getNotaPrimeiroBimestre() {
        return notaPrimeiroBimestre;
    }

    public void setNotaPrimeiroBimestre(String notaPrimeiroBimestre) {
        this.notaPrimeiroBimestre = notaPrimeiroBimestre;
    }

    public String getNotaSegundoBimestre() {
        return notaSegundoBimestre;
    }

    public void setNotaSegundoBimestre(String notaSegundoBimestre) {
        this.notaSegundoBimestre = notaSegundoBimestre;
    }

    public String getNotaTerceiroBimestre() {
        return notaTerceiroBimestre;
    }

    public void setNotaTerceiroBimestre(String notaTerceiroBimestre) {
        this.notaTerceiroBimestre = notaTerceiroBimestre;
    }

    public String getNotaQuartoBimestre() {
        return notaQuartoBimestre;
    }

    public void setNotaQuartoBimestre(String notaQuartoBimestre) {
        this.notaQuartoBimestre = notaQuartoBimestre;
    }

    public String getResultadoMedia() {
        return resultadoMedia;
    }

    public void setResultadoMedia(String resultadoMedia) {
        this.resultadoMedia = resultadoMedia;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }
}
