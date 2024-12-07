package contenedor;

import java.util.ArrayList;
import java.util.List;

public class InventarioGenerica <T>{
   private List<T> inventario1 = new ArrayList<T>();

    public void add(T producto) {
        inventario1.add(producto);
    }

    public void getInventario1() {
        for(T pro : inventario1){
            System.out.println(pro);
        }

    }

//    public void setInventario1(List<T> inventario1) {
//        this.inventario1 = inventario1;
//    }






}
