package ejemplo02;

public class Hilo1  extends Thread{
	private String persona;
	public Hilo1(String persona) {
		this.persona = persona;
	}
	
	@Override
	public void run() {
		for (int i=1; i<=3; i++) {
			System.out.println(persona+ " come un " +i+ " pan con mermelada");
			
		}
		
		System.out.println("Terminó de comer " +persona);
	}
}
