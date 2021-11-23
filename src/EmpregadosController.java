package com.fatecrl.mvcdemo.controllers;

import com.fatecrl.mvcdemo.models.Empregado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmpregadosController {

    private List<Empregado> empregados = List.of(
            new Empregado("Caio Santos", "Secretário", "caio.santo@int.br", "Avenida Pedro Lessa 123"),
            new Empregado("Fernanda Souza", "Secretária", "fernanda.souza@int.br", "Avenida Ana Costa 568"),
            new Empregado("Amanda Ribeiro", "Almoxarifado", "amanda.ribeiro@int.br", "Avenida Pedro Lessa 444")
    );

    @GetMapping("/empregados")
    public List<Empregado> getEmpregados(){
        return empregados;
}
}