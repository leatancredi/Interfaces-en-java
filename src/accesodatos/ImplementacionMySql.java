package accesodatos;

public class ImplementacionMySql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde mysql");
    }

    @Override
    public void listar() {
        System.out.println("listar desde mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde myasql");
    }
    
}
