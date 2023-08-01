import controllers.RegionController;
import entities.Region;

public class Program {
    public static void main(String[] agrs) {
        RegionController controller = new RegionController();
        for (Region string : controller.Get()) {
            System.out.println(string.getName());
        };
    }
}