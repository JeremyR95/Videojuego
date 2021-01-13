
public class Personaje {

	//Atributos
	String nombre;
	int vida;
	
	//Constructor con Atributos
	public Personaje(String nombre, int vida) {
		super();
		this.nombre = nombre;
		this.vida = vida;
	}
	//Constructor Vacio
	public Personaje() {
		super();
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + "]";
	}
	
	//Metodos
	
	public void atacar(int ataque, Personaje p1 ) {
	
	p1.setVida(p1.getVida()- ataque );	
	
		System.out.println(this.nombre + " ataco a " + p1.getNombre());
		System.out.println(p1.getNombre() + " porcentaje vida restante: " +p1.getVida());	
	}
	
	 
	
	public void curarse( Personaje p1) {
		
	if(p1.getVida()>0 && p1.getVida()<100) {

		p1.setVida(10+p1.getVida());
	}
	else if(p1.getVida()== 100) {
		System.out.println("Vida completa");
	}
	else if(p1.getVida()==0) {
		System.out.println("Tu personaje ha muerto");
	}
	}
	
	

	
	
	
	
	
}
