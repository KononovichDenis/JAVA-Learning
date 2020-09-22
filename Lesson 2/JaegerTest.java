class JaegerTest {
	public static void main(String[] args) {
		Jaeger obsidianFury = new Jaeger();
		obsidianFury.setModelName("Obsidian Fury");
		obsidianFury.setMark("Mark-01");
		obsidianFury.setOrigin("USA");
		obsidianFury.setHeight(65.5f);
		obsidianFury.setWeight(11.3f);
		obsidianFury.setSpeed(5);
		obsidianFury.setStrength(9);
		obsidianFury.setArmor(9);

		System.out.println(obsidianFury.getModelName());
		System.out.println(obsidianFury.getMark());
		System.out.println(obsidianFury.getOrigin());
		System.out.println(obsidianFury.getHeight());
		System.out.println(obsidianFury.getWeight());
		System.out.println(obsidianFury.getSpeed());
		System.out.println(obsidianFury.getStrength());
		System.out.println(obsidianFury.getArmor());

		Jaeger gipsyAvenger = new Jaeger();
		gipsyAvenger.setModelName("Gipsy Avenger");
		gipsyAvenger.setOrigin("Japan");
		gipsyAvenger.setHeight(61.3f);
		gipsyAvenger.setWeight(9.5f);
		gipsyAvenger.setSpeed(7);
		gipsyAvenger.setStrength(9);
		gipsyAvenger.setArmor(7);

		System.out.println("\n" + gipsyAvenger.getModelName());
		System.out.println(gipsyAvenger.getOrigin());
		System.out.println(gipsyAvenger.getHeight());
		System.out.println(gipsyAvenger.getWeight());
		System.out.println(gipsyAvenger.getSpeed());
		System.out.println(gipsyAvenger.getStrength());
		System.out.println(gipsyAvenger.getArmor());
	}
}