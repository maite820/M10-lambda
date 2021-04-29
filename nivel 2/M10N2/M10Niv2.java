package M10N2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class M10Niv2 {
	
		public static void main(String[] args) {
			/* String formada por palabras y numeros. Interfaz funcional Operacio() devuelve float.
			 * lambda con transformacion de suma, resta, multiplicacion y division.
			 * matriu que contingui algunes cadenes de text y numeros.
			 * Ordenar  */
			
			String[] ListaOriginal = { "oceanos", "nasa", "112", "antena","oreo" ,
					"20", "1","elena","eternamente" };
			System.out.println(" original:\n"+ Arrays.toString(ListaOriginal) +"\n");
			
			System.out.println("Modulo 10 lambda: NIVEL 2     ");	
			
			System.out.println("\n-Lista Filtrada por longitud de menor a mayor");
			
			
				
				List<String> OriginalDesc= Stream.of(ListaOriginal)
						.sorted(Comparator.comparing(String::length))
						.collect(Collectors.toList());
						
				System.out.println( OriginalDesc +"\n");
			
			
			
			
				
			System.out.println("\n-Lista Filtrada por longitud de mayor a menor");
				
			List<String> OriginalAsc= Stream.of(ListaOriginal)
					.sorted(Comparator.comparing(String::length).reversed())
					.collect(Collectors.toList());
			
			System.out.println( OriginalAsc +"\n");
				
				System.out.println("\n-Lista Filtrada por primer caracter");
				
				Arrays.sort(ListaOriginal, (a, b) -> Character.compare(
						Character.toLowerCase(a.charAt(0)), Character.toLowerCase(b.charAt(0))
						));
				
				System.out.println( Arrays.toString(ListaOriginal));
					
				System.out.println("\n-String que contine 'e' primero ");
				// - les cadenes que contenen 'e' primer, tota la resta en segon lloc
				Arrays.sort(ListaOriginal, Comparator.comparingInt(
						a -> (a.contains("e") || a.contains("E") ? 0 : 1)
						));
				
				System.out.println(  Arrays.toString(ListaOriginal));
				
				
				System.out.println("\n-Lista sustituyendo'a' por '4'");
		
				
				ListaOriginal = Arrays.stream(ListaOriginal)
						.map(string -> string.replace("a", "4"))
						.toArray(String[]::new);
		
				System.out.println( Arrays.toString(ListaOriginal));
				
				System.out.println("\n-Lista solo 100% numericos");
			
				String[] ListaOriginalNumbers = Arrays.stream(ListaOriginal)
						.filter(string -> string.matches("[0-9]*"))
						.toArray(String[]::new);
		
				System.out.println(Arrays.toString(ListaOriginalNumbers));
				
			

			/*
			Interface
			 */
				IOperacion suma = (Float num1, Float num2) ->  num1 + num2;
				System.out.println("\nsuma: " + suma.operacion(35.25F, 20.25F));
				
				IOperacion resta = (Float num1, Float num2) ->  num1 - num2;
				System.out.println("resta: " + resta.operacion(35.25F, 20.25F));
				
				IOperacion multiplicacion = (Float num1, Float num2) ->  num1 * num2;
				System.out.println("multiplicacion: " + multiplicacion.operacion(10.25F, 10F));
				
				IOperacion division = (Float num1, Float num2) ->  num1 / num2;
				System.out.println("division: " + division.operacion(10.25F, 10F));
				
		}

		
	}
	


