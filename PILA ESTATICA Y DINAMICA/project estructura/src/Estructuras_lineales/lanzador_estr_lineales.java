package Estructuras_lineales;

public class lanzador_estr_lineales {
    public static void main(String[] args) {
        PilaSimple p = new PilaSimple();

        p.push(10);
        p.push(20);
        p.push(30);
        p.mostrar();

        p.pop(); // Saca el 30
        p.mostrar();

        // Métodos adicionales pedidos en la tarea
        System.out.println("¿Está vacía?: " + p.isEmpty());
        System.out.println("¿Está llena?: " + p.isFull());
        System.out.println("Elemento en el tope (peek): " + p.peek());
    }
}