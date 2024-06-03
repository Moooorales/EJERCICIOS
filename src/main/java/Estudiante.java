import java.util.Scanner;

public class Estudiante extends Persona {
    private String matricula;
    private final String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void estudiar() {
        System.out.println(getNombre() + " (" + getMatricula() + ") está estudiando " + carrera + ".");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese la edad del estudiante: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            
            System.out.print("Ingrese la carrera del estudiante: ");
            String carrera = scanner.nextLine();
          
            Estudiante estudiante1 = new Estudiante(nombre, edad, carrera);
            estudiante1.presentarse();
            System.out.print("Ingrese la matricula del estudiante: ");
            String matricula = scanner.nextLine();
            estudiante1.setMatricula(matricula);
            
            estudiante1.estudiar();
        }
    }
}
