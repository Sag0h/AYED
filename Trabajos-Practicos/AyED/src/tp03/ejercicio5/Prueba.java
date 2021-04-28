package tp03.ejercicio5;

import tp03.ejercicio1y2.ArbolBinario;

public class Prueba {

	public static void main(String[] args) {
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> h1,h2;
		h1 = new ArbolBinario<Integer>(20);
		h2 = new ArbolBinario<Integer>(30);
		arbol.agregarHijoIzquierdo(h1);
		arbol.agregarHijoDerecho(h2);
		
		h1 = new ArbolBinario<Integer>(20);
		h2 = new ArbolBinario<Integer>(3);
		
		arbol.getHijoIzquierdo().agregarHijoIzquierdo(h1);
		arbol.getHijoIzquierdo().agregarHijoDerecho(h2);
		
		h1 = new ArbolBinario<Integer>(2);
		h2 = new ArbolBinario<Integer>(3);
		
		arbol.getHijoDerecho().agregarHijoIzquierdo(h1);
		arbol.getHijoDerecho().agregarHijoDerecho(h2);
		
		System.out.println("Arbol por niveles: ");
		arbol.printPorNiveles();
		
		ProfundidadDeArbolBinario profArbol = new ProfundidadDeArbolBinario(arbol);
		
		System.out.println("\nprof 0 = "+profArbol.sumaElementosProfundidad(0));
		System.out.println("prof 1 = "+profArbol.sumaElementosProfundidad(1));
		System.out.println("prof 2 = "+profArbol.sumaElementosProfundidad(2));
	
	}

}
