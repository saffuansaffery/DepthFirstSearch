import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class myFileReader {

    public static void readFile(String filePath) {
        
        Graph graph = new Graph();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            Integer numVertices;
            numVertices = Integer.parseInt(reader.readLine());
            graph.numVertices = numVertices;
            String line;
            for(int i = 0; i < numVertices; i++){
                if ((line = reader.readLine()) != null) {
                    graph.addVertex(line);
                }
            }

            int x = 0, y = 0;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    int edge = (int) c;
                    graph.adjacencyMatrix[x][y] = edge;
                    y++;
                }
                x++;
                y = 0; // Reset y for the next row
            }
                        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

