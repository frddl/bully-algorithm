import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hey, please enter the amount of processes to start:");
		int processes = in.nextInt();
		
		MyThread[] t = new MyThread[processes];

		for (int i = 0; i < processes; i++)
			t[i] = new MyThread(new Process(i+1), processes);
		
		Election.initialElection(t);

		for (int i = 0; i < processes; i++)
			new Thread(t[i]).start();
	}
}
