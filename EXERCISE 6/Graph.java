public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 11;
        int noEdges = 18;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "CARLOS";
        myGraph.edge[0].dest = "JOSHUA";

        // Edge 2
        myGraph.edge[1].src = "CARLOS";
        myGraph.edge[1].dest = "GLENDE";

        // Edge 3
        myGraph.edge[2].src = "CARLOS";
        myGraph.edge[2].dest = "SEAN";

        // Edge 4
        myGraph.edge[3].src = "CARLOS";
        myGraph.edge[3].dest = "LORRAINE";

        // Edge 5
        myGraph.edge[4].src = "CARLOS";
        myGraph.edge[4].dest = "JACOB";
        
        // Edge 6
        myGraph.edge[5].src = "CARLOS";
        myGraph.edge[5].dest = "ALEJO";
        
        // Edge 7
        myGraph.edge[6].src = "JOSHUA";
        myGraph.edge[6].dest = "JC";
        
        // Edge 8
        myGraph.edge[7].src = "JOSHUA";
        myGraph.edge[7].dest = "ALEJO";
        
        // Edge 9
        myGraph.edge[8].src = "JACOB";
        myGraph.edge[8].dest = "SEAN";
        
        // Edge 10
        myGraph.edge[9].src = "JACOB";
        myGraph.edge[9].dest = "LORRAINE";
        
        // Edge 11
        myGraph.edge[10].src = "LORRAINE";
        myGraph.edge[10].dest = "SEAN";
        
        // Edge 12
        myGraph.edge[11].src = "LORRAINE";
        myGraph.edge[11].dest = "JACOB";
        
        // Edge 13
        myGraph.edge[12].src = "SEAN";
        myGraph.edge[12].dest = "JACOB";
        
        // Edge 14
        myGraph.edge[13].src = "SEAN";
        myGraph.edge[13].dest = "LORRAINE";
        
        // Edge 15
        myGraph.edge[14].src = "ALEJO";
        myGraph.edge[14].dest = "JOSHUA";
        
        // Edge 16
        myGraph.edge[15].src = "GLENDE";
        myGraph.edge[15].dest = "ERIKA";
        
        // Edge 17
        myGraph.edge[16].src = "GLENDE";
        myGraph.edge[16].dest = "FRED";
        
        // Edge 18
        myGraph.edge[17].src = "GLENDE";
        myGraph.edge[17].dest = "LEO";
        
        
        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
