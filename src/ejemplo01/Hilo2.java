package ejemplo01;

public class Hilo2 extends Thread{
	int sum=0;
	
	@Override
	public void run() {
		for (int i=1;i<=10;i++) {
			if (i%2!=0) {
				System.out.println(i);
				sum = sum+i;
			}
		}
		
		System.out.println("Suma:" +sum);
	}
}


