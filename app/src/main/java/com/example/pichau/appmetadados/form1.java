package com.example.pichau.appmetadados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        final String bt1 = st.getBotaoSalvar();

        TextView tv1 = (TextView) findViewById(R.id.textView1);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);

        Button b1 = (Button) findViewById(R.id.buttonSave);

        // Na ideia de clicar na pergunta lá no questinário e inicialmente aparecer a pergunta assim!!!
        // Por uma classe de strings que ele pegaria essas perguntas e mostraria em um Toast
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),bt1,Toast.LENGTH_SHORT).show();
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
