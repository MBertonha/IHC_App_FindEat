package com.example.ihcfindeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaAlterarCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_alterar_cadastro);
    }
    public void irParaRest1(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaRest1.class);
        startActivity(intent1);
    }

    public void irParaQuestionario(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaQuestionario.class);
        startActivity(intent1);
    }
    public void irParaMain(View view){
        Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent1);
    }
    public void irAlterarCadastro(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaAlterarCadastro.class);
        startActivity(intent1);
    }

    public void irParaListaRest(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaListaRest.class);
        startActivity(intent1);
    }
    public void irParaRestaurantesVisitados(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaRestaurantesVisitados.class);
        startActivity(intent1);
    }
}
