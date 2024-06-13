import java.util.*;
public class AnalisisEdad {
	public ArrayList <Integer> numeros = new ArrayList<Integer>();
	int pares = 0;
	int impares = 0;
	public void numeros (ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public String comprobar (ArrayList<Integer> numeros) {
		for (int i=0;i<numeros.get(i);i++) {
			if(numeros.get(i)%2==0) {
				pares = pares + numeros.get(i);
			}
			if(numeros.get(i)%2==1) {
				impares = impares + 1;
			}
		}
		String mensaje = "Suma de pares: " + pares + ", Recuento de impares: " + impares ;
		return mensaje;
	}

}
