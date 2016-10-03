/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 8
 *------------------------------------------------------------------
 *@author
 *Paulina Cano Ruiz - 15053
 *Roberto Andres Giron - 15174
 *------------------------------------------------------------------*/
 
public class Paciente <E> implements Comparable<E> {
	private String name;
	private String sintoma;
	private String code;
	
	public Paciente (String nombre, String sintomaa, String codigo){
		name = nombre;
		sintoma = sintomaa;
		code = codigo;
	}
	
	public String getCode (){
		return code;
	}
	
	@Override
	public int compareTo (E new_paciente){
		String new_code = ((Paciente)new_paciente).getCode();
		return code.compareTo(new_code);
	}
	
	public String toString (){
		return name+", " + sintoma + ", " + code;
	}

}
