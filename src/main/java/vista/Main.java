package vista;

import Libraries.Arrays.ChainOfCharacter.ChainOfCharacter;
import controlador.UsuarioControlador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import com.toedter.calendar.*;
import controlador.EnumNacionalidad;
import controlador.EnumPreferencia;
import controlador.EnumSexo;
import java.awt.Frame;
import java.awt.Image;
import java.util.Date;
import javax.swing.JRadioButton;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * @author javiersolanop
 */
public class Main extends JFrame implements ActionListener{
    
    // Controllers:
    UsuarioControlador objUsuarioControlador = new UsuarioControlador();
    
    // Properties:
    private String[] atrNacionalidades;
    
    // Components:
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;
    private static final String PATH = "C:\\Users\\ROOT\\Documents\\NetBeansProjects\\registro-de-usuarios\\src\\main\\java\\images\\";
    private static final String PERFIL_DESCONOCIDO_ICON = PATH+"desconocido.png";
    private static final String PERFIL_MUJER_ICON = PATH+"mujer.png";
    private static final String PERFIL_HOMBRE_ICON = PATH+"hombre.png";
    private static final String MENSAJE_DESCRIPCION = " Ingrese su descripcion...";
    Etiqueta lblTitulo = new Etiqueta("Registro de Usuarios", "Arial", 20, 15, 10, 200, 25);
    
    Contenedor ctnDatosGenerales = new Contenedor("Datos generales", Color.GREEN, 10, 35, 340, 200);
    Contenedor ctnDatosOpcionales = new Contenedor("Datos opcionales", Color.GREEN, 10, 250, 340, 200);
    Contenedor ctnPerfil = new Contenedor("Perfil", PERFIL_DESCONOCIDO_ICON, 375, 35, 180, 160);
    Contenedor ctnPerfilMujer = new Contenedor("Perfil", PERFIL_MUJER_ICON, 375, 35, 180, 160);
    Contenedor ctnPerfilHombre = new Contenedor("Perfil", PERFIL_HOMBRE_ICON, 375, 35, 180, 160);
    
    Etiqueta lblNombres = new Etiqueta("Nombres:", "Arial", 15, 20, 60, 150, 20);
    Etiqueta lblApellidoPaterno = new Etiqueta("Apellido paterno:", "Arial", 15, 20, 85, 150, 20);    
    Etiqueta lblApellidoMaterno = new Etiqueta("Apellido materno:", "Arial", 15, 20, 110, 150, 20);
    Etiqueta lblFechaNacimiento = new Etiqueta("Fecha de nacimiento:", "Arial", 15, 20, 135, 150, 20);
    Etiqueta lblSexo = new Etiqueta("Sexo:", "Arial", 15, 20, 160, 150, 40);
    Etiqueta lblNacionalidad = new Etiqueta("Nacionalidad:", "Arial", 15, 20, 205, 150, 20); 
    Etiqueta lblDescripcion = new Etiqueta("Descripcion:", "Arial", 15, 20, 265, 150, 20); 
    Etiqueta lblPreferencias = new Etiqueta("Preferencias:", "Arial", 15, 175, 265, 150, 20);  
    
    Texto txtNombres = new Texto("NOMBRES", 170, 60, 170, 20);
    Texto txtApellidoPaterno = new Texto("APELLIDO PATERNO", 170, 85, 170, 20);
    Texto txtApellidoMaterno = new Texto("APELLIDO MATERNO", 170, 110, 170, 20);
    JDateChooser calFechaNacimiento = new JDateChooser();
    JRadioButton btnMasculino = new JRadioButton("Masculino");
    JRadioButton btnFemenino = new JRadioButton("Femenino");
    JComboBox<String>btnNacionalidad = new JComboBox<>();
    TextoArea txtDescripcion = new TextoArea(MENSAJE_DESCRIPCION, 20, 285, 150, 155);
    JList<String> btnPreferencias = new JList<>();
    JCheckBox btnMostrarPerfil = new JCheckBox("Mostrar perfil");
    JCheckBox btnMostrarFecha = new JCheckBox("Mostrar fecha nacimiento");
    JButton btnNuevoUsuario = new JButton("Nuevo Usuario");
    JButton btnGuardar = new JButton("Guardar");
    JButton btnSalir= new JButton("Salir");
    
    public Main()
    {
        super("Dueño: Javier Solano");
        setLayout(null);
        
        add(lblTitulo);
        
        add(ctnDatosGenerales);
        add(ctnDatosOpcionales);
        add(ctnPerfil);
        ctnPerfilMujer.setVisible(false);
        ctnPerfilHombre.setVisible(false);
        add(ctnPerfilMujer);
        add(ctnPerfilHombre);
        
        add(lblNombres);
        add(lblApellidoPaterno);
        add(lblApellidoMaterno);
        add(lblFechaNacimiento);
        add(lblSexo);
        add(lblNacionalidad);
        add(lblDescripcion);
        add(lblPreferencias);
        
        add(txtNombres);
        add(txtApellidoPaterno);
        add(txtApellidoMaterno);
        
        calFechaNacimiento.setBounds(170, 135, 170, 20);
        add(calFechaNacimiento);
        
        btnMasculino.setBounds(170, 160, 170, 20);
        add(btnMasculino);
        
        btnFemenino.setBounds(170, 180, 170, 20);
        add(btnFemenino);
        
        btnNacionalidad.setBounds(170, 200, 170, 30);
        obtenerNacionalidades();
        add(btnNacionalidad);
        add(txtDescripcion.getTextoArea());
        
        btnPreferencias.setBounds(180, 285, 150, 155);
        obtenerPreferencias();
        add(btnPreferencias);
        
        btnMostrarPerfil.setBounds(375, 200, 180, 15);
        btnMostrarPerfil.setSelected(true);
        add(btnMostrarPerfil);
        
        btnMostrarFecha.setBounds(375, 220, 180, 15);
        btnMostrarFecha.setSelected(true);
        add(btnMostrarFecha);
        
        btnNuevoUsuario.setBounds(375, 300, 180, 30);
        add(btnNuevoUsuario);
        
        btnGuardar.setBounds(375, 340, 180, 30);
        add(btnGuardar);
        
        btnSalir.setBounds(375, 380, 180, 30);
        add(btnSalir);
        
        btnFemenino.addActionListener(this);
        btnMasculino.addActionListener(this);
        btnMostrarPerfil.addActionListener(this);
        btnGuardar.addActionListener(this);
        btnNuevoUsuario.addActionListener(this);
        btnSalir.addActionListener(this);
        
        setSize(WIDTH, HEIGHT);
        setBackground(Color.blue);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.blue);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    
    private void obtenerNacionalidades()
    {
        for(EnumNacionalidad objNacionalidad: EnumNacionalidad.values())
            btnNacionalidad.addItem(objNacionalidad.name());
    }   
    
    private void obtenerPreferencias()
    {
        EnumPreferencia[] arrEnumPreferencias = EnumPreferencia.values();
        String[] arrPreferencias = new String[arrEnumPreferencias.length];
        
        arrPreferencias[0] = "Seleccione:";
        
        for(int i = 0; i < arrEnumPreferencias.length - 1; i++)
            arrPreferencias[i + 1] = arrEnumPreferencias[i].getName();
        btnPreferencias.setListData(arrPreferencias);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if((e.getSource() == btnFemenino) || (e.getSource() == btnMasculino) || (e.getSource() == btnMostrarPerfil)){
            
            if(e.getSource() == btnFemenino)
                objUsuarioControlador.setSexo(EnumSexo.Femenino);
            else
                objUsuarioControlador.setSexo(EnumSexo.Masculino);
            obtenerPerfil(e);
        }
        else if(e.getSource() == btnGuardar)
            guardar();
        else if(e.getSource() == btnNuevoUsuario)
            restablecerUsuario();
        else if(e.getSource() == btnSalir)
            salir();
    }
    
    private void obtenerPerfil(ActionEvent e)
    {
        if(e.getSource() == btnFemenino){
            btnMasculino.setSelected(false);
        }else if(e.getSource() == btnMasculino){
            btnFemenino.setSelected(false);
        }
        
        if(btnMostrarPerfil.isSelected()){
            ctnPerfil.setVisible(false);
            if(btnFemenino.isSelected()){
                ctnPerfilHombre.setVisible(false);
                ctnPerfilMujer.setVisible(true);
            }else if(btnMasculino.isSelected()){
                ctnPerfilMujer.setVisible(false);
                ctnPerfilHombre.setVisible(true);
            }
            if(!btnFemenino.isSelected() && !btnMasculino.isSelected()){
                ctnPerfilMujer.setVisible(false);
                ctnPerfilHombre.setVisible(false);
                ctnPerfil.setVisible(true);
            }
        }else{
            ctnPerfil.setVisible(true);
            ctnPerfilMujer.setVisible(false);
            ctnPerfilHombre.setVisible(false);
        }
    }
    
    private boolean validarDato(Texto txt)
    {
        if(!ChainOfCharacter.containsLetters(txt.getText())){
            txt.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Campo "+txt.getName()+" no valido!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        txt.setForeground(Color.BLACK);
        return true;
    }
    
    private boolean obtenerNombres()
    {
        if(!txtNombres.getText().isEmpty() && validarDato(txtNombres)){
            objUsuarioControlador.setNombres(txtNombres.getText());
            return true;
        }
        return false;   
    }
    
    private boolean obtenerApellidoPaterno()
    {
        if(!txtApellidoPaterno.getText().isEmpty() && validarDato(txtApellidoPaterno)){
            objUsuarioControlador.setApellidoPaterno(txtApellidoPaterno.getText());
            return true;
        }
        return false;
    }
    
    private boolean obtenerApellidoMaterno()
    {
        if(!txtApellidoMaterno.getText().isEmpty() && validarDato(txtApellidoMaterno)){
            objUsuarioControlador.setApellidoMaterno(txtApellidoMaterno.getText());
            return true;
        }
        return false;
    }
    
    private boolean obtenerFechaNacimiento()
    {
        if(calFechaNacimiento.getDate() != null){
            objUsuarioControlador.setFechaNacimiento(calFechaNacimiento.getDate());
            return true;
        }
        return false;
    }
    
    private boolean obtenerSexo()
    {
        if(btnFemenino.isSelected() || btnMasculino.isSelected()){
            
            if(btnFemenino.isSelected() && !btnMasculino.isSelected())
                objUsuarioControlador.setSexo(EnumSexo.Femenino);
            
            else if(btnMasculino.isSelected() && !btnFemenino.isSelected())
                objUsuarioControlador.setSexo(EnumSexo.Masculino);
            return true;
        }
        return false;
    }
    
    private boolean obtenerNacionalidad()
    {
        String varNacionalidad = (String)btnNacionalidad.getSelectedItem();
        
        for(EnumNacionalidad objNacionalidad: EnumNacionalidad.values()){
            
            if(objNacionalidad.name().equals(varNacionalidad)){
                objUsuarioControlador.setNacionalidad(objNacionalidad);
                return true;
            }
        }
        return false;
    }
    
    private void obtenerDescripcion()
    {
        if(!txtDescripcion.getText().isEmpty() && !txtDescripcion.getText().equals(MENSAJE_DESCRIPCION))
            objUsuarioControlador.setDescripcion(txtDescripcion.getText());
        else if(txtDescripcion.getText().equals(MENSAJE_DESCRIPCION))
            objUsuarioControlador.setDescripcion("NO TIENE");
    }
    
    private void obtenerPreferencia()
    {
        String varPreferencia = btnPreferencias.getSelectedValue();
        
        for(EnumPreferencia objPreferencia: EnumPreferencia.values()){
            
            if(objPreferencia.getName().equals(varPreferencia))
                objUsuarioControlador.setPreferencia(objPreferencia);
        }
    }
    
    private String obtenerInformacion()
    {
        return "NOMBRES: "+objUsuarioControlador.getNombres()+"\n"+
               "APELLIDO PATERNO: "+objUsuarioControlador.getApellidoPaterno()+"\n"+
               "APELLIDO MATERNO: "+objUsuarioControlador.getApellidoMaterno()+"\n"+
               "FECHA DE NACIMIENTO: "+((btnMostrarFecha.isSelected()) ? objUsuarioControlador.getFechaNacimiento() : "NO VISIBLE")+"\n"+
               "SEXO: "+objUsuarioControlador.getSexo().name()+"\n"+
               "NACIONALIDAD: "+objUsuarioControlador.getNacionalidad().name()+"\n"+
               "DESCRIPCION: "+objUsuarioControlador.getDescripcion()+"\n"+
               "PREFERENCIA: "+objUsuarioControlador.getPreferencia().getName()+"\n";
    }
    
    private void guardar()
    {
        if(obtenerNombres() &&
           obtenerApellidoPaterno() &&
           obtenerApellidoMaterno() &&
           obtenerFechaNacimiento() &&
           obtenerSexo() &&
           obtenerNacionalidad())
        {
            obtenerDescripcion();
            obtenerPreferencia();
            Image perfil = new ImageIcon(PERFIL_DESCONOCIDO_ICON).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            
            if(btnMostrarPerfil.isSelected()){
                
                if(btnFemenino.isSelected() && !btnMasculino.isSelected())
                    perfil = new ImageIcon(PERFIL_MUJER_ICON).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
                       
                else if(btnMasculino.isSelected() && !btnFemenino.isSelected())
                    perfil = new ImageIcon(PERFIL_HOMBRE_ICON).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            }
            JOptionPane.showMessageDialog(null, obtenerInformacion(), "Informacion del usuario", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(perfil));
        }
        else
            JOptionPane.showMessageDialog(null, "Los Datos Generales son obligatorios!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private void restablecerUsuario()
    {
        objUsuarioControlador = new UsuarioControlador();
        txtNombres.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        calFechaNacimiento.setDate(null);
        btnFemenino.setSelected(false);
        btnMasculino.setSelected(false);
        btnNacionalidad.resetKeyboardActions();
        txtDescripcion.setText(MENSAJE_DESCRIPCION);
        btnPreferencias.clearSelection();
        btnMostrarPerfil.setSelected(true);
        btnMostrarFecha.setSelected(true);
        ctnPerfilHombre.setVisible(false);
        ctnPerfilMujer.setVisible(false);
        ctnPerfil.setVisible(true);
    }
    
    private void salir()
    {
        System.exit(0);
    }
        
    public static void main(String[] args) {
        Main objMain = new Main();
    }    
}
