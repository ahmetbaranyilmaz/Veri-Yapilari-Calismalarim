public class main {
    public static void main(String[] args) {
        linkedList list = new linkedList(); // liste isimli bir linkedList nesnesi olusturuldu
        list.insert(3); // 3 degeri eklendi
        list.insert(2); // 2 degeri eklendi
        list.insert(10);  // 10 degeri eklendi
        list.printList();  // liste gosterildi
        System.out.println("----------------");
        list.basaEkle(8); // 8 degeri basa eklendi
        list.insert(11); // 11 degeri eklendi
        list.printList(); // liste gosterildi
        System.out.println("Eleman sayisi: "+list.getLenght()); // eleman sayisi
        System.out.println("10 hangi indexde: "+list.getDataIndex(10));
        System.out.println("15 hangi indexde: "+list.getDataIndex(15));
        System.out.println("0. indexde ne var: "+list.getIndex(0));
        System.out.println("4. indexde ne var: "+list.getIndex(4));
        System.out.println("10. indexde ne var: "+list.getIndex(10));
        System.out.println("3. indexde ne var: "+list.getIndex(3));

        System.out.println("getSize: "+list.getCount()); // recursive olarak uzunluk bulma
        list.printList(); // liste gosterildi
        list.reversePrint(list.head); // liste tersten gosterildi
        System.out.println();
        list.printList();  // liste gosterildi
        list.delete(11); // 11 listeden silindi
        list.printList(); // liste gosterildi
        list.insert(11); // 11 listeye eklendi
        list.printList(); // liste gosterildi
        list.deleteIndex(2); // 2. indexteki deger silindi
        list.printList(); // liste gosterildi

        System.out.println("list2");

        linkedList list2 = new linkedList(); // list2 isimli bir linkedList olusturuldu
        list2.insert(0); // list2 ye 0 degeri eklendi
        list2.insert(15); // list 2 ye 15 degeri eklendi
        System.out.println("list2");
        list2.printList(); // list2 gosterildi
        System.out.println("list1");
        list.printList(); // list gosterildi
        list.mergeList(list2.head); // list'in sonuna list2 eklendi
        System.out.println("list1 + list2");
        list.printList(); // list gosterildi. list2'nin eklenmis oldugu goruldu

        System.out.println("list1 + bos list");
        linkedList list3 = new linkedList();  // list3 isimli bir linkedList olusturuldu
        list.mergeList(list3.head); // list'in sonuna bos olan list3 eklendi
        list.printList(); // hata yok
        System.out.println("bos liste + bos liste");
        linkedList list4 = new linkedList(); // list4 isimli bir linkedList olusturuldu
        list3.mergeList(list4.head); // bos olan list3 ile list4 eklendi
        list3.printList(); // hata yok
        System.out.println("bos liste + dolu liste");
        list4.insert(3); // 3 degeri list4 e eklendi
        list4.insert(22); // 22 degeri list4 e eklendi

        list3.mergeList(list4.head); // bos olan list3'e dolu list4 eklendi
        list3.printList(); // yeni list3 gosterildi. hata yok

        System.out.print("list: ");
        list.printList(); // list gosterildi

        System.out.print("list3: ");
        list3.printList(); // list3 gosterildi

        list.insertList(list3.head,4); // list3 list'in 4. indexsinin sagina eklendi
        list.printList(); // list gosterildi

        linkedList emptyList = new linkedList(); // bos liste olusturuldu
        System.out.print("list2: ");
        list2.printList(); // list 2 gosterildi
        list2.insertList(emptyList.head,3); // bos liste eklenmeye calisildi
        list2.printList(); // hata vermiyor
    }
}
