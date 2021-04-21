package Day_21_04_21_pkg;

public class Borad {
	private int wNumber;
	private	String wtitle;
	private	String passward;
	private	String name;
	private	String wdate;
	
	Borad(){
		
	}
	
	
	public Borad(int wNumber, String wtitle, String passward, String name, String wdate) {
		super();
		this.wNumber = wNumber;
		this.wtitle = wtitle;
		this.passward = passward;
		this.name = name;
		this.wdate = wdate;
	}


	public int getwNumber() {
		return wNumber;
	}


	public void setwNumber(int wNumber) {
		this.wNumber = wNumber;
	}


	public String getWtitle() {
		return wtitle;
	}


	public void setWtitle(String wtitle) {
		this.wtitle = wtitle;
	}


	public String getPassward() {
		return passward;
	}


	public void setPassward(String passward) {
		this.passward = passward;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getWdate() {
		return wdate;
	}


	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	@Override
	public String toString() {
		return "Borad [wNumber=" + wNumber + ", wtitle=" + wtitle + ", passward=" + passward + ", name=" + name
				+ ", wdate=" + wdate + "]";
	}
}
