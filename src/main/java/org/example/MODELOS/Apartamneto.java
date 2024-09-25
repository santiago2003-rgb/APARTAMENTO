package org.example.MODELOS;

public class Apartamneto {

    private Long id;
    private String nombreConstructora;
    private Double metroCuadrados;
    private int numeroHabitaciones;
    private String direccion;
    private Boolean tieneBalcon;
    private String barrio;

    public Apartamneto() {
    }

    public Apartamneto(Long id, String nombreConstructora, Double metroCuadrados, int numeroHabitaciones, String direccion, Boolean tieneBalcon, String barrio) {
        this.id = id;
        this.nombreConstructora = nombreConstructora;
        this.metroCuadrados = metroCuadrados;
        this.numeroHabitaciones = numeroHabitaciones;
        this.direccion = direccion;
        this.tieneBalcon = tieneBalcon;
        this.barrio = barrio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreConstructora() {
        return nombreConstructora;
    }

    public void setNombreConstructora(String nombreConstructora) {
        this.nombreConstructora = nombreConstructora;
    }

    public Double getMetroCuadrados() {
        return metroCuadrados;
    }

    public void setMetroCuadrados(Double metroCuadrados) {
        this.metroCuadrados = metroCuadrados;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getTieneBalcon() {
        return tieneBalcon;
    }

    public void setTieneBalcon(Boolean tieneBalcon) {
        this.tieneBalcon = tieneBalcon;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "Apartamneto{" +
                "id=" + id +
                ", nombreConstructora='" + nombreConstructora + '\'' +
                ", metroCuadrados=" + metroCuadrados +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", direccion='" + direccion + '\'' +
                ", tieneBalcon=" + tieneBalcon +
                ", barrio='" + barrio + '\'' +
                '}';
    }
}

