public class Main {
    public static void main(String[] args) {
        Herbivores gazel = new Herbivores("Газель", 30, 70, "Саванна", "растения и кустарники");
        Herbivores giraffe = new Herbivores("Жираф", 15, 55, "Саванна", "листья");
        Herbivores horse = new Herbivores("Лошадь", 7, 60, "Повсеместно, исключая Антарктиду", "трава");

        Predators hyena = new Predators("Гиена", 3, 10, "Африка", "падаль");
        Predators tiger = new Predators("Тигр", 20, 50, "лесная местность", "мясо");
        Predators bear = new Predators("Медведь", 4, 40, "лес", "рыба");

        Amphibians frog = new Amphibians("Лягушка", 1, "болото");
        Amphibians waterSnake = new Amphibians("Уж пресноводный", 2, "русло реки");

        Flightless peacock = new Flightless("Павлин", 15, "остров Цейлон", null);
        Flightless penguin = new Flightless("Пингвин", 13, "Антарктида", null);
        Flightless doDo = new Flightless("Птица до-до", 5,"Маскаренский архипелаг", null);

        Flying seagull = new Flying("Чайка", 2, "берег реки Обь", null);
        Flying albatross = new Flying("Альбатрос", 1, "Антарктида", null);
        Flying falcon = new Flying("Сокол", 3, "Тайга", null);

        System.out.println(gazel.toString());
        System.out.println(giraffe.toString());
        System.out.println(horse.toString());
        System.out.println(hyena.toString());
        System.out.println(tiger.toString());
        System.out.println(bear.toString());
        System.out.println(frog.toString());
        System.out.println(waterSnake.toString());
        System.out.println(peacock.toString());
        System.out.println(penguin.toString());
        System.out.println(doDo.toString());
        System.out.println(seagull.toString());
        System.out.println(albatross.toString());
        System.out.println(falcon.toString());
        if(gazel.equals(giraffe)){
            System.out.println("одинаковые");
        } else {
            System.out.println("разные");
        }
    }


}