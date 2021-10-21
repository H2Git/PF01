package vo;

public class Sc_Vo {

	private int sc_Code;
	private int sc_Score;

	public Sc_Vo(int sc_Code, int sc_Score) {
		super();
		this.sc_Code = sc_Code;
		this.sc_Score = sc_Score;
	}

	public int getSc_Code() {
		return sc_Code;
	}

	public int getSc_Score() {
		return sc_Score;
	}

	public void setSc_Code(int sc_Code) {
		this.sc_Code = sc_Code;
	}

	public void setSc_Score(int sc_Score) {
		this.sc_Score = sc_Score;
	}

}
