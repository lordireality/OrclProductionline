import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Шаг 23 Создайте программу, которая позволит пользователю добавить новый продукт и указать
количество единиц этого продукта, которые должны быть созданы. Затем программа должна
создать эти объекты и добавить их в коллекцию.
Коллекцию можно вывести в любой момент.
Также можно вывести статистику производства – общее количество произведнной продукции,
количество единиц каждого вида, количество уникальных продуктов и т.д.
Оператор будет сам решать, когда завершать работу приложения. В программе должно быть
меню для управления из консоли или через графический интерфейс.

@author (Зыкин Герман Леонидович)
 */

public class OrclProductionline {
	
	
	private static List<Product> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
        while (true)
        {
            System.out.println("------------------------------------------------------");
            System.out.println("Выберите действие: \n 1 - Создать продукт \n 2 - Вывести продукты \n 3 - Вывести статистику \n 4 - Выйти из программы");
            String s = scanner.nextLine();
            int opt;

            try
            {
                opt = Integer.parseInt(s);
            }
            catch (NumberFormatException e)
            {
                System.out.println("неподдерживаемая операция!");
                continue;
            }

            switch (opt)
            {
                case 1: runCreationScript(); break;
                case 2: displayProducts(); break;
                case 3: displayStats(); break;
                case 4: System.exit(0); break;
                default: System.out.println("что??");
            }

            System.out.println('\n');
        }
    }

    private static void displayStats()
    {
        System.out.println(
                "Всего продуктов          : " + list.size() + '\n' +
                "Кол-во Аудиоплееров        : " + list.stream().filter(product -> product instanceof AudioPlayer).count() + '\n' +
                "Кол-во Видеоплееров        : " + list.stream().filter(product -> product instanceof MoviePlayer).count() + '\n');
    }

    private static void displayProducts()
    {
        System.out.println(list);
    }

    private static void runCreationScript()
    {
        System.out.println("Выберите тип создаваемого продукта: \n 1 - Аудио плеер \n 2 - Видеоплеер");

        String s = scanner.nextLine();
        int opt;

        try
        {
            opt = Integer.parseInt(s);
            if (opt != 1 && opt != 2)
            {
                System.out.println("Некорректное значение ввода!");
                return;
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Некорректное значение ввода!");
            return;
        }

        if (opt == 1)
        {
            System.out.println("Введите наименование аудиоплеера:");
            String name = scanner.nextLine();
            System.out.println("Введите спецификацию аудиоплеера:");
            list.add(new AudioPlayer(name, scanner.nextLine()));
            return;
        }

        System.out.println("Введите наименование видеоплеера:");
        String name = scanner.nextLine();

        System.out.println("Введите разрешение экрана:");
        String res = scanner.nextLine();

        System.out.println("Введите частоту экрана целым числом:");
        s = scanner.nextLine();
        int rr;

        try
        {
            rr = Integer.parseInt(s);
            if (rr < 1)
            {
                System.out.println("Некорректное значение ввода!");
                return;
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Некорректное значение ввода!");
            return;
        }

        System.out.println("Введите отклик экрана целым числом больше 0:");
        s = scanner.nextLine();
        int rt;

        try
        {
            rt = Integer.parseInt(s);
            if (rt < 1)
            {
                System.out.println("Некорректное значение ввода!");
                return;
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Некорректное значение ввода!");
            return;
        }

        System.out.println("Введите тип монитора (LED / LCD):");

        s = scanner.nextLine();

        if (!s.equals("LED") && !s.equals("LCD"))
        {
            System.out.println("Некорректное значение ввода!");
            return;
        }

        MonitorType monitorType;

        if (s.equals("LCD"))
            monitorType = MonitorType.LCD;
        else
            monitorType = MonitorType.LED;

        Screen screen = new Screen(res, rr, rt);
        list.add(new MoviePlayer(name, screen, monitorType));
    }
}
