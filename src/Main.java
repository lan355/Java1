import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport();
        Airports airports = new Airports();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        airport.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию: ");
        airport.setMiddlename(scanner.nextLine());
        System.out.print("Введите Отчество:");
        airport.setLastname(scanner.nextLine());
        System.out.print("Введите номер рейса:");
        airport.setNumberFlight(scanner.nextLine());
        System.out.print("Введите номер багажной квитанции:");
        airport.setNumberBag(scanner.nextLine());
        System.out.print("Выберите класс багажа: \n 1)Эконом Класс = 1место не более 23 кг \n 2)Бизнес класс 2 места по 23 кг \n");
        airport.setNumberOfSeatsBag(scanner.nextInt());
        System.out.print("Введите суммарный вес багажа:");
        airport.setSummWeightOfBag(scanner.nextInt());

        System.out.print("\n");
        System.out.print(airport.toString());

        System.out.print("\n");
        while (true) {
            System.out.println("Выберите что хотите дальше сделать:" + "\n" + "1) Добавить пассажира\n" + "2)Вывести информацию о пассажирах,вес багажа которых превышает 30 кг\n"
                    + "3)Вывести информацию о суммарном весе багажа всех пассажиров рейса\n" + "4)Вывести информацию по заданному номеру багажной квитанции\n" + "5)Удалить запись о пассажире с заданной фамилией\n" + "6)Выход");

            switch ((int) check(scanner))
            {
                case 1:

            }
        }
    }

    static float check(Scanner in)
    {
        while (true)
        {
            String s = in.nextLine();
            try
            {
                float a = Float.parseFloat(s);
                return a;
            } catch (NumberFormatException e)
            {
                System.out.println("Неверный ввод данных, пожалуйста попробуйте нова");
            }
        }
    }

}
