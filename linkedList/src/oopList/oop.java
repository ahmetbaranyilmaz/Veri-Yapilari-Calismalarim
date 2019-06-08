package oopList;

public class oop {
    public static void main(String[] args) {
        list list = new list();
        list.insert(new bilgi(1,"Brad","PITT"));
        list.insert(new bilgi(2,"Ryan","REYNOLDS"));
        list.printList();
    }
}
class node{
    private bilgi bilgi;
    private node next;

    node(bilgi bilgi) {
        this.bilgi = bilgi;
        this.next = null;
    }

    bilgi getBilgi() {
        return bilgi;
    }

    node getNext() {
        return next;
    }

    void setNext(node next) {
        this.next = next;
    }
}
class list{
    private node head = null;

    void insert(bilgi bilgi){
        if (head == null){
            head = new node(bilgi);
            return;
        }

        node temp = head;
        while (temp.getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(new node(bilgi));
    }

    void printList(){ // elemanlari gosterme
        node pointNode = head;
        while (pointNode!=null){
            System.out.print(pointNode.getBilgi().getId()+" "+pointNode.getBilgi().getName()+" "+pointNode.getBilgi().getSurname());
            System.out.println();
            pointNode = pointNode.getNext();
        }
        System.out.println();
    }
}
class bilgi{
    private int id;
    private String name;
    private String surname;

    bilgi(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }
}