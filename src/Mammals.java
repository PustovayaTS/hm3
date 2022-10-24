import java.util.Objects;

public abstract class Mammals extends Animals{

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
        Mammals mammals = (Mammals) o;
        return movementSpeed == mammals.movementSpeed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }

     public abstract void walk ();

    @Override
    public String toString() {
        return "Mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", movementSpeed=" + movementSpeed +
                '}';
    }

}
