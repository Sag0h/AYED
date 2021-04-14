package tp02.ejercicio1;

public @interface Ejercicio1_7 {
    // a). No, porque son metodos abstractos que las subclases deberan implementar.
    // se define abstracta porque no se va a instanciar, pero sus subclases heredaran su comportamiento
    // b). Agregar un nodo al principio, solo engancha el nodo de inicio, al siguiente del nuevo nodo.
    // Agregar nodo en el final, si la lista esta vacia, el inicio apunta al nuevo nodo, sino el nodo siguiente de fin, apuntara a el nuevo nodo y ahora el nuevo nodo es fin.
    // Agregar nodo en medio, se engancha el nuevo nodo al siguiente del anterior a la posicion donde se insertara, y el siguiente del nuevo nodo al nodo que sigue.
    // como en pascal xD

    // c). su primer elemento esta en el indice 0 del vector.

}
