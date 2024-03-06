package com.agenda.agenda.Controller;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Evento {
    private Long id;
    private String descricao;
    private String data;
}