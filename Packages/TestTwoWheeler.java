import com.automobile.twowheeler.*;

public class TestTwoWheeler {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Honda honda = new Honda();

        System.out.println("Hero Model name : " + hero.getModelName());
        System.out.println("Hero owner name : " + hero.getOwnerName());
        System.out.println("Hero registration no. : " + hero.getRegistrationNumber());
        System.out.println("Hero current speed : " + hero.getSpeed());
        hero.radio();

        System.out.println("Honda Model name : " + honda.getModelName());
        System.out.println("Honda owner name : " + honda.getOwnerName());
        System.out.println("Honda registration no. : " + honda.getRegistrationNumber());
        System.out.println("Honda current speed : " + honda.getSpeed());
        honda.cdplayer();
    }
}
