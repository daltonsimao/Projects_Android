package com.studio.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovoTexto;
    private Button botaoNovoTexto;
    private String[] frases = {
            "Proverbios 3:5 - Confie em Jeová de todo o seu coração",
            "Apocalipse 21:4 - Não haverá mais morte, nem haverá mais tristeza, nem choro, nem dor. As coisas anteriores já passaram.",
            "2Timoteo 3:16 - Toda a escritura é inspirada por Deus e proveitosa para ensinar, para repreender e indireitar as coisas",
            "Tiago 1:17 - Toda boa dádiva e todo presente perfeito vem de cima, desce do Pai das luzes celestes",
            "Proverbios 15:1 -Uma resposta branda acalma o furor"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovoTexto = (TextView) findViewById(R.id.textoNovoTextoId);
        botaoNovoTexto = (Button) findViewById(R.id.botaoNovoTextoId);


        botaoNovoTexto.setOnClickListener(new View.OnClickListener() {  //criando evento click
            @Override
            public void onClick(View view) {
                Random randomico = new Random(); //instanciando classe Random
                int numeroAleatorio = randomico.nextInt(frases.length);//lenght lê o tamanho da array

                textoNovoTexto.setText(frases[numeroAleatorio]);//vai mostrar frases de acordo com tamanho da array, nesse caso 3 frases
            }
        });
    }
}