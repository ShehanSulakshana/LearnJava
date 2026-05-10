import EmployeeArrayHandler.Company;

public class EmployeeHandler {
    public static void main(String[] args){

        Company.addEmployees();
        Company.showRecords();
        Company.searchEmployee("amal");

        Company.deleteEmployee("amal");
        Company.showRecords();
        
    }
}

