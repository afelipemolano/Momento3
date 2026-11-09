# Momento 3 - Sistema de Gestión de Inventario (CHEVIGNON)

## Información del Proyecto
* **Asignatura:** Lógica de Programación
* **Evaluación:** Momento 3
* **Estudiante:** Andrés Felipe Molano
* **Docente:** Santiago Yosa

---

## 📝 Descripción
Programa de consola desarrollado en Java para la gestión básica de inventario de tiendas (referencias de prendas). El sistema implementa almacenamiento en arreglos de tamaño fijo, validación de valores nulos, ciclos interactivos y funciones estáticas auxiliares.

---

## ⚙️ Funcionalidades
1. **Listar Referencias:** Muestra las prendas guardadas en el inventario de manera enumerada, omitiendo las posiciones vacías (`null`).
2. **Buscar Referencia:** Permite consultar la disponibilidad de una prenda utilizando una función estática (`buscarReferencia`) que realiza la búsqueda sin diferenciar entre mayúsculas y minúsculas (`equalsIgnoreCase`).
3. **Agregar Referencia:** Permite registrar una nueva prenda en la primera casilla disponible del arreglo (`null`). Si el arreglo está lleno, notifica al usuario.
4. **Salir:** Finaliza la ejecución del sistema liberando los recursos de lectura.
