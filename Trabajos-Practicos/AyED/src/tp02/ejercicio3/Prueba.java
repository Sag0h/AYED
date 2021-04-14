package tp02.ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        PilaGenerica<Integer> pila = new PilaGenerica<Integer>();
        ColaGenerica<Integer> cola = new ColaGenerica<Integer>();

        Integer x= 1;
        Integer y= 2;

        if(pila.esVacia()){
            pila.apilar(x);
            pila.apilar(y);
        }
        if(cola.esVacia()){
            cola.encolar(x);
            cola.encolar(y);
        }

        System.out.println(pila.desapilar() + " - Desapilado con éxito.");
        System.out.println(cola.desencolar() + " - Desencolado con éxito.");
        System.out.println("Tope de pila: " + pila.tope());
        System.out.println("Tope de cola: " + cola.tope());


    }
}
