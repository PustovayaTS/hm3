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
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    public String toString() {
        return "Flightless{" +
                "nickname='" + getNickname() + '\'' +
                ", age=" + getAge() +
                ", typeOfMovement='" + typeOfMovement + '\'' +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
