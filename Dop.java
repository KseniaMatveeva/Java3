import java.io.Serializable;
//
//public class Dop {
//
//
//    public static class Employee implements Serializable{
//
//        Employee supervisor = new Employee();
//
//        public void worksFor(Manager e) {
//            this.supervisor = e;
//        }
//
//        public Employee getSupervisor() {
//            return supervisor;
//        }
//    }
//
//    public static class Manager extends Employee {
//        @Override
//        public void worksFor(Employee e) {
////            this.supervisor = e;
//        }
//
//        @Override
//        public Manager getSupervisor() {
//            return new Serializable() {
//            };
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Employee chelovek = new Employee();
//        chelovek = new Manager();
//        chelovek.worksFor(new Manager());
//        Employee ch = chelovek.getSupervisor();
//
////        //  System.out.println(chelovek.worksFor(Employee e));
////        chelovek.getSupervisor();
////        Manager man = new Manager();
////        //System.out.println(Manager.worksFor(man));
////        man.getSupervisor();
//
//    }
//}
//
