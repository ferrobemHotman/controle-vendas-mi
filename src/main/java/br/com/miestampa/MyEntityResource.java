package br.com.miestampa;

import br.com.miestampa.models.Cliente;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface MyEntityResource extends PanacheEntityResource<Cliente, Long> {
}