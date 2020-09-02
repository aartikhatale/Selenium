package innerClass;

public class TubeLight {

	public static void main(String[] args) {
		Light l = new Light() {

			public String giveLight() {
				return "Give TubeLight";
			}

		};
		System.out.println(l.giveLight());
	}

}
