package Section12.Liste_InterFace;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListIstifadesi {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>(20);
        list.add("ad1");
        list.add("add2");
        list.add("add3");
        list.ensureCapacity(120);
        list.trimToSize();
        ArrayList<String> newList=new ArrayList<>(list);
        System.out.println(newList.size());

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itrv=v.iterator();
        while(itrv.hasNext()){
            System.out.println(itrv.next());
        }
    }


}
