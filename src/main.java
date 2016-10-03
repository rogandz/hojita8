import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 8
 *------------------------------------------------------------------
 *@author
 *Paulina Cano Ruiz - 15053
 *Roberto Andres Giron - 15174
 *-----------------------------------------------------------------*/


public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String file = "pacientes.txt";
		String[] sep; //separador
		BufferedReader br = new BufferedReader(new FileReader(file));
	    String line;
	    
	    Vector<Paciente> listpacientes = new Vector<Paciente>();
	    
        try {
			while ((line = br.readLine()) != null) {
				//separador de frases
			    sep=line.split(",");
			    listpacientes.add(new Paciente(sep[0], sep[1], sep[2]));
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
        
        //Impresion original de los pacientes
        System.out.println("Lista Original de datos: \n");
        for(int i=0; i<listpacientes.size(); i++){
            System.out.println(listpacientes.get(i));
		}

        
        System.out.println("\nAtención de emergencias\n");
        
        VectorHeap vecheap = new VectorHeap(listpacientes);
		String ordenados="";
        while(vecheap.iterator().hasNext()){
			Paciente paciente = (Paciente) vecheap.poll();
			ordenados += paciente.toString()+"\n";
		}
		
		//Impresion de los pacientes ordenados
		System.out.println(ordenados);
		
		System.out.println("Atención de emergencias usando heap\n");
		
		ordenados="";
		VectorHeap_implementa vecheap2 = new VectorHeap_implementa(listpacientes);
		int size=vecheap2.size();
		
		for(int i=0; i<size; i++){
			Paciente paciente = (Paciente)vecheap2.remove();
			ordenados += paciente.toString()+"\n";
		}
		System.out.println(ordenados);
	}
	
}