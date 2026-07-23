package loja;

import java.math.BigDecimal;

import loja.desconto.CalculadoraDeDescontos;
import loja.orcamento.Orcamento;

public class TestesDesconto {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(primeiro));
        System.out.println(calculadoraDeDescontos.calcular(segundo));
    }
}
