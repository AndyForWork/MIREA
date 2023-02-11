package org.example.HW2.PartFour;

import java.util.LinkedList;

public class Shop {
    private LinkedList<String> computersName;

    public Shop()
    {
        computersName = new LinkedList<>();

    }

    public void addComputer(String computerName)
    {
        computersName.add(computerName);
    }

    public boolean isComputerExists(String computerName)
    {
        return computersName.contains(computerName);
    }

    public void deleteComputer(String computerName)
    {
        if(isComputerExists(computerName))
            computersName.remove(computerName);
    }

}
