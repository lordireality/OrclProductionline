
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Sort {

	public void test() {
        
        ArrayList<Product> products = new ArrayList<Product>();
        
        products = testCollection();
        
        Collections.sort(products);
        
        print(products);
	}
	
	
	public static ArrayList<Product> testCollection() {
		ArrayList<Product> products = new ArrayList<Product>();
		AudioPlayer ap1 = new AudioPlayer("iPod", "WAV");
		AudioPlayer ap2 = new AudioPlayer("ChinaNoname player", "Mp3 ");
		MoviePlayer mp1 = new MoviePlayer("Sony",new Screen("640x480", 40, 22), MonitorType.LCD);
		MoviePlayer mp2 = new MoviePlayer("Panasonic",new Screen("1920x1080", 40, 22), MonitorType.LED);
		
		
		products.add(ap1);
		products.add(ap2);
		products.add(mp1);
		products.add(mp2);
		return products;
    }
	
    public static void print(ArrayList<Product> products) {

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
