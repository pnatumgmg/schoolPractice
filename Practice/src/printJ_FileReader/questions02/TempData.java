package printJ_FileReader.questions02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TempData {
	private Date Date;
	private double aveTemp;
	private double maxTemp;
	private double minTemp;
	
	public TempData(Date date,double aveTemp,double maxTemp,double minTemp) {
		// TODO 自動生成されたコンストラクター・スタブ
		setDate(date);
		setAveTemp(aveTemp);
		setMaxTemp(maxTemp);
		setMinTemp(minTemp);
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public double getAveTemp() {
		return aveTemp;
	}

	public void setAveTemp(double aveTemp) {
		this.aveTemp = aveTemp;
	}

	public double getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}

	public double getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	
	String strDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		return df.format(Date);
	}

}
