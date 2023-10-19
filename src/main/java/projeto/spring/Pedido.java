package projeto.spring;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id_pedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

   // @Column(name = "carro")
   // private Carro carro;
    @ManyToOne
    @JoinColumn(name="grupo_id")
    private Grupo_carro grupo_carro;
    @Column(name="Data_Aluguel")
    private LocalDate data_Aluguel;
    @Column(name="Data_Devolucao")
    private LocalDate data_Devolucao;
    @Column(name="Valor_diaria")
    private BigDecimal valor_Diaria;
    @Column(name="Diaria ")
    private Byte validade;


    public Integer getId_Pedido() {
        return id_pedido;
    }

    public void setId_Pedido(Integer id_Pedido) {
        this.id_pedido = id_Pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   /** public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
**/
    public Grupo_carro getGrupo() {return grupo_carro;}

    public void setGrupo(Grupo_carro grupo_carro) {
        this.grupo_carro = grupo_carro;
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

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", data_Aluguel=" + data_Aluguel +
                ", data_Devolucao=" + data_Devolucao +
                '}';
    }
}
