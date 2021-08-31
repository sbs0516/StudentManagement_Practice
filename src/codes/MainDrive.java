package codes;

public class MainDrive {
	
	public static void main(String[] args) {
		
		Student std1 = new Student("송병섭", 1989, true, "010-6820-7867", 95, 100);
		
		System.out.println(std1);
		
		ForeignStudent fStd1 = new ForeignStudent("유학생", 1990, false, "010-6584-8785", 85, 96, 52);
		System.out.println(fStd1);
	}

}
