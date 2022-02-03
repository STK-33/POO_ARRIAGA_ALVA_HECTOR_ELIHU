
package modelo;


public class vehiculo {
    private String categoria;
    private String producto;
    private String um;
    private double precio;
    private String imagen;

    public vehiculo() {
    }

    public vehiculo(String categoria, String producto, String um, double precio, String imagen) {
        this.categoria = categoria;
        this.producto = producto;
        this.um = um;
        this.precio = precio;
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

   
}
