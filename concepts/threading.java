import java.io.*;

class threading extends Thread {
	public int delay;

	threading(int delay) {
		this.delay = delay;
	}

	public void run() {
		int i = 1000;
		while (i > 0) {
			System.out.println(getName());
			System.out.println("An individual thread is running with " + i + " and delay " + this.delay);
			try {
				Thread.sleep(this.delay);
			} catch (InterruptedException e) {
				;
			}
			i--;
		}
	}

	public static void main(String[] args) {
		threading p = new threading(500);
		threading p2 = new threading(1000);
		
		p.start();
		p2.start();
	}
}