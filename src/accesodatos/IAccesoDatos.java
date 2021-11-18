package accesodatos;

public interface IAccesoDatos {
    //las interfaces no hereda de la clase object.
    //Los atributos en las interfaces son declarados como constantes
    // siempre hay que daele un valr al atributo
    int MAX_REGISTROS = 10;
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
    
    
}
