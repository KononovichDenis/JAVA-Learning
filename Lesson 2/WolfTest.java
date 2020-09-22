class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.setNickName("Wolfie");
		wolf.setGender("he-wolf");
		wolf.setAge(5);
		wolf.setWeight(25);
		wolf.setColoring("gray");

		System.out.println(wolf.getNickName());
		System.out.println(wolf.getGender());
		System.out.println(wolf.getAge());
		System.out.println(wolf.getWeight());
		System.out.println(wolf.getColoring());
	}
}