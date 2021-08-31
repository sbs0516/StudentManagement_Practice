package codes;

public class Student {
	
	String name;
	int birthYear;
	boolean isMale;
	String phoneNum;
	int korScore;
	int mathScore;
	
	public Student() {
		
	}

	public Student(String name, int birthYear, boolean isMale, String phoneNum, int korScore, int mathScore) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.isMale = isMale;
		this.phoneNum = phoneNum;
		this.korScore = korScore;
		this.mathScore = mathScore;
	}

	int calcAvg () {
		return (korScore + mathScore) / 2 ;
	}
	void possibleUniversity (int avg) {
		if(avg >= 95) {
			System.out.println("최상위권");
		} else if(avg >= 90) {
			System.out.println("상위권");
		} else if(avg >= 80) {
			System.out.println("인서울");
		} else {
			System.out.println("기타");
		}
	}
	@Override
	public String toString() {
		return this.name+"-"+this.birthYear+"년생/평균-"+this.calcAvg()+"점";
	}
}
