package com.studio.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "A persistência é o caminho do êxito. - Charles Chaplin",
            "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente. - Zig Ziglar",
            "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer. - Dwight Eisenhower",
            "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação. - Dalai Lama",
            "No meio da dificuldade encontra-se a oportunidade. - Albert Einstein",
            "Eu faço da dificuldade a minha motivação. A volta por cima vem na continuação. - Charlie Brown Jr",
            "A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento. - Frederick Herzberg",
            "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado. - Roberto Shinyashiki",
            "O que me preocupa não é o grito dos maus. É o silêncio dos bons. - Martin Luther King",
            "Imagine uma nova história para sua vida e acredite nela. - Paulo Coelho",
            "O insucesso é apenas uma oportunidade para recomeçar com mais inteligência. - Henry Ford",
            "Nossa maior fraqueza está em desistir. O caminho mais certo de vencer é tentar mais uma vez. - Thomas Edison"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                textoNovaFrase.setText(frases [numeroAleatorio]);
            }
        });

    }
}
