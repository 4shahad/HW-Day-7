public class PartTimeEmployee extends Employee implements PayAble{
    private int workHour;
    private int wage;

    public PartTimeEmployee( int id,String name, int workHour, int wage) {
        super(name, id);
        this.workHour = workHour;
        this.wage = wage;
    }

    public PartTimeEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public double computeAmount() {
        double amount= workHour*wage;
        return amount;
    }
}
