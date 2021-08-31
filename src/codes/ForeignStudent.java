package codes;

public class ForeignStudent extends Student {
	
	int engScore;
	
	

	public ForeignStudent() {
		super();
	}



	public ForeignStudent(String name, int birthYear, boolean isMale, String phoneNum, int korScore, int mathScore, int engScore) {
		super(name, birthYear, isMale, phoneNum, korScore, mathScore);
		
		this.engScore = engScore;
	}



	@Override
	int calcAvg() {
		
		return (this.korScore + this.mathScore + this.engScore) / 3;
	}

}
