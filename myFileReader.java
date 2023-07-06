import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class myFileReader {

    public static void readFile(String filePath) {
        Graph graph = new Graph();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String numVertices;
            numVertices = reader.readLine();
            graph.numVertices = numVertices;

            System.out.print(numVertices);
            int character;
            String line;
            for(int i = 0; i < Integer.parseInt(numVertices); i++){
                if ((line = reader.readLine()) != null) {
                    for (char c : line.toCharArray()) {
                        System.out.print(c);
                    }
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

