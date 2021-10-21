package vo;

public class Ev_Vo {
	

	private String ev_Name;
	private String ev_Code;
	private int ev_Score;
	
	public Ev_Vo(String ev_Name, String ev_Code, int ev_Score) {
		super();
		this.ev_Name = ev_Name;
		this.ev_Code = ev_Code;
		this.ev_Score = ev_Score;
	}

	public String getEv_Name() {
		return ev_Name;
	}

	public String getEv_Code() {
		return ev_Code;
	}

	public int getEv_Score() {
		return ev_Score;
	}

	public void setEv_Name(String ev_Name) {
		this.ev_Name = ev_Name;
	}

	public void setEv_Code(String ev_Code) {
		this.ev_Code = ev_Code;
	}

	public void setEv_Score(int ev_Score) {
		this.ev_Score = ev_Score;
	}
	
	
	

	
	

}