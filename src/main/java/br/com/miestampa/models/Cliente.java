package br.com.miestampa.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


public class Cliente extends PanacheEntity {

    private long id;
    private String nome;
    private String telefone;
    private String email;

}

