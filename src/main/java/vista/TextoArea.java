package vista;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author javiersolanop
 */
public class TextoArea extends JTextArea {
    
    // Properties:
    JScrollPane atrTextoArea;
    
    // Constructors:
    public TextoArea(String prmEtiqueta, int x, int y, int width, int height)
    {
        super(prmEtiqueta);
        atrTextoArea = new JScrollPane(this);
        atrTextoArea.setBounds(x, y, width, height);
    }
    
    public TextoArea(String prmEtiqueta, int rows, int columns, int x, int y, int width, int height)
    {
        super(prmEtiqueta, rows, columns);
        atrTextoArea = new JScrollPane(this);
        atrTextoArea.setBounds(x, y, width, height);
    }
    
    public JScrollPane getTextoArea()
    {
        return atrTextoArea;
    }
}
