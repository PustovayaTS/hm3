import java.util.Objects;

public abstract class Birds extends Animals{

    private String livingEnvironment;

    public Birds(String nickname, int age, String livingEnvironment) {
        super(nickname, age);
        if (livingEnvironment != null || !livingEnvironment.isEmpty() || !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public abstract void hunt();

    @Override
    public String toString() {
        return "Birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
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
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
