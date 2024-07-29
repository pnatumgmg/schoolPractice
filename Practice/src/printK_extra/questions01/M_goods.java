package printK_extra.questions01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class M_goods {
	private int itemcode;
	private String itemname;
	private int supcode;
	private int price;
	private Date update_date;
	private M_supplier sup;
	
	public M_goods(int itemcode,String itemname,int supcode,int price,Date update_date) {
		setItemcode(itemcode);
		setItemname(itemname);
		setSupcode(supcode);
		setPrice(price);
		setUpdate_date(update_date);
	}
	
	public void show() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		
		int iCode = this.getItemcode();
		String iName = this.getItemname();
		int sCode = this.getSupcode();
		int price = this.getPrice();
		String date = sf.format(this.getUpdate_date());
		
		System.out.println("%d,%s,%d,%d,%s"
				.formatted(iCode,iName,sCode,price,date));
	}
	
	
	
	public M_goods() {
		
	}

	public int getItemcode() {
		return itemcode;
	}

	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getSupcode() {
		return supcode;
	}

	public void setSupcode(int supcode) {
		this.supcode = supcode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public M_supplier getSup() {
		return sup;
	}

	public void setSup(M_supplier sup) {
		this.sup = sup;
	}
	
}
