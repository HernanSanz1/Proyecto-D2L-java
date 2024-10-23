package d2l;

import java.util.Scanner;

public class Registro {
    private Estudiante Estudiante1; // Estudiante compartido

    // Constructor que recibe la instancia del estudiante
    public Registro(Estudiante Estudiante1) {
        this.Estudiante1 = Estudiante1;
    }

    public void validar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese nuevo codigo de estudiante:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese Nombre de estudiante:");
        String Nombre = scanner.nextLine();
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese Apellido de estudiante:");
        String Apellido = scanner.nextLine();
        
        // Setear los valores en el objeto estudiante
        Estudiante1.SetCodigo(codigo);
        Estudiante1.SetNombre(Nombre);
        Estudiante1.SetApellido(Apellido);
        
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Información del Estudiante");
        System.out.println("----------------------------------------------------------------");
        Estudiante1.detalle_estudiante(); // Mostrar los detalles del estudiante
        System.out.println();
        System.out.println("-------------------------------------------");

    }
    
}