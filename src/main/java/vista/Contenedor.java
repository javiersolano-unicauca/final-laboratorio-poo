package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * @author javiersolanop
 */
public class Contenedor extends JPanel implements ActionListener{
    
    // Properties:
    private int width;
    private int height;
    private String IMAGE;
    
    // Constructors:
    public Contenedor(String prmTitulo, Color prmColor, int x, int y, int width, int height)
    {
        this.width = width;
        this.height = height;
        crearContenedor(prmTitulo, prmColor, x, y);
    }
    
    public Contenedor(String prmTitulo, String prmImagen, int x, int y, int width, int height)
    {
        this.width = width;
        this.height = height;
        crearContenedor(prmTitulo, x, y);
        IMAGE = prmImagen;
    }
    
    public Contenedor(String prmImagen, int x, int y, int width, int height)
    {
        IMAGE = prmImagen;
        this.width = width;
        this.height = height;
        this.setBounds(x, y, width, height);     
    }
    
    // Methods:
    private void crearContenedor(String prmTitulo, Color prmColor, int x, int y)
    {
        this.setBackground(prmColor);
        this.setBounds(x, y, width, height);
        this.setBorder(new TitledBorder(prmTitulo));
    }
    
    private void crearContenedor(String prmTitulo, int x, int y)
    {
        this.setBounds(x, y, width, height);
        this.setBorder(new TitledBorder(prmTitulo));
    }
    
    @Override
    public void paint(Graphics g){
        Image objImageIcon = new ImageIcon(IMAGE).getImage();
        g.drawImage(objImageIcon, 10, 10, width-20, height-20, this);
        setOpaque(false);
        super.paint(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Click");
    }

    
    
}
