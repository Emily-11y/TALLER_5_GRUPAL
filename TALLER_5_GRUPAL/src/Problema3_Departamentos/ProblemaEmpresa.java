
package Problema3_Departamentos;

import java.util.Scanner;

public class ProblemaEmpresa {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la empresa:");
        String nombreEmpresa = sc.nextLine();

        System.out.println("Ingrese el RUC:");
        String ruc = sc.nextLine();

        System.out.println("Ingrese la direccion:");
        String direccion = sc.nextLine();

        System.out.println("Ingrese la cantidad de departamentos:");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Empresa empresa = new Empresa(nombreEmpresa, ruc, direccion, cantidad);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nDepartamento " + (i + 1));

            System.out.println("Ingrese el nombre del departamento:");
            String nombreDepartamento = sc.nextLine();

            System.out.println("Ingrese el numero de empleados:");
            int empleados = sc.nextInt();

            System.out.println("Ingrese la produccion anual:");
            double produccion = sc.nextDouble();
            sc.nextLine();

            Departamento departamento = new Departamento(nombreDepartamento, empleados, produccion);

            empresa.agregarDepartamento(departamento);
        }

        System.out.println("\nRESULTADO FINAL");
        System.out.println(empresa.toString());
    }
    
}
