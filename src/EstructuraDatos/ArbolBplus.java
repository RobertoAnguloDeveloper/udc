package EstructuraDatos;

public class ArbolBplus {
    /**root node**/
    protected NodoBplus root;

    /**head node**/
    protected NodoBplus head;

    /**M value**/
    protected int order;


    public int getOrder(){
        return this.order;
    }

    public void setOrder(Integer order){
        this.order = order;
    }

    public ArbolBplus(int order){
        if(order < 3){
            System.out.println("order must be greater than 2");
            System.exit(0);
        }
        this.order = order;
        root = new NodoBplus(true, true);
        head = root;
    }

    public void insertOrUpdate(Integer key, Object obj){
        root.insertOrUpdate(key, obj, this);
    } // Remove the specified keyword

    public void remove(Integer key){
        root.remove(key, this);
    } // Add the specified entry

    public Object search(Integer key) { // Find the specified entry
        return root.search(key);
    }

    public void find(ArbolBplus Tree) {
        root.find(Tree);
    }// Iterate over node list
}