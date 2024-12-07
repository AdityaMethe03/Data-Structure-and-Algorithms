import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSandDFS {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    
    static void CreateGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));

    }

    public static void bfs(ArrayList<Edge>[] graph) { //O(V+E) //bigger out of V or E will control TC
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);//source -> 0

        while(!q.isEmpty()) {
            int curr = q.remove();

            if(!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) { //O(V+E)
        //visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) { //O(V+E)
        if(src == dest) return true;

        vis[src] = true;
        for(int i=0; i<graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<ArrayList<Edge>> adjacencyList(ArrayList<ArrayList<Integer>> edgeList) {
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < edgeList.size(); i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edgeList.size(); i++) {
            int a = edgeList.get(i).get(0);
            int b = edgeList.get(i).get(1);
            graph.get(a).add(new Edge(a, b, 1));
            graph.get(b).add(new Edge(b, a, 1));
        }

        return graph;
    }

    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        CreateGraph(graph);

        bfs(graph);
        System.out.println();
        dfs(graph, 0, new boolean[V]);
        System.out.println();
        System.out.println(hasPath(graph, 0, 7, new boolean[V]));

        ArrayList<ArrayList<Edge>> adjList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> edgeList = new ArrayList<>();

        edgeList.add(new ArrayList<>(Arrays.asList(0, 1)));
        edgeList.add(new ArrayList<>(Arrays.asList(1,2)));
        edgeList.add(new ArrayList<>(Arrays.asList(1,3)));
        edgeList.add(new ArrayList<>(Arrays.asList(2,3)));

        adjList = adjacencyList(edgeList);

        for (ArrayList<Edge> list : adjList) {
            for (Edge element : list) {
                System.out.print("("+element.src + " " +element.dest + ")");
            }
            System.out.println();
        }
    }
}
