# Práctica de Pilas: Estática y Dinámica (Estructura de Datos)

Este proyecto contiene la implementación en Java de estructuras de datos lineales: **Pilas Estáticas** (mediante arreglos) y **Pilas Dinámicas** (mediante nodos y referencias), incluyendo sus métodos operativos y auxiliares.

---

## Diferencias conceptuales

* **Almacenamiento Estático (`PilaSimple.java`):**
  * Utiliza un arreglo de tamaño fijo asignado de manera contigua en memoria.
  * Su capacidad es limitada y requiere definir un tamaño máximo al inicializarse.
  * Cuenta con la validación `isFull()` para detectar desbordamientos cuando el arreglo alcanza su límite (`tope == datos.length - 1`).

* **Almacenamiento Dinámico (`PilaDinamica.java`):**
  * Utiliza nodos enlazados mediante referencias en memoria.
  * No utiliza un tamaño fijo ni requiere la función `isFull()`, ya que su capacidad crece o decrece de forma dinámica dependiendo de la memoria disponible.
  * Controla su estado vacío mediante la verificación de la cima (`cima == null`).

---

## Pasos para compilar y ejecutar el proyecto

1. Abrir el proyecto completo en **IntelliJ IDEA**.
2. Asegurarse de que los archivos se encuentren dentro del paquete `Estructuras_lineales` (`Nodo.java`, `PilaSimple.java`, `PilaDinamica.java` y `lanzador_estr_lineales.java`).
3. Abrir la clase principal **`lanzador_estr_lineales.java`**.
4. Dar clic en el botón de **Run** (ícono de reproducción ▶) ubicado a un lado de la clase o del método `main`.

---

## Ejemplo de prueba de ejecución por consola

A continuación se muestra el resultado obtenido al ejecutar las operaciones en las pilas:

```text
Metiste: 10
Metiste: 20
Metiste: 30
Pila actual: 10 20 30
Sacaste: 30
Pila actual: 10 20
¿Está vacía?: false
¿Está llena?: false
Elemento en el tope (peek): 20
Process finished with exit code 0
