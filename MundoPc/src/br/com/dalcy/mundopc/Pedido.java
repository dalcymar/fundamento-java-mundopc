package br.com.dalcy.mundopc;

/**
 *
 * @author Dalcimar
 */
public class Pedido {

    private final int idPedido;
    private Computador computadores[];
    private static int contadorPedidos;
    private static final int MAX_COMPUTADORES = 10;
    private int contadorComputadores;
    
    public Pedido() {
        this.idPedido = ++Pedido.contadorPedidos;
        this.computadores = new Computador[Pedido.MAX_COMPUTADORES];
    }
    
    public void agregarComputador(Computador computador) {
        if(this.contadorComputadores < Pedido.MAX_COMPUTADORES) {
            this.computadores[this.contadorComputadores++] = computador;
        } else {
            System.out.println("Você ultrapassou o limite" + Pedido.MAX_COMPUTADORES);
        }
    }
    
    public void mostrarOrdem(){
        System.out.println("Ordem #: " + this.idPedido);
        System.out.println("Encomenda de Computadores #: " + this.idPedido);
        for(int i = 0; i < this.contadorComputadores; i++) {
            System.out.println(this.computadores[i]);
        }
    }
}
