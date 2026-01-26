package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListProblems {

    public static ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
    public static ArrayList<String> fruits=new ArrayList<>(Arrays.asList("Apple","Banana","Pineapple","Guava","Mango"));

     public static void numberListForLoop(){
         for(int i=0;i<numbers.size();i++){
             int number=numbers.get(i);
             System.out.println(number);
         }
     };

     public static void fruitsForLoop(){
         for(int i=0;i<fruits.size();i++){
             String fruit=fruits.get(i);
             System.out.println(fruit);
         }
     };

     public static void numbersForEachLoop(){
         for (int num:numbers){
             System.out.println(num);
         }
     };

     public static void fruitsForEachLoop(){
         for (String fruit:fruits){
             System.out.println(fruit);
         }
     }



     public static void numbersIteratorMethod(){
         Iterator<Integer> iterator= numbers.iterator();
         while (iterator.hasNext()){
             int number=iterator.next();
             System.out.println(number);
         }
     };

     public static void fruitsIteratorMethod(){
         Iterator<String> iterator= fruits.iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }
     };

     /*
     Create a function which prints to the console the pairs from the given array
     [1,3,4,5] --11,13,14,15,
                 31,33,34,35
                 41,43,44,45
                 51,53,54,55
      */

    public static ArrayList<String> pairOfElements(int[] array){
        ArrayList<String> pairs=new ArrayList<>(); // -----O(1)
        for(int i=0;i<array.length;i++){  //-----O(n)
            for (int j=0;j<array.length;j++){ //-----O(n)
                String number= String.valueOf(array[i]) + String.valueOf(array[j]); // -----O(1)
                pairs.add(number); //-----O(n)
            }
        }
        return pairs;
    }
}
