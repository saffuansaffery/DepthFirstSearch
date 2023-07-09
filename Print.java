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
        startLocation = scanner.nextInt() - 1;

        showCountries();
        System.out.print("Select your destination: ");
        endLocation = scanner.nextInt() - 1;

        while(endLocation == startLocation){
            showCountries();
            System.out.println("Try again! ");
            System.out.print("Select your destination: ");
            endLocation = scanner.nextInt() - 1;
        }
    }

    public void path(DepthFirstSearch dfs, Graph graph) {

        int count = 0;
        List<Integer> path = new ArrayList<>();

        System.out.print("\033[H\033[2J");  
        System.out.flush();
        
        System.out.println("");
        System.out.println("Here are the airports with connected flights to take you to your destination!");
        System.out.println("");

        for(int location : dfs.findPath(startLocation, endLocation, path, graph)){

            System.out.print(graph.verticesName.get(location) + " ");
            if (count < dfs.findPath(startLocation, endLocation, path, graph).size() - 1) {
                System.out.println("");
                System.out.println("\t o");
                System.out.println("\t |");
                System.out.println("\t o");
            }
            count++;
        }
        System.out.println(" ");
    }
}

