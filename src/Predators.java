import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    public void hunt() {
        System.out.println(this.getNickname() + " охотится на добычу");
    }

    @Override
    public void walk() {
        System.out.println(this.getNickname() + " гуляет по лесу.");
    }

    @Override
    public void eat() {
        System.out.println(this.getNickname() + " раздирает на кусочки.");
    }

    @Override
    public void go() {
        System.out.println(this.getNickname() + " передвигается очень тихо.");
    }

    @Override
    public String toString() {
        return "Predators{"
                + getNickname()
                + ", возраст - "
                + getAge()
                + " лет. Среда проживания - "
                + getLivingEnvironment()
                + ". Тип пищи - "
                + getTypeOfFood()
                + ", скорость движения - "
                + getMovementSpeed()
                + " км/ч"
                + '}';

    }
}
