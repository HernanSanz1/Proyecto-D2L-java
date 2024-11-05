package d2l;

public class Salida_de_cursos {
    private Curso curso1;
    private Curso curso2;
    private Curso curso3;
    private Curso curso4;

    public Salida_de_cursos(Curso curso1,Curso curso2,Curso curso3,Curso curso4){
        this.curso1= curso1;
        this.curso2= curso2;
        this.curso3= curso3;
        this.curso4= curso4;
    }

    public void salida_curso_1(){
        System.out.println("-------------------------------------------");
        System.out.println("Detalle del curso 1");
        System.out.println("-------------------------------------------");
        System.out.println("El nombre del curso 1 : " + curso1.GetNombre());
        System.out.println("El Departamento del curso 1 : " + curso1.GetDepartamento());
        System.out.println("El codigo del curso 1 : " + curso1.Getcodigo());
        System.out.println("La nota del curso 1 : " + curso1.Getnota_curso());
        System.out.println("-------------------------------------------");
    }

    public void salida_curso_2(){
        System.out.println("Detalle del curso 2");
        System.out.println("-------------------------------------------");
        System.out.println("El nombre del curso 2 : " + curso2.GetNombre());
        System.out.println("El Departamento del curso 2 : " + curso2.GetDepartamento());
        System.out.println("El codigo del curso 2 : " + curso2.Getcodigo());
        System.out.println("La nota del curso 2 : " + curso2.Getnota_curso());
        System.out.println("-------------------------------------------");
    }


    public void salida_curso_3(){
        System.out.println("Detalle del curso 3");
        System.out.println("-------------------------------------------");
        System.out.println("El nombre del curso 3 : " + curso3.GetNombre());
        System.out.println("El Departamento del curso 3 : " + curso3.GetDepartamento());
        System.out.println("El codigo del curso 3 : " + curso3.Getcodigo());
        System.out.println("La nota del curso 3 : " + curso3.Getnota_curso());
        System.out.println("-------------------------------------------");
    }


    public void salida_curso_4(){
        System.out.println("Detalle del curso 4");
        System.out.println("-------------------------------------------");
        System.out.println("El nombre del curso 4 : " + curso4.GetNombre());
        System.out.println("El Departamento del curso 4 : " + curso4.GetDepartamento());
        System.out.println("El codigo del curso 4 :  " + curso4.Getcodigo());
        System.out.println("La nota del curso 4 : " + curso4.Getnota_curso());
    }
}
