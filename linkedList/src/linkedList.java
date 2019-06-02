class linkedList{

    node head = null;

    public void insert(int newData){
        if (head == null){
            head = new node(newData);
            return;
        }
        node newNode = new node(newData);
        node last = head;
        while (last.next!=null){
            last = last.next;
        }
        last.next = newNode;
    }

    public void printList(){
        node pointNode = head;
        while (pointNode!=null){
            System.out.print(pointNode.data+" ");
            pointNode = pointNode.next;
        }
        System.out.println();
    }

    public void basaEkle(int newData){
        if (head==null){
            head = new node(newData);
            return;
        }

        node newNode = new node(newData);
        newNode.next = head;
        head = newNode;
    }

    public int getLenght(){
        int counter =0;
        node temp = head;
        while (temp!=null){
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    public int getDataIndex(int data){
        int counter = 0;
        node temp = head;
        while (temp!=null){
            if (temp.data == data){
                return counter;
            }
            else {
                counter++;
                temp = temp.next;
            }
        }
        return -1;
    }

    public int getIndex(int index){
        if (index>=getLenght()){
            return -1;
        }
        node temp = head;
        int indexCounter = 0;
        while (temp!=null){
            if (index==indexCounter){
                return temp.data;
            }
            else {
                indexCounter++;
                temp = temp.next;
            }
        }

        return -1;
    }

}
class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}