package projeto.spring.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import projeto.spring.Cliente;

import java.util.List;


public interface Clientes extends JpaRepository<Cliente, Integer> {

    @Query(value = "select * from cliente c where c.nome '%:nome%' ",nativeQuery = true)
    List<Cliente>encontrarPorNome( @Param("nome") String nome );

    @Query(" delete from Cliente c where c.nome =:nome ")
    @Modifying
    void deleteByNome(String nome);

    boolean existsByNome(String nome);

    List<Cliente> findByNomeLike(String nome);

    @Query("select c from cliente c left join fetch c.pedidos where c.id =:id ")
    Cliente findClienteFetchPedidos (@Param("id") Integer id);

}
