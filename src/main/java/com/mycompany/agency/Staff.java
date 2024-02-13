package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];


        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("Steven Bills", "25 New Tree Lane" ,
                "516-101-3131", "000-000-1234",100000);
        staffList[1] = new Intern("Intern One", "1 Intern Dr" ,
                "516-101-3131", "000-345-3334",0);
        staffList[2] = new Intern("Intern Two", "2 Intern Dr" ,
                "516-101-3131", "000-111-1555",0);
        staffList[3] = new TempEmploee("Joe Schmo", "26 New Tree Lane" ,
                "526-101-3131", "000-550-4567",100);
        staffList[4] = new Intern("Intern Three", "3 Intern Dr" ,
                "516-101-3131", "000-888-1234",0);
        staffList[5] = new Intern("Intern Four", "4 Intern Dr" ,
                "516-101-3131", "066-999-1234",0);

        ((Executive)staffList[0]).awardBonus(500.00);
        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
