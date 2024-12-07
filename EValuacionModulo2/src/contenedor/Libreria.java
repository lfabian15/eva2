package contenedor;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private String nombreLibreria;
    private List<Categoria> listaCategoria = new ArrayList<>();


    public String getNombreLibreria() {
        return nombreLibreria;
    }

    public void setNombreLibreria(String nombreLibreria) {
        this.nombreLibreria = nombreLibreria;
    }

    public List<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public Libreria(String nombreLibreria) {
        this.nombreLibreria = nombreLibreria;
        this.listaCategoria = new ArrayList<>();
    }

    public void agregarCategoria(Categoria categoria){
        listaCategoria.add(categoria);

    }

    public void mostrarInventario(){
        System.out.println("Nombre Libreria: " + getNombreLibreria());
        for(Categoria ca : listaCategoria){
            ca.mostrarProduto();
        }
    }



}
