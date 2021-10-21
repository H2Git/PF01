package vo;

public class St_Vo {

	private String st_code;
	private String st_Teamcode;
	private String st_Name;
	private String st_Pw;
	private int st_Score;
	private int st_Major;

	public St_Vo(String st_code, String st_Teamcode, String st_Name, String st_Pw, int st_Score, int st_Major) {
		super();
		this.st_code = st_code;
		this.st_Teamcode = st_Teamcode;
		this.st_Name = st_Name;
		this.st_Pw = st_Pw;
		this.st_Score = st_Score;
		this.st_Major = st_Major;
	}

	public String getSt_code() {
		return st_code;
	}

	public String getSt_Teamcode() {
		return st_Teamcode;
	}

	public String getSt_Name() {
		return st_Name;
	}

	public String getSt_Pw() {
		return st_Pw;
	}

	public int getSt_score() {
		return st_Score;
	}

	public int getSt_Major() {
		return st_Major;
	}

	public void setSt_code(String st_code) {
		this.st_code = st_code;
	}

	public void setSt_Teamcode(String st_Teamcode) {
		this.st_Teamcode = st_Teamcode;
	}

	public void setSt_Name(String st_Name) {
		this.st_Name = st_Name;
	}

	public void setSt_Pw(String st_Pw) {
		this.st_Pw = st_Pw;
	}

	public void setSt_Score(int st_score) {
		this.st_Score = st_score;
	}

	public void setSt_Major(int st_Major) {
		this.st_Major = st_Major;
	}
	
	
	
		
	
	

}