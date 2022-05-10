package java_basic.example_total.model;

// 상속
public class Hero extends Character{
    private boolean isFlying;

    public Hero(String name) {
        super.setName(name);    // 부모의 setName호출
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void attack(Hero hero) {
        System.out.println(this.getName() + "은 " + hero.getName() + "을 공격했다.");
    }
}
