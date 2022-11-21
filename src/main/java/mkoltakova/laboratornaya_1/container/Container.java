

// Github: https://github.com/mriaklt/class-container-laba1.git

package mkoltakova.laboratornaya_1.container;

/**
 *
 * @author admin
 */
public class Container {
    private Node head;
    private Node tail;


    // Добавить элемент в конец
    public void append(int _num) {
        if(head!=null) {
            tail.setNext(new Node());
            tail.getNext().setNum(_num);
            tail = tail.getNext();
        } else {
            head = new Node();
            tail = new Node();
            head.setNum(_num);
            head.setNext(null);
            tail = head;
        }
    }

    // Удалить элемент по индексу
    public void remove(int index){
        Node tmp = head.getNext();
        Node prev_tmp = head;
        if (index==0) { head = head.getNext(); }
        int i = 0;
        do {
            if(index==i+1) {
                //System.out.println("Just removed " + tmp.getNum() + " at index " + (i+1));
                prev_tmp.setNext(tmp.getNext());
            }
            i++;
            prev_tmp = tmp;
            tmp = tmp.getNext();

        } while(tmp!= null);

    }

    // получить элемент по индексу
    public int get(int ind){
        Node tmp = head;
        int i = 0;
        while(tmp!=null) {
            if(i==ind) {
                return tmp.getNum();
            }
            i+=1;
            tmp = tmp.getNext();
        }

        return 99999;
    }

    // Распечатать содержимое в строку
    public void print(){
        Node tmp = head;
        while(tmp!=null) {
            System.out.print(tmp.getNum() + " ");
            tmp = tmp.getNext();
        }
        System.out.println("");

    }


}
