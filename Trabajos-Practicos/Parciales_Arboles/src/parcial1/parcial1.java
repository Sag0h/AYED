package parcial1;

import librerias.*;

public class parcial1 {
	
	
	private static void caminosPares(ArbolGeneral<String> a, int contador, ListaGenerica<String> caminoAct, ListaGenerica<ListaGenerica<String>> caminos) {
		if(!a.esVacio()) {
			contador++;
			caminoAct.agregarFinal(a.getDato());
			if(!a.esHoja()) {
				for(int i=1; i<=a.getHijos().tamanio(); i++) {
					caminosPares(a.getHijos().elemento(i), contador, caminoAct, caminos);
				}
			}else {
				if(contador % 2 == 0) {
					ListaGenerica<String> copia = new ListaEnlazadaGenerica<String>();
					for(int i = 1; i <= caminoAct.tamanio(); i++) {
						copia.agregarFinal(caminoAct.elemento(i));
					}
					caminos.agregarFinal(copia);
				}
			}
			caminoAct.eliminarEn(caminoAct.tamanio());
		}
	}
	
	public static ListaGenerica<ListaGenerica<String>> caminosPares(ArbolGeneral<String> a){
		if(!a.esVacio()) {
			ListaGenerica<ListaGenerica<String>> lista = new ListaEnlazadaGenerica<ListaGenerica<String>>();
			lista.comenzar();
			caminosPares(a, 0, new ListaEnlazadaGenerica<String>(), lista);
			return lista;
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		ArbolGeneral<String> a = new ArbolGeneral<String>("A");
		ArbolGeneral<String> b = new ArbolGeneral<String>("B");
		ArbolGeneral<String> c = new ArbolGeneral<String>("C");
		ArbolGeneral<String> d = new ArbolGeneral<String>("D");
		a.agregarHijo(b);
		a.agregarHijo(c);
		a.agregarHijo(d);
			
		b.agregarHijo(new ArbolGeneral<String>("E"));
		
		ArbolGeneral<String> f = new ArbolGeneral<String>("F");
		
		c.agregarHijo(f);
		c.agregarHijo(new ArbolGeneral<String>("G"));
		
		f.agregarHijo(new ArbolGeneral<String>("H"));
		f.agregarHijo(new ArbolGeneral<String>("I"));
		

	
		ListaGenerica<ListaGenerica<String>> lista = caminosPares(a);
		for(int i=1; i<=lista.tamanio(); i++) {
			System.out.println("Camino "+ i+": ");
			for(int j=1; j<=lista.elemento(i).tamanio(); j++) {
				if(j < lista.elemento(i).tamanio()) {
					System.out.print(lista.elemento(i).elemento(j) + " - ");
				}
				else { 
					System.out.print(lista.elemento(i).elemento(j)+ " \n");
			
				}
			}
		}
	}

}
