package assignment0211.sample02;

public class PartTime extends Employee{
    int timePay;

    PartTime() {

    }
    
    PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
        super(empNo, eName, job, mgr, hiredate, deptName);
        this.timePay = timePay;
    }

    public int getTimePay() {
        return timePay;
    }

    public void setTimePay(int timePay) {
        this.timePay = timePay;
    }
    
    @Override
    public void message() {
        System.out.println(super.geteName() + "님은 비정규직입니다.");
    }

    
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("PartTime [timePay=");
		builder.append(timePay);
		builder.append("]");
		return builder.toString();
	}

    
    
}
