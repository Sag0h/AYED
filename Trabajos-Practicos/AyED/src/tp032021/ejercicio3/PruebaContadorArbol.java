package tp032021.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp032021.ejercicio1y2.ArbolBinario;

public class PruebaContadorArbol {
	
	public static void main(String[] args) {
		
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> h1,h2;
		h1 = new ArbolBinario<Integer>(8);
		h2 = new ArbolBinario<Integer>(4);
		arbol.agregarHijoDerecho(h1);
		arbol.agregarHijoIzquierdo(h2);
		
		h1 = new ArbolBinario<Integer>(3);
		h2 = new ArbolBinario<Integer>(5);
		
		arbol.getHijoIzquierdo().agregarHijoIzquierdo(h1);
		arbol.getHijoIzquierdo().agregarHijoDerecho(h2);
		
		h1 = new ArbolBinario<Integer>(7);
		h2 = new ArbolBinario<Integer>(9);
		
		arbol.getHijoDerecho().agregarHijoIzquierdo(h1);
		arbol.getHijoDerecho().agregarHijoDerecho(h2);
		
		ContadorArbol contArbol = new ContadorArbol(arbol);
		
		ListaEnlazadaGenerica<Integer> l = contArbol.numerosPares();
		
		System.out.println(l.toString());
		
	}
	
}
