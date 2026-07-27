package loja.orcamento;

import java.math.BigDecimal;

import loja.orcamento.situacao.EmAnalise;
import loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
    private BigDecimal valor;
    private int qtdItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

}
