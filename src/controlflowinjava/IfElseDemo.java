package controlflowinjava;

public class IfElseDemo {
    public static void main(String[] args) {
        int x=4;
        if(x>5){
            System.out.println("X is Greater Than Five");
        }else if(x>3){
            System.out.println("X is Greater Than Three");
        }else {
            System.out.println("X is not Greater Than Five and Three");
        }
    }
}
