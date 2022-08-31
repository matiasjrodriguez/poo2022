package poo2022.ejercicio01;

public class Libro {
	private String autor;
	private String titulo;
	private String ISBN;
	private int cantidadTotal;
	private int cantidadDisponibles;
	private int numPaginas;
	private static int totalPrestamos = 0;
	


	public Libro(String autor, String titulo, String ISBN, int cantidadTotal,
			int numPaginas) {
		this.autor = autor;
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.cantidadTotal = cantidadTotal;
		this.cantidadDisponibles = cantidadTotal;
		this.numPaginas = numPaginas;
	}
	
	public Libro(String autor, String titulo, int cantidadTotal, 
			int numPaginas) {
		this(autor, titulo, "", cantidadTotal, numPaginas);
	}
	
	public void mostrarDescripcion() {
		System.out.println("El libro " + this.titulo + " creado por el autor "
				+ this.autor + " tiene " + this.numPaginas + " páginas, "
				+ "quedan " + this.cantidadDisponibles + " disponibles y se "
				+ "prestaron " + (cantidadTotal - cantidadDisponibles));
	}
	
	public void mayorPaginas(Libro libro){
		if (this.numPaginas > libro.getNumPaginas()){
			System.out.println("El libro " + this.titulo + " tiene más páginas");
		}else if (this.numPaginas < libro.getNumPaginas()){
			System.out.println("El libro " + libro.getTitulo() 
			+ " tiene más páginas");
		}else{
			System.out.println("Ambos tienen misma cantidad de páginas");
		}
		
	}
	
	public void prestar() {
		if (this.cantidadDisponibles > 1) {
			this.cantidadDisponibles = this.cantidadDisponibles - 1;
			Libro.totalPrestamos = Libro.totalPrestamos + 1;
			System.out.println("Libro prestado con éxito.");
		} else {
			System.out.println("Queda un solo ejemplar.");
		}
	}
	
	public void devolver() {
		if (this.cantidadDisponibles < this.cantidadTotal) {
			this.cantidadDisponibles = this.cantidadDisponibles + 1;
			System.out.println("Libro devuelto");
		} else {
			System.out.println("No hay libros prestados");
		}
	}
	
	public static int getTotalPrestamos() {
		return totalPrestamos;
	}
	
	public String getISBN() {
		return this.ISBN;
	}

	public int getNumPaginas() {
		return numPaginas;
	}
	
	public String getTitulo() {
		return titulo;
	}

}