package contenedor;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombreCategoria;
    private List<ProductoAbstracto> productos = new ArrayList<>();

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Categoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoAbstracto producto){
        productos.add(producto);
    }

    public void mostrarProduto(){
        System.out.println("Nombre de categoria: " + getNombreCategoria() );
        for(ProductoAbstracto pro : productos ){
            pro.mostrarProducto();
        }
    }

}
