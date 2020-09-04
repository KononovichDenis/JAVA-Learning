public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 28;
		if(age > 20) {
		    System.out.println("Возраст более 20 лет");
		}

		boolean genderMan = true;
		if(genderMan) {
		    System.out.println("Пол мужской");
		}

		if(!genderMan) {
		    System.out.println("Пол женский");
		}

		float height = 1.73f;
		if(height < 1.80) {
		    System.out.println("Рост менее 1.80 м");
		} else {
		    System.out.println("Рост более 1.80 м");
		}

		char firstLetterName = 'D';
		if(firstLetterName == 'M') {
		    System.out.println("Первая буква имена M");
		} else if(firstLetterName == 'I') {
		    System.out.println("Первая буква имени I");
		} else {
		    System.out.println("Первая буква имени не равна I и M");
		}
	}
}