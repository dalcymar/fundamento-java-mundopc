
package br.com.dalcy.test;

import br.com.dalcy.mundopc.Computador;
import br.com.dalcy.mundopc.Monitor;
import br.com.dalcy.mundopc.Mouse;
import br.com.dalcy.mundopc.Pedido;
import br.com.dalcy.mundopc.Teclado;

/**
 *
 * @author Dalcimar
 */
public class MundoPc {
    public static void main(String[] args) {
    
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Mouse mouseHP = new Mouse("bluetooth", "HP");
        Computador computadorHP = new Computador("Computador HP", monitorHP, tecladoHP, mouseHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Mouse mouseGamer = new Mouse("bluetooth", "Gamer");
        Computador computadorGamer = new Computador("Computador Gamer", monitorGamer, tecladoGamer, mouseGamer);
        
        Pedido pedido1 = new Pedido();
        pedido1.agregarComputador(computadorHP);
        pedido1.agregarComputador(computadorGamer);
        
        pedido1.mostrarOrdem();
    }
}
