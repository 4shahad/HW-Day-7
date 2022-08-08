import java.util.ArrayList;

public class Company  {
    private String name ;
    private ArrayList<PayAble> list= new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }
    public boolean add (PayAble p){
       if (list.add(p))
           return true;
   return false; }
    public double computAmount(){
        double sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i).computeAmount();
        }

   return sum; }

    @Override
    public String toString() {
        return "Company{ payables=[" +
                  '\'' +
                "[" + list +']'+ "name="+name +
                '}';
    }


}
