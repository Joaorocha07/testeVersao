package com.example.appescolarversaotres.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appescolarversaotres.R;
import com.example.appescolarversaotres.controller.DisciplinaController;
import com.example.appescolarversaotres.modal.Disciplina;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private DisciplinaController disciplinaController;

    private EditText edit_nomeDoAluno;
    boolean mediaCalculadaMatematica;

    // Matematica
    private EditText edit_primeiraNotaMatematica;
    private EditText edit_SegundaNotaMatematica;
    private EditText edit_TerceiraNotaMatematica;
    private EditText edit_QuartaNotaMatematica;
    Button btn_Calcular_Media_Matematica;
    ImageButton btn_Limpar_Notas_Matematica;

    // Portugues
    private EditText edit_primeiraNotaPortugues;
    private EditText edit_SegundaNotaPortugues;
    private EditText edit_TerceiraNotaPortugues;
    private EditText edit_QuartaNotaPortugues;

    // Geografia
    private EditText edit_primeiraNotaGeografia;
    private EditText edit_SegundaNotaGeografia;
    private EditText edit_TerceiraNotaGeografia;
    private EditText edit_QuartaNotaGeografia;

    // Historia
    private EditText edit_primeiraNotaHistoria;
    private EditText edit_SegundaNotaHistoria;
    private EditText edit_TerceiraNotaHistoria;
    private EditText edit_QuartaNotaHistoria;

    // Fisica
    private EditText edit_primeiraNotaFisica;
    private EditText edit_SegundaNotaFisica;
    private EditText edit_TerceiraNotaFisica;
    private EditText edit_QuartaNotaFisica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        disciplinaController = new DisciplinaController(this);

        Button btn_Salvar_Notas = findViewById(R.id.btn_salvar_todas_as_notas);
        btn_Salvar_Notas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarNotas();
            }
        });

        edit_nomeDoAluno = findViewById(R.id.editTextNomeDoAluno);

        // Matematica
        edit_primeiraNotaMatematica = findViewById(R.id.editTextMatematicaBimestre1);
        edit_SegundaNotaMatematica = findViewById(R.id.editTextMatematicaBimestre2);
        edit_TerceiraNotaMatematica = findViewById(R.id.editTextMatematicaBimestre3);
        edit_QuartaNotaMatematica = findViewById(R.id.editTextMatematicaBimestre4);

        // Portugues
        edit_primeiraNotaPortugues = findViewById(R.id.editTextPortuguesBimestre1);
        edit_SegundaNotaPortugues = findViewById(R.id.editTextPortuguesBimestre2);
        edit_TerceiraNotaPortugues = findViewById(R.id.editTextPortuguesBimestre3);
        edit_QuartaNotaPortugues = findViewById(R.id.editTextPortuguesBimestre4);

        // Geografia
        edit_primeiraNotaGeografia = findViewById(R.id.editTextGeografiaBimestre1);
        edit_SegundaNotaGeografia = findViewById(R.id.editTextGeografiaBimestre2);
        edit_TerceiraNotaGeografia = findViewById(R.id.editTextGeografiaBimestre3);
        edit_QuartaNotaGeografia = findViewById(R.id.editTextGeografiaBimestre4);

        // Historia
        edit_primeiraNotaHistoria = findViewById(R.id.editTextHistoriaBimestre1);
        edit_SegundaNotaHistoria = findViewById(R.id.editTextHistoriaBimestre2);
        edit_TerceiraNotaHistoria = findViewById(R.id.editTextHistoriaBimestre3);
        edit_QuartaNotaHistoria = findViewById(R.id.editTextHistoriaBimestre4);

        // Fisica
        edit_primeiraNotaFisica = findViewById(R.id.editTextFisicaBimestre1);
        edit_SegundaNotaFisica = findViewById(R.id.editTextFisicaBimestre2);
        edit_TerceiraNotaFisica = findViewById(R.id.editTextFisicaBimestre3);
        edit_QuartaNotaFisica = findViewById(R.id.editTextFisicaBimestre4);

        // Botão Calcular Matematica
        btn_Calcular_Media_Matematica = findViewById(R.id.btn_calcular_matematica);
        btn_Calcular_Media_Matematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primeiraNotaMatematica = edit_primeiraNotaMatematica.getText().toString();
                String segundaNotaMatematica = edit_SegundaNotaMatematica.getText().toString();
                String terceiraNotaMatematica = edit_TerceiraNotaMatematica.getText().toString();
                String quartaNotaMatematica = edit_QuartaNotaMatematica.getText().toString();

                if (primeiraNotaMatematica.isEmpty() || segundaNotaMatematica.isEmpty() || terceiraNotaMatematica.isEmpty() || quartaNotaMatematica.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {
                    double primeira = Double.parseDouble(primeiraNotaMatematica);
                    double segunda = Double.parseDouble(segundaNotaMatematica);
                    double terceira = Double.parseDouble(terceiraNotaMatematica);
                    double quarta = Double.parseDouble(quartaNotaMatematica);

                    double media = (primeira + segunda + terceira + quarta) / 4;

                    // Verificar se a média é um valor válido
                    if (Double.isFinite(media)) {
                        // Formatar a média com duas casas decimais
                        DecimalFormat decimalFormat = new DecimalFormat("#.##");
                        String mediaFormatada = decimalFormat.format(media);

                        // Exibir o resultado de aprovação/reprovação em um TextView
                        TextView textViewResultadoMatematica = findViewById(R.id.textViewResultadoMatematica);
                        if (media >= 60) {
                            textViewResultadoMatematica.setText("APROVADO");
                            textViewResultadoMatematica.setTextColor(getResources().getColor(R.color.verde));
                        } else {
                            textViewResultadoMatematica.setText("REPROVADO");
                            textViewResultadoMatematica.setTextColor(getResources().getColor(R.color.vermelho));
                        }

                        // Exibir a média em um TextView com a cor apropriada
                        TextView resultadoMediaMatematica = findViewById(R.id.resultadoMediaMatematica);
                        resultadoMediaMatematica.setText(mediaFormatada);
                        if (media < 60) {
                            resultadoMediaMatematica.setTextColor(getResources().getColor(R.color.vermelho));
                        } else {
                            resultadoMediaMatematica.setTextColor(getResources().getColor(R.color.verde));
                        }

                        // Definir o estado de cálculo da média como verdadeiro
                        mediaCalculadaMatematica = true;
                    } else {
                        Toast.makeText(MainActivity.this, "Por favor, insira um valor válido", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        // Botão Limpar Matematica
        btn_Limpar_Notas_Matematica = findViewById(R.id.btn_excluir_matematica);
        btn_Limpar_Notas_Matematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Notas Matematica Limpas", Toast.LENGTH_LONG).show();
                edit_primeiraNotaMatematica.setText("");
                edit_SegundaNotaMatematica.setText("");
                edit_TerceiraNotaMatematica.setText("");
                edit_QuartaNotaMatematica.setText("");

                TextView resultadoMediaMatematica = findViewById(R.id.resultadoMediaMatematica);
                TextView textViewResultadoMatematica = findViewById(R.id.textViewResultadoMatematica);
                resultadoMediaMatematica.setText("");
                textViewResultadoMatematica.setText("");
            }
        });
    }

    private void salvarNotas() {
        if (!mediaCalculadaMatematica) {
            Toast.makeText(MainActivity.this, "Calcule a média antes de salvar as notas", Toast.LENGTH_SHORT).show();
            return;
        }

        String nomeDoAluno = edit_nomeDoAluno.getText().toString();

        // Matematica
        String primeiraNotaMatematica = edit_primeiraNotaMatematica.getText().toString();
        String segundaNotaMatematica = edit_SegundaNotaMatematica.getText().toString();
        String terceiraNotaMatematica = edit_TerceiraNotaMatematica.getText().toString();
        String quartaNotaMatematica = edit_QuartaNotaMatematica.getText().toString();

        // Portugues
        String primeiraNotaPortugues = edit_primeiraNotaPortugues.getText().toString();
        String segundaNotaPortugues = edit_SegundaNotaPortugues.getText().toString();
        String terceiraNotaPortugues = edit_TerceiraNotaPortugues.getText().toString();
        String quartaNotaPortugues = edit_QuartaNotaPortugues.getText().toString();

        // Geografia
        String primeiraNotaGeografia = edit_primeiraNotaGeografia.getText().toString();
        String segundaNotaGeografia = edit_SegundaNotaGeografia.getText().toString();
        String terceiraNotaGeografia = edit_TerceiraNotaGeografia.getText().toString();
        String quartaNotaGeografia = edit_QuartaNotaGeografia.getText().toString();

        // Historia
        String primeiraNotaHistoria = edit_primeiraNotaHistoria.getText().toString();
        String segundaNotaHistoria = edit_SegundaNotaHistoria.getText().toString();
        String terceiraNotaHistoria = edit_TerceiraNotaHistoria.getText().toString();
        String quartaNotaHistoria = edit_QuartaNotaHistoria.getText().toString();

        // Fisica
        String primeiraNotaFisica = edit_primeiraNotaFisica.getText().toString();
        String segundaNotaFisica = edit_SegundaNotaFisica.getText().toString();
        String terceiraNotaFisica = edit_TerceiraNotaFisica.getText().toString();
        String quartaNotaFisica = edit_QuartaNotaFisica.getText().toString();

        // Matematica

        // Verifique se todos os campos estão preenchidos
        if (nomeDoAluno.isEmpty() || primeiraNotaMatematica.isEmpty() || segundaNotaMatematica.isEmpty()
                || terceiraNotaMatematica.isEmpty() || quartaNotaMatematica.isEmpty()) {
            Toast.makeText(MainActivity.this, "Preencha todos os campos de Matematica", Toast.LENGTH_SHORT).show();
            return;
        }

        double primeiraMatematica = Double.parseDouble(primeiraNotaMatematica);
        double segundaMatematica = Double.parseDouble(segundaNotaMatematica);
        double terceiraMatematica = Double.parseDouble(terceiraNotaMatematica);
        double quartaMatematica = Double.parseDouble(quartaNotaMatematica);

        // Salve as notas de Matemática
        Disciplina matematica = new Disciplina();
        matematica.setNomeDoAluno(nomeDoAluno);
        matematica.setMateria("Matemática");
        matematica.setNotaPrimeiroBimestre(primeiraNotaMatematica);
        matematica.setNotaSegundoBimestre(segundaNotaMatematica);
        matematica.setNotaTerceiroBimestre(terceiraNotaMatematica);
        matematica.setNotaQuartoBimestre(quartaNotaMatematica);

        double mediaMatematica = (primeiraMatematica + segundaMatematica + terceiraMatematica + quartaMatematica) / 4;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String mediaFormatadaMatematica = decimalFormat.format(mediaMatematica);

        matematica.setResultadoMedia(mediaFormatadaMatematica);

        disciplinaController.salvar(matematica);

        // Portugues

        // Verifique se todos os campos estão preenchidos
        if (nomeDoAluno.isEmpty() || primeiraNotaPortugues.isEmpty() || segundaNotaPortugues.isEmpty()
                || terceiraNotaPortugues.isEmpty() || quartaNotaPortugues.isEmpty()) {
            Toast.makeText(MainActivity.this, "Preencha todos os campos de Portugues", Toast.LENGTH_SHORT).show();
            return;
        }

        double primeiraPortugues = Double.parseDouble(primeiraNotaMatematica);
        double segundaPortugues = Double.parseDouble(segundaNotaMatematica);
        double terceiraPortugues = Double.parseDouble(terceiraNotaMatematica);
        double quartaPortugues = Double.parseDouble(quartaNotaMatematica);

        // Salve as notas de Português
        Disciplina portugues = new Disciplina();
        portugues.setNomeDoAluno(nomeDoAluno);
        portugues.setMateria("Português");
        portugues.setNotaPrimeiroBimestre(primeiraNotaPortugues);
        portugues.setNotaSegundoBimestre(segundaNotaPortugues);
        portugues.setNotaTerceiroBimestre(terceiraNotaPortugues);
        portugues.setNotaQuartoBimestre(quartaNotaPortugues);

        double mediaPortugues = (primeiraPortugues + segundaPortugues + terceiraPortugues + quartaPortugues) / 4;

        String mediaFormatadaPortugues = decimalFormat.format(mediaMatematica);

        matematica.setResultadoMedia(mediaFormatadaPortugues);

        disciplinaController.salvar(portugues);

        // Geografia
        // Verifique se todos os campos estão preenchidos
        if (nomeDoAluno.isEmpty() || primeiraNotaGeografia.isEmpty() || segundaNotaGeografia.isEmpty()
                || terceiraNotaGeografia.isEmpty() || quartaNotaGeografia.isEmpty()) {
            Toast.makeText(MainActivity.this, "Preencha todos os campos de Geografia", Toast.LENGTH_SHORT).show();
            return;
        }

        double primeiraGeografia = Double.parseDouble(primeiraNotaGeografia);
        double segundaGeografia = Double.parseDouble(segundaNotaGeografia);
        double terceiraGeografia = Double.parseDouble(terceiraNotaGeografia);
        double quartaGeografia = Double.parseDouble(quartaNotaGeografia);

        // Salve as notas de Geografia
        Disciplina geografia = new Disciplina();
        geografia.setNomeDoAluno(nomeDoAluno);
        geografia.setMateria("Geografia");
        geografia.setNotaPrimeiroBimestre(primeiraNotaGeografia);
        geografia.setNotaSegundoBimestre(segundaNotaGeografia);
        geografia.setNotaTerceiroBimestre(terceiraNotaGeografia);
        geografia.setNotaQuartoBimestre(quartaNotaGeografia);

        double mediaGeografia = (primeiraGeografia + segundaGeografia + terceiraGeografia + quartaGeografia) / 4;

        String mediaFormatadaGeografia = decimalFormat.format(mediaGeografia);

        geografia.setResultadoMedia(mediaFormatadaGeografia);

        disciplinaController.salvar(geografia);

        // Física
        // Verifique se todos os campos estão preenchidos
        if (nomeDoAluno.isEmpty() || primeiraNotaFisica.isEmpty() || segundaNotaFisica.isEmpty()
                || terceiraNotaFisica.isEmpty() || quartaNotaFisica.isEmpty()) {
            Toast.makeText(MainActivity.this, "Preencha todos os campos de Física", Toast.LENGTH_SHORT).show();
            return;
        }

        double primeiraFisica = Double.parseDouble(primeiraNotaFisica);
        double segundaFisica = Double.parseDouble(segundaNotaFisica);
        double terceiraFisica = Double.parseDouble(terceiraNotaFisica);
        double quartaFisica = Double.parseDouble(quartaNotaFisica);

        // Salve as notas de Física
        Disciplina fisica = new Disciplina();
        fisica.setNomeDoAluno(nomeDoAluno);
        fisica.setMateria("Física");
        fisica.setNotaPrimeiroBimestre(primeiraNotaFisica);
        fisica.setNotaSegundoBimestre(segundaNotaFisica);
        fisica.setNotaTerceiroBimestre(terceiraNotaFisica);
        fisica.setNotaQuartoBimestre(quartaNotaFisica);

        double mediaFisica = (primeiraFisica + segundaFisica + terceiraFisica + quartaFisica) / 4;

        String mediaFormatadaFisica = decimalFormat.format(mediaFisica);

        fisica.setResultadoMedia(mediaFormatadaFisica);

        disciplinaController.salvar(fisica);
        // Salve as notas de Geografia
        // Repita o processo para as outras disciplinas

        // Exiba uma mensagem de sucesso ou faça qualquer outra ação necessária
        Toast.makeText(MainActivity.this, "Notas salvas com sucesso", Toast.LENGTH_SHORT).show();
    }
}