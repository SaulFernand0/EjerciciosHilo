package ejemplo01;

public class Hilo1  extends Thread{
	
	@Override
	public void run() {
		int suma=0;
		for (int i=1;i<=10;i++) {
			if (i%2==0) {
				System.out.println(i);
				suma = suma+i;
			}
		}
		
		System.out.println("Suma:" +suma);
		
	}
}