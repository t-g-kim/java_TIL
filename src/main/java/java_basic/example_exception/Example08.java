package java_basic.example_exception;

public class Example08 {
    public void sayNick(String nick) {

        try {
            if("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        } catch (FoolException e) {
            System.err.println("FoolException가 발생했습니다.");
        }

    }

    public static void main(String[] args) {
        Example08 sample = new Example08();
        sample.sayNick("fool");
        sample.sayNick("genius");
    }
}
