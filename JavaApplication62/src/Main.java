public class Main {
	private static int index = 0;
	final static int size = 1000;

	public static void add(Plant[] plants, Plant p) { // add
		if (index >= size) {
			System.out.println("Array size exceeds!");
			return;
		}

		plants[index] = p;
		index++;
	}

	public static void remove(Plant[] plants, String n) { // remove
		if (index > size)
			return;
		for (int i = 0; i < index; i++) {
			if (plants[i].getName().equals(n)) {
				for (int j = i; j < index - 1; j++)
					plants[j] = plants[j + 1];
				index--;
			}
		}
		//System.out.println("\nRemoved!");
	}

	public static Plant search(Plant[] plants, String n) { // search
		for (int i = 0; i < index; i++) {
			if (plants[i].getName().equals(n)) {
				return plants[i];
			}
		}
		return null;
	}

	public static void display(Plant[] plants) { // display
		for (int i = 0; i < index; i++)
			System.out.println(plants[i]);
	}

	public static void main(String[] args) { // main
		Plant[] plants = new Plant[size];

		Plant p1 = new Flower("Rose", "Red", true, true);
		Plant p2 = new Herb("Bay leaf", "Green", true, "year-round");
		Plant p3 = new Flower("Tulip", "Violet", true, false);
		Plant p4 = new Herb("Oregano", "Green", true, "Summer");
		add(plants, p1);
		add(plants, p2);
		add(plants, p3);
		add(plants, p4);
		display(plants);

		Plant p = search(plants, "Rose");
		if (p != null) {
			System.out.println("Found!");
			//System.out.println(p.toString());
		} else {
			System.out.println("Not Found!");
		}

		remove(plants, "Oregano");
		display(plants);

	}
}