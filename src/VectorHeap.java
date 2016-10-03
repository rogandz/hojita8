import java.util.PriorityQueue;
import java.util.Vector;

/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 8
 *------------------------------------------------------------------
 *@author
 *Paulina Cano Ruiz - 15053
 *Roberto Andres Giron - 15174
 *-----------------------------------------------------------------*/

public class VectorHeap < E extends Comparable<E>> extends PriorityQueue<E>{
	
	
	protected Vector<E> data; //Datos ordenados
	
	public VectorHeap(){
	data = new Vector<E>();
	}
	
	public VectorHeap(Vector<E> v){
	int i;
	data = new Vector<E>(v.size()); // Tamano del vector
	for (i = 0; i < v.size(); i++)
	{ // Agregar elementos para hacer el heap
	add(v.get(i));
	}
	}
	
	//Padre
	protected static int parent(int pos)
	{
	return (pos-1)/2;
	}
	
	//hijo izquierdo
	protected static int left(int pos)
	{
	return 2*pos+1;
	}
	
	//hijo derecho
	protected static int right(int pos){
	return 2*(pos+1);
	}
}