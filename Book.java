package mini;

public class Book {
	  private int bid;
	  private String bname,aname,sname;
	  public Book(int bid, String sname, String bname,String anmae) {
	       super();
	       this.bid = bid;
	       this.sname = sname;
	       this.aname = aname;
	       this.bname = bname;
	   }
	  
	public static void main(String[] args) {
	

	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
