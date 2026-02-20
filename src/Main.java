//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18){
            System.out.println("Если возраст равен "+ age + ", вы совершеннолетний");
        } else {
            System.out.println("вы не достигли совершеннолетия, нужно подождать");
        }
        System.out.println("________");

        System.out.println("Задача 2");
        int temperature = 1;
        if (temperature >= 5){
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        System.out.println("________");

        System.out.println("Задача 3");
        int speed = 80;
        if (speed > 60){
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        System.out.println("________");

        System.out.println("Задача 4");
        int agePeople = 1;
        boolean kindergartenAge = agePeople >= 2 && agePeople <= 6;   //возраст, когда идешь в детский сад
        boolean schoolAge = agePeople >= 7 && agePeople <= 17;        //возраст, когда нужно идти в школу
        boolean universityAge = agePeople >= 18 && agePeople <= 24;   //возраст, когда нужно идти в университет
        boolean workAge = agePeople > 24;                             //возраст, когда нужно идти на работу
        if (kindergartenAge){
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в детский сад");
        }
        else if (schoolAge){
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в школу");
        }
        else if (universityAge){
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в университет");
        }
        else if (workAge){
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Возраст не попадает ни в одну категорию");
        }
        System.out.println("________");

        System.out.println("Задача 5");
        int ageChildron = 2;
        boolean adult = false;
        if (ageChildron < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildron + ", то он не может кататься на аттракционе");
        } else if (ageChildron >= 5 && ageChildron <= 14 && adult){
            System.out.println("Если возраст ребенка равен " + ageChildron + ", то он может кататься только в сопровождении взрослого");
        } else if (ageChildron >=5 && ageChildron <=14 && !adult) {
            System.out.println("Если возраст ребенка равен " + ageChildron + ", нельзя кататься на аттракционе без сопровождения взрослого");
        } else if (ageChildron > 14){
            System.out.println("Если возраст ребенка равен " + ageChildron + ", то он может кататься без сопровождения взрослого");
        }
        System.out.println("________");

        System.out.println("Задача 6");
        int passenger = 59;                             //вводим количесвто пассажиров
        int seatingCapacity = 60;                       //количество сидячих мест
        int totalCapacity = 102;                        //вместимость вагона

        if (passenger >= totalCapacity){
            System.out.println("вагон полон");
        } else if (passenger >= seatingCapacity){
            System.out.println("есть стоячие места");
        } else {
            System.out.println("есть сидячие места");
        }
        System.out.println("________");

        System.out.println("Задача 7");
        int one = 4;
        int two = 4;
        int three = 3;

        if (one > two && one >three){
            System.out.println(one +" самое большое число");
        } else if (two > one && two > three){
            System.out.println(two + " самое большое число");
        } else if (three > two && three > one){
            System.out.println(three + " самое боьльшое число");
        } else if (one == two && one > three) {
            System.out.println(one + " самое большое число");
        } else if (two == three && two > one){
            System.out.println(two + " самое большое число");
        }else if (three == one && three > two){
            System.out.println(three + " сасмое большое число");
        } else if (one == two && two ==three){
            System.out.println("все числа одинаковые");
        }
        System.out.println("________");

    }
}