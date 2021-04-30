package lab2p2_cesarbrito;

public class Computadoras {

    private String modelo;
    private String numeroSerie;
    private int capacidadDisco;
    private double pantalla;
    private boolean tecladoNum;
    private String procesador;
    private String tarjetaGrafica;
    private String sistemaOper;
    private int tiempo;
    private int capacidadBateria;
    private double bateriaDuracion;

    public Computadoras() {
    }

    public Computadoras(String modelo, String numeroSerie, int capacidadDisco, double pantalla, boolean tecladoNum, String procesador, String tarjetaGrafica, String sistemaOper, int tiempo, int capacidadBateria, double bateriaDuracion) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.capacidadDisco = capacidadDisco;
        this.pantalla = pantalla;
        this.tecladoNum = tecladoNum;
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.sistemaOper = sistemaOper;
        this.tiempo = tiempo;
        this.capacidadBateria = capacidadBateria;
        this.bateriaDuracion = bateriaDuracion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isTecladoNum() {
        return tecladoNum;
    }

    public void setTecladoNum(boolean tecladoNum) {
        this.tecladoNum = tecladoNum;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getSistemaOper() {
        return sistemaOper;
    }

    public void setSistemaOper(String sistemaOper) {
        this.sistemaOper = sistemaOper;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getBateriaDuracion() {
        return bateriaDuracion;
    }

    public void setBateriaDuracion(double bateriaDuracion) {
        this.bateriaDuracion = bateriaDuracion;
    }

    @Override
    public String toString() {
        return "Modelo = " + modelo + ", Numero de Serie = " + numeroSerie + ", Capacidad del Disco Disco = " + capacidadDisco + "GB, Pantalla = " + pantalla
                + " pulg, Tiene teclado numerico = " + tecladoNum + ", Procesador = " + procesador + ", Tarjeta grafica = " + tarjetaGrafica + ", Sistema Operativo = " + sistemaOper + ", Tiempo para fabricarse = "
                + tiempo + ", Capacidad de bateria = " + capacidadBateria + "mA, La bateria dura = " + bateriaDuracion + " horas";
    }

}
