public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println("Здача 1");
        int age = 18;
        System.out.println("Если человек возраст равен=" + age);
        if (age >= 18) {
            System.out.println("то, он совершенолетен");
        } else {
            System.out.println("Он не достиг совершенолетия");
        }
        System.out.println("Задача 2");
        byte temperature = 6;
        System.out.println("На улице" + temperature + "градусов");
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed = 40;
        System.out.println("Если скорость" + speed + ", то");
        if (speed > 60) {
            System.out.println("Придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int ageMe = 22;
        System.out.println("Если возраст человека равен" + ageMe + ", то ему");
        if (ageMe > 2 && ageMe <= 6) {
            System.out.println("нужно ходить в детский сад");
        }
        if (ageMe >= 7 && ageMe <= 17) {
            System.out.println("Нужно ходить в школу");
        }
        if (ageMe >= 18 && ageMe <= 24) {
            System.out.println("нужно ходить в университет");
        }
        if (ageMe > 24) {
            System.out.println("нужно ходить на работу");
        }
        System.out.println("Задача 5");
        int children = 12;
        System.out.println("Если возраст ребенка равен"+children+", то ему");
        if (children < 5) {
            System.out.println("можно кататься на аттракционе.");
        } else if (children < 14) {
                System.out.println("можно кататься только в сопровождения взрослого");
        } else if (children>17){
            System.out.println("можно кататься без сопровождения взрослого");
        } else{
            System.out.println("кататься нельзя");
        }
        System.out.println("Задача 6");
        int humanInTrain = 74;
        int seatPlace = 60;
        int plase =102;
        int standPlace = plase - humanInTrain;
        if(humanInTrain>seatPlace && humanInTrain<plase){
            System.out.println("Сидячих мест нет, но есть стоячие"+standPlace);
        }else{
            System.out.println("мест нет");
        }
        System.out.println("Задача 7");
        int one =1;
        int two = 2;
        int three =3;
        boolean oneIsBiggest = one>two && one>three;
        boolean twoIsBiggest = two>one && two>three;
        if (oneIsBiggest) {
            System.out.println("Число один - наибольшее из всех");
        } else if (twoIsBiggest) {
            System.out.println("Число два - наибольшее из всех");
        }else {
            System.out.println("Число три - наибольшее из всех");
        }
    }}