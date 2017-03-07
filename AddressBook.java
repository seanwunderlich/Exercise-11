/**
 * Sean Wunderlich
 * ITSE 1302-011
 * Exercise 11
 * Program that returns information about user
 */

public class AddressBook //Establishes class called AddressBook
{
    public static void main(String [] strArgs)
    {
        Person objPersonOne = new Person(); //Creates new object called objPersonOne
        objPersonOne.setFirstName("Sean"); //Assigns Sean to setFirstName
        objPersonOne.setMiddleName("R"); //Assigns R to setMiddleName
        objPersonOne.setLastName("Wunderlich"); //Assigns Wunderlich to setLastName
        System.out.println(objPersonOne.getName()); //Print getName

        System.out.print("Born: "); //Print Born:

        objPersonOne.setBirthMonth("January "); //Assigns January  to setBirthMonth
        System.out.print(objPersonOne.getBirthMonth()); //Print getBirthMonth

        objPersonOne.setBirthDay(29); //Assigns 29 to setBirthDay
        System.out.print(objPersonOne.getBirthDay()); //Print getBirthDay
        System.out.print(", "); //Print a comma

        objPersonOne.setBirthYear(1993); //Assigns 1993 to setBirthYear
        System.out.print(objPersonOne.getBirthYear()); //Print getBirthYear
        System.out.println(); //Print blank line

        System.out.print("Gender: "); //Print Gender:
        objPersonOne.setChrGender('M'); //Assigns M to setChrGender
        System.out.print(objPersonOne.getChrGender()); //Print getChrGender
        System.out.println(); //Print blank line

        System.out.print("Height in inches: "); //Print Height in inches:
        objPersonOne.setIntHeightIN(74); //Assign 74 to setIntHeightIN
        System.out.print(objPersonOne.getIntHeightIN()); //Print getIntHeightIN
        System.out.println(); //Print blank line

        System.out.print("Weight in pounds: "); //Print Weight in pounds
        objPersonOne.setIntWeightLBS(229); //Assign 229 to setIntWeightLBS
        System.out.print(objPersonOne.getIntWeightLBS()); //Print getIntWeightLBS
    }
}
