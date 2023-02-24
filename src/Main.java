public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Он совершенолетний");
        } else {
            System.out.println("Он несовершенолетний нужно немого подождать");
        }
        int airTemperature = 10;
        if (airTemperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        int ageHuman = 15;
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу ");
        } else {
            if (2 <= ageHuman && ageHuman < +6) {
                System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад ");
            }
            if (6 < ageHuman && ageHuman <= 18) {
                System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу ");
            }
            if (18 < ageHuman && ageHuman <= 24) {
                System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в универсетет ");
            }
        }
        int ageKids = 14;
        if (ageKids <= 5) {
            System.out.println("Если возраст ребенка равен " + ageKids + " нельзя кататься на аттракционе");
        } else if (ageKids > 5 && ageKids <= 14) {
            System.out.println("Если возраст ребенка равен " + ageKids + " можно катать на атракционе в сопровождении");

        } else {
            System.out.println("Если возраст ребенка равен " + ageKids + " можно кататься без сопровождения");
        }
        int occupiedSeats = 103;
        if (occupiedSeats > 102 ){
            System.out.println("Вагон полностью забит ");
        }else {
            if (occupiedSeats <= 60){
                System.out.println("В вагоне есть сидячии места");
            }else {
                System.out.println("В вагоне только стояичии места");
            }
        }
        int one = 10;
        int two = 5;
        int three = 3;
        if (three > two && three > one ){
            System.out.println("большее число " + three);
        }else {
            if (one > two){
                System.out.println("большее число " + one);
            }else {
                System.out.println("болшее число " + two);
            }
        }
    }
}

