package practicejava;

public class TicketCutting {

	public static void main(String[] args) {
		
		PracticeThread pt1 = new PracticeThread("show me teh ticket");
		PracticeThread pt2 = new PracticeThread("Here is your seat");
		Thread t1=new Thread(pt1);
		Thread t2=new Thread(pt2);
		
		t1.start();
		t2.start();
		

	}

}
