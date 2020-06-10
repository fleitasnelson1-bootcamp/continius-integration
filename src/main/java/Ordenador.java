import java.util.stream.IntStream;

/**
 * 
 * @author Nelson Fleitas.
 * 
 * Esta clase se usa para ordenar listas de numeros.	
 * Se usa para arreglos de hasta 15 elementos.
 * No permiten enteros negativos.
 */
public class Ordenador {
	private final int LIMITE = 15;
	/**
	 * @method ordenAscendente : Ordena un arreglo de enteros de menor a mayor.
	 * @param lista : Arreglo de enteros.
	 * @return : devuelve una lista ordenada a partir de lista.
	 * @exception : IllegalArgumentException si la lista argumentada 
	 * 	tiene más de 15 elementos, si tiene algún valor negativo,
	 * 	si la lista está vacía o si recibe null.
	 */
	public int[] ordenAscendente(int[] lista) {
		if( !listaCorrecta(lista) || contieneNegativo(lista) ) {
			throw new IllegalArgumentException(" Se ha pasado un argumento no procesable. ");
		}
		
		return IntStream.of(lista).sorted().toArray();
	}
	
	/**
	 * @method ordenDescendente : Ordena un arreglo de enteros de mayor a menor.
	 * @param lista :  Arreglo de enteros.
	 * @return : devuelve una lista ordenada a partir de lista.
	 * @exception : IllegalArgumentException si la lista argumentada 
	 * 	tiene más de 15 elementos, si tiene algún valor negativo, 
	 *  si la lista está vacía o si recibe null.
	 */
	public int[] ordenDescendente(int[] lista) {
		if( !listaCorrecta(lista) || contieneNegativo(lista) ) {
			throw new IllegalArgumentException(" Se ha pasado un argumento no procesable. ");
		}
		
		/* Lei en StackOverflow esta forma de hacer un orden descendente. */
		return IntStream.of(lista)
				.map( n -> n * -1 ) //Convertir todos los enteros en negativos.
				.sorted()
				.map(n -> n * -1 )
				.toArray();
	}
	
	/**
	 * @method contieneNegativo : Verifica que un arreglo de enteros tenga alguno negativo.
	 * @param lista : Una lista de enteros
	 * @return : True si tiene algun numero negativo, False ni no.
	 */
	private boolean contieneNegativo(int[] lista) {
		//Retorna true si encuentra algun numero menor a 0.
		return IntStream.of(lista).anyMatch( (n) -> n < 0 );
	}
	
	/**
	 * @method listaCorrecta : Verifica que una lista cumpla los requisitos para ser procesada.
	 * @param lista : lista de enteros.
	 * @return : Retorna false si la lista es null, si está vacía, 
	 *  o si tiene mas del limite de elementos.
	 */
	private boolean listaCorrecta(int[] lista) {
		if(lista == null) {
			return false;
		}
		
		if(lista.length == 0 || lista.length > LIMITE) {
			return false;
		}
		
		return true;
	}
}
