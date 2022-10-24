import java.util.Objects;

public class Flying extends Birds{

    private String typeOfMovement;

    public Flying(String nickname, int age, String livingEnvironment, String typeOfMovement) {
        super(nickname, age, livingEnvironment);
        setTypeOfMovement(typeOfMovement);
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank()) {
            this.typeOfMovement = "летают";
        } else {
            this.typeOfMovement = typeOfMovement;
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
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    public void fly() {
        System.out.println(this.getNickname() + " летает в небе.");
    }

    @Override
    public void hunt() {
        System.out.println(this.getNickname() + " за добычей пикирует с большой скоростью.");
    }

    @Override
    public void eat() {
        System.out.println(this.getNickname() + " клюет свою ппищу.");
    }

    @Override
    public void go() {
        System.out.println(this.getNickname() + " перемещается с помощью крыльев.");
    }

    @Override
    public String toString() {
        return "Flying{"
                + getNickname()
                + ", возраст - "
                + getAge()
                + " лет. Среда проживания - "
                + getLivingEnvironment()
                + ". Тип передвижения - "
                + getTypeOfMovement()
                + '}';

    }
}
