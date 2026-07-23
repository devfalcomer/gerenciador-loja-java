package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhetos extends Desconto {
    public DescontoParaOrcamentoComValorMaiorQueQuinhetos(Desconto proximo) {
        super(proximo);
        // TODO Auto-generated constructor stub
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal(0.05));
        }

        return proximo.calcular(orcamento);
    }
}
