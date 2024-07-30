
public class Ropa {
	
	public String marca;
	public String tipo;
	public String color;
	public float precio;
	
	public Ropa() {
	}

	//Constructor con la llave
	public Ropa(String marca) {
		this.marca = marca;
	}

	public Ropa(String marca, String tipo, String color, float precio) {
		this.marca = marca;
		this.tipo = tipo;
		this.color = color;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ropa [marca=" + marca + ", tipo=" + tipo + ", color=" + color + ", precio=" + precio + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
