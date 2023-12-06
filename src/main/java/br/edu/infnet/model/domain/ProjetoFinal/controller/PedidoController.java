package br.edu.infnet.model.domain.ProjetoFinal.controller;

import br.edu.infnet.model.domain.ProjetoFinal.model.Solicitante;
import br.edu.infnet.model.domain.ProjetoFinal.service.PedidoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Pedido")
public class PedidoController {

    private int num = 3;

    @Autowired
    PedidoService pedidoService;

    Logger logger = LoggerFactory.getLogger("PedidoController.class");

    @GetMapping
    public List<Solicitante> findAll() {
        logger.info("Metodo FindAll Solicitantes iniciado:");
        return pedidoService.findAll();
    }

    @PutMapping
    public void update() {
        logger.info("Metodo Alterar Solicitante iniciado:");
        Solicitante s =  new Solicitante("Diego","33333333333","Diego@teste4.com");
        pedidoService.update(3,s);
    }

    @DeleteMapping
    public void delete() {
        logger.info("Metodo Deletar Solicitante iniciado:");
        pedidoService.delete(1);

    }

    @PostMapping
    public void create(@RequestBody Solicitante solicitante) {
        logger.info("Metodo Cadastrar Solicitante iniciado:");
       // Solicitante s =  new Solicitante("Diego","33333333333","Diego@teste3.com");
        //  pedidoService.create(s);
        this.pedidoService.create(solicitante);
        num++;

    }

    //@GetMapping("{id}")
    //public void getById(@){}

}
