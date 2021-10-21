package vo;

public class Tr_Vo {
	
	private String tr_Code;
	private String tr_Pw;
	private String tr_Name;
	
	public Tr_Vo(String tr_Code, String tr_Pw, String tr_Name) {
		super();
		this.tr_Code = tr_Code;
		this.tr_Pw = tr_Pw;
		this.tr_Name = tr_Name;
	}

	public String getTr_Code() {
		return tr_Code;
	}

	public String getTr_Pw() {
		return tr_Pw;
	}

	public String getTr_Name() {
		return tr_Name;
	}

	public void setTr_Code(String tr_Code) {
		this.tr_Code = tr_Code;
	}

	public void setTr_Pw(String tr_Pw) {
		this.tr_Pw = tr_Pw;
	}

	public void setTr_Name(String tr_Name) {
		this.tr_Name = tr_Name;
	}
	
	
	
	
}