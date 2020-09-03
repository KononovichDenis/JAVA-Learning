public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 28;
		boolean genderman = true;
		float height = 1.73f;
		char firstlettername = 'D';

		if(age > 20) {
		    System.out.println("Возраст более 20");
		}

		if(genderman) {
		    System.out.println("Пол мужской");
		}

		if(!genderman) {
		    System.out.println("Пол женский");
		}

		if(height < 1.80) {
		    System.out.println("Рост менее 1.80");
		} else {
		    System.out.println("Рост более 1.80");
		}

		if(firstlettername == 'M') {
		    System.out.println("Первая буква имена M");
		} else if(firstlettername == 'I') {
		    System.out.println("Первая буква имени I");
		} else {
		    System.out.println("Первая буква имени не равна I и M");
		}
	}
}