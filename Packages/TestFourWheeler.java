import com.automobile.fourwheeler.*;

public class TestFourWheeler {
    public static void main(String[] args) {
        Logan logan = new Logan();
        Ford ford = new Ford();

        System.out.println("Logan model : " + logan.getModelName());
        System.out.println("Ford model : " + ford.getModelName());
        System.out.println("Logan Owner : " + logan.getOwnerName());
        System.out.println("Ford Owner : " + ford.getOwnerName());
        System.out.println("Logan registration no. : " + logan.getRegistrationNumber());
        System.out.println("Ford registration no. : " + ford.getRegistrationNumber());
        System.out.println("Logan gps: " + logan.gps());
        System.out.println("Ford tempControl : " + ford.tempControl());
    }
}
