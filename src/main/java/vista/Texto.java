package vista;

import javax.swing.JTextField;

/**
 * @author javiersolanop
 */
public class Texto extends JTextField {
    
    private String atrName;
    
    // Constructors:
    public Texto(String prmName, int x, int y, int width, int height)
    {
        super();
        atrName = prmName;
        setBounds(x, y, width, height);
    }
    
    @Override
    public String getName()
    {
        return atrName;
    }
    
}
