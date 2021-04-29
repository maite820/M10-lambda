package M10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Modul10fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nombres = ListaNombres;
		System.out.print("Lista de nombres original : ");
		for (String s : nombres) {
			System.out.print(s + ", ");
		}

		List<Integer> ShowIntegers = ListaIntegers;
		System.out.print("\nLista de números original:");
		ShowIntegers.forEach(s -> System.out.print(s + ", "));

		List<String> ListadoStrings = Planetas;
		System.out.print("\nListados de planetas original:");
		for (String r : ListadoStrings) {
			System.out.print(r + ", ");
		}

		System.out.println("\n");
		// FASE 1
		// ejercicio 1 (nombres de 3 letras)

		System.out.println("\n Ejercicio 1 :Lista de nombres que empiezan por mayuscula con solo 3 letras:");
		nombres.stream().filter((s) -> s.startsWith("A") && s.length() == 3).forEach(s -> System.out.print(s + ", "));
		System.out.println("\n");

		// ejercicio 2( añadir e impar, añadir o par)

		// lista
		List<String> ShowIntegersString = new ArrayList<String>();

		ShowIntegers.stream().forEach((Consumer<? super Integer>) new Consumer<Integer>() {
			@Override
			public void accept(Integer num) {
				if (num % 2 == 0) {
					ShowIntegersString.add("e" + String.valueOf(num));
				} else {
					ShowIntegersString.add("o" + String.valueOf(num));
				}
			}

		});
		System.out.println("\n-Ejercicio 2 :Lista modificada, acompañada de la letra e o o:");
		for (String i : ShowIntegersString) {
			System.out.print(i + ", ");
		}
		System.out.println("\n");

		// ejercicio 3 (string que contenga la letra o)

		List<String> stringsLetraO = Planetas;

		System.out.println("Ejercicio 3: Lista de palabras que contiene la letra o");
		stringsLetraO.stream().filter((r) -> r.contains("o")).forEach(r -> System.out.print(r + ", "));
		System.out.println("\n");

		// ejercicio 4 (Strings con mas de 5 letras)

		System.out.println("Ejercicio 4: Strings con mas de 5 letras son: ");
		ListadoStrings.stream().filter((r) -> (r.length() >= 5)).forEach(r -> System.out.print(r + ", "));
		System.out.println("\n");

		// ejercicio 5: meses con lambda

		List<String> stringsMes = ListadoMeses;
		System.out.println("Ejercicio 5:listado meses con lambda-");

		stringsMes.stream().forEach(s -> System.out.print(s + "," + " "));
		System.out.println();
		System.out.println("\n");
		
		// ejercicio 6: meses con metodo reference
		System.out.println("Ejercicio 6:listado meses con metodo reference-");

		stringsMes.forEach(System.out::println);

	}

	// METODO PARA CREAR NOMBRES

	private static List<String> ListaNombres = Arrays.asList("Ana", "Alba", "María", "Maite", "Ari");

	/*
	 * private static List<String> ListaNombres() {
	 * 
	 * 
	 * List<String> prov= new ArrayList<String>(); prov.add("Ana");
	 * prov.add("Alba"); prov.add("María"); prov.add("Maite"); prov.add("Ari");
	 * return prov; }
	 */

	// LISTA INTEGER (PARES E IMPARES)

	private static List<Integer> ListaIntegers = Arrays.asList(2021, 2300, 2034, 1911, 1972, 1971, 2020, 2019);

	/*
	 * private static List<Integer> ListaIntegers() { List<Integer> prov= new
	 * ArrayList<Integer>(); prov.add((Integer)2021); prov.add((Integer)2300);
	 * prov.add((Integer)2034); prov.add((Integer)1911); prov.add((Integer)1972);
	 * prov.add((Integer)1971); prov.add((Integer)2020); prov.add((Integer)2019);
	 * return prov; }
	 */
	// lista de Strings
	private static List<String> Planetas = Arrays.asList("Mercury", "Venu", "Terra", "Marte", "Jupiter", "Saturno",
			"Uran", "Neptuno");

	// lista de Strings
	private static List<String> ListadoMeses = Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "junio",
			"julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre");

}
