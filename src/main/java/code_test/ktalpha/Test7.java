package code_test.ktalpha;

public class Test7 {
    public static void main(String args[]){
        try{
            System.out.println(10/0);
            System.out.print("a");
        }catch(Exception e){
            System.out.print("b");
        }finally{
            System.out.print("c");
        }
        System.out.println("d");
    }
}
