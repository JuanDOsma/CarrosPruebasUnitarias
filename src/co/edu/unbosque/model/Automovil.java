package co.edu.unbosque.model;

public class Automovil {
	private String marca;
	private String modelo;
	private String anio;
	private String placa;
	private String puertas;
	private String capacidad;
	private String tipo;
	
	public Automovil(String placa, String modelo, String marca, String anio, String puertas, String capacidad, String tipo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.placa = placa;
		this.puertas = puertas;
		this.capacidad = capacidad;
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPuertas() {
		return puertas;
	}
	public void setPuertas(String puertas) {
		this.puertas = puertas;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
