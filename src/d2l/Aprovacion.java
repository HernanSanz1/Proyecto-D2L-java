package d2l;
public class Aprovacion {
    private Curso curso1;
    private Curso curso2;
    private Curso curso3;
    private Curso curso4;
    private Estudiante Estudiante1;

    public Aprovacion(Curso curso1, Curso curso2, Curso curso3, Curso curso4,Estudiante Estudiante1){
        this.curso1 = curso1;
        this.curso2 = curso2;
        this.curso3 = curso3;
        this.curso4 = curso4;
        this.Estudiante1 = Estudiante1;
    }


    public void aproved_desaproved(){

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

    if(promedio < 3.25){
        System.out.println("EL PROMEDIO DEL ESTUDIANTE "  + Estudiante1.GetNombre() + "es : " + promedio);
        System.out.println();
        System.out.println("El estudiante esta en prueba academica");
        System.out.println();
    }else if(promedio >= 4.75){
        System.out.println("EL PROMEDIO DEL ESTUDIANTE "  + Estudiante1.GetNombre() + "es : " + promedio);
        System.out.println();
        System.out.println("El estudiante es candidato a beca");
        System.out.println();
    }
}
    }
    
