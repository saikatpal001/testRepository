package practicejava;

public class PracticeThread extends Thread {

	public String str;
	public PracticeThread(String str) {

		this.str=str;
		
		}
public void run() {
	
	for (int i = 1; i <= 10; i++) {
		System.out.println(str + i);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
	}

