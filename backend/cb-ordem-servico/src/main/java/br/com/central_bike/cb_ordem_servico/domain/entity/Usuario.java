package br.com.central_bike.cb_ordem_servico.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Usuarios")
public class Usuario {

    @Id
    @Column(name = "usuario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "login")
    private String login;

    @Column(name = "senha")
    private String senha;

    @Column(name = "data_inclusao")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataInclusao;

    @Column(name = "data_exclusao")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataExclusao;
}

