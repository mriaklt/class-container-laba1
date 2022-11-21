
package mkoltakova.laboratornaya_1.container;

/**
 *
 * @author admin
 */
public class Node {
    private int num;
    private Node next;
    
    public void setNum(int _num){
       num = _num;
    }
    
    public int getNum(){
        return num;
    }
    
    public void setNext(Node _next) {
        next = _next;
    }
    
    public Node getNext() {
        return next;
    }
    
}
