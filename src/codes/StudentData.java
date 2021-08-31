package codes;

public class StudentData {
	
	String name;
	int birthYear;
	boolean isMale;
	int phoneNum;
	int korScore;
	int mathScore;
	
	public StudentData() {
		
	}

	public StudentData(String name, int birthYear, boolean isMale, int phoneNum, int korScore, int mathScore) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.isMale = isMale;
		this.phoneNum = phoneNum;
		this.korScore = korScore;
		this.mathScore = mathScore;
	}

	int calcAvg (int kor, int math) {
		return (this.korScore + this.mathScore) / 2 ;
	}
}
