/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacion;

/**
 *
 * @author Mauricio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Sincronizador sincronizador = new Sincronizador();
       Semaforo sem1 =  new Semaforo("Semaforo","Principal",sincronizador);  //Semaforo principal hace referencia a los dos semaforos en principal
       Semaforo sem2 =  new Semaforo("Semaforo2","Secundaria",sincronizador); //Semaforo secundario hace referencia a los dos semaforos en via secundaria
      
       
       
       sem1.start();
       sem2.start();
    }
    
}
