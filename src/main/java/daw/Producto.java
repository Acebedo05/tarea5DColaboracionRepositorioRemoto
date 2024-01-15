package daw;

/**
 *
 * @author acebedo
 */
public class Producto {

    // Atributos.
    private String marca;
    private int precio;
    private double descuento;

    public Producto(String marca, int precio, double descuento) {
        this.marca = marca;
        this.precio = precio;
        this.descuento = descuento;
    }

    public Producto() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("marca=").append(marca);
        sb.append(", precio=").append(precio);
        sb.append(", descuento=").append(descuento);
        sb.append('}');
        return sb.toString();
    }
    
    
}
