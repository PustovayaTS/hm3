public class Mammals extends Animals{

    private String livingEnvironment;
    private int movementSpeed;

    public Mammals(String nickname, int age, int movementSpeed, String livingEnvironment) {
        super(nickname, age);
        if (livingEnvironment != null || !livingEnvironment.isEmpty() || !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
        this.movementSpeed = movementSpeed;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed > 0) {
            this.movementSpeed = movementSpeed;
        }
    }

    public void walk() {
    }

    public void eat() {
        System.out.println("жевать");
    }

    public void go () {
        System.out.println("Бежать");
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", movementSpeed=" + movementSpeed +
                '}';
    }

}
