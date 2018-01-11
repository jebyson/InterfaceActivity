package com.company;

import java.io.File;
import java.util.*;

public class Implementation implements UI {

    public String time;

    public void ok()
    {

    }
    public void no()
    {
        exit();
    }
    public void cancel()
    {
        exit();
    }
    public void exit()
    {
        exit();
    }
    public String help()
    {
        System.out.println("Would you like help? Enter yes if you need help.");
        Scanner input = new Scanner(System.in);
        String yesNo = input.next();
        if(yesNo.equalsIgnoreCase("yes"))
        {
            return "What do you need help with?";
        }
        else
        {
            no();
        }
        return "Sorry try again.";
    }
    public void setRes()
    {

    }
    public void setTaskbar()
    {

    }
    public void startOS()
    {
        
    }
    public void runProgram(String programName)
    {

    }
    public void startMouse()
    {

    }
    public void keyboardInput(char key)
    {

    }
    public void setWallPaper(File image)
    {

    }
    public void setTime()
    {
        System.out.println("Input time.");
        Scanner input = new Scanner(System.in);
        time = input.nextLine();
    }
}
