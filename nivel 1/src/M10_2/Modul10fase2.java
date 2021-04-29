package M10_2;

public class Modul10fase2 {
	// objeto de la interfaz funcional Pi.  con una operación que debe retornar un double
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PiInterfaz objPi = () -> {return 3.1415;};

	
			System.out.println(objPi.getPiValue());
		
		}
		
		}

