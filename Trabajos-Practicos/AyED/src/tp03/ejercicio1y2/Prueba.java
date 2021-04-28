package tp03.ejercicio1y2;

public class Prueba {
	
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
		
		System.out.println("Arbol por niveles: ");
		arbol.printPorNiveles();
		
		ArbolBinario<Integer> arbolEspejo = arbol.espejo();
		
		System.out.println("");
		
		System.out.println("Arbol espejo: ");
		arbolEspejo.printPorNiveles();
		
		int n, m;
		n = 0;
		m = 1;
		System.out.println("\nArbol espejo entre niveles "+ n + " y " + m + ": ");
		arbolEspejo.entreNiveles(n, m);
	}
	
}
