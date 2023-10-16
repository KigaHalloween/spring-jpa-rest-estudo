package projeto.spring.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.spring.Cliente;
import projeto.spring.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
    Iterable<Object> findByCliente(Cliente kiga);
}
