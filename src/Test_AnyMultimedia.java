import java.util.ArrayList;


public class Test_AnyMultimedia {

	public void test() {
		
		ArrayList<MultimediaControl> devices = new ArrayList<MultimediaControl>();
		
		AudioPlayer player = new AudioPlayer("iPod", "wav");
		
		Screen testScreen = new Screen("1920x1080", 144, 5);
		MoviePlayer moviePlayer = new MoviePlayer("TestMoviePlayer", testScreen, MonitorType.LED);
		
		
		devices.add(player);
		devices.add(moviePlayer);
		for(MultimediaControl device : devices) {
			controlDevice(device);
		}
		
	}
	
	
	public void controlDevice(MultimediaControl device) {
		device.play();
		device.next();
		device.previous();
		device.stop();
    }
}
