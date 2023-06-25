/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ROOT
 */
public class Perfil extends ImageIcon {
    
    // Properties:
    private static String LOCATION;
    
    // Constructors:
    public Perfil(String location)
    {
        super(location);
        LOCATION = location;
    }

}
