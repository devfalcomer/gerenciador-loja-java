package loja.imposto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}

/*
 * Por mais que o código esteja funcionando,
 * sempre que tiver um novo imposto terá que adicionar uma nova case
 * e isso vai deixar o código poluido então será aplicado o pattern Strategy
 * então criamos duas classes uma ICMS e ISS para receber esses calculos porem
 * ainda não está bom, então vamos criar uma interface para receber o mesmo
 * método com funções diferentes e agora não é mais necessario mexer na classe
 * principal
 * CalculadoraDeImpostos
 * O Strategy é utilizado quando já sabemos quais parametros serão utilizados
 */
