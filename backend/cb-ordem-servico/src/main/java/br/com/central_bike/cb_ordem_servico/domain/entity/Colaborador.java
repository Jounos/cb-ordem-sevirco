package br.com.central_bike.cb_ordem_servico.domain.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Colaboradores")
public class Colaborador {

    @Id
    @Column(name = "colaborador_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data_admissao")
    @Temporal(TemporalType.DATE)
    private LocalDate dataAdmissao;

    @Column(name = "salario")
    private Double salario;

    @Column(name = "data_rescisao")
    @Temporal(TemporalType.DATE)
    private LocalDate dataRescisao;

    @Column(name = "data_inclusao")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataInclusao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id", referencedColumnName = "pessoa_id")
    private Pessoa pessoa;
}
