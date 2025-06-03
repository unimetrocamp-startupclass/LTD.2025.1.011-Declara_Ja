package com.declaraja.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "autorizacoes")
public class Autorizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Usuario cliente;

    @ManyToOne
    @JoinColumn(name = "contador_id", nullable = false)
    private Usuario contador;

    @Enumerated(EnumType.STRING)
    @NotNull
    private StatusAutorizacao status;

    private LocalDateTime dataSolicitacao;

    private LocalDateTime dataResposta;

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public void setContador(Usuario contador) {
        this.contador = contador;
    }

    public void setStatus(StatusAutorizacao statusAutorizacao) {
        this.status = statusAutorizacao;
    }

    public StatusAutorizacao getStatus() {
        return this.status;
    }

    public Usuario getContador() {
        return this.contador;
    }

    public enum StatusAutorizacao {
        PENDENTE,
        APROVADO,
        REJEITADO
    }
}