
public class Guerrero extends Personaje {

	//atributos
	private String espada;
	private String armadura;
	
	//constructorvacio
	public Guerrero() {
		
	}
	
	//constructor con atributos
	public Guerrero(String nombre, int vida, String espada, String armadura) {
		super(nombre, vida);
		this.espada = espada;
		this.armadura = armadura;
	}

	//getters y setters
	public String getEspada() {
		return espada;
	}

	public void setEspada(String espada) {
		this.espada = espada;
	}

	public String getArmadura() {
		return armadura;
	}

	public void setArmadura(String armadura) {
		this.armadura = armadura;
	}

	@Override
	public String toString() {
		return "Guerrero [espada=" + espada + ", armadura=" + armadura + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//endClass




