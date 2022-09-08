
public class Main {

	public static void main(String[] args) {

		//Primera Parte
		int total = suma(2,5,6);
		System.out.println(total);
		
		//Segunda Parte
		Coche c = new Coche();
		c.agregarPuertas(1);
		c.agregarPuertas(3);
		System.out.println("Mi coche tiene "+c.puertas+" puertas");
		
	}
	
	public static int suma(int a,int b,int c) {
		return a+b+c;
	}
	

}


class Coche{
	
	public int puertas=0;
	
	public void agregarPuertas(int puertas) {
		this.puertas+=puertas;
	}
	
}
