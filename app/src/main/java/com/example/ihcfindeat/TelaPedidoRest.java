package com.example.ihcfindeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaPedidoRest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pedido_rest);
    }

    public void irParaTelaRest(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaRestaurante.class);
        startActivity(intent1);
    }
}
