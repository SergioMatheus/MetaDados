package com.example.pichau.appmetadados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class visualizar_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_questionarios);

        Button b1 = (Button) findViewById(R.id.buttonModel1);
//        Button b2 = (Button) findViewById(R.id.buttonModel2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //form1
                Intent i = new Intent(visualizar_activity.this, GraphClass.class);
                startActivity(i);
            }
        });
    }
}
