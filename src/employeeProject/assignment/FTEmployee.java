package employeeProject.assignment;

public class FTEmployee extends Employee {

    public FTEmployee(){
        super();
    }
    
    //complete getPay
    @Override
    public double getPay() {
        totalPay+=1;
        return 0;
    }
    
}