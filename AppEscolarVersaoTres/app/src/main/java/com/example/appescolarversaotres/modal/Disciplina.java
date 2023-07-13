package com.example.appescolarversaotres.modal;

public class Disciplina {
    private String nomeDoAluno;
    private String materia;
    private String notaPrimeiroBimestre;
    private String notaSegundoBimestre;
    private String notaTerceiroBimestre;
    private String notaQuartoBimestre;
    private String resultadoMedia;

    public Disciplina() {

    }
    public Disciplina(String nomeDoAluno, String materia, String notaPrimeiroBimestre, String notaSegundoBimestre, String notaTerceiroBimestre, String notaQuartoBimestre, String resultadoMedia) {
        this.nomeDoAluno = nomeDoAluno;
        this.materia = materia;
        this.notaPrimeiroBimestre = notaPrimeiroBimestre;
        this.notaSegundoBimestre = notaSegundoBimestre;
        this.notaTerceiroBimestre = notaTerceiroBimestre;
        this.notaQuartoBimestre = notaQuartoBimestre;
        this.resultadoMedia = resultadoMedia;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
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
}
