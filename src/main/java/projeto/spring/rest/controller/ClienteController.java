package projeto.spring.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projeto.spring.Cliente;

@Controller
//@RequestMapping("/api/clientes")
// @RequestMapping define a url que tem acesso as rotas desse controller
public class ClienteController {

    @RequestMapping(
            value = {"/api/clientes/hello/{nome}", "/hello/{nome}"},
            method = RequestMethod.GET,
            consumes = {"application/jason", "application/xml"},
            produces = {"application/jason", "application/xml"}
    )
    @ResponseBody
    public String helloClientes(@PathVariable("nome") String nomeCliente, @RequestBody Cliente cliente){
        return String.format("hello  %s ", nomeCliente);
    }

}
