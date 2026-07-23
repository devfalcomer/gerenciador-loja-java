package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisdeCincoItens extends Desconto {
    public DescontoParaOrcamentoComMaisdeCincoItens(Desconto proximo) {
        super(proximo);
        // TODO Auto-generated constructor stub
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQtdItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal(0.1));
        }

        return proximo.calcular(orcamento);
    }
}
