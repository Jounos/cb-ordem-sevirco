package br.com.central_bike.cb_ordem_servico.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Servicos")
public class Servico {

    @Id
    @Column(name = "servico_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private Double preco;

    @Column(name = "data_inclusao")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataInclusao;

    @Column(name = "data_exclusao")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataExclusao;
}
