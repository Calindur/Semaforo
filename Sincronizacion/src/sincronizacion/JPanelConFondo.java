package sincronizacion;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelConFondo extends JPanel {


	// Metodo que es llamado automaticamente por la maquina virtual Java cada vez que repinta
        @Override
	public void paintComponent(Graphics g) {
                Dimension tam =getSize();
                
                ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/Crucero.png")).getImage());
                g.drawImage(imagen.getImage(),0,0,tam.width, tam.height,null);
	}

}
