

/**
 * Step 2
Все элементы имеют заранее заданый тип. В настоящий момент есть 4 типа. Создайте
перечисление enum с именем ItemType
*
*@author (Зыкин Герман Леонидович)
 */
public enum ItemType {
	Audio("AU"),
	Visual("VI"),
	AudioMobile("AM"),
	VisualMobile("VM");
	
	private final String code;
	
	ItemType(String code) {
	    this.code = code;
	}
	
	public String getCode() {
	    return code;
	}
}
