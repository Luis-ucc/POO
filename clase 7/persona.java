public class persona {

    //atributos

    private int identificacion;
    private String nombres;
    private String apellidos;
    private int edad;
    private double estatura;
    private double peso;

    //metodo constructor
    public persona(int identificacion, String nombres, String apellidos, int edad, double estatura, double peso){
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = edad;
        this.peso = peso;
    }

    //metodos

    public void caminar(){
        System.out.println("caminar");
    }
    public boolean jugar(){
        return true;
    }
    public void comer(){
        System.out.println("comiendo");
    }
    public String estudiar(String carrera){
        return "usted esta estudiando: " + carrera;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad < 100) {
            this.edad = edad;
        } else {
            System.out.println("edad invalida");
        }
    }

    //tarea consultar sobre el metodo toString


}