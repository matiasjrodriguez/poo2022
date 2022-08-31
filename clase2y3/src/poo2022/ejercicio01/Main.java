package poo2022.ejercicio01;

public class Main {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Ephron Nora", "No me acuerdo de nada", 3, 1476);
		Libro libro2 = new Libro("London Kate ", "Post Mortem", "9789878474489",
				10, 1476);
		
		System.out.println(Libro.getTotalPrestamos());
		libro1.prestar();
		System.out.println(Libro.getTotalPrestamos());
		libro1.prestar();
		System.out.println(Libro.getTotalPrestamos());
		libro1.prestar();
		System.out.println(Libro.getTotalPrestamos());
		libro2.prestar();
		System.out.println(Libro.getTotalPrestamos());
	}
}
