package d2l;

public class Estudiante {
    int codigo;
    String Nombre;
    String Apellido;

    public Estudiante(){
        
    }

    public Estudiante(int codigo,String Nombre,String Apellido){
        this.codigo=codigo;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
    }


    public int Getcodigo(){
        return codigo;
    }

    public void SetCodigo(int codigo){
        this.codigo=codigo;
    }

    public String GetNombre(){
        return Nombre;
    }

    public void SetNombre(String Nombre){
        this.Nombre=Nombre;
    }

    public String GetApellido(){
        return Apellido;
    }

    public void SetApellido(String Apellido){
        this.Apellido=Apellido;
    }

    public double promedio(){

        return 0;
    }
    
    public void detalle_estudiante(){
        System.out.println("El codigo del Estudiante : " + this.codigo);
        System.out.println("El nombre del Estudiante : " + this.Nombre);
        System.out.println("El apellido del Estudiante : " + this.Apellido);

    }
}
