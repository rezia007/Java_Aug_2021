package singleInheritance;

public class empdata {
    public static void main(String[] args) {
        employee001 empdata=new employee001();
        empdata.setName("Luna");
        empdata.setAge(39);
        empdata.setEmpID("empoo7");
        System.out.println("Name is: "+ empdata.getName());
        System.out.println("Age is : "+ empdata.getAge());
        System.out.println("Employee ID is: "+empdata.getEmpID());
    }
}
