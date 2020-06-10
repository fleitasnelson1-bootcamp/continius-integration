/**
 * 
 * @author Nelson Fleitas
 *	Esta clase es para representar un chipero sin identificación.
 *	Con un precio y cantidad disponibles constantes.
 */
public class Chipero {
	private final int STOCK = 50;
	private final int PRECIO = 1000;

	private int _chipasVendidas;
	private int _chipasDisponibles;

	public Chipero() {
		_chipasVendidas = 0;
		_chipasDisponibles = STOCK;
	}
	
	/**
	 * Metodo para consultar si puedes comprar X chipas con Y de dinero.
	 * @param cantidad : Cantidad que se solicita.
	 * @param dinero : Dinero que se ofrece.
	 * @return : True si puedes.
	 */
	public boolean puedeVender(int cantidad) {
		if(!hayChipas()) {
			return false;
		}
		else if( cantidad <= 0 || cantidad > _chipasDisponibles) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Metodo para vender chipas, debe aumentar la cantidad vendida,
	 * y disminuir la cantidad disponible.
	 * @param cantidad : Cantidad de chipas solicitadas.
	 * @return
	 */
	public void vender(int cantidad) {
		//Implementar
	}
	
	/**
	 * Metodo para consultar si el chipero tiene chipas disponibles.
	 * @return True si las tiene.
	 */
	private boolean hayChipas() {
		return _chipasDisponibles > 0;
	}
	
	/**
	 * Metodo para obtener la cantidad de chipas disponibles.
	 * @return _chipasDisponibles
	 */
	public int disponibles() {
		return _chipasDisponibles;
	}
	
	/**
	 * Metodo para obtener la cantidad de chipas disponibles.
	 * @return _chipasVendidas
	 */
	public int vendidas() {
		return _chipasVendidas;
	}
	
}
