public class Wolf {

	private String gender = "he-wolf";
	private String nickName = "Wolfie";
	private int weight = 25;
	private int age = 5;
	private String coloring = "gray";

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String gender) {
		this.nickName = nickName;
	}

	public int weight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int age() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColoring() {
		return coloring;
	}

	public void setColoring(String coloring) {
		this.coloring = coloring;
	}

	boolean move() {
		return true;
	}

	void sit() {

	}

	boolean run() {
		return true;
	}

	void howl() {

	}

	boolean hunt() {
		return true;
	}
}