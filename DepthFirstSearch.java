import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    private List<Integer> visitedVertices;

    public List<Integer> dfs(int current, int destination, List<Integer> path, Graph graph) {
        visitedVertices = new ArrayList<>();
        return search(current, destination, path, graph);
    }

    private List<Integer> search(int current, int destination, List<Integer> path, Graph graph) {
        if (current == destination) {
            path.add(current);
            return path; 
        }

        visitedVertices.add(current);

        for (int next : graph.getEdges(current)) {
            if (!visitedVertices.contains(next)) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(current);
                List<Integer> result = search(next, destination, newPath, graph);

                if (result != null) {
                    return result; 
                }
            }
        }

        return null; 
    }
}