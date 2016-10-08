package pckThread;

public class MiThread extends Thread {
	MiThread(String identificador){
		super(identificador);
	}
	
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println(i+" "+getName());
		System.out.println("Fin Thread"+getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MiThread("Julio").start();
		new MiThread("Lucas").start();
	}
}
