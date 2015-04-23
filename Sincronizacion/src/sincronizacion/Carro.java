/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacion;

import java.awt.Color;
import java.awt.Point;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Mauricio
 */

public class Carro implements Runnable {
    JLabel carro;
    JPanelConFondo panel;
    
    public Carro (JPanelConFondo p){
        ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/auto24.png")).getImage());
        carro = new JLabel();
        //carro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        carro.setBounds(525, 700, 35 , 65);
        carro.setIcon(img);
        panel = p;
        p.add(carro);
        
    }
    
    public void run(){
    Point p = carro.getBounds().getLocation();
     while(p.y > -60){
         System.out.println(p.x + " " + p.y);
         carro.setBounds(p.x,p.y-=20, 35 , 65);
         carro.repaint();
         try {
             sleep(500);
         } catch (InterruptedException ex) {
             Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    }
}
