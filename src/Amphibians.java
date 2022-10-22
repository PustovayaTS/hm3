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

    public void hunt() {
    }

    public void eat() {
        System.out.println("лизать");
    }

    public void go () {
        System.out.println("Ползать");
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "nickname='" + getNickname() + '\'' +
                " , age=" + getAge() +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
