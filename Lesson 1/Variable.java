public class Variable {
	public static void main(String[] args) {
		byte numberOfCpuCore = 4;
		short hddFreeSpace = 464;
		int sumRam = 8;
		long hddUsedSpace = 677824307;
		float cacheCpu = 3.10f;
		double coreSpeed = 3.3000d; 
		char firstCpuLetterBrand = 'i';
		boolean fanModeCpu = true;

		System.out.println("Количество ядер процессора = " + numberOfCpuCore);
		System.out.println("Свободного места на HDD (ГБ) = " + hddFreeSpace);
		System.out.println("Количество ОЗУ (ГБ) = " + sumRam);
		System.out.println("Количество занятого места на HDD (Байт) = " + hddUsedSpace);
		System.out.println("Кэш процессора (МБ) = " + cacheCpu);
		System.out.println("Частота процессора (ГГц) = " + coreSpeed);
		System.out.println("Первая буква в названии процессора = " + firstCpuLetterBrand);
		System.out.println("Активен ли FanMode для кулера = " + fanModeCpu);
	}
}