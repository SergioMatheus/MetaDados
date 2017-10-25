package com.example.pichau.appmetadados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botao = (Button)findViewById(R.id.button2);
        Button botao2=(Button)findViewById(R.id.button3);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CriaQuestionarios.class);
                startActivity(i);
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, visualizar_activity.class);
                startActivity(i);
            }
        });
    }

    public void msg (View v) {
        Toast t = Toast.makeText(getApplicationContext(),"Utilize ou responda questionários disponíveis",Toast.LENGTH_SHORT);
        t.show();
    }

}
