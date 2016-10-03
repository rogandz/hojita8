/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 8
 *------------------------------------------------------------------
 *@author
 *Paulina Cano Ruiz - 15053
 *Roberto Andres Giron - 15174
 *------------------------------------------------------------------*/
 

public interface PriorityQueue<E extends Comparable<E>>
{
	public E getFirst();
	public E remove();
	
	//Agregar elemento a la cola
	public void add(E value);
	//Determina si esta vacia o no la cola
	public boolean isEmpty();
	//Devuelve el tamano
	public int size();
	//Elimina todos los elementos 
	public void clear();

}