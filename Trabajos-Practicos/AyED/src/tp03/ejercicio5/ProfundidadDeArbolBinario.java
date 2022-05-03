package tp03.ejercicio5;

import tp03.ejercicio1y2.ArbolBinario;
import tp02.ejercicio3.ColaGenerica;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> arbol;
	
	public ProfundidadDeArbolBinario() {
		this.arbol = new ArbolBinario<Integer>();
	}
	
	public ProfundidadDeArbolBinario(ArbolBinario<Integer> a) {
		this.arbol = a;
	}
	
	
	public int sumaElementosProfundidad(int p) {
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		ArbolBinario<Integer> aux;
		int nivel = 0;
		int total = 0;
		if(!this.arbol.esVacio()) {
			cola.encolar(this.getArbol());
			cola.encolar(null);
			while(!cola.esVacia() && nivel <= p) {
				aux = cola.desencolar();			
				if(aux != null) {
					if(nivel == p) 
						total += aux.getDato();
					if(aux.tieneHijoIzquierdo()) 
						cola.encolar(aux.getHijoIzquierdo());
					if(aux.tieneHijoDerecho())
						cola.encolar(aux.getHijoDerecho());
				}else {
					if(nivel++ < p) 
						cola.encolar(null);
				}
			}
		}
		return total;
	}

	public ArbolBinario<Integer> getArbol() {
		return arbol;
	}
	
}
