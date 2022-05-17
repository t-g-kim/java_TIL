package java_basic.example_exception;

public class Example07 {
    public void sayNick(String nick) {
        if("fool".equals(nick)) {
            throw new RuntimeFoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Example07 sample = new Example07();
        sample.sayNick("fool");
        sample.sayNick("genius");
    }
}
