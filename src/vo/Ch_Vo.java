
package vo;

public class Ch_Vo {

	private String ch_Code;
	private String ch_Name;

	public String getCh_Code() {
		return ch_Code;
	}

	public String getCh_Name() {
		return ch_Name;
	}

	public void setCh_Code(String ch_Code) {
		this.ch_Code = ch_Code;
	}

	public void setCh_Name(String ch_Name) {
		this.ch_Name = ch_Name;
	}

	public Ch_Vo(String ch_Code, String ch_Name) {
		super();
		this.ch_Code = ch_Code;
		this.ch_Name = ch_Name;
	}

}