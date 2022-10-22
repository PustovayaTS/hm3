public abstract class Animals {
    private String nickname;
    private int age;

    public Animals(String nickname, int age) {
        this.nickname = nickname;
        if (age > 0) {
            this.age = age;
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname != null || !nickname.isEmpty() || !nickname.isBlank()) {
            this.nickname = nickname;
        }
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("кушать");
    }

    public void sleep() {
        System.out.println("Спит");
    }

    public void go () {
        System.out.println("Перемещаться");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
