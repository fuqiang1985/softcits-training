package homework;

public class ChinaPeople {
	private String nationality = "�л����";

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public static void main(String[] args){
		ChinaPeople p = new ChinaPeople();
		p.setNationality("�л����񹲺͹�");
		System.out.println(p.getNationality());
	}
	
}
