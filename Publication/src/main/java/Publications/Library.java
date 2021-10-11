package Publications;

import java.util.ArrayList;

public class Library {

    ArrayList arrayList = new ArrayList();

    ArrayList list;

    public void addBooks(Publication pub){
        list = new ArrayList();
        list.add(pub.getNoOfPages());
        list.add(pub.getPrice());
        list.add(pub.getPublisherName());
        arrayList.add(list);
    }

    public void printDetails(){
        for(Object i : arrayList){
            System.out.println(i.toString());
        }
    }
}
