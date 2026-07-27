package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisdeCincoItens extends Desconto {
    public DescontoParaOrcamentoComMaisdeCincoItens(Desconto proximo) {
        super(proximo);
        // TODO Auto-generated constructor stub
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(0.1));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQtdItens() > 5;
    }
}
