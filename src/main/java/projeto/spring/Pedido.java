package projeto.spring;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

    private Integer id_Pedido;
    private Cliente id;
    private Carro id_Carro;
    private Grupo_carro id_Grupo;
    private LocalDate data_Aluguel;
    private LocalDate data_Devolucao;
    private BigDecimal valor_Diaria;
    private Byte validade;


    public Integer getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(Integer id_Pedido) {
        this.id = id;
    }

    public Cliente getId() {
        return id;
    }

    public void setId(Cliente id) {
        this.id = id;
    }

    public Carro getId_Carro() {
        return id_Carro;
    }

    public void setId_Carro(Carro id_Carro) {
        this.id_Carro = id_Carro;
    }

    public Grupo_carro getId_Grupo() {
        return id_Grupo;
    }

    public void setId_Grupo(Grupo_carro id_Grupo) {
        this.id_Grupo = id_Grupo;
    }

    public LocalDate getData_Aluguel() {
        return data_Aluguel;
    }

    public void setData_Aluguel(LocalDate data_Aluguel) {
        this.data_Aluguel = data_Aluguel;
    }

    public LocalDate getData_Devolucao() {
        return data_Devolucao;
    }

    public void setData_Devolucao(LocalDate data_Devolucao) {
        this.data_Devolucao = data_Devolucao;
    }

    public BigDecimal getValor_Diaria() {
        return valor_Diaria;
    }

    public void setValor_Diaria(BigDecimal valor_Diaria) {
        this.valor_Diaria = valor_Diaria;
    }

    public Byte getValidade() {
        return validade;
    }

    public void setValidade(Byte validade) {
        this.validade = validade;
    }
}
