package contenedor;

public abstract class ProductoAbstracto implements Producto{

    private String nombre;
    private double precio;
    private String codigo;
    private String descripcion;

    public ProductoAbstracto() {
    }

    public ProductoAbstracto(String nombre, double precio, String codigo, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarProducto(){
        System.out.println("Nombre: " +getNombre()+ " Precio: " + getPrecio() + " Codigo " + getCodigo()
        + " Descripcion " + getDescripcion());
    };
}
