import java.util.Collection;
import java.util.Date;

public class Product implements Item,Comparable<Product> {
    private static int currentProductionNumber = 0; // Хранит текущее значение номера производства
    private int serialNumber;
    private Date manufacturedOn;
    private String name;

    public Product(String name) {
        this.name = name;
        this.serialNumber = currentProductionNumber++; // Присваиваем новый серийный номер
        this.manufacturedOn = new Date(); // Устанавливаем текущую дату и время
    }

    @Override
    public void setProductionNumber(int productionNumber) {
        this.serialNumber = productionNumber;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Date getManufactureDate() {
        return this.manufacturedOn;
    }

    @Override
    public int getSerialNumber() {
        return this.serialNumber;
    }
    
    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name); // Сравнение по имени
    }
    
    @Override
    public String toString() {
        return "Manufacturer : " + MANUFACTURER + "\n" +
        "Serial Number : " + serialNumber + "\n" +
        "Date : " + manufacturedOn.toString() + "\n" +
        "Name : " + name;
    }
    
    public static <T extends Product> void printType(Collection<T> products, Class<T> type) {
        for (T product : products) {
            if (type.isInstance(product)) {
                System.out.println(product);
            }
        }
    }
}