import java.util.Date;

public interface Item {
	 	String MANUFACTURER = "OracleProduction"; // Константа

	    void setProductionNumber(int productionNumber); // Метод для установки номера партии

	    void setName(String name); // Метод для установки названия

	    String getName(); // Метод для получения названия

	    Date getManufactureDate(); // Метод для получения даты производства

	    int getSerialNumber(); // Метод для получения серийного номера
}
