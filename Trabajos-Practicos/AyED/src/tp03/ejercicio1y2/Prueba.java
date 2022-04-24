package tp03.ejercicio1y2;

public class Prueba {

	public static void main(String[] args) {
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(10);
		
		arbol.agregarHijoDerecho(new ArbolBinario<Integer>(15));
		arbol.getHijoDerecho().agregarHijoIzquierdo(new ArbolBinario<Integer>(13));
		arbol.getHijoDerecho().agregarHijoDerecho(new ArbolBinario<Integer>(16));
		
		arbol.agregarHijoIzquierdo(new ArbolBinario<Integer>(5));
		arbol.getHijoIzquierdo().agregarHijoIzquierdo(new ArbolBinario<Integer>(1));
		arbol.getHijoIzquierdo().agregarHijoDerecho(new ArbolBinario<Integer>(7));
	
		arbol.entreNiveles(0, 2);
		System.out.println("");
		ArbolBinario<Integer> arbolEspejo = arbol.espejo();
		arbolEspejo.entreNiveles(0, 2);
		System.out.println("");
		System.out.println("Cantidad de hojas de arbol = "+ arbol.contarHojas());
	}

}
