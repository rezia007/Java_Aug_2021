package variable;
//Declare inside class but not inside method.
//Instance Variable always get a default value.
//Cannot reinitialize directly within class.

public class InstanceVariable {
    String name;
    String street;
    String city;

    InstanceVariable(String name,String street,String city){
        this.name=name;
        this.street=street;
        this.city=city;
    }
    public void getStreet(){
        System.out.println(street);
    }

    public static void main(String[] args) {
        InstanceVariable obj=new InstanceVariable("Luna","Autumn Spell","Elkridge");
        InstanceVariable obj1=new InstanceVariable("Prima","Forest Woodland","Elkridge");
        obj.getStreet();
        obj1.getStreet();
    }
}
