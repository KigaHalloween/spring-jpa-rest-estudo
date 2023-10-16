package projeto.spring.domain.repository;

import org.hibernate.secure.spi.JaccPermissionDeclarations;
import org.springframework.data.jpa.repository.JpaRepository;
import projeto.spring.Carro;

public interface Carros extends JpaRepository<Carro, Integer> {
}
