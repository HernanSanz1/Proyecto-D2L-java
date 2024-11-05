package d2l;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Registro {
    private Estudiante Estudiante1; // Estudiante compartido

    // Constructor que recibe la instancia del estudiante
    public Registro(Estudiante Estudiante1) {
        this.Estudiante1 = Estudiante1;
    }

    public void validar() {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese nuevo codigo de estudiante:");
        int codigo = Integer.parseInt(br.readLine());
        
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese Nombre de estudiante:");
        String Nombre = br.readLine(); 
        
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese Apellido de estudiante:");
        String Apellido = br.readLine();
        
        // Aquí puedes continuar con el procesamiento de los datos ingresados
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        
    } catch (IOException e) {
        System.err.println("Error de entrada/salida: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.err.println("El código ingresado no es un número válido.");
    } */
        Scanner scanner = new Scanner(System.in);
        /*String hola = JOptionPane.showInputDialog("Cual es tu nombre");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Cual es tu nombre"));
        JOptionPane.showMessageDialog(null,"El valor de numero es : " + numero,"TEXTO",2);*/
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese nuevo codigo de estudiante:");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese Nombre de estudiante:");
        String Nombre = scanner.nextLine();
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese Apellido de estudiante:");
        String Apellido = scanner.nextLine();
        //Setear los valores en el objeto estudiante
        Estudiante1.SetCodigo(codigo);
        Estudiante1.SetNombre(Nombre);
        Estudiante1.SetApellido(Apellido);
        
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Información del Estudiante");
        System.out.println("----------------------------------------------------------------");
        Estudiante1.detalle_estudiante(); // Mostrar los detalles del estudiante
        System.out.println("-------------------------------------------");
        System.out.println();

    }
    
}