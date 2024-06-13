import java.util.ArrayList;

public class PrincipalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(25);
		numeros.add(12);
		numeros.add(3);
		numeros.add(56);
		numeros.add(78);
		numeros.add(32);
		
		AnalisisEdad analisis = new AnalisisEdad();
		System.out.println(analisis.comprobar(numeros));
	}

}
