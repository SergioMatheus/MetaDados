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
        barEntries.add(new BarEntry(44f, 0));
        barEntries.add(new BarEntry(80f, 1));
        barEntries.add(new BarEntry(60f, 2));
        barEntries.add(new BarEntry(20f, 3));
        barEntries.add(new BarEntry(70f, 4));

        BarDataSet barDataSet = new BarDataSet(barEntries, "Questões");

        ArrayList<String> questoes = new ArrayList<>();
        questoes.add("Questao 1");
        questoes.add("Questao 2");
        questoes.add("Questao 3");
        questoes.add("Questao 4");
        questoes.add("Questao 5");

        BarData theDates = new BarData(questoes,barDataSet);
        barChart.setData(theDates);
        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);
    }

}
