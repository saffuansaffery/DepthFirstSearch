import java.util.List;

public class DepthFirstSearch {

    Graph graph = new Graph();
    private List<Integer> visitedVertices;
    private List<Integer> path;


    // public DepthFirstSearch(Graph graph) {
    //     this.graph = graph;
    //     visitedVertices = new java.util.LinkedList<>();
    // }

    public void dfs(Integer start, Integer destination) {
        if (start != destination && !visitedVertices.contains(start)) {
            visitedVertices.add(start);
            for (int current : graph.getEdges(start)) {
                path.add(start);
                search(current, destination, path);
            }
        }
    }

    private List<Integer> search(int current, int destination, List<Integer> path) {
        path.add(current);
        if (current == destination) {
            return path;
        }

        for (int neighbor = 0; neighbor < adjacencyMatrix[current].length; neighbor++) {
            if (adjacencyMatrix[current][neighbor] == 1 && !visited[neighbor]) {
                dfs(neighbor, destination, path);

                if (!path.get(path.size() - 1).equals(destination)) {
                    path.remove(path.size() - 1);
                } else {
                    return;
                }
            }
        }
    }
}

    public List<Integer> findPath(int source, int destination) {
        int numVertices = adjacencyMatrix.length;
        visited = new boolean[numVertices];
        List<Integer> path = new ArrayList<>();

        dfs(source, destination, path);

        if (path.isEmpty()) {
            return null;
        } else {
            return path;
        }
    }

    


