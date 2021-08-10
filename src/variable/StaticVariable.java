package variable;
// need to use static key word.

public class StaticVariable {
    String name;
    String street;
    static String city="Windsor Mill";
    static int i=0;

    StaticVariable(String name,String street){
       this.name=name;
       this.street=street;
       i++;
        System.out.println(i);
    }
    public void getStreet(){
        System.out.println(street+" / "+ city);
    }

    public static void main(String[] args) {
        StaticVariable obj=new StaticVariable("Sharmin","Moury Road");
        StaticVariable obj1=new StaticVariable("Shirin","Fairbrook Road");
        StaticVariable obj2=new StaticVariable("Tamzima","Springridge Road");
        StaticVariable obj3=new StaticVariable("Anamika","Pleasant Valley");

        obj.getStreet();
        obj1.getStreet();
        obj2.getStreet();
    }
}
