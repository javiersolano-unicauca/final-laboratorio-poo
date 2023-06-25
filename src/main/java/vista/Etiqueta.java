package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 * @author javiersolanop
 */
public class Etiqueta extends JLabel {
    
    // Constructors:
    public Etiqueta(String prmEtiqueta, String prmFont, int prmFontSize, int x, int y, int width, int height)
    {
        super(prmEtiqueta);
        setFont(new Font(prmFont, Font.PLAIN, prmFontSize));
        setBounds(x, y, width, height);
    }
    
    public Etiqueta(String prmEtiqueta, String prmFont, int prmFontSize, Color prmBorder, int x, int y, int width, int height)
    {
        super(prmEtiqueta);
        setFont(new Font(prmFont, Font.PLAIN, prmFontSize));
        setBounds(x, y, width, height);
        setBorder(BorderFactory.createLineBorder(prmBorder));
    }
    
}
