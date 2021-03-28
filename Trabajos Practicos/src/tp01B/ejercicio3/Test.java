package tp01B.ejercicio3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[2];
        Profesor[] profesores = new Profesor[3];

        int cantE= estudiantes.length;
        for(int i=0; i<cantE; i++){
            estudiantes[i] = new Estudiante();
            System.out.print("Ingrese nombre del estudiante "+(i+1)+": ");
            estudiantes[i].setNombre(scanner.nextLine());
            System.out.print("Ingrese apellido del estudiante "+(i+1)+": ");
            estudiantes[i].setApellido(scanner.nextLine());
            System.out.print("Ingrese comision del estudiante "+(i+1)+": ");
            estudiantes[i].setComision(scanner.nextLine());
            System.out.print("Ingrese email del estudiante "+(i+1)+": ");
            estudiantes[i].setEmail(scanner.nextLine());
            System.out.print("Ingrese direccion del estudiante "+(i+1)+": ");
            estudiantes[i].setDireccion(scanner.nextLine());

        }
        int cantP= profesores.length;
        for(int i=0; i<cantP; i++){
            profesores[i] = new Profesor();
            System.out.print("Ingrese nombre del profesor "+(i+1)+": ");
            profesores[i].setNombre(scanner.nextLine());
            System.out.print("Ingrese apellido del profesor "+(i+1)+": ");
            profesores[i].setApellido(scanner.nextLine());
            System.out.print("Ingrese email del profesor "+(i+1)+": ");
            profesores[i].setEmail(scanner.nextLine());
            System.out.print("Ingrese catedra del profesor "+(i+1)+": ");
            profesores[i].setCatedra(scanner.nextLine());
            System.out.print("Ingrese facultad del profesor "+(i+1)+": ");
            profesores[i].setFacultad(scanner.nextLine());
        }

        for (Estudiante e: estudiantes) {
            System.out.println(e.tusDatos());
        }

        for (Profesor p: profesores) {
            System.out.println(p.tusDatos());
        }


    }
}
