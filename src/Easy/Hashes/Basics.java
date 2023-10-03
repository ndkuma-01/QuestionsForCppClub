package Easy.Hashes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Basics {
    //Hashes are a method of transforming some 'key' and transforming it into another value
    //It can do this without using a for loop or using an array
    // Because of this it uses barely any resources and takes very little time
    //However each key must be distinct
    //So if you try to add a key that already exists then it won't be added since one already exists with the same key
    public static void main(String[] args) {

        // Lets first explore hashsets, which is essentially that of an array of distinct values
        //to initialize use the following syntax:
        HashSet<Integer> set = new HashSet<>();

        //To put values inside use the following syntax:
        set.add(1);
        set.add(2);

        //we can print it out like so
        System.out.println(set);

        //if we try adding 1 again then see what happens:
        set.add(1);
        System.out.println(set);
        //and thats one of the quirks of hashes, the keys must be distinct

        //you can figure out how big the hashset is by using the following syntax:
        System.out.println(set.size());

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,15,3,6,1,2,2,1,2,1,5,2,3,4,1,15));
        //Below create your own hashset and add the elements above from the arraylist nums, then
        // find print out the number of distinct numbers in nums





        //There are also HashMaps, which take any type of key and can return any type in.
        //Remember though that each key must be distinct

        //to declare:
        HashMap<String, Integer> map = new HashMap<>();

        //to put key, value pairs inside use the following syntax:
        map.put("Sunday", 0);
        //if we try
        //map.put("Sunday", 0);
        //it will give an error cause there already exists a duplicate

        //so if we do the following to access the value, given the key:
        System.out.println(map.get("Sunday"));
        // we get 0
        //to get the length of the hashmap:
        System.out.println(map.size());

        //now below add in the rest of the days in the week and weekend and give them an assosciated value
        //then take in a user input of a day (use Scanner)
        //and return the number day it is







    }
    //from this point on you can use hashsets and hashmaps, they are super useful and and insanely
    //optimized data structure, so thoroughly recommend using them
}
