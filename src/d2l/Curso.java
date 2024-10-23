package d2l;


public class Curso {
    int codigo;
    String Nombre;
    String Departamento;
    double C_credito;
    double nota_de_curso;


    public void SetNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String GetNombre(){
        return Nombre;
    }
    public void SetDepartamento(String Departamento){
        this.Departamento = Departamento;
    }
    public String GetDepartamento(){
        return Departamento;
    }
    public void Setcodigo(int codigo){
        this.codigo = codigo;
    }
    public int Getcodigo(){
        return codigo;
    }
    public void SetC_credito(double C_credito){
        this.C_credito = C_credito;
    }
    public double GetC_credito(){
        return C_credito;
    }

    public void Setnota_curso(double nota_de_curso){
        if(nota_de_curso >= 1.5 && nota_de_curso <= 5){
          this.nota_de_curso = nota_de_curso;
        }
    }

    public double Getnota_curso(){
        return nota_de_curso;
    }
}
