import java.util.Objects;

public class Herbivores extends Mammals{

    private String typeOfFood;

    public Herbivores(String nickname, int age, int movementSpeed, String livingEnvironment, String typeOfFood) {
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
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    public void graze() {
        System.out.println(this.getNickname() + " пасется на поле.");
    }

    @Override
    public void walk() {
        System.out.println(this.getNickname() + " гуляет по полю.");;
    }

    @Override
    public void eat() {
        System.out.println(this.getNickname() + " щиплет траву.");;
    }

    @Override
    public void go() {
        System.out.println(this.getNickname() + " скачет по полю.");
    }

    @Override
    public String toString() {
        return "Herbivores{"
                + getNickname()
                + ", возраст - "
                + getAge()
                + " лет. Среда проживания - "
                + getLivingEnvironment()
                + ". Тип пищи - "
                + typeOfFood
                + '}';
    }
}
