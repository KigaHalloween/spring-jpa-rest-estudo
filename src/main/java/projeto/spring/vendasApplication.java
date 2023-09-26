package projeto.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import projeto.spring.domain.repositorio.Clientes;

import java.util.List;



@SpringBootApplication
public class vendasApplication {


    @Bean
    public CommandLineRunner init (@Autowired Clientes clientes){
        return  args -> {
            clientes.salvar(new Cliente("Kiga", "email@email.com", 1234));
            clientes.salvar(new Cliente("KigaHalloween", "email1@email.com", 12345));
            clientes.salvar(new Cliente("Andre", "email2@email.com", 12346));
            clientes.salvar(new Cliente("Felipe", "email3@email.com", 12347));

            List<Cliente> todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);
/**
            List<Cliente> todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);

            todosClientes.forEach(c -> {
                c.setNome(c.getNome() + " atualizado");
                c.setEmail(c.getEmail()+"genericoCliente@email.com");
                clientes.atualizar(c);
            });

 //               clientes.obterTodos().forEach( c ->{
 //                  clientes.deletar(c);
 //               });


            todosClientes = clientes.obterTodos();
            if(todosClientes.isEmpty()){
                System.out.println("Lista de clientes esta vazia.");
            }else {
                todosClientes.forEach(System.out::println);
            }
            clientes.buscarPorNome("Ha").forEach(System.out::println);
 **/};

    }

    public static void main(String[] args) {
        SpringApplication.run(vendasApplication.class, args);
    }
 }
