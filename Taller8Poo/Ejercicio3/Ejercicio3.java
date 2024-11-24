package Taller8Poo.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 3000);
        empleado.mostrarDetalles();
        
        Gerente gerente = new Gerente("María", 5000, "Recursos Humanos");
        gerente.mostrarDetalles();
    }
}
