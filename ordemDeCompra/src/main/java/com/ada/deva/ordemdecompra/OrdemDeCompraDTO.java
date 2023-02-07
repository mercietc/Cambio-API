package com.ada.deva.ordemdecompra;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Random;

@Data
public class OrdemDeCompraDTO {
    private String id_compra;
    

    private String id_cliente;
    
    private String cpf_cliente;
    
    private String tipo_moeda;
    
    private Double valor_moeda_estrangeira;

    private Double valor_cotacao;
    private Double valor_total_operacao;
    private LocalDateTime dataSolicitacao;
    private String conta;


//    public OrdemDeCompraDTO(String id_compra, String id_cliente, String cpf_cliente, String tipo_moeda, Double valor_moeda_estrangeira, Double valor_cotacao, LocalDateTime dataSolicitacao, String numero_agencia_retirada) {
//    }
    public static OrdemDeCompraDTO of(OrdemDeCompra ordemDeCompra){
        OrdemDeCompraDTO dto = new OrdemDeCompraDTO();
        dto.setId_compra(ordemDeCompra.getId_compra());
        dto.setId_cliente(ordemDeCompra.getCpf_cliente());
        dto.setDataSolicitacao(ordemDeCompra.getDataSolicitacao());
        dto.setTipo_moeda(ordemDeCompra.getTipo_moeda());
        dto.setValor_cotacao(ordemDeCompra.getValor_cotacao());
        dto.setValor_moeda_estrangeira(ordemDeCompra.getValor_moeda_estrangeira());
        dto.setValor_total_operacao(ordemDeCompra.getValor_total_operacao());
        dto.setConta(ordemDeCompra.getConta());
        return dto;
    }

    public OrdemDeCompra toEntity(){
        OrdemDeCompra ordemDeCompra = new OrdemDeCompra();
        ordemDeCompra.setId_compra(id_compra);
        ordemDeCompra.setCpf_cliente(cpf_cliente);
        ordemDeCompra.setTipo_moeda(tipo_moeda);
        ordemDeCompra.setValor_moeda_estrangeira(valor_moeda_estrangeira);
        ordemDeCompra.setConta(conta);
        return ordemDeCompra;
    }

}
