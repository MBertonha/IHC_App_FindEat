package com.example.ihcfindeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaRestaurante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_restaurante);
    }

    public void irParaMain(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaListaRest.class);
        startActivity(intent1);
    }
    public void irParaFotos(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaFotos.class);
        startActivity(intent1);
    }

    public void irParaPedidosRest(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaPedidoRest.class);
        startActivity(intent1);
    }

    public void irParaComentarios(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaComentarios.class);
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
