import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Airports airports = new Airports();

        airports.addPassenger(new Airport("Bill","Velington","Mihael","r3ss34","r432",2,46));
        airports.addPassenger(new Airport("Andrew","Coronov","Alexeyevich","et2ts34","2tyt3",1,25));
        airports.addPassenger(new Airport("Alex","Maicon","Keylor","gr45t","ef434",2,50));
        System.out.println("Выберите что хотите дальше сделать:" + "\n" + "1) Добавить пассажира\n" + "2)Вывести информацию о пассажирах,вес багажа которых превышает 30 кг\n"
                + "3)Вывести информацию о суммарном весе багажа всех пассажиров рейса\n" + "4)Вывести информацию по заданному номеру багажной квитанции\n" + "5)Удалить запись о пассажире с заданной фамилией\n" + "6)Выход" + "\n" + "Ваш выбор:");
        Scanner scanner =new Scanner(System.in);
        while (true) {

            switch ((int) check(scanner))
            {
                case 1:
                    addPassenger(airports,scanner);
                    break;
                case 2:
                    System.out.print(airports.ShowMassOver30());
                    break;
                case 3:
                    System.out.print(airports.summWeightOfBag());
                    break;
                case 4:
                    System.out.print(airports.numberOfBag(scanner.nextLine()));
                    break;
                case 5:
                    System.out.print(airports.removeLastName(scanner.nextLine()));
                    break;
                case 6:
                    return;
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
                return Float.parseFloat(s);
            } catch (NumberFormatException e)
            {

            }
        }
    }

    static void addPassenger(Airports airport, Scanner scanner)
    {
        System.out.print("Введите имя: ");
        String firstname = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String middlename = scanner.nextLine();
        System.out.print("Введите Отчество:");
        String lastname = scanner.nextLine();
        System.out.print("Введите номер рейса:");
        String numberFlight = scanner.nextLine();
        System.out.print("Введите номер багажной квитанции:");
        String numberBag = scanner.nextLine();
        System.out.print("Выберите класс багажа: \n 1)Эконом Класс = 1место не более 23 кг \n 2)Бизнес класс 2 места по 23 кг \n");
        int numberOfSeatsBag = scanner.nextInt();
        System.out.print("Введите суммарный вес багажа:");
        int summWeightOfBag = scanner.nextInt();

        airport.addPassenger(new Airport(firstname,middlename,lastname,numberFlight,numberBag,numberOfSeatsBag,summWeightOfBag));
        System.out.println("Выберите что хотите дальше сделать:" + "\n" + "1) Добавить пассажира\n" + "2)Вывести информацию о пассажирах,вес багажа которых превышает 30 кг\n"
                + "3)Вывести информацию о суммарном весе багажа всех пассажиров рейса\n" + "4)Вывести информацию по заданному номеру багажной квитанции\n" + "5)Удалить запись о пассажире с заданной фамилией\n" + "6)Выход" + "\n" + "Ваш выбор:");
    }

}
