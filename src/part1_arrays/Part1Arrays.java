package part1_arrays;

public class Part1Arrays {
    public static void main(String[] args) {
        System.out.println("Welcome to my first simple project");

        boolean HotWeather = false;
        boolean ItsMonday = true;
        boolean AirAlerts = true;
        boolean IamInUkr = true;



        boolean GoinAUK = false;
        GoinAUK = ItsMonday && (!AirAlerts || IamInUkr) && HotWeather;
        System.out.println(GoinAUK);
    }
}
