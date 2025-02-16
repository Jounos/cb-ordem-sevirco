package br.com.central_bike.cb_ordem_servico.domain.entity;

import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "notas")
public class Nota {

    @Id
    @Column(name = "nota_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "servico_prestado_id")
    private ServicoPrestado servicoPrestado;

    @ManyToOne
    @JoinColumn(name = "produto_vendido_id")
    private ProdutoVendido produtoVendido;

    @ManyToOne
    @JoinColumn(name = "colaborador_id")
    private Colaborador colaborador;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "data_inclusao")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataInclusao;
}
