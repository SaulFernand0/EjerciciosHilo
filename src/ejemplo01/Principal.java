package ejemplo01;

public class Principal {
	
	static Hilo1 h1, h3, h4;
	
	public static void main(String[] args) {
	h1 = new Hilo1();
	h3 = new Hilo1();
	h4 = new Hilo1();
	
	Thread h2 = new Thread(new Hilo2());
	h1.start();
	h2.start();
	
	}
}
