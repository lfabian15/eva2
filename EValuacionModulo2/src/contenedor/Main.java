package contenedor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Objetos instanciados de ProductoLibro
        ProductoLibro libro1 = new ProductoLibro("Luces de Bohemia", 800.0,"A1","De ramon del valle Inclaan");
        ProductoLibro libro2 = new ProductoLibro("Crimen y Castigo", 750.20, "A2", "De Fedor Dostoievski");
        ProductoLibro libro3 = new ProductoLibro("100 Anos de Soledad", 2400.50, "A3", "De Gabriel Garcia Marquez");

        //objetos intanciados de ProductoRevista
        ProductoRevista revista1 = new ProductoRevista("Byte", 750.20, "R1", "Informatica y Tecnologica");
        ProductoRevista revista2 = new ProductoRevista("Sport", 250.30, "R2", "Deportes y Salud");
        ProductoRevista revista3 = new ProductoRevista("Big Bang", 450, "R3", "Diversion y aprendizaje");

        //Objetos instanciados de Categoria
        Categoria literario = new Categoria("Libros");
        Categoria entretenimiento = new Categoria("Revista");

        //Agregar producto a la categoria
        literario.agregarProducto(libro1);
        literario.agregarProducto(libro2);
        literario.agregarProducto(libro3);
        entretenimiento.agregarProducto(revista1);
        entretenimiento.agregarProducto(revista2);
        entretenimiento.agregarProducto(revista3);

        //Instanciar objeto de Libreria
        Libreria storeBook = new Libreria("El buen lector");
        storeBook.agregarCategoria(literario);
        storeBook.agregarCategoria(entretenimiento);

        InventarioGenerica<Libreria> librerias = new InventarioGenerica<>();
        librerias.add(storeBook);
        librerias.getInventario1();

        InventarioGenerica<ProductoLibro> libros = new InventarioGenerica<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.getInventario1();

        InventarioGenerica<ProductoRevista> revistas = new InventarioGenerica<>();
        revistas.add(revista1);
        revistas.add(revista2);
        revistas.add(revista3);
        revistas.getInventario1();

        InventarioGenerica<Categoria> categorias = new InventarioGenerica<>();
        categorias.add(literario);
        categorias.add(entretenimiento);
        categorias.getInventario1();




    }
}
