package EmployeeArrayHandler;

public class Company {

    private static Employee[] employee = new Employee[5];
    int empNum = 0;

    public static void addEmployees(){
        employee[0] = new Employee("shehan",21 ,20000);
        employee[1] = new Employee("udara",25 ,39000);
        employee[2] = new Employee("amal",22 ,25000);
        employee[3] = new Employee("kamal",23 ,50000);
        employee[4] = new Employee("wimal",51 ,90000);

        System.out.println("Employees added");
    }

    public static void searchEmployee(String targetName){
        int i;
        boolean found = false;
        for (i=0; i< employee.length ; i++){
            if (targetName.equals(employee[i].getEmpName())){
                found = true;
                System.out.println("employee record found :");
                System.out.println((employee[i].getEmpName())+ " , " + (employee[i].getAge()) + " , " + (employee[i].getSalary()));
            }
        }
        if(!found){
            System.out.println("employee not found");
        }
    }

    public static void showRecords(){
        for (int j = 0; j < employee.length; j++) {

            if((employee[j]) != null) {
                System.out.println(
                        employee[j].getEmpName() + " , " +
                                employee[j].getAge() + " , " +
                                employee[j].getSalary()
                );
            }else {
                System.out.println("Null");
            }

        }
    }

    public static void deleteEmployee(String targetName){
        for(int k=0 ; k<employee.length ; k++ ){
            if (employee[k].getEmpName().equals(targetName)){
                for(int l=k ; l<employee.length-1 ; l++){
                    employee[l]= employee[l+1];
                }

                employee[employee.length-1] = null;
                break;
            }
        }
        System.out.println("Record Deleted Successfully");
    }


}
