package d2l;

import java.util.Scanner;

public class Plataforma {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante Estudiante1 = new Estudiante();
        Curso curso1 = new Curso(); 
        Curso curso2 = new Curso(); 
        Curso curso3 = new Curso(); 
        Curso curso4 = new Curso(); 
        Registro registro = new Registro(Estudiante1);
        Salida_de_cursos salida_de_cursos1 = new Salida_de_cursos(curso1,curso2,curso3,curso4); // Se pasa el estudiante al registro
        
        int salir = 3;

        while (salir == 3) {
            System.out.println("--------------------------------//------------------------------------------------//--------------------");
            System.out.println("Ingrese 1 si quiere registrarse // Ingrese 2 si quiere visulizar los estudiantes // Ingrese 0 para salir");
            System.out.println("--------------------------------//----------------------------------------------//----------------------");
            int numero = scanner.nextInt();
            
            if (numero == 1) {
                registro.validar(); 
            } else if (numero == 2) {
                Estudiante1.detalle_estudiante(); 
            } else if (numero == 0) {
                salir = 0; 
            }
        }
        System.out.println();
        int salir2 = 3;

        while (salir2 == 3) {
            System.out.println("--------------------------------//------------------------------------------------//--------------------");
            System.out.println("Ingrese 1 si agregar cursos al estudiante ingresado // Ingrese 2 si quiere visulizar los cursos del estudiante ingresado // Ingrese 0 para salir");
            System.out.println("--------------------------------//-----------------------------------------------//---------------------");
            int numero = scanner.nextInt();
            if (numero == 1) {
                int k=0;
                while(k!=4){
                    if(k==0){
                        System.out.println("-------------------------------------");
                        System.out.println("Ingrese el Nombre del curso");
                        scanner.nextLine();
                        String Nombre = scanner.nextLine();
                        curso1.SetNombre(Nombre);
                        System.out.println("Ingrese el Departamento del curso");
                        String Departamento = scanner.nextLine();
                        scanner.nextLine();
                        curso1.SetDepartamento(Departamento);
                        System.out.println("Ingrese el codigo del curso");
                        int codigo = scanner.nextInt();
                        curso1.Setcodigo(codigo);
                        System.out.println("Ingrese el credito del curso");
                        double C_credito = scanner.nextDouble();
                        curso1.SetC_credito(C_credito);
                        System.out.println("Ingrese la nota del curso (RECUERDE QUE EL VALOR DEBE DE ESTAR ENTRE 1,5 Y 5)");
                        double nota_de_curso = scanner.nextDouble();
                        curso1.Setnota_curso(nota_de_curso);
                        System.out.println("-------------------------------------"); 
                    }else if(k==1){
                        System.out.println("Ingrese el Nombre del curso");
                        scanner.nextLine();
                        String Nombre = scanner.nextLine();
                        curso2.SetNombre(Nombre);
                        System.out.println("Ingrese el Departamento del curso");
                        String Departamento = scanner.nextLine();
                        scanner.nextLine();
                        curso2.SetDepartamento(Departamento);
                        System.out.println("Ingrese el codigo del curso");
                        int codigo = scanner.nextInt();
                        curso2.Setcodigo(codigo);
                        System.out.println("Ingrese el credito del curso");
                        double C_credito = scanner.nextDouble();
                        curso2.SetC_credito(C_credito);
                        System.out.println("Ingrese la nota del curso (RECUERDE QUE EL VALOR DEBE DE ESTAR ENTRE 1,5 Y 5)");
                        double nota_de_curso = scanner.nextDouble();
                        curso2.Setnota_curso(nota_de_curso);
                        System.out.println("-------------------------------------"); 
                    }else if(k==2){
                        System.out.println("Ingrese el Nombre del curso");
                        scanner.nextLine();
                        String Nombre = scanner.nextLine();
                        curso3.SetNombre(Nombre);
                        System.out.println("Ingrese el Departamento del curso");
                        String Departamento = scanner.nextLine();
                        scanner.nextLine();
                        curso3.SetDepartamento(Departamento);
                        System.out.println("Ingrese el codigo del curso");
                        int codigo = scanner.nextInt();
                        curso3.Setcodigo(codigo);
                        System.out.println("Ingrese el credito del curso");
                        double C_credito = scanner.nextDouble();
                        curso3.SetC_credito(C_credito);
                        System.out.println("Ingrese la nota del curso (RECUERDE QUE EL VALOR DEBE DE ESTAR ENTRE 1,5 Y 5)");
                        double nota_de_curso = scanner.nextDouble();
                        curso3.Setnota_curso(nota_de_curso);
                        System.out.println("-------------------------------------"); 
                    }else if(k==3){
                        System.out.println("Ingrese el Nombre del curso");
                        scanner.nextLine();
                        String Nombre = scanner.nextLine();
                        curso4.SetNombre(Nombre);
                        System.out.println("Ingrese el Departamento del curso");
                        String Departamento = scanner.nextLine();
                        scanner.nextLine();
                        curso4.SetDepartamento(Departamento);
                        System.out.println("Ingrese el codigo del curso");
                        int codigo = scanner.nextInt();
                        curso4.Setcodigo(codigo);
                        System.out.println("Ingrese el credito del curso");
                        double C_credito = scanner.nextDouble();
                        curso4.SetC_credito(C_credito);
                        System.out.println("Ingrese la nota del curso (RECUERDE QUE EL VALOR DEBE DE ESTAR ENTRE 1,5 Y 5)");
                        double nota_de_curso = scanner.nextDouble();
                        curso4.Setnota_curso(nota_de_curso);
                        System.out.println("-------------------------------------"); 
                    }
                    k++;
                }


                System.out.println("-------------------------------------"); 

                double suma_ponderada = (curso1.Getnota_curso() * curso1.GetC_credito()) +
                (curso2.Getnota_curso() * curso2.GetC_credito()) +
                (curso3.Getnota_curso() * curso3.GetC_credito()) +
                (curso4.Getnota_curso() * curso4.GetC_credito());


                double total_creditos = curso1.GetC_credito() +
                curso2.GetC_credito() +
                curso3.GetC_credito() +
                curso4.GetC_credito();


                double promedio = suma_ponderada / total_creditos;                                                      

                if(promedio > 3.25){
                    System.out.println("EL PROMEDIO DEL ESTUDIANTE "  + Estudiante1.GetNombre() + "es : " + promedio);
                    System.out.println();
                    System.out.println("El estudiante esta en prueba academica");
                    System.out.println();
                }else if(promedio <= 4.75){
                    System.out.println("EL PROMEDIO DEL ESTUDIANTE "  + Estudiante1.GetNombre() + "es : " + promedio);
                    System.out.println();
                    System.out.println("El estudiante es candidato a beca");
                    System.out.println();
                }
            } else if (numero == 2) {
                int k=0;
                while(k!=4){
                    if(k==0){
                        salida_de_cursos1.salida_curso_1();
                    }else if(k==1){
                        salida_de_cursos1.salida_curso_2();
                    }else if(k==2){
                        salida_de_cursos1.salida_curso_3();
                    }else if(k==3){
                        salida_de_cursos1.salida_curso_4();
                    }
                    k++;
                }
            } else if (numero == 0) {
                salir2 = 0; // Termina el ciclo
            }
        }

        scanner.close();
    }
}