//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");

            int temperature = 18;
            if (temperature <= 5) {
                System.out.println();
                System.out.println("Сегодня на улице " + temperature + " градусов, надень шапку.");
            } if (temperature >= 5) {
                System.out.println( );
                System.out.println("Сегодня на улице " + temperature + " градусов, можешь идти без шапки.");

                int speed = 48;
                if (speed > 60) {
                    System.out.println( );
                    System.out.println("Если скорость " + speed + " км/час , то придется заплатить штраф.");
                } if (speed <= 60) {
                    System.out.println( );
                    System.out.println("Если скорость " + speed + " км/час можно ездить спокойно.");
                }

                int peopleAge = 44;
                if (peopleAge >= 2 && peopleAge <= 6) {
                    System.out.println( );
                    System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в садик.");
                } if (peopleAge >= 7 && peopleAge <= 17) {
                    System.out.println( );
                    System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в школу.");
                } if (peopleAge >= 18 && peopleAge<= 24) {
                    System.out.println( );
                    System.out.println("Если возрастчеловека равен " + peopleAge + ", то ему нужно ходить в университет.");
                } if (peopleAge > 24) {
                    System.out.println( );
                    System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить на работу.");
                }

                int childAge = 8;
                if (childAge <=5){
                    System.out.println( );
                    System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
                } else if (childAge > 5 && childAge <= 14) {
                    System.out.println( );
                    System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе только в сопровождении взрослых.");
                } else {
                    System.out.println( );
                    System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе без сопровождения взрослых.");
                }

                int totalCapacity = 102;
                int seatCapacity = 60;
                int passengers = 72;
                if (passengers < seatCapacity) {
                    System.out.println( );
                    System.out.println("В вагоне есть сидячие места.");
                } else if (passengers < totalCapacity) {
                    System.out.println( );
                    System.out.println("В вагоне есть стоячие места, но нет сидячих.");
                } else {
                    System.out.println( );
                    System.out.println("Вагон забит, мест нет.");
                }

                int one = 1;
                int two = 2;
                int three = 3;
                if (one >= two && one >= three) {
                    System.out.println( );
                    System.out.println("Наибльшее число это " + one);
                } else if (two >= one && two >= three) {
                    System.out.println( );
                    System.out.println("Наибольшее число это " + two);
                } else {
                    System.out.println( );
                    System.out.println("Наибольшее число это " + three);
                }



            }

        }

    }
}