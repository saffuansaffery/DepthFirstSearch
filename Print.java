import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print {

    Scanner scanner = new Scanner(System.in);
    private int startLocation, endLocation;

    public Print(){

        System.out.println("");
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║           Flight Explorer Pro           ║");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.println("");
        System.out.println("    Explore connected flights to reach     ");
        System.out.println("         your desired destination          ");
        System.out.println("");
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║  Press enter to find your destination!  ║");
        System.out.println("╚═════════════════════════════════════════╝");

        scanner.nextLine(); 
        askLocation();
    }
    
    public void showCountries() {

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println("");
        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║   1. America       2. China    3. Germany   ║");
        System.out.println("║   4. Saudi Arabia  5. India    6. France    ║");
        System.out.println("║   7. Malaysia      8. Japan    9. Korea     ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        System.out.println("");
    }

    public void askLocation() {

        showCountries();
        System.out.print("Select your location: ");
        startLocation = scanner.nextInt();

        showCountries();
        System.out.print("Select your destination: ");
        endLocation = scanner.nextInt();
    }

    public void path(DepthFirstSearch dfs, Graph graph) {

        List<Integer> path = new ArrayList<>();
        dfs.findPath(startLocation, endLocation, path, graph);
        
    }
}
