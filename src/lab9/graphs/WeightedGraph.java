package lab9.graphs;

/**
 * a minimal number of stubs have been provided 
 * to get the starting point file to run
 * 
 * @author Tyler Elvis Zach, Nick
 * 
 */
public class WeightedGraph 
{
    private int[ ][ ] edges;
    private Object[ ] labels;
    
    /**This is the constructor
     * 
     * @param n the value of how many nodes to be made 
     */
    public WeightedGraph(int n)
    {
         edges = new int[n][n];  
        labels = new Object[n]; 
    }
       
    /**
     * This adds and edge to the graph
     * 
     * @param source the nodes you want to be able to connect to 
     * @param target the nodes you want to be able to connect to 
     * @param weight the weight value of said edge 
     */
    public void addEdge(int source, int target, int weight)
    {
        edges[source][target] = weight;
    }
    
    /**
     * gets the label of the vertex
     * 
     * @param vertex the vertex you are looking for 
     * @return the name/value of that vertex 
     */
    public Object getLabel(int vertex)
    { 
        return labels[vertex];
    }
    
    /**
     * this will show if the edge is real and if you can connect to it 
     * 
     * @param source the main node looking at also x element 
     * @param target the target value/ y element 
     * @return 
     */
    public boolean isEdge(int source, int target)
    {
        if(edges[source][target] > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * the neighbors checks to see if if you can move from one place to another
     * 
     * @param vertex the value you are looking at 
     * @return the answer 
     */
    public int[ ] neighbors(int vertex)
    {
      int i;
      int count;
      int[ ] answer;

      // First count how many edges have the vertex as their source
      count = 0;
      for (i = 0; i < labels.length; i++)
      {
         if (edges[vertex][i] > 0)
            count++;
      }

      // Allocate the array for the answer
      answer = new int[count];

      // Fill the array for the answer
      count = 0;
      for (i = 0; i < labels.length; i++)
      {
         if (edges[vertex][i] > 0)
            answer[count++] = i;
      }

      return answer;
    }
    
    /**
     * the remove edge removes and edge 
     * @param source the main vertex you are looking at 
     * @param target the target you want to remove
     */
    public void removeEdge(int source, int target)
    {
       edges[source][target] = 0;
    }
    
    /**
     * sets the label of the vertex 
     * 
     * @param vertex where you want it 
     * @param newLabel the label you want to be named 
     */
    public void setLabel(int vertex, Object newLabel)
    {
        labels[vertex] = newLabel;
    }
    
    /**
     * finds the size of the graph 
     * 
     * @return the size 
     */
    public int size( )
    {
        return labels.length;
    }

    /**
     * the get weight gets the weight of the edges 
     * 
     * @param source the main x you are looking at 
     * @param target the target value your trying to find 
     * @return the value of the weight
     */
    public int getWeight(int source, int target)
    {
        return edges[source][target];
    }
    
    /**
     * the setweight sets the weight of the edge 
     * 
     * @param source the main row you are looking at 
     * @param target the target you are looking to be set to 
     * @param weight the number you want the edge to be set at 
     */
    public void setWeight(int source, int target, int weight)
    {
       edges[source][target] = weight;
    }
       
}
