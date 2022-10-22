public class Birds extends Animals{

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

    public void hunt() {
    }

    public void eat(){
        System.out.println("Клевать");
    }

    public void go () {
        System.out.println("Летать");
    }

    @Override
    public String toString() {
        return "Birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
