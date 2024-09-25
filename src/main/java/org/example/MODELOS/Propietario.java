package org.example.MODELOS;

import java.time.LocalDate;

public class Propietario {

    private Long id;
    private String nombreCompleto;
    private String telefono;
    private String direccionResidencia;
    private String cuentaBancaria;
    private LocalDate fechaRegistro;
    private String estado;

    public Propietario() {
    }

    public Propietario(Long id, String nombreCompleto, String telefono, String direccionResidencia, String cuentaBancaria, LocalDate fechaRegistro, String estado) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.direccionResidencia = direccionResidencia;
        this.cuentaBancaria = cuentaBancaria;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
