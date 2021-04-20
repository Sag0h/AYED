package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static int[] devolverMinMaxYProm(int[] arreglo){
        int max= -1;
        int min= 9999;
        int prom, cant=0, total=0;

        for (int i=0; i<arreglo.length; i++){
            cant++;
            total+=arreglo[i];
            if(arreglo[i]>max){
                max=arreglo[i];
            }
            if(arreglo[i]<min) {
                min = arreglo[i];
            }
        }
        prom = total/cant;
        int[] minmaxprom = {min, max, prom};
        return minmaxprom;
    }

    public static void devolverMinMaxYProm(int[] arreglo, MinMaxYProm retorno){
        int cant=0, total=0;

        for (int i=0; i<arreglo.length; i++){
            cant++;
            total+=arreglo[i];
            if(arreglo[i]>retorno.getMax()){
                retorno.setMax(arreglo[i]);
            }
            if(arreglo[i]<retorno.getMin()) {
                retorno.setMin(arreglo[i]);
            }
        }
        int prom = total/cant;
        retorno.setProm(prom);
    }



    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.print("Ingrese cantidad de elementos del arreglo: ");
        int N=entrada.nextInt();

        int[] array = new int[N];

        for(int i=0; i<N; i++){
            System.out.print("Ingrese un numero "+(i+1)+ ": ");
            array[i]=entrada.nextInt();
        }

        int[] minMaxyProm = devolverMinMaxYProm(array);
        System.out.println("Minimo: "+ minMaxyProm[0]);
        System.out.println("Maximo: "+ minMaxyProm[1]);
        System.out.println("Promedio: "+ minMaxyProm[2]);

        MinMaxYProm datos = new MinMaxYProm(9999, -1, 0);
        devolverMinMaxYProm(array, datos);
        System.out.println(datos.toString());


    }


}
