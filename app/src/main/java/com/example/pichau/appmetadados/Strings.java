package com.example.pichau.appmetadados;

import java.util.List;



public class Strings {

    private final String pergunta1 = "Quantos anos você tem?";
    private final String pergunta2 = "Qual a cor do seu cabelo?";
    private final String pergunta3 = "Qual sua altura?";
    private final String pergunta4 = "De qual bairro você é?";

    private List<Integer> respostas1;
    private List<String> respostas2;
    private List<Double> respostas3;
    private List<String> respostas4;


    //Listando e passando pra um vetor
    public Integer[] listarR1() {
        Integer[] listar1 = new Integer[respostas1.size()];
        for (int i = 0;i <= respostas1.size();i++) {
            listar1[i] = respostas1.indexOf(i);
        }
        return listar1;
    }


    //
    public Integer qtdList1() {
        Integer count = 0;
        for (Integer cont: respostas1 ) {
            count++;
        }
        return count;
    }

    public Integer qtdList2() {
        Integer count = 0;
        for (String cont: respostas2 ) {
            count++;
        }
        return count;
    }

    public Integer qtdList3() {
        Integer count = 0;
        for (Double cont: respostas3 ) {
            count++;
        }
        return count;
    }

    public Integer qtdList4() {
        Integer count = 0;
        for (String cont: respostas4 ) {
            count++;
        }
        return count;
    }

    public void resp1(Integer x) {
        respostas1.add(x);
    }
    public void resp2(String x) {
        respostas2.add(x);
    }
    public void resp3(Double x) {
        respostas3.add(x);
    }
    public void resp4(String x) {
        respostas4.add(x);
    }

    public String getPergunta1() {
        return pergunta1;
    }

    public String getPergunta2() {
        return pergunta2;
    }

    public String getPergunta3() {
        return pergunta3;
    }

    public String getPergunta4() {
        return pergunta4;
    }


}
