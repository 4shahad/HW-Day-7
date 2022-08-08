public class FullTimeEmployee extends Employee implements PayAble{
    private int weeklySalary;

    public FullTimeEmployee( int id,String name, int salary) {
        super(name, id);
        this.weeklySalary = salary;
    }

    public FullTimeEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public double computeAmount() {
        double amount=weeklySalary*4;
        return amount;
    }
}
