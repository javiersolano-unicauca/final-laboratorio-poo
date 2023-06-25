package controlador;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author javiersolanop
 */
public class UsuarioControlador {
    
    // Properties:
    private String atrNombres;
    private String atrApellidoPaterno;
    private String atrApellidoMaterno;
    private Date atrFechaNacimiento;
    private EnumSexo atrSexo;
    private EnumNacionalidad atrNacionalidad;
    private String atrDescripcion;
    private EnumPreferencia atrPreferencia;
    
    // Constructors:
    public UsuarioControlador()
    {
        atrNombres = "";
        atrApellidoPaterno = "";
        atrApellidoMaterno = "";
        atrFechaNacimiento = null;
        atrSexo = null;
        atrNacionalidad = null;
        atrDescripcion = "";
        atrPreferencia = EnumPreferencia.No_tiene;
    }
    
    public UsuarioControlador(String prmNombres, String prmApellidoPaterno, String prmApellidoMaterno,
                              Date prmFechaNacimiento, EnumSexo prmSexo, EnumNacionalidad prmNacionalidad)
    {
        atrNombres = prmNombres;
        atrApellidoPaterno = prmApellidoPaterno;
        atrApellidoMaterno = prmApellidoMaterno;
        atrFechaNacimiento = prmFechaNacimiento;
        atrSexo = prmSexo;
        atrNacionalidad = prmNacionalidad;
    }
    
    public UsuarioControlador(String prmNombres, String prmApellidoPaterno, String prmApellidoMaterno,
                              Date prmFechaNacimiento, EnumSexo prmSexo, EnumNacionalidad prmNacionalidad,
                              String prmDescripcion, EnumPreferencia prmPreferencia)
    {
        atrNombres = prmNombres;
        atrApellidoPaterno = prmApellidoPaterno;
        atrApellidoMaterno = prmApellidoMaterno;
        atrFechaNacimiento = prmFechaNacimiento;
        atrSexo = prmSexo;
        atrNacionalidad = prmNacionalidad;
        atrDescripcion = prmDescripcion;
        atrPreferencia = prmPreferencia;
    }
    
    // Methods 'setter' and 'getter':

    public String getNombres() {
        return atrNombres;
    }

    public void setNombres(String prmNombres) {
        this.atrNombres = prmNombres;
    }

    public String getApellidoPaterno() {
        return atrApellidoPaterno;
    }

    public void setApellidoPaterno(String prmApellidoPaterno) {
        this.atrApellidoPaterno = prmApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return atrApellidoMaterno;
    }

    public void setApellidoMaterno(String prmApellidoMaterno) {
        this.atrApellidoMaterno = prmApellidoMaterno;
    }

    public String getFechaNacimiento() {
        SimpleDateFormat objFormat = new SimpleDateFormat("dd/MM/yyyy");
        return objFormat.format(atrFechaNacimiento);
    }

    public void setFechaNacimiento(Date prmFechaNacimiento) {
        this.atrFechaNacimiento = prmFechaNacimiento;
    }

    public EnumSexo getSexo() {
        return atrSexo;
    }

    public void setSexo(EnumSexo prmSexo) {
        this.atrSexo = prmSexo;
    }

    public EnumNacionalidad getNacionalidad() {
        return atrNacionalidad;
    }

    public void setNacionalidad(EnumNacionalidad prmNacionalidad) {
        this.atrNacionalidad = prmNacionalidad;
    }

    public String getDescripcion() {
        return atrDescripcion;
    }

    public void setDescripcion(String prmDescripcion) {
        this.atrDescripcion = prmDescripcion;
    }

    public EnumPreferencia getPreferencia() {
        return atrPreferencia;
    }

    public void setPreferencia(EnumPreferencia prmPreferencia) {
        this.atrPreferencia = prmPreferencia;
    }
    
    @Override
    public String toString()
    {
        return "NOMBRES: "+atrNombres+"\n"+
               "APELLIDO PATERNO: "+atrApellidoPaterno+"\n"+
               "APELLIDO MATERNO: "+atrApellidoMaterno+"\n"+
               "FECHA DE NACIMIENTO: "+atrFechaNacimiento.toString()+"\n"+
               "SEXO: "+atrSexo.name()+"\n"+
               "NACIONALIDAD: "+atrNacionalidad.name()+"\n"+
               "DESCRIPCION: "+atrDescripcion+"\n"+
               "PREFERENCIA: "+atrPreferencia.getName()+"\n";
    }
}
