package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static int[] getMultiplosN(int n){
        int[] arreglo = new int[n];
        for(int i=0; i<n; i++){
            arreglo[i] = (n * (i+1));
        }
        return arreglo;
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor entero para N:");
        int n = scanner.nextInt();
        int[] v = getMultiplosN(n);
        for(int i=0; i<n; i++){
            System.out.println(v[i]);
        }
    }
}
