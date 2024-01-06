package com.andrelgirao.microserviceclientsample.application.representation;

import com.andrelgirao.microserviceclientsample.domain.Cliente;
import lombok.Data;

@Data
public class ClienteInput {

    private String cpf;
    private String nome;
    private Integer idade;

    public Cliente toModel() {
        return new Cliente(cpf, nome, idade);
    }
}
