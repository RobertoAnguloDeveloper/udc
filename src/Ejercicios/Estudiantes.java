package Ejercicios;

public class Estudiantes {
    private int edad;
    private String sexo, carrera;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(int sexo) {
        if(sexo == 1){
            this.sexo = "Masculino";
        }else if(sexo == 2){
            this.sexo = "Femenino";
        }else{
            System.out.println("ESCOJA 1 O 2");
        }
    }

    public void setCarrera(int carrera) {
        if(carrera == 1){
            this.carrera = "Ingenieria";
        }else if(carrera == 2){
            this.carrera = "Otra carrera";
        }else{
            System.out.println("ESCOJA 1 O 2");
        }
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCarrera() {
        return carrera;
    }
    
    
    
    
    
    
}
