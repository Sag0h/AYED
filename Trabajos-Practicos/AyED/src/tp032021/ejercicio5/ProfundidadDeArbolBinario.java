package tp032021.ejercicio5;

import tp02.ejercicio3.ColaGenerica;
import tp032021.ejercicio1y2.ArbolBinario;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> arbolBinario;
	
	public ProfundidadDeArbolBinario() {
		arbolBinario = new ArbolBinario<Integer>();
	}
	
	public ProfundidadDeArbolBinario(ArbolBinario<Integer> a) {
		arbolBinario = a;
	}
	
	public int sumaElementosProfundidad(int p) {
		ArbolBinario<Integer> arbol = null;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		cola.encolar(this.arbolBinario);
		cola.encolar(null);
		int nivel = 0;
		int total = 0;
		while(!cola.esVacia() && nivel <= p) {
			arbol = cola.desencolar();
			if(arbol != null) {
				if(nivel == p) 
					total += arbol.getDato();
				if(arbol.tieneHijoIzquierdo()) 
					cola.encolar(arbol.getHijoIzquierdo());
				if(arbol.tieneHijoDerecho()) 
					cola.encolar(arbol.getHijoDerecho());
			}else if(!cola.esVacia())
				if(nivel <= p) {
					nivel++;
					cola.encolar(null);
				}
		}
		return total;
	}
	
}
