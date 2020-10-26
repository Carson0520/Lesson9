package employeeProject.assignment;

public class FTEmployee extends Employee {

    public FTEmployee(){
        super();
    }
    
    //complete getPay
    @Override
    public double getPay() {
        boolean noovertime = hours <= 40;
        if (noovertime) {
            total_pay = rate * hours;



        } else {
            total_pay = rate * 40 + (hours - 40) * rate * 2;
                        noovertime=false;

        }
        return total_pay;
    }
    
}