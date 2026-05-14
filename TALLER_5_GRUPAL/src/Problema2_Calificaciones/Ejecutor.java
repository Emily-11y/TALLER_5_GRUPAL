package Problema2_Calificaciones;
import java.util.Scanner;
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes a registrar: ");
        int n = sc.nextInt();

        Estudiante[] alumnos = new Estudiante[n];

        for (int i = 0; i < alumnos.length; i++) {
            sc.nextLine(); 
            System.out.println("--- Datos Estudiante n-" + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String nom = sc.nextLine();
            System.out.print("Edad: ");
            int ed = sc.nextInt();
            
            sc.nextLine(); 
            System.out.print("Nombre de la materia: ");
            String matNom = sc.nextLine();
            System.out.print("Nota ACD (3.5): ");
            double n1 = sc.nextDouble();
            System.out.print("Nota APE (3.5): ");
            double n2 = sc.nextDouble();
            System.out.print("Nota AA (3.0): ");
            double n3 = sc.nextDouble();

            alumnos[i] = new Estudiante(nom, ed);
            Materia mat = new Materia(matNom, n1, n2, n3);
            alumnos[i].agregarMateria(mat);
        }

        System.out.println("\n========== LISTADO DE CALIFICACIONES ==========");
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i].mostrarReporteEstudiante();
        }
        System.out.println("===============================================");

        sc.close();
    }
}
