package com.example.pichau.appmetadados;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

public class GraphClass extends AppCompatActivity {

    /*LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_layout);

        double x,y;
        x=5.0;

        GraphView graph = (GraphView) findViewById(R.id.graph);
        series = new LineGraphSeries<DataPoint>();
        for (int i=0; i<50; i++){
            x=x+1.0;
            y=Math.sin(x);
            series.appendData(new DataPoint(x , y), true, 50 );
        }
        graph.addSeries(series);*/
    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_layout);

        barChart = (BarChart) findViewById(R.id.bargraph);

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        Strings s1 = new Strings();
        Integer qtd = s1.qtdList1();
        Integer[] resps1 = s1.listarR1();

        // Tentativa de preenchimento com os valores de acordo com a primeira pergunta
        // Se der IndexOfArrayBound Excpt Pode ser pelo
        //     <= do FOR
        for (Integer i = 0; i <= resps1.length;i++ ) {
            barEntries.add(new BarEntry(Integer.parseInt("resps1[i]+f"),Integer.parseInt("[i]")));
        }

      /*
        Exemplos iniciais comentados
        barEntries.add(new BarEntry(44f, 0));
        barEntries.add(new BarEntry(80f, 1));
        barEntries.add(new BarEntry(60f, 2));
        barEntries.add(new BarEntry(20f, 3));
        barEntries.add(new BarEntry(70f, 4));
      */


        // Legenda do Gráfico
        BarDataSet barDataSet = new BarDataSet(barEntries, s1.getPergunta1());


        // Adicionando o passado para o Vetor - comentado em Strings
        // Se der IndexOfArrayBound Excpt Pode ser pelo
        //     <= do FOR
        ArrayList<String> questoes = new ArrayList<>();
        for (Integer i = 0; i <= resps1.length;i++ ) {
            questoes.add(resps1[i].toString());
        }


        BarData theDates = new BarData(questoes,barDataSet);
        barChart.setData(theDates);
        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);
    }

}
