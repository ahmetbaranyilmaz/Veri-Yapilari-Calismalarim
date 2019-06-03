class linkedList{

    node head = null;

    public void insert(int newData){ // deger ekleme
        if (head == null){
            head = new node(newData);
            return;
        }
        node last = head;
        while (last.next!=null){
            last = last.next;
        }
        last.next = new node(newData);
    }

    public void printList(){ // elemanlari gosterme
        node pointNode = head;
        while (pointNode!=null){
            System.out.print(pointNode.data+" ");
            pointNode = pointNode.next;
        }
        System.out.println();
    }

    public void basaEkle(int newData){ // basa ekleme
        if (head==null){
            head = new node(newData);
            return;
        }

        node newNode = new node(newData);
        newNode.next = head;
        head = newNode;
    }

    public int getLenght(){ // uzunluk bulma
        int counter =0;
        node temp = head;
        while (temp!=null){
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    public int getDataIndex(int data){ // dataya gore index bulma
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

    public int getIndex(int index){ // indexe gore data bulma
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

    public int getSize(node head){ // recursive sekilde uzunluk bulma
        if (head==null)
            return 0;
        else
            return 1+getSize(head.next);
    }

    public int getCount(){
        return getSize(head);
    }

    public void reversePrint(node head){ // tersten gosterme
        if (head==null)return;
        reversePrint(head.next);
        System.out.print(head.data + " ");
    }

    public void delete(int data){ // degere gore silme islemi
        node temp = head;
        node prev = null;

        if (temp == null) return;

        if (temp!=null && temp.data == data){
            temp = temp.next;
            return;
        }

        while (temp!=null && temp.data != data){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    public void deleteIndex(int index){ // Indexe gore silme islemi
        node temp = head;
        node prev = null;

        int counter = 0;

        if (temp == null) return;

        if (index>=getSize(temp)) return;

        if (temp!= null && counter==index){
            temp = temp.next;
            return;
        }

        while (temp!=null && counter!= index){
            prev = temp;
            temp = temp.next;
            counter++;
        }

        prev.next = temp.next;
    }

    public void mergeList(node newHead){ // iki linkedListi birlestirmek icin
        node temp = head;
        if (temp == null && newHead == null) return;
        if (temp == null && newHead != null) head = newHead;
        if (temp != null && newHead == null) return;
        if (temp != null && newHead != null){
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newHead;
        }
    }

    public void insertList(node listHead,int index){
        if (index>=getSize(head)) return;
        if (index<0)return;
        if (listHead == null)return;
        node temp = head;
        int counter =0;
        while (temp!= null && index!=counter){
            temp = temp.next;
            counter++;
        }
        node x = temp.next;
        temp.next = listHead;
        while (listHead.next!= null){
            listHead = listHead.next;
        }
        listHead.next = x;
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