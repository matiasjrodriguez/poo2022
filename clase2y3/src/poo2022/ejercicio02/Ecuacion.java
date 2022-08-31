package poo2022.ejercicio02;
import java.lang.Math;

public class Ecuacion {
	private int x;
	private int a;
	private int b;
	private int c;
	
	public Ecuacion(int x, int a, int b, int c) {
		this.x = x;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Raiz resolver() {
		int a = this.a;
		int b = this.b;
		int c = this.c;
		
		int raiz = (b*b)-(4*a*c);
		int denominador = 2*a;
		
		Raiz raices = new Raiz();
		
		raices.setX1(
				(-b + Math.sqrt(raiz))
				/ denominador
		);
		
		raices.setX2(
				(-b - Math.sqrt(raiz))
				/ denominador
		);
		
		return raices;
		
	}
	
	public int getX() {
		return x;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}	
}