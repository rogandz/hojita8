/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 8
 *------------------------------------------------------------------
 *@author
 *Paulina Cano Ruiz - 15053
 *Roberto Andres Giron - 15174
 *------------------------------------------------------------------*/
import java.util.Vector;

public class VectorHeap_implementa<E extends Comparable<E>> implements PriorityQueue<E>{

	protected Vector<E> data; // the data, kept in heap order
	
	public VectorHeap_implementa()
	{
		data = new Vector<E>();
	}
	
	public VectorHeap_implementa(Vector<E> vector)
	{
		data = new Vector<E>(vector.size()); // we know ultimate size
		for (int i = 0; i < vector.size(); i++)
			{ // add elements to heap
			add(vector.get(i));
			}
	}
	
	protected static int parent(int pos)
	{
		return (pos-1)/2;
	}
	
	protected static int left(int pos)
	{
		return 2*pos+1;
	}
	
	protected static int right(int pos)
	{
		return 2*(pos+1);
	}

	protected void percolateUp(int hoja)
	// pre: 0 <= leaf < size
	// post: moves node at index leaf up to appropriate position
	{
		int parent = parent(hoja);
		E value = data.get(hoja);
		while (hoja > 0 && (value.compareTo(data.get(parent)) < 0))
		{
			data.set(hoja,data.get(parent));
			hoja = parent;
			parent = parent(hoja);
		}
		data.set(hoja,value);
	}
	
	protected void pushDownRoot(int raiz)
	{
		int heapSize = data.size();
		E value = data.get(raiz);
		while (raiz < heapSize) 
		{
			int childpos = left(raiz);
			if (childpos < heapSize)
			{
				if ((right(raiz) < heapSize) && ((data.get(childpos+1)).compareTo (data.get(childpos)) < 0))
				{
					childpos++;
				}
				if ((data.get(childpos)).compareTo (value) < 0)
				{
					data.set(raiz,data.get(childpos));
					raiz = childpos; 
			} else { 
				data.set(raiz,value);
				return;
			}
			} else { 
				data.set(raiz,value);
				return;
			}
		}
	}

	public void add(E value)
	{
		data.add(value);
		percolateUp(data.size()-1);
	}
	
	@Override
	public E remove() {
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if(data.size()>1){pushDownRoot(0);};
		return minVal;
	}

	public boolean isEmpty() {
		return false;
	}

	public int size() {
		return data.size();
	}

	public void clear() {
	}

	public E getFirst() {
		return data.get(0);
	}
}