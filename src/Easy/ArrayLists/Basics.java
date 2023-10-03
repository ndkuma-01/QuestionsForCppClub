package Easy.ArrayLists;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;

public class Basics {
    //Arraylists are like arrays but they can change their size dynamically
    //In arrays once you fill up, you can't extend that array. For an arraylist however
    //it will dynamically increase or decrease its size to fit the amount of elements

    public static void main(String[] args) {
        //to create a arraylist use the following syntax
        // ArrayList<[INSERT TYPE (Make sure the type has a capital first letter)]> [Insert variable name] = new ArrayList<>();
        // ex.
        ArrayList<Integer> nums = new ArrayList<Integer>();

        //To put elements inside of the ArrayList use the following syntax
        nums.add(1);

        //to clear the arraylist of all elements do the following:
        nums.clear();

        //you can also do the following for adding elements:
        for(int i = 0 ; i < 5; i++){
            nums.add(i);
        }

        // to retrieve elements use the .get(int index) syntax
        System.out.println(nums.get(1));

        //ArrayLists also inheritently support printing out. So for normal arrays you have to use Arrays.toString()
        // For ArrayLists you can simply print it out
        System.out.println(nums);

       //in addition to get the length of the ArrayList use the .size() command
        System.out.println("Num of Elements: " + nums.size());



        //now below create your own arraylist
        // add some elements to it
        // then print out each element on a seperate line



    }
    //From this point on you can choose whether or not to use ArrayLists or Arrays
    //Cameron and I both usually opt to use ArrayLists as they are more convenient when making small programs where resource consumption isn't that important
    // (do NOT use ArrayLists for CS180, Dr. Xing won't be chill with them)


}
