package codes;

public class ForeignStudent extends StudentData {
	
	int engScore;
	
	
	public ForeignStudent() {
		super();
	}

	

	public ForeignStudent(int engScore) {
		super();
		this.engScore = engScore;
	}


	@Override
	int calcAvg(int kor, int math) {
		
		return (super.korScore + super.mathScore + this.engScore) / 3;
	}

}
