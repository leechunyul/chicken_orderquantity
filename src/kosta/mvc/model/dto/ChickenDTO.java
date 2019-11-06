package kosta.mvc.model.dto;

public class ChickenDTO {
	private int referenceDate; //기준일
	private String day;  //요일
	private String gender;  //성별
	private String ageRange;   //연령대
	private String city;  //시도
	private String sigun;  //시군
	private String eupmundong;  //읍면동
	private String sectors;  //업종
	private int call;		//통화건수
	
	public ChickenDTO(){
		
	}

	public ChickenDTO(int referenceDate, String day, String gender, String ageRange, String city, String sigun,
			String eupmundong, String sectors, int call) {
		super();
		this.referenceDate = referenceDate; 
		this.day = day;  
		this.gender = gender;  
		this.ageRange = ageRange; 
		this.city = city; 
		this.sigun = sigun; 
		this.eupmundong = eupmundong; 
		this.sectors = sectors;  
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
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

	public String getSectors() {
		return sectors;
	}

	public void setSectors(String sectors) {
		this.sectors = sectors;
	}

	public int getCall() {
		return call;
	}

	public void setCall(int call) {
		this.call = call;
	}
	
	



	
	

}
