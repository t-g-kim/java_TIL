package java_basic.test;

public class Normal extends Person {
    private boolean hasCar;
    private boolean isMale;
    private int grade;

    public Normal(){}
    public Normal(boolean hasCar, boolean isMale, int grade) {
        this.hasCar = hasCar;
        this.isMale = isMale;
        this.grade = grade;
    }

    public Normal(String name, int age, float height, boolean isHero, boolean hasCar, boolean isMale, int grade) {
        super(name, age, height, isHero);
        this.hasCar = hasCar;
        this.isMale = isMale;
        this.grade = grade;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Normal{" +
                "hasCar=" + hasCar +
                ", isMale=" + isMale +
                ", grade=" + grade +
                '}';
    }

    public void speak() {
        System.out.println("사람이 말을 합니다.");
    }
}
