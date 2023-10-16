package projeto.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import projeto.spring.domain.repository.Clientes;
import projeto.spring.domain.repository.Pedidos;

import java.time.LocalDate;
import java.util.List;



@SpringBootApplication
public class vendasApplication {


    @Bean
    public CommandLineRunner init (
            @Autowired Clientes clientes,
            @Autowired Pedidos pedidos
    ){
        return  args -> {
            Cliente kiga = new Cliente("Kiga", "email@email.com", 1234);
            clientes.save(kiga);
            clientes.save(new Cliente("KigaHalloween", "email1@email.com", 12345));
            clientes.save(new Cliente("Andre", "email2@email.com", 12346));
            clientes.save(new Cliente("Felipe", "email3@email.com", 12347));

            Pedido p = new Pedido();
            p.setCliente(kiga);
            p.setData_Aluguel(LocalDate.now());
            p.setData_Devolucao(LocalDate.ofYearDay(2024,10));

            pedidos.save(p);

            Cliente cliente = clientes.findClienteFetchPedidos(kiga.getId());
            System.out.println(cliente);
            System.out.println(cliente.getPedidos());

            List<Cliente> todosClientes = clientes.findAll();
            todosClientes.forEach(System.out::println);

            System.out.println("Clientes Atualizados:");
                todosClientes.forEach(c -> {
                c.setNome(c.getNome() + " atualizado");
                c.setEmail(c.getEmail()+"genericoCliente@email.com");
                clientes.save(c);
            });

                todosClientes = clientes.findAll();
                todosClientes.forEach(System.out::println);

                System.out.println("Bucando clientes");
                clientes.findByNomeLike("kiga").forEach(System.out::println);

               clientes.findAll().forEach( c ->{
                  clientes.delete(c);
                });


            todosClientes = clientes.findAll();
            if(todosClientes.isEmpty()){
                System.out.println("Lista de clientes esta vazia.");
            }else {
                todosClientes.forEach(System.out::println);
            }
        };

    }

    public static void main(String[] args) {
        SpringApplication.run(vendasApplication.class, args);
    }
 }
