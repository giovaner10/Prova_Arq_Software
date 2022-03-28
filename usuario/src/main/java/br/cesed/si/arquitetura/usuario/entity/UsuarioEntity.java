package br.cesed.si.arquitetura.usuario.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class UsuarioEntity implements Serializable {
    @Id
    @Column(name = "CPF", nullable = false)
    private Long CPF;

    @Column(name = "Nome", nullable = false)
    private String nome;




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return CPF;
    }

    public void setId(Long id) {
        this.CPF = id;
    }
}
