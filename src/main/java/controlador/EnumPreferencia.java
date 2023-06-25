package controlador;

/**
 * @author javiersolanop
 */
public enum EnumPreferencia {
    Escuchar_Musica,
    Leer,
    Deportes,
    Otros,
    No_tiene;
    
    public String getName(){
        return name().replace("_", " ");
    }
}
