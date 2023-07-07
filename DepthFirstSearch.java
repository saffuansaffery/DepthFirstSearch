import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
    private Graph graph;
    private List<Integer> visitedVertices;

    public List<Integer> dfs(Integer current, Integer destination, List<Integer> path) {
        visitedVertices = new ArrayList<>();
        return search(current, destination, path);
    }

    private List<Integer> search(Integer current, Integer destination, List<Integer> path) {
        if (current.equals(destination)) {
            path.add(current);
            return path; 
        }

        visitedVertices.add(current);

        for (Integer next : graph.getEdges(current)) {
            if (!visitedVertices.contains(next)) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(current);
                List<Integer> result = search(next, destination, newPath);

                if (result != null) {
                    return result; // Found a valid path, return it
                }
            }
        }

        return null; // No path found
    }
}
