package vista;

import javax.swing.JTextField;

/**
 * @author javiersolanop
 */
public class Texto extends JTextField {
    
    // Constructors:
    public Texto(String prmTexto, int x, int y, int width, int height)
    {
        super(prmTexto);
        setBounds(x, y, width, height);
    }
    
}
