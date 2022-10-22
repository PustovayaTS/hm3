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

    public void fly() {
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

    @Override
    public String toString() {
        return "Flying{" +
                "nickname='" + getNickname() + '\'' +
                ", age=" + getAge() +
                ", typeOfMovement='" + typeOfMovement + '\'' +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
