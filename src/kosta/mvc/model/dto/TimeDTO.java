package kosta.mvc.model.dto;

public class TimeDTO {
	private int referenceDate;  //기준일
	private String day; //요일
	private int time;  //시간
	private String sectors;  //업종
	private String city;    //도시
	private String sigun;   //시군
	private String eupmundong;  //읍면동
	private int call;   //통화건수
	
	public TimeDTO() {
		
	}

	public TimeDTO(int referenceDate, String day, int time, String sectors, String city, String sigun,
			String eupmundong, int call) {
		super();
		this.referenceDate = referenceDate;
		this.day = day;
		this.time = time;
		this.sectors = sectors;
		this.city = city;
		this.sigun = sigun;
		this.eupmundong = eupmundong;
		this.call = call;
	}

	public int getReferenceDate() {
		return referenceDate;
	}

	public void setReferenceDate(int referenceDate) {
		this.referenceDate = referenceDate;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getSectors() {
		return sectors;
	}

	public void setSectors(String sectors) {
		this.sectors = sectors;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSigun() {
		return sigun;
	}

	public void setSigun(String sigun) {
		this.sigun = sigun;
	}

	public String getEupmundong() {
		return eupmundong;
	}

	public void setEupmundong(String eupmundong) {
		this.eupmundong = eupmundong;
	}

	public int getCall() {
		return call;
	}

	public void setCall(int call) {
		this.call = call;
	}
	
	
}
