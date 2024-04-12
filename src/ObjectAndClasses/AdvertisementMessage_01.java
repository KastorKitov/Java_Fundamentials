package ObjectAndClasses;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messagesToGenerate = Integer.parseInt(scanner.nextLine());

        String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};

        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.",
                "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random randomNumber = new Random();

        for(int i = 1; i <= messagesToGenerate; i++){
            String phrase = phrases[randomNumber.nextInt(phrases.length)];
            String event = events[randomNumber.nextInt(events.length)];
            String author = authors[randomNumber.nextInt(authors.length)];
            String city = cities[randomNumber.nextInt(cities.length )];

            System.out.println(phrase + " " + event + " " + author + " - " + city);
        }
    }
}
