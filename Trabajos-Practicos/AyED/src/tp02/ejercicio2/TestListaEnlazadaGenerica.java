package tp02.ejercicio2;
/* Escriba una clase llamada TestListaEnlazadaGenerica que cree 4 objetos de tipo
Estudiante (implementado en el TP01B) y los agregue a un objeto de tipo
ListaEnlazadaGenerica usando los diferentes métodos de la lista y luego, imprima los
elementos de dicha lista usando el método tusDatos(). */

public class TestListaEnlazadaGenerica {

    public static void main(String[] args) {
        Estudiante e;
        ListaEnlazadaGenerica<Estudiante> l = new ListaEnlazadaGenerica<Estudiante>();
        l.comenzar();
        for(int i=0; i<4; i++){
            e = new Estudiante("Nombre"+(i+1), "Apellido"+(i+1), "Comision "+(i+1), "email"+(i+1),"Direccion "+(i+1));
            l.agregarFinal(e);
        }

        while(!l.fin()){
            System.out.println(l.proximo().tusDatos());
        }

    }

}
