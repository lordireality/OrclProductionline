import java.util.Collection;
import java.util.Date;

/**
 * Шаг 3 - Создайте класс Product, который будет реализовывать интерфейс Item. В Product
будет реализован базовый функционал, которым обладают все элементы производственной
линии. Добавьте в Product следующие поля:
• int serialNumber
• String manufacturer
• Date manufacuredOn
• String name
Добавьте целочисленную переменную класса с именем currentProductionNumber. В ней будет
хранится следующее число, которое будет присваиваться полю serialNumber.
Реализуйте методы из интерфейса Item.
Добавьте конструктор, который будет принимать в качестве аргумента имя продукта и
присвойте это имя полю name. Вы также заполните значение серийного номера согласно
значению из перменной currentProductionNumber. Значение переменной
currentProductionNumber должно увеличиваться и быть готовым к следующему экземпляру.
Установите значение поле manufacturedOn текущими значениями времени и даты.
Добавьте метод toString, 

 */


public class Product implements Item,Comparable<Product> {
    private static int currentProductionNumber = 0; // Хранит текущее значение номера производства
    private int serialNumber; //серийник
    private Date manufacturedOn; //дата производства
    private String name; //нпименование

    public Product(String name) {
        this.name = name;
        this.serialNumber = currentProductionNumber++; // Присваиваем новый серийный номер
        this.manufacturedOn = new Date(); // Устанавливаем текущую дату и время
    }

    @Override //сеттер номера
    public void setProductionNumber(int productionNumber) {
        this.serialNumber = productionNumber;
    }

    @Override
    public void setName(String name) { //сеттер имени
        this.name = name;
    }

    @Override //геттер имени
    public String getName() {
        return this.name;
    }

    @Override //геттер даты производства
    public Date getManufactureDate() {
        return this.manufacturedOn;
    }

    @Override //геттер серийника
    public int getSerialNumber() {
        return this.serialNumber;
    }
   
    @Override //вывод
    public String toString() {
        return "Manufacturer : " + MANUFACTURER + "\n" +
        "Serial Number : " + serialNumber + "\n" +
        "Date : " + manufacturedOn.toString() + "\n" +
        "Name : " + name;
    }
    
    /**
     * Шаг 14
     * Добавьте функционал к своим классам, который позволит сортировать их экземпляры по имени с
использованием метода Collections.sort.
     */
    
    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name); // Сравнение по имени
    }
    /**
     * Шаг 17:
Создайте статический метод с именем printType в классе Product, который будет проходить по
коллекции и вывдоить все объекты определенного типа.
Например, вывести только объекты класса AudioPlayer из коллекции.
В качестве дополнительного бонуса вы можете изменить этот метод, чтобы он принимал класс,
объекты которого нужно вывести в качестве параметрa. Таким образом мы сможем использовать
этот метод для классов, которые мы пока не создали.
Ограничьте коллекцию только объектами, которые являются экземплярами подклассов Product
     */
    public static <T extends Product> void printType(Collection<T> products, Class<T> type) {
        for (T product : products) {
            if (type.isInstance(product)) {
                System.out.println(product);
            }
        }
    }
}