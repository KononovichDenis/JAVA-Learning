public class Wolf {

	private String gender;
	private String nickName;
	private int weight;
	private int age;
	private String coloring;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
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