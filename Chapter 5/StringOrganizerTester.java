import java.util.Scanner;

public class StringOrganizerTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type three strings, A, B, and C.");
        System.out.println("A?");
        String a = in.nextLine();
        System.out.println("B?");
        String b = in.nextLine();
        System.out.println("C?");
        String c = in.nextLine();
        StringOrganizer strings = new StringOrganizer(a, b, c);
        System.out.println(strings.getOne());
        System.out.println(strings.getTwo());
        System.out.println(strings.getThree());
    }
}
