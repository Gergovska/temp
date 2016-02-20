package linkedlist;
/*
 * @author Oleksandra Gergovska
 */
import node.Node;
public class LinkedList<T> {
        /* Stores pointers to the list's nodes at the head and the tail
           Head pointer is null if the list is empty */
        private Node<T> head;

        /* The number of nodes in the list */
        private int size;


    /* Constructor creates an empty list */
        public LinkedList() {
            head = null;
            size = 0;
        }

        /* Getter: returns the size of the list */
        public int size() {
            return size;
        }

        /* @param	value to add to the end of the list */
        public void add(T value) {
            head = addToTail(head, value);
            size++;
        }

        /* @param   node of the list to which the value should be added
         * @param	value to add to the end of the list*/
        private Node<T> addToTail(Node<T> node, T value) {
            if (node == null) {
                return new Node<>(value);
            } else if (node.getNext() == null) {
                node.setNext(new Node<>(value));
            } else {
                addToTail(node.getNext(), value);
            }
            return node;
        }


        /*Method reverts single linked list in one go through the single linked list*/
        public void revertList() {
            Node<T> tempHead = head;
            Node<T> newHead = null;
            Node<T> temp;
            while (tempHead != null) {
                    temp = tempHead.getNext();
                    tempHead.setNext(newHead);
                    newHead = tempHead;
                    tempHead = temp;
                }
                head = newHead;
        }
        public boolean ifListEquals( LinkedList<Integer> list2){
            //Node<Integer> nodeHead1 = list1.head;
            //Node<Integer> nodeHead2 = list2.head;
           if (( this.size()== 0)&&( list2.size() == 0)){
                return true;
            } else if (this.head==list2.head){
                this.head=this.head.getNext();
                list2.head=list2.head.getNext();
                        ifListEquals(list2);
            }
                return false;
                    }

    //Method converts the list to a printable string
         @Override
         public String toString() {
            Node<T> node = head;
            String result = "";
            while (node != null) {
                result = result + (node.getValue()).toString() + " ";
                node=node.getNext();
            }
            return result;
        }
    }

