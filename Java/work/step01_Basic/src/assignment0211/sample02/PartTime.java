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
    public String toString() {
        return this.empNo + " | " + this.eName + " | " + this.job + " | " + this.mgr + " | " + this.hiredate + " |" + this.deptName + " | " + this.timePay;
    }

    @Override
    public void message() {
        System.out.println(super.eName + "님은 비정규직입니다.");
    }
}
