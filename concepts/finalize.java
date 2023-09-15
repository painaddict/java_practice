class destroy {
	destroy() {
		System.out.println("Destroying object..");
		try {
			super.finalize();
		} catch (Throwable t) {
			System.out.println("Exception caught");
		}
	}
}

public class finalize {
	public static void main(String[] args) {
		destroy obj = new destroy();
	}
}