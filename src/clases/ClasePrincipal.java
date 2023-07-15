package clases;

public class ClasePrincipal {

    public static void main(String[] args) {
        //Clase principal, se llaman las clases creada
        ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
        mensajero.setSaldo(500);
        mensajero.Operaciones();
    }
}
