import java.util.Date;



/**
 * Шаг 1
Создайте интрефейс с именем Item, который обяжет все классы реализовывать следующий
функции.
• Константу с именем manufacturer, которой будет задаваться значение "OracleProduction"
• Метод setProductionNumber одним целочисленным параметром
• Метод setName с одним строковым параметром
• Метод getName, возвращающий строку
• Метод getManufactureDate, возвращающий объект Date
• Метод getSerialNumber, возвращающий целое число
 * 
 * @author (Зыкин Герман Леонидович)
 */

public interface Item {
	 	String MANUFACTURER = "OracleProduction"; // Константа

	    void setProductionNumber(int productionNumber); // Метод для установки номера

	    void setName(String name); // Метод для установки названия

	    String getName(); // Метод для получения названия

	    Date getManufactureDate(); // Метод для получения даты производства

	    int getSerialNumber(); // Метод для получения серийного номера
}
