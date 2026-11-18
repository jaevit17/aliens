package modelo.alien;

public class Alien {
	//ATRIBUTOS
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	//CONSTRUCTOR
	public Alien(int tamanio,String color) {
		if(tamanio>4&&tamanio<31) {
			this.tamanio=tamanio;
		}else {
			this.tamanio=10;
		}
		this.precioCuerpo=(this.tamanio/100.0)*20;
		this.precioExtremidad=(this.tamanio/100.0)*10;
		this.precioOjo=(this.tamanio/100.0)*5;
		this.color=color;
	}
	//GETTERS
	public int getTamanio() {
		return tamanio;
	}
	//-----------------------------
	public String getColor() {
		return color;
	}
	//-----------------------------
	public int getNumeroOjos() {
		return numeroOjos;
	}
	//-----------------------------
	public int getNumeroBrazos() {
		return numeroBrazos;
	}
	//-----------------------------
	public int getNumeroPies() {
		return numeroPies;
	}
	//-----------------------------
	public double getPrecioExtremidad() {
		return precioExtremidad;
	}
	//-----------------------------
	public double getPrecioOjo() {
		return precioOjo;
	}
	//-----------------------------
	public double getPrecioCuerpo() {
		return precioCuerpo;
	}
	//METODOS
	public void imprimir() {
		System.out.println("-----ALIEN-----");
		System.out.println("Tamaño: "+tamanio);
		System.out.println("Color: "+color);
		System.out.println("Numero Ojos: "+numeroOjos);
		System.out.println("Numero de Brazos: "+numeroBrazos);
		System.out.println("Numero de Pies: "+numeroPies);
		System.out.println("Precio de Cuerpo: "+precioCuerpo);
		System.out.println("Precio de Extremidad: "+precioExtremidad);
		System.out.println("Precio de Ojos: "+precioOjo);
		
		
	}
}
