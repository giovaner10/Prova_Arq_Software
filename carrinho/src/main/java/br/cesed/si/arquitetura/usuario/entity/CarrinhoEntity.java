package br.cesed.si.arquitetura.usuario.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CarrinhoEntity implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Nome", nullable = false)
    private String nome;



}