import java.util.Objects;

public class Flightless extends Birds{

    private String typeOfMovement;

    public Flightless(String nickname, int age, String livingEnvironment, String typeOfMovement) {
        super(nickname, age, livingEnvironment);
        setTypeOfMovement(typeOfMovement);
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank()) {
            this.typeOfMovement = "ходят";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public void walk() {
        System.out.println(this.getNickname() + " гуляет по земле.");
    }

    @Override
    public void hunt() {
        System.out.println(getNickname() + " охотится на рыб.");
    }

    @Override
    public void eat() {
        System.out.println(this.getNickname() + " ест стоя.");
    }

    @Override
    public void go() {
        System.out.println(this.getNickname() + " перемещатся по земле.");;
    }

    public String toString() {
        return "Flightless{"
                + getNickname()
                + ", возраст - "
                + getAge()
                + " лет. Среда проживания - "
                + getLivingEnvironment()
                + ". Тип передвижения - "
                + typeOfMovement
                + '}';
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
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
