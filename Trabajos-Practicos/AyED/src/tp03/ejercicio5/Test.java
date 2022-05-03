package tp03.ejercicio5;

import tp03.ejercicio1y2.ArbolBinario;

public class Test {

	public static void main (String[]args) {
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> arbol1 = new ArbolBinario<Integer>(15);
		ArbolBinario<Integer> arbol7 = new ArbolBinario<Integer>(13);
		ArbolBinario<Integer> arbol2 = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> arbol3 = new ArbolBinario<Integer>(9);
		ArbolBinario<Integer> arbol4 = new ArbolBinario<Integer>(11);
		ArbolBinario<Integer> arbol5 = new ArbolBinario<Integer>(16);
		
		
		arbol.agregarHijoDerecho(arbol1);
		arbol1.agregarHijoDerecho(arbol5);
		arbol1.agregarHijoIzquierdo(arbol7);
		
		
		arbol.agregarHijoIzquierdo(arbol2);
		arbol2.agregarHijoIzquierdo(arbol3);
		arbol2.agregarHijoDerecho(arbol4);
		
		
		ProfundidadDeArbolBinario restuladoProfundidad = new ProfundidadDeArbolBinario(arbol);
		System.out.println("El resultado de la profundidad de 2 es: " + restuladoProfundidad.sumaElementosProfundidad(2));
		
		arbol.entreNiveles(0, 2);
		
		
	}
	
}
