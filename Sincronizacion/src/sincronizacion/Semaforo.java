/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauricio
 */
public class Semaforo extends Thread{
    private String color;
    private String tipo;
    private static Sincronizador sincronizador;
    
    public Semaforo(String nombre, String t, Sincronizador s){
    super(nombre);
    tipo = t;
    color = "Rojo";
    sincronizador = s;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                System.out.println("Se inicio " + this.getName());
                sincronizador.activarSemaforo( tipo );
                color = "Verde";
                System.out.println(this.getName() + " " + tipo + " Esta en " + color);
                sleep(1000*10);
                color = "Ambar";
                System.out.println(this.getName() + " " + tipo + " Esta en " + color);
                sleep(1000*5);
                color = "RojoYVuelta";
                System.out.println(this.getName() + " " + tipo + " Esta en " + color);
                sleep(1000*3);
                color = "Rojo";
                System.out.println(this.getName() + " " + tipo + " Esta en " + color);
                sincronizador.cambiarSemaforo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
