package innerClass;

public class Fossile {

	public static void main(String[] args) {
		Watch w = new Watch() {
			@Override
			public void giveWatch() {
				System.out.println("Give Fossile Watch!");

			}

		};
		w.giveWatch();

	}

}
