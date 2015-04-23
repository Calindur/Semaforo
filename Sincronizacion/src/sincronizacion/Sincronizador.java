package sincronizacion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sincronizador {
private String semaforoActivo;

public Sincronizador(){
semaforoActivo = null;
}

    public synchronized  void cambiarSemaforo(){
    this.notify();
    }
    
    public synchronized void activarSemaforo(String semaforo) throws InterruptedException{
        if(semaforoActivo == null){
            semaforoActivo = semaforo;
        } else {
            semaforoActivo = semaforo;
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Sincronizador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
