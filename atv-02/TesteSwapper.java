import java.util.*;
public class TesteSwapper {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Y: ");
        int y = scanner.nextInt();
        Swapper swapper = new Swapper(x, y);
        System.out.println("Swap");
        swapper.swap();
        System.out.println("X: " + swapper.x);
        System.out.println("Y: " + swapper.y);
        scanner.close();
    }
}
