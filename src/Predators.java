public class Predators extends Mammals{

    private String typeOfFood;

    public Predators(String nickname, int age, int movementSpeed, String livingEnvironment, String typeOfFood) {
        super(nickname, age, movementSpeed, livingEnvironment);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null || !typeOfFood.isEmpty() || !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    public void graze() {
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public String toString() {
        return "Predators{" +
                "nickname='" + getNickname() + '\'' +
                ", age=" + getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", movementSpeed=" + getMovementSpeed() +
                ", typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
