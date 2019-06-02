public class main {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insert(3);
        list.insert(2);
        list.insert(10);
        list.printList();
        System.out.println("----------------");
        list.basaEkle(8);
        list.insert(11);
        list.printList();
        System.out.println("Eleman sayisi: "+list.getLenght());
        System.out.println("10 hangi indexde: "+list.getDataIndex(10));
        System.out.println("15 hangi indexde: "+list.getDataIndex(15));
        System.out.println("0. indexde ne var: "+list.getIndex(0));
        System.out.println("4. indexde ne var: "+list.getIndex(4));
        System.out.println("10. indexde ne var: "+list.getIndex(10));
        System.out.println("3. indexde ne var: "+list.getIndex(3));
    }
}
