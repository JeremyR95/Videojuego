
public class Hechicero extends Personaje{

	//atributos
	private String poder;

	
	//Constructor vacio
	
	public Hechicero() {
		
	}
	
	//Constructor con atributos
	public Hechicero(String nombre, int vida, String poder) {
		super(nombre, vida);
		this.poder = poder;
		
	//Getters y Setters
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	//toString
	@Override
	public String toString() {
		return "Hechicero [poder=" + poder + "]";
	}
	
	
	
	
	
	
	
	


	
	
	
	
	
	
}
