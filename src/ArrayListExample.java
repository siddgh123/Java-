import java.util.*;

/*
1. Arraylist is dynamic used to store ordered data in which u want
Initial capacity is 10
Growth factor is 1.5
*/

public class ArrayListExample {

    public static void main(String[] args) {

        String[] arr ={"siddhesh","Arman","Aniket","Chinmay"};

        List<Integer> arrList=new ArrayList<>();


        arrList.add(200);
        arrList.add(100);
        arrList.add(150);
        arrList.add(500);
        arrList.add(1,500);

        System.out.println("ArrayList Size = "+arrList.size());
        for(int x: arrList){
            System.out.println(x);
        }

        System.out.println("ArrayList get method at index 2 = "+arrList.get(2));

        System.out.println("ArrayList does contain 500 = "+arrList.contains(500));

        System.out.println("ArrayList remove 100 = "+arrList.remove(Integer.valueOf(100)));// as arraylist take index or object

        List<String> arrList1=Arrays.asList(arr);
        arrList1.set(1,"Armaan");
        System.out.println("ArrayList of string array get method at index 1 = "+arrList1.get(1));

        System.out.println("ArrayList After sorting");
        arrList.sort(null);
        for(int x: arrList){
            System.out.println(x);
        }
        System.out.println("ArrayList is empty = "+arrList.isEmpty());
    }
}
