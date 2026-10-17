package Estructuras_lineales;

public class PilaDinamica {
    Nodo cima; // Declarando un nodo llamado cima. El control remoto que apunta al elemento de arriba

    // Constructor de la pila
    public PilaDinamica() {
        this.cima = null;
    }// Arranca vacía }

    // Metodo PUSH (Meter elemento arriba)
    void push(int x) {
        Nodo nuevo = new Nodo(x); // 1. Creamos el nuevo nodo que tiene las mismas propiedades
        nuevo.siguiente = cima;   // 2. Como tiene las mismas propiedades que nodo no necesita
        // El nuevo atrapa al viejo de la cima
        cima = nuevo;            // 3. Actualizamos la cima. El nuevo se convierte oficialmente...
    }

    // nota: nuevo.siguiente es la flecha
    // Método POP (Sacar el elemento de arriba)
    void pop() {
        if (cima != null) {
            System.out.println("Sacaste de la pila: " + cima.dato);
            cima = cima.siguiente; // La cima se baja al siguiente nodo
        } else {
            System.out.println("¡Pila dinámica vacía!");
        }
    }

    // Método MOSTRAR (Recorriendo con el explorador)
    void mostrar() {
        Nodo actual = cima; // Nuestro explorador arranca en la cima
        System.out.print("Pila Dinámica (Cima -> Fondo): ");

        while (actual != null) { // Mientras no lleguemos al fondo (null)
            System.out.print(actual.dato + " ");
            actual = actual.siguiente; // Saltamos al siguiente nodo
        }
        System.out.println(); // salto de línea
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return (cima == null);
    }

    // Método para consultar el valor en la cima sin desvincular el nodo
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return -1; // O el valor de error que manejes
        }
        return cima.dato; // Asegúrate de que el atributo del nodo que guarda el número se llame 'dato'
    }
}