 package tp03.ejercicio1y2;

import tp02.ejercicio3.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}
 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public boolean esLleno() {
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		boolean lleno = true;
		cola.encolar(this);
		int cant_nodos = 0;
		cola.encolar(null);
		int nivel = 0;
		while(!cola.esVacia() && lleno) {
			arbol = cola.desencolar();
			if(arbol != null) {
				System.out.print(arbol.getDato());
				if(arbol.tieneHijoIzquierdo()) {
					cola.encolar(arbol.getHijoIzquierdo());
					cant_nodos++;
				}
				if(arbol.tieneHijoDerecho()) {
					cola.encolar(arbol.getHijoDerecho());
					cant_nodos++;
				}
			} else if(!cola.esVacia()) {
				if(cant_nodos == Math.pow(2, ++nivel)) {
					cola.encolar(null);
					cant_nodos = 0;
					System.out.println();
				}else {
					lleno = false;	
				}
			}
		}
		return lleno;
	}

	boolean esCompleto() {
		if(this.esLleno()) {
			return true;
		}else {
			ColaGenerica <ArbolBinario<T>> cola = new ColaGenerica<>(new ListaEnlazadaGenerica<>());
			cola.encolar(this);

			boolean flag = false;
			while (!cola.esVacia()) {
				ArbolBinario<T> curr = cola.desencolar();

				if (curr.tieneHijoIzquierdo()) {
					if (flag) {
						return false;
					}
					
					cola.encolar(curr.getHijoIzquierdo());
				} else {
					flag = true;
				}

				if (curr.tieneHijoDerecho()) {
					if (flag) {
						return false;
					}

					cola.encolar(curr.getHijoDerecho());
				} else {
					flag = true;
				}
			}
			return true;
		}
	}

	// imprime el árbol en preorden  
	public void printPreorden() {
		System.out.println(this.getDato());
		if(tieneHijoIzquierdo()) {
			this.getHijoIzquierdo().printPreorden();;
		}
		if(tieneHijoDerecho()) {
			this.getHijoDerecho().printPreorden();
		}
	}

	// imprime el árbol en postorden
	public void printPostorden() {
		if(tieneHijoIzquierdo()) {
			this.getHijoIzquierdo().printPostorden();
		}
		if(tieneHijoDerecho()) {
			this.getHijoDerecho().printPostorden();
		}
		System.out.println(this.getDato());
	}
	
	//imprime el árbol en inorden
	public void printInorden() {
		if(tieneHijoIzquierdo()) {
			this.getHijoIzquierdo().printInorden();
		}
		System.out.println(this.getDato());
		if(tieneHijoDerecho()) {
			this.getHijoDerecho().printInorden();
		}
	}

	
	public void printPorNiveles() {
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		while(!cola.esVacia()) {
			arbol = cola.desencolar();
			if(arbol != null) {
				System.out.print(arbol.getDato());
				if(arbol.tieneHijoIzquierdo()) {
					cola.encolar(arbol.getHijoIzquierdo());
				}
				if(arbol.tieneHijoDerecho()) {
					cola.encolar(arbol.getHijoDerecho());
				}
			}else if(!cola.esVacia()) {
				System.out.println();
				cola.encolar(null);
			}
		}
	}

	public ListaGenerica<T> frontera() {
		ListaGenerica<T> l = new ListaEnlazadaGenerica<T>();

		return l;
	}

    public int contarHojas() { 
        int contHI=0,contHD=0;
        if(this.esHoja()){
            return 1;
        }else{
            if(this.tieneHijoIzquierdo())
                contHI=this.getHijoIzquierdo().contarHojas();
            if(this.tieneHijoDerecho())
                contHD=this.getHijoDerecho().contarHojas();
        }
        return contHI+contHD;
    }

    public ArbolBinario<T> espejo(){ 
        ArbolBinario<T> arbol = new ArbolBinario<T>(this.getDato()); 
        if(!this.esVacio()){
                if(this.tieneHijoDerecho()){
                    arbol.agregarHijoIzquierdo(this.getHijoDerecho().espejo());   
                }    
                if(this.tieneHijoIzquierdo()){
                    arbol.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
                }   
        }
        return arbol;     
    }
    
    public void entreNiveles(int n, int m) {
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		int nivel = 0;
		while(!cola.esVacia() && nivel <= m) {
			arbol = cola.desencolar();
			if(arbol != null) {
				if(nivel >= n){
					System.out.print(arbol.getDato());
				}
				if(arbol.tieneHijoIzquierdo()) {
					cola.encolar(arbol.getHijoIzquierdo());
				}
				if(arbol.tieneHijoDerecho()) {
					cola.encolar(arbol.getHijoDerecho());
				}
			} else if(!cola.esVacia()) {
				if(nivel <= m) {
					nivel++;
				    if(nivel > n && nivel <= m) 
						System.out.println("");	
					cola.encolar(null);
				}
			}
		}
    }
    
} 