package printK_extra.questions01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class M_supplier {
	private int supcode;
	private String supname;
	private String address;
	private String tel;
	private String rep_name;
	private Date update_date;
	
	public M_supplier(int supcode,String supname,String address,String tel,String rep_name,Date update_date) {
		setSupcode(supcode);
		setSupname(supname);
		setAddress(address);
		setTel(tel);
		setRep_name(rep_name);
		setUpdate_date(update_date);
	}
	
	public M_supplier() {


	}
	
	public void show() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		
		int sCode = this.getSupcode();
		String sName = this.getSupname();
		String address = this.getAddress();
		String tel = this.getTel();
		String rName = this.getRep_name();
		Date date = this.getUpdate_date();
		String strDate = sf.format(date);
		
		System.out.println("%d,%s,%s,%s,%s,%s"
				.formatted(sCode,sName,address,tel,rName,date,strDate));
	}

	public int getSupcode() {
		return supcode;
	}

	public void setSupcode(int supcode) {
		this.supcode = supcode;
	}

	public String getSupname() {
		return supname;
	}

	public void setSupname(String supname) {
		this.supname = supname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRep_name() {
		return rep_name;
	}

	public void setRep_name(String rep_name) {
		this.rep_name = rep_name;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

}
