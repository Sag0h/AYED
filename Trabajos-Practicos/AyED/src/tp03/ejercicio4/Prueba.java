package tp03.ejercicio4;

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
		
		RedBinariaLlena red = new RedBinariaLlena(arbol);
		
		System.out.println("\nEl retardo maximo es = "+red.retardoReenvio());
		
		
	}
}
