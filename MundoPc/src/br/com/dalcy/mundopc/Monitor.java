package br.com.dalcy.mundopc;

/**
 *
 * @author Dalcimar
 */
public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamanho;
    private static int contadorMonitores;
    
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor (String marcar, double tamanho) {
        this();
        this.marca = marca;
        this.tamanho = tamanho;
    }
    
    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanho=" + tamanho + '}';
    }
    
}
