//Value of final variable is constant and you can not change it.
// We can not extend final class.
// We can not override final method.

final class FinalKeyword {
final int i;
public FinalKeyword(){
    i=10;
}
public class FinalDemo {
}

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        System.out.println(obj.i);
    }
}

