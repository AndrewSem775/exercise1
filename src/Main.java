

public class Main{
    public static void main(String[] args) {
        
        String city = "england";
        int zipcode = 1234;
        double add = 0;

        int dailyHighs[] = {50, 60, 70, 80, 90};
        for(int i=0; i<dailyHighs.length; i++) {
            add += dailyHighs[i];
        }
        double average = add/dailyHighs.length;
        System.out.println("city: " + city + "  zipcode: " + zipcode + "  average temp will be " + average);

    }
}