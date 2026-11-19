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
	private double precioTotal=0;
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
	//-----------------------------
	public double getPrecioTotal() {
		return precioTotal;
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
		
	public boolean agregarBrazos(int cantidadBrazos) {
		if(cantidadBrazos>0 &&(this.numeroBrazos + this.numeroPies+cantidadBrazos)<11) {
			this.numeroBrazos+=cantidadBrazos;
			calcularPrecioTotal();
			return true;
		}else {
			return false;
		}
		
	}
	public boolean agregarPiernas(int cantidadPiernas) {
		if(cantidadPiernas>0 &&(this.numeroBrazos + this.numeroPies+cantidadPiernas)<11) {
			this.numeroPies+=cantidadPiernas;
			calcularPrecioTotal();
			return true;
		}else {
			return false;
		}
	}
	public boolean agregarOjos(int cantidadOjos) {
		if(tamanio>4&&tamanio<11&&cantidadOjos>0&&(this.numeroOjos+cantidadOjos)<4) {
			this.numeroOjos+=cantidadOjos;
			calcularPrecioTotal();
			return true;
		}else if(tamanio>10&&tamanio<21&&cantidadOjos>0&&(this.numeroOjos+cantidadOjos)<5){
			this.numeroOjos+=cantidadOjos;
			calcularPrecioTotal();
			return true;
		}else if(tamanio>20&&tamanio<31&&cantidadOjos>0&&(this.numeroOjos+cantidadOjos)<7){
			this.numeroOjos+=cantidadOjos;
			calcularPrecioTotal();
			return true;
		}else {
			return false;
		}
	}
	public void calcularPrecioTotal() {
		int extremidades=(numeroBrazos+numeroPies);
		double suma=precioCuerpo+(extremidades*precioExtremidad)+(numeroOjos*precioOjo);
		this.precioTotal=suma;
	}
	
}
