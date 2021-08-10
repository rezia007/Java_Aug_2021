package singleInheritance;
    public class PhysicsTeacher extends Teacher{
        String mainSubject = "Physics";
        public static void main(String args[]){
            singleInheritance.PhysicsTeacher obj = new singleInheritance.PhysicsTeacher();
            System.out.println(obj.collegeName);
            System.out.println(obj.designation);
            System.out.println(obj.mainSubject);
            obj.does();
        }
    }

