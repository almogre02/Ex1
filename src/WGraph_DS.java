import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *This class represents an undirectional weighted graph.
 */
public class WGraph_DS implements weighted_graph {

    //private HashMap<Integer, Edge> nodeInfo;
    private HashMap<Integer, NodeInfo> nodeInfo;

    /**
     *
     * @param key - the node_id
     * @return
     */
    @Override
    public node_info getNode(int key) {
        if (nodeInfo.containsKey(key)==true)
            return nodeInfo.get(key);
        else
            return null;
    }

    /**
     * This function checks if their is an edge between node1 and node2
     * @param node1
     * @param node2
     * @return
     */
    @Override
    public boolean hasEdge(int node1, int node2) {
        if (getNode(node1).)

    }

    /**
     *This function returns the weight of the edge between node1 and node2.
     * In case their isn't an edge,the function returns -1.
     * @param node1
     * @param node2
     * @return
     */
    @Override
    public double getEdge(int node1, int node2) {
        return 0;
    }

    /**
     *
     * @param key
     */
    @Override
    public void addNode(int key) {

    }

    /**
     *
     * @param node1
     * @param node2
     * @param w
     */
    @Override
    public void connect(int node1, int node2, double w) {

    }

    /**
     *
     * @return
     */
    @Override
    public Collection<node_info> getV() {
        return null;
    }

    /**
     *
     * @param node_id
     * @return
     */
    @Override
    public Collection<node_info> getV(int node_id) {
        return null;
    }

    /**
     *
     * @param key
     * @return
     */
    @Override
    public node_info removeNode(int key) {
        return null;
    }

    /**
     *
     * @param node1
     * @param node2
     */
    @Override
    public void removeEdge(int node1, int node2) {

    }

    /**
     *
     * @return
     */
    @Override
    public int nodeSize() {
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public int edgeSize() {
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public int getMC() {
        return 0;
    }

    private class NodeInfo implements node_info{
        private int key;
        private String info;
        private double tag;
        //private HashMap<Integer, Edge> nodeInfo;
        private LinkedList<Edge> edges;

        public NodeInfo(int key)
        {
            this.key=key;
            this.info="";
            this.tag=tag;
            this.edges=new LinkedList<Edge>();
        }

        @Override
        public int getKey() {
            return this.key;
        }

        @Override
        public String getInfo() {
            return this.info;
        }

        @Override
        public void setInfo(String s) {
            this.info=s;
        }

        @Override
        public double getTag() {
            return this.tag;
        }

        @Override
        public void setTag(double t) {
            this.tag=t;
        }

    }
    private class Edge{
        int dest;
        double weight;

        private Edge(){
            this.dest=dest;
            this.weight=weight;
        }

        public int getDest()
        {
            return this.dest;
        }
        public void setDest(int d)
        {
            this.dest=d;
        }
        public double getWeight()
        {
            return this.weight;
        }
        public void setWeight(double d)
        {
            this.weight=d;
        }
    }
}
