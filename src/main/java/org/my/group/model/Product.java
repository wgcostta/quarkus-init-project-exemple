package org.my.group.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

   @Id
   private Long Id;

   private String nome;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
