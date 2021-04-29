package M10_3;

public class Modul10fase3 {
	public static void main(String[] args) {
		/* Crea una Functional Interface que continga un m�tode abstracte reverse (),
		que retorne un valor String; en una altra classe, injecta a la interf�cie creada mitjan�ant una lambda el cos del m�tode, 
		de manera que torne la mateixa cadena que rep com a par�metre per� a l'inrev�s. 
		Invoca la inst�ncia de la interf�cie passant-li una cadena i comprovant el resultat. */
		
	ReversoInterfaz cadenaOriginal = (cadena) -> {
	    return new StringBuilder(cadena).reverse().toString();			
	};
	
	
		
		String texto="El dron Ingenuity de la NASA se ha convertido en el primer artefacto de este tipo en volar sobre la superficie de otro planeta ";
		System.out.println("Cadena original:" +texto);
		System.out.println(cadenaOriginal.reverse(texto));
	
}
}