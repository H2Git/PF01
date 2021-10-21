package vo;

public class Aw_Vo {

	private String aw_code;
	private String aw_name;
	private String aw_benefit;

	public Aw_Vo(String aw_code, String aw_name, String aw_benefit) {
		super();
		this.aw_code = aw_code;
		this.aw_name = aw_name;
		this.aw_benefit = aw_benefit;
	}

	public String getAw_code() {
		return aw_code;
	}

	public String getAw_name() {
		return aw_name;
	}

	public String getAw_benefit() {
		return aw_benefit;
	}

	public void setAw_code(String aw_code) {
		this.aw_code = aw_code;
	}

	public void setAw_name(String aw_name) {
		this.aw_name = aw_name;
	}

	public void setAw_benefit(String aw_benefit) {
		this.aw_benefit = aw_benefit;
	}

}