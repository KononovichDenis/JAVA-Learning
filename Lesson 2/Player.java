/*
Player — описывает игроков (один экземпляр класса соответствует одному игроку)
Класс Player должен иметь следующие поля и методы:
String name — имя игрока (одного!)
int number — введенное пользователем число
геттеры/сеттеры (по необходимости)
*/
public class Player {

	private String name;
	private int number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}