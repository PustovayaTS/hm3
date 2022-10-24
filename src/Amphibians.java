import java.util.Objects;

public class Amphibians extends Animals{

    private String livingEnvironment;

    public Amphibians(String nickname, int age, String livingEnvironment) {
        super(nickname, age);
        if (livingEnvironment != null || !livingEnvironment.isEmpty() || !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
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
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    public void hunt() {
        System.out.println(this.getNickname() + " cледит за добычей.");
    }

    public void eat() {
        System.out.println(this.getNickname() + " глотает добычу не жуя.");
    }

    public void go () {
        System.out.println(this.getNickname() + " ползает по земле.");
    }

    @Override
    public String toString() {
        return "Amphibians{"
                + getNickname()
                + ", возраст - "
                + getAge()
                + " лет. Среда проживания - "
                + getLivingEnvironment()
                + '}';
    }
}
