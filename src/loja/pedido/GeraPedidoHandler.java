package loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import loja.orcamento.Orcamento;
import loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
    // construtor com injecao de dependencias: repository, service, etc.
    private List<AcaoAposGerarPedido> acaoAposGerarPedidos;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acaoAposGerarPedidos) {
        this.acaoAposGerarPedidos = acaoAposGerarPedidos;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acaoAposGerarPedidos.forEach(a -> a.executarAcao(pedido));
    }
}
