package ejemplo02;


public class Principal {
	
	public static void main(String[] args) {
		String[] personas= {
				"Jezer", "Pablo", "Mateo", "Enrique", "Luis", "Ricardo", "Maria", "Karen", "Paola", "Sofia"
		};
		
		for (String per: personas) {
			Hilo1 h1 = new Hilo1(per);
			Thread th = new Thread(h1);
			th.start();
		}
	}
}
