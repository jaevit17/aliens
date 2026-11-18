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
		precioCuerpo=(tamanio/100)*20;
		precioExtremidad=(tamanio/100)*10;
		precioOjo=(tamanio/100)*5;
	}
}
