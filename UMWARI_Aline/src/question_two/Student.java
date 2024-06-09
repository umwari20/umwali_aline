package question_two;

public class Student {
	public int id;
	public String name;
	public String grade;
	public int feespaid;
	public int feestotal;
	public Student(int id, String name, int feespaid) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feespaid =0;
		this.feestotal =30000;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getFeespaid() {
		return feespaid;
	}
	public void setFeespaid(int feespaid) {
		this.feespaid = feespaid;
	}
	public int getFeestotal() {
		return feestotal;
	}
	public void setFeestotal(int feestotal) {
		this.feestotal = feestotal;
	}
	public void payfees(int fees){
		feespaid+=fees;
		School.UpdateTotalMoneyEarned(fees);
	}

}
