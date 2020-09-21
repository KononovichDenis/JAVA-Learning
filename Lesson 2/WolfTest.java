class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.nickName = "Wolfie";
		wolf.age = 5;
		wolf.weight = 25;
		wolf.coloring = "gray";

		System.out.println(wolf.nickName());
		System.out.println(wolf.age());
		System.out.println(wolf.weight());
		System.out.println(wolf.coloring());
	}
}