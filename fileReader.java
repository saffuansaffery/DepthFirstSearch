import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

    public fileReader(String filePath, Graph graph) {
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            int numVertices = Integer.parseInt(reader.readLine());
            graph.numVertices = numVertices;

            String line;
            for(int i = 0; i < numVertices; i++){
                if ((line = reader.readLine()) != null) {
                    graph.addVertex(line);
                }
            }

            int vertexFrom = 0, vertexTo = 0;
            graph.createList();
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    int edge = Character.getNumericValue(c);
                    if(edge == 1){
                        graph.addEdge(vertexFrom, vertexTo);
                    }
                    // graph.print();
                    vertexTo++;
                } 
            vertexFrom++;
            vertexTo = 0;
            }
                        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

