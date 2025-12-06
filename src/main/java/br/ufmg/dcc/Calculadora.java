package br.ufmg.dcc;

public class Calculadora {

    // BUG PROPOSITAL no método soma (quebra o teste)
    public int soma(int x, int y) {
        return x + y + 1; // bug proposital
    }

    public int subtrai(int x, int y) {
        return x - y;
    }
}
