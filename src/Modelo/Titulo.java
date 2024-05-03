package Modelo;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int tiempoDuracionEnMinutos;

    public String getTitulo() {
        return nombre;
    }

    public void setTitulo(String titulo) {
        nombre = titulo;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDuracionEnMinutos() {
        return tiempoDuracionEnMinutos;
    }

    public void setTiempoDuracionEnMinutos(int tiempoDuracionEnMinutos) {
        this.tiempoDuracionEnMinutos = tiempoDuracionEnMinutos;
    }
    public void muestraFichaTecnica(){
        System.out.println("***Ficha técnica***");
        System.out.println("Nombre de la película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración: " + tiempoDuracionEnMinutos + "minutos");


    }
}
