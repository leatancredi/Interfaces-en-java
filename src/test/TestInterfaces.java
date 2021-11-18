package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
       //se inicia la variable con la interface y el objeto no se puede crear mediante la interface
        IAccesoDatos  datos = new ImplementacionMySql();
//        datos.listar();
        datos = new ImplementacionOracle();
        //        datos.listar();
        imprimir(datos);
    }
     public static void imprimir(IAccesoDatos datos){
         datos.listar();
     }
}
