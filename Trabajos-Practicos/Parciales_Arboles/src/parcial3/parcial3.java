package parcial3;

import librerias.*;

public class parcial3 {

	public static void main(String[] args) {
		ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(3);
		a3.agregarHijo(new ArbolGeneral<Integer>(4));
		ArbolGeneral<Integer> a7 = new ArbolGeneral<Integer>(7);
		a7.agregarHijo(new ArbolGeneral<Integer>(2));
		a3.agregarHijo(a7);
		a3.agregarHijo(new ArbolGeneral<Integer>(6));
		ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(5);
		a5.agregarHijo(new ArbolGeneral<Integer>(1));
		a5.agregarHijo(new ArbolGeneral<Integer>(9));
		a5.agregarHijo(new ArbolGeneral<Integer>(10));
		arbol.agregarHijo(a3);
		arbol.agregarHijo(a5);
		
		
		Res res= new Res();
		
		ListaGenerica<Integer> camino = res.caminoAHojaMasLejana(arbol);
		for(int i=1; i<=camino.tamanio(); i++) {
			System.out.print(camino.elemento(i));
			if(i < camino.tamanio()) {
				System.out.print(" - ");
			}
		}
	}

}
