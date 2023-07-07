import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args) {

        List<Integer> path = new ArrayList<>();
        Graph graph = new Graph();
        fileReader file = new fileReader("input.txt", graph);
        DepthFirstSearch dfs = new DepthFirstSearch();
        System.out.println(dfs.dfs(0, 3, path, graph));
    }
}

