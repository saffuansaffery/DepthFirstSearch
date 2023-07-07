import java.util.List;

public class Graph {

    int numVertices;
    private List<String> vertices;
    int[][] adjacencyMatrix = new int[numVertices][numVertices];

    // public Graph() {

    // }

    public void addVertex(String vertex) {
        vertices.add(vertex);
    }

    public Integer[] getEdges(Integer vertex) {
        Integer[] edges = new Integer[numVertices];
        for(int i = 0; i<numVertices; i++){
            if(adjacencyMatrix[vertex][i] == 1){
                edges[i] = i++;
            }
        }
        return edges;
    }

    // public int countEdges(Integer vertex) {
    //     int count = 0;
    //     for(int y = 0; y < numVertices; y++){
    //         if(adjacencyMatrix[vertex][y] == 1){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public void printGraph(){
        
    // }
}

