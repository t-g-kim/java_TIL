package java_basic.example_exception;

public class Example10 {
    public void sayNick(String nick) {
        try {
            if ("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 " + nick + " 입니다.");
        } catch (FoolException e) {
            System.out.println("FoolException 발생");
        }

    }

    public static void main(String[] args) {
        Example10 sample = new Example10();
        // 메소드에서 예외처리시 두문장이 모두 수행된다.
        sample.sayNick("fool");
        sample.sayNick("genius");
    }
}
