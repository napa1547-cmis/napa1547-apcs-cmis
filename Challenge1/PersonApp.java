public class PersonApp
{
    public static void main(String[] args)
    {
        Person[] people = new Person[4];
        people[0] = new Person("Nathan Kieffer", 1975, 4, 23);
        people[1] = new Student("Bradley Shank", 1943, 9, 21, "CMIS");
        people[2] = new Senior("Tadpole", 1998, 1, 1, "CMIS", "Harvard", true);
        people[3] = new Doctor ("Napa", 1998, 5, 13, 99999999);
        for ( Person person : people )
        {
            System.out.println(person + "\n");
        }     
    }
}