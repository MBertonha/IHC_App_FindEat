package com.example.ihcfindeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaLogin(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaLogin.class);
        startActivity(intent1);
    }

    public void irParaCadastro(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaCadastrar.class);
        startActivity(intent1);
    }

    public void irParaListaRest(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaListaRest.class);
        startActivity(intent1);
    }
}
