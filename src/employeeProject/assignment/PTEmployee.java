package employeeProject.assignment;

public class PTEmployee extends Employee {


    PTEmployee() {
        super();
    }
    
    //complete getPay
    @Override
    public double getPay() {
        total_pay += rate * hours; //adding to toalPay
        return hours * rate;
    }
    
}