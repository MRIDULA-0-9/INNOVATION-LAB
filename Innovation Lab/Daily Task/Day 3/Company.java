public class Company {

    static String companyName = "WIPRO";
    String employeeName;
    
    public Company(String employeeName){
        this.employeeName = employeeName;
    }

    void display(){
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + employeeName);
    }

    public static void main(String[] args) {
        Company company1 = new Company("Sruthi");
        Company company2 = new Company("Maya");
        Company company3 = new Company("Abc");
        
        
        company1.display();
        company2.display();
        company3.display();
    }
}
