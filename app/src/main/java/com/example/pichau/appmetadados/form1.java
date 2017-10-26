package com.example.pichau.appmetadados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class form1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);
        Toast.makeText(getApplicationContext(),"Ao clicar em alguma pergunta a mesma aparecerá",Toast.LENGTH_LONG).show();
        Strings st = new Strings();
        final String um = st.getPergunta1();
        final String dois = st.getPergunta2();
        final String tres = st.getPergunta3();
        final String quatro = st.getPergunta4();

        TextView tv1 = (TextView) findViewById(R.id.textView1);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);

        Button b1 = (Button) findViewById(R.id.buttonSave);

        // Na ideia de clicar na pergunta lá no questinário e inicialmente aparecer a pergunta assim!!!
        // Por uma classe de strings que ele pegaria essas perguntas e mostraria em um Toast

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText q1 = (EditText) findViewById(R.id.editTextQ1);
                EditText q2 = (EditText) findViewById(R.id.editTextQ2);
                EditText q3 = (EditText) findViewById(R.id.editTextQ3);
                EditText q6 = (EditText) findViewById(R.id.editTextQ6);

                if(q1.getText()!=null&&q2.getText()!=null&&q3.getText()!=null&&q6.getText()!=null) {
                    Strings s1 = new Strings();
                    s1.resp1(Integer.parseInt(q1.toString()));
                    s1.resp2(q2.toString());
                    s1.resp3(Double.parseDouble(q3.toString()));
                    s1.resp4(q6.toString());
                    Intent teste = new Intent(form1.this,GraphClass.class);
                    startActivity(teste);
                } else {
                    Toast.makeText(getApplicationContext(),"Algum dos botões esta vazio ou foi preenchido erromeamente",Toast.LENGTH_SHORT).show();
                }



            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),um,Toast.LENGTH_LONG).show();
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),dois,Toast.LENGTH_LONG).show();
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),tres,Toast.LENGTH_LONG).show();
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),quatro,Toast.LENGTH_LONG).show();
            }
        });
    }
}
