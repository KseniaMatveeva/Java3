/* public class Employee {

    private String userNames;
    private int id;
    private static Employee supervisor;

    public Employee(String a)
    {
        String _shef ="Шеф";
        a=_shef;
    }

    public Employee(String userNames, int id,
                    Employee supervisor) {
        this.userNames = userNames;
        this.id = id;
        this.supervisor = supervisor;
    }
    public String getUserNames() {
        return userNames;
    }

    public void setUserNames(String userNames) {
        this.userNames = userNames;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Employee getSupervisor() {
        return supervisor;
    }


    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }
    @Override
    public String toString() {
        return "Employee [userNames=" + userNames + ", id=" + id + ", supervisor=" + supervisor + "]";
    }


    public static void main(String[] args) {
        int u = 0;
        Employee emp = new Employee ("s",7,supervisor );
        System.out.println(Employee.supervisor.getSupervisor());
    }
    }

}
*/
 /*

    @Override
    public String toString() {
        return "Employee [userNames=" + userNames + ", department=" + department
                + ", displayName=" + displayName + ", password=" + password
                + ", supervisorKey=" + supervisorKey + ", id=" + id + ", version="
                + version + ", supervisor=" + supervisor + "]";
    }
}

*/