package tp01B.ejercicio1;

public class SinIterar {

    public static void imprimirEntre(int a, int b){
        if(a<=b){
            System.out.println(a);
            a++;
            imprimirEntre(a,b);
        }
    }

}
