import java.util.Scanner;

public class Videojuego {
	
	static public String user = "magicmike";
	static public int contra = 1234;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hechicero vs Guerrero");
		Scanner sc = new Scanner (System.in);
		String usuario = "";
		int password=0;	
		System.out.println("Usuario");
		usuario = sc.next();
		System.out.println("Password");
		password = sc.nextInt();
		
		
		
		if (usuario.equals(Videojuego.user) && password == Videojuego.contra) {
		
		Hechicero H1 = new Hechicero("Cracklitos", 100, " kamekamejaaa");
		Guerrero G1 = new Guerrero("Omarshito", 100, " ", " ");
		System.out.println();
		H1.atacar(30, G1);
		G1.curarse(G1);
		
		
		

		}
		else {
			System.out.println("No entraste");
		}
		

		
}//endMain
	
}//endClass