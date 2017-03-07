/**
 * Sean Wunderlich
 * ITSE 1302-011
 * Exercise 11
 * Program that returns information about user
 */

//This program gets and sets various information characteristics about the user and prints them on the screen

public class Person //Establishes public class called Person
{
    private String strFirstName = ""; //Establishes private string called strFirstName
    private String strLastName = ""; //Establishes private String called strLastName
    private String strMiddleName = ""; //Establishes private String called strMiddleName
    private int intBirthYear = 1970; //Establishes private int called intBirthYear and sets default value to 1970
    private String strBirthMonth = ""; //Establishes private string called strBirthMonth
    private int intBirthDay = 1; //Establishes private int called intBirthDay and sets default value to 1
    private char chrGender = ' '; //Establishes private char called chrGender
    private int intHeightIN = 72; //Establishes private int called intHeightIN and sets default value to 72
    private int intWeightLBS = 165; //Establishes private int called intWeightLBS and sets default value to 165

    public void setFirstName(String pstrFirstName)
    {
        this.strFirstName = pstrFirstName; //Set setFirstName as String
    }
    public String getFirstName()
    {
        return this.strFirstName; //Get setFirstName from previous statement
    }
    public void setLastName(String pstrLastName)
    {
        this.strLastName = pstrLastName; //Set setLastName as String
    }
    public String getLastName()
    {
        return this.strLastName; //Get setLastName from previous statement
    }
    public void setMiddleName(String pstrMiddleName)
    {
        this.strMiddleName = pstrMiddleName; //Set setMiddleName as String
    }
    public String getMiddleName()
    {
        return this.strMiddleName; //Get setMiddleName from previous statement
    }
    public String getName()
    {
        return this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
        //Returns getFirstName, getMiddleName, and getLastName
    }
    public void setName(String pstrFirstName, String pstrMiddleName, String pstrLastName)
    {
        this.setFirstName(pstrFirstName); //Sets setFirstName as part of setName
        this.setMiddleName(pstrMiddleName); //Sets setMiddleName as part of setName
        this.setLastName(pstrLastName); //Sets setLastName as part of setName
    }
    public void setBirthYear(int pintBirthYear)
    {
        this.intBirthYear = pintBirthYear; //set intBirthYear as int
    }
    public int getBirthYear()
    {
        return this.intBirthYear; //Get setBirthYear from previous set statement
    }
    public void setBirthMonth(String pstrBirthMonth)
    {
        this.strBirthMonth = pstrBirthMonth; //set strBirthMonth as string
    }
    public String getBirthMonth()
    {
        return this.strBirthMonth; //Get setBirthMonth from previous set statement
    }
    public void setBirthDay(int pintBirthDay)
    {
        this.intBirthDay = pintBirthDay; //set setBirthDay as int
    }
    public int getBirthDay()
    {
        return this.intBirthDay; //Get setBirthDay from previous set statement
    }
    public void setChrGender(char pchrGender)
    {
        this.chrGender = pchrGender; //set setChrGender as char
    }
    public char getChrGender()
    {
        return this.chrGender; //Get setChrGender from previous set statement
    }
    public void setIntHeightIN(int pintHeightIN)
    {
        this.intHeightIN = pintHeightIN; //set setIntHeightIN as int
    }
    public int getIntHeightIN()
    {
        return this.intHeightIN; //Get setIntHeightIN from previous set statement
    }
    public void setIntWeightLBS(int pintWeightLBS)
    {
        this.intWeightLBS = pintWeightLBS; //set setIntWeightLBS as int
    }
    public int getIntWeightLBS()
    {
        return this.intWeightLBS; //Get setIntWeightLBS from previous set statement
    }
}

