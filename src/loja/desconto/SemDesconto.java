package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
        // TODO Auto-generated constructor stub
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        // TODO Auto-generated method stub
        return true;
    }
}
