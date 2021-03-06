package br.com.dalcy.mundopc;

/**
 *
 * @author Dalcimar
 */
public class Computador {

    private final int idComputador;
    private  String nome;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private static int contadorComputadores;

    public Computador() {
        this.idComputador = ++Computador.contadorComputadores;
    }
    
    public Computador(String nome, Monitor monitor, Teclado teclado, Mouse mouse) {
        this();
        this.nome = nome;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public int getIdComputador() {
        return idComputador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computador{" + "idComputador=" + idComputador + ", nome=" + nome + ", monitor=" + monitor + ", teclado=" + teclado + ", mouse=" + mouse + '}';
    }
    
    
}
