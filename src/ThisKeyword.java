public class ThisKeyword {
    int rollno;
    String name;
    float fee;
    ThisKeyword(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class TestThis2{
    public static void main(String args[]){
        ThisKeyword s1=new ThisKeyword(111,"Rezia",7000f);
        ThisKeyword s2=new ThisKeyword(112,"Parvin",8000f);
        s1.display();
        s2.display();
    }
}

