package innerClass;

public class Dog {

	public static void main(String[] args) {
		Animal a = new Animal() {
			@Override
			public void animalVoice() {
				System.out.println("Dog barks!");

			}

		};
		a.animalVoice();
	}

}
