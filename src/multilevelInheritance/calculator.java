package multilevelInheritance;

public class calculator {
    public float mul(float p, float q) {
        return p * q;
    }

    public float dif(float a, float b) {
        return a - b;
    }
    public float sum(float x, float y) {
        return x+y;
    }
    public float div(float m, float n) {
        return m/n;
    }
}
class advanced extends calculator{
    public float mod(float m, float n) {
        return m%n;
    }
    public float sqr(float m) {
        return m*m;
    }
    public float sqrt(float m) {
        System.out.println(Math.sqrt(m));
        return m;
    }
}
class area extends advanced{
    public float square(float m){
        return m*m;
    }
    public float rectangle(float l,float b){
        return l*b;
    }
    public float circle(float r){
        return(float) (3.142*r*r);
    }
}
class baseclass{
    public static void main(String[] args) {
        area edu=new area();
        float addresult=edu.sum(10,100);
        float difresult=edu.dif(100,50);
        float mulresult=edu.mul(10,20);
        System.out.println(addresult);
        System.out.println(difresult);
        System.out.println(mulresult);
    }
}
