package node;

/**
 * @author Oleksandra Gergovska
 */
public class Node <T> {

    /* Contains reference on value node stores */
    private T valueNode = null;

    /* Link to the next node in the list */
    private Node<T> nextNode = null;

    /* node's constructor initializes the fields */
    public Node(T valueNode) {
        this.valueNode = valueNode;
        this.nextNode = null;
    }

    /* Getter: returns the next node */
    public Node<T> getNext() {
        return nextNode;
    }

    /* Setter: set the next node after this one */
    public void setNext(Node<T> next) {
        nextNode = next;
    }

    /* Getter: returns the value being stored in the node */
    public T getValue() {
        return valueNode;
    }

}
