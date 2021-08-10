package controlflowinjava;

public class DoWhileLoop {
    public static void main(String args[]){
        int arr[]={9,49,399,2999,19999};
        //i starts with 0 as array index starts with 0
        int i=0;
        do{
            System.out.println(arr[i]);
            i++;
        }while(i<3);
    }

}
