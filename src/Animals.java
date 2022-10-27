import java.util.Objects;

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

    public abstract void eat();

    public void sleep() {
        System.out.println(this.nickname + " cпит");
    }

    public abstract void go ();

    @Override
    public String toString() {
        return "Animals{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
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
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(nickname, animals.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, age);
    }
}
