package assignment0211.sample02;

public class FullTime extends Employee{
    int salary;
    int bonus;
    FullTime() {

    }
    FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary, int bonus) {
        super(empNo, eName, job, mgr, hiredate, deptName);
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void message() {
        System.out.println(eName + "님은 정규직입니다.");
    }

    @Override
    public String toString() {
        return this.empNo + " | " + this.eName + " | " + this.job + " | " + this.mgr + " | " + this.hiredate + " | " + this.deptName + " | " + this.salary + " | " + this.bonus;
    }
}
