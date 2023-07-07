import java.util.ArrayList;
import java.util.List;

public class Graph {

    int numVertices;
    private List<String> verticesName = new ArrayList<String>();;
    ArrayList<Integer>[] adjacencyLists;

    public Graph(){
    }
    
    public void addVertex(String vertex) {
        verticesName.add(vertex);
    }

    public void addEdge(int x, int y) {
        adjacencyLists[x].add(y);
    }

    public void createList() {
        adjacencyLists = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjacencyLists[i] = new ArrayList<Integer>();
        }
    }

    public List<Integer> getEdges(int vertex) {
        List<Integer> edges = new ArrayList<Integer>();
        for(int i : adjacencyLists[vertex]){
            edges.add(i);
        }
        return edges;
    }

    public void print() {
        System.out.println(adjacencyLists);
    }
}

