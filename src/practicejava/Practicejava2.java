package practicejava;

public class Practicejava2 {

	public static void main(String[] args) {

		Thread T = Thread.currentThread();
		System.out.println("the current thread is " + T);
		System.out.println(T.getName());
		System.out.println(T.getPriority());

	}

}
