package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaOrcamentoComMaisdeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhetos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
