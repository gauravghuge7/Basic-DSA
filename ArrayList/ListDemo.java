import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

class ListDemo {

    static void basicArrayList() {
        // Integer i = Integer.valueOf(2);

        ArrayList <Integer> L1 = new ArrayList<>();

        L1.add(5);
        L1.add(6);
        L1.add(7);
        L1.add(8);
        

        L1.add(1, 15);

        // L1.removeIf(15)

        L1.set(0, 595);

        // L1.remove(0);
        L1.remove(Integer.valueOf(595));


        // printing the arrayList using the loop
        for (int i=0; i<L1.size(); i++) {

            System.out.print(L1.get(i)+" ");

        }

        
        System.out.println(L1);



        ArrayList get = new ArrayList<>();

        // get.valueOf = [1,2,3,4];
    }



    static void reverseArrayList(ArrayList<Integer> list) {

        int i=0, j=list.size()-1;

        while(i<j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
    }



    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>();

        list.add(7);
        list.add(20);
        list.add(15);
        list.add(10);
        list.add(11);
        
        
        // reverseArrayList(list);

        // alternate method for reverse array

        // Collection.reverse(list);

        // sorting the arrayList
        Collection.sort(list);

        System.out.print(list+" ");

    }
}

