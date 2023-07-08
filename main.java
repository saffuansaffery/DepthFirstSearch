
public class main{
    public static void main(String[] args) {

        Graph graph = new Graph();

        fileReader file = new fileReader("input.txt", graph);
        DepthFirstSearch dfs = new DepthFirstSearch();
        Print print = new Print();

        print.path(dfs, graph);
    } 
}

