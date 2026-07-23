package loja;

import java.math.BigDecimal;

import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ICMS;
import loja.orcamento.Orcamento;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("100"), 1);

        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(primeiro, new ICMS()));
    }
}
