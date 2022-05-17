package java_basic.example_exception;

public class Example09 {
    public void sayNick(String nick) throws FoolException {

        if ("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 " + nick + " 입니다.");
    }

    public static void main(String[] args) {
        Example09 sample = new Example09();
        try {
            sample.sayNick("fool");
            sample.sayNick("genius");
        } catch (FoolException e) {
            System.out.println("FoolException가 발생했습니다.");
        }
    }
}
