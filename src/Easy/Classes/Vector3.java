package Easy.Classes;

/*
 * create a class with the following things:
 * public Double x
 * public Double y
 * public Double z
 * 
 * Constructor that takes in 3 doubles and assigns them to x, y, and z
 * Constructor that takes in to doubles and initilizes <x, y, 0>
 * Default Constructor that initilizes to <0, 0, 0>
 * 
 * Several class level common vectors with the keywords "public static final" then Vector3:
 * public static final Vector3 UP initilized to <0,1,0>
 * public static final Vector3 DOWN initilized to <0,-1,0>
 * public static final Vector3 RIGHT initilized to <1,0,0>
 * public static final Vector3 LEFT initilized to <-1,0,0>
 * public static final Vector3 FORWARDS initilized to <0,0,1>
 * public static final Vector3 UP initilized to <0,0,-1>
 * 
 * The following Non-Static Methods:
 * public double magnitude()    //(Look up how to find magnitude)
 * public boolean equals(Vector3 other)     //sees if the components of the vectors are equal
 * public String toString()     //returns string of the form "<x, y, z>" where x, y, and z are the actual values 
 * 
 */

public class Vector3 {
    public static void main(String[] args) {
        //Vector3 myUp = new Vector3(0, 1);
        //System.out.println(myUp.equals(Vector3.UP)); //should print true
        //Vector3 piO4 = new Vector3(1, 1);
        //System.out.println(piO4.magnitude()); //should print a value starting with 0.707
    }
}
