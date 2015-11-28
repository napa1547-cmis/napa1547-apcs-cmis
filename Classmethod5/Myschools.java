public class Myschools
{
    public static void main (String[] args)
    {
        String school1 = ("UCLA");
        String school2 = ("UCLA");
        String school3 = ("UCSD");
        
        System.out.println( school1.compareTo( school2 ));
        System.out.println( school2.compareTo( school3 ));
        System.out.println( school3.compareTo( school1 ));
    } // end compareTo method
}
/*
 * a. What is the output of the compareTo() method telling us? 
 * The output of the compareTo() method is telling us the alphabetical order difference between the alphabet of each string.
 * It starts at the first letter, then moves on until there is a difference found - if none at all, then it will be 0.
 * b. Compare to schools that have the same first letter and a different second letter. What does compareTo() do in this case?
 * In this case, compare to will skip the first letter and print the alphabetical order difference of the second letter.

 */
