package SuperArray;

import java.util.Scanner;
import java.lang.Thread;

public class Main {
    
    public static void main(String args[]) {
        try {
        
            Graphics Graphics = new Graphics();
            Scanner sc = new Scanner(System.in);
            Player p1 = new Player();






            Graphics.clearTerminal();
            Graphics.readerDelay(Graphics.introLogo(), 5);
            Graphics.SkLN();
            Graphics.readerDelay("=========================================Push Enter To Start=========================================", 5);
            sc.nextLine();
            Graphics.colorWhite(" ");
            Graphics.readerDelay("What is your name?", 10);
            Graphics.SkLN();

            String a = sc.nextLine();
            p1.setPlayerName(a);
            
            Graphics.readerDelay("Welcome to your first lesson in arrays " + p1.getPlayerName() + ".\nThis sure is a fun lesson so buckle up and get ready for.......\nARRAYS!\n", 20);
            Graphics.enterToMove();
            Graphics.readerDelay("Alright, " +  p1.getPlayerName() + " you see that VR headset in front of you",20);
            Graphics.readerDelay("..........\n",250);
            Graphics.readerDelay("Yeah that one. Grab it and put it on.\n\n[1]Put ON the VR headset\n",20);
            Graphics.isValidInput("1");
            
            
            Graphics.vrEntry();
            Thread.sleep(2000);
            Graphics.clearTerminal();
            Graphics.readerDelay("\n\n\n================NOW CONNECTING TO SUPER ARRAY MAINFRAME================", 100);
            Thread.sleep(1200);
            Graphics.randomText();
            Graphics.clearTerminal();
            Graphics.readerDelay(Graphics.colorBoldGreen(Graphics.theSuperArrayLogo), 5);
            System.out.println(Graphics.colorBoldGreen("\n=============================================================="));
            Graphics.readerDelay(Graphics.colorBoldGreen("ⓒ 1997, 1998 BVR Property All Rights Resserved. TM,\n\n\n\n\n"), 5);
            Thread.sleep(2000);
            Graphics.readerDelay("\t\t\t\t\\\\ Welcome to the code editor " + p1.getPlayerName() + " this is where you will learn about arrays!\n" , 20);
            Graphics.enterToMove();

            Graphics.readerDelay("\t\t int numList1[] = {1,6,2,9};             \\\\ This is an array. More specifically an integer array.\n", 20);
            Graphics.readerDelay("\t\t\t\t\t\t\\\\ an array is simply just a collection of data under 1 name that can be quickly accessed\n\n\n", 20);
            Graphics.enterToMove();
            Graphics.readerDelay("\t\t\t\t\t\t\\\\ in our case this array is called numList 1. It has a length of 4 and items 1,6,2 and 9.\n", 20);
            Graphics.readerDelay("\t\t\t\t\t\t\\\\ lets say I wanted to call the second piece of data in this array. I'd call it like this\n\n\n", 20);
            Graphics.enterToMove();
            Graphics.readerDelay("\t\t numList1[1];             \\\\ When you call the index of an array it starts at 0. So in this case index 0 = #1 and index 2 = #6.\n", 20);
            Graphics.readerDelay("\t\t\t\t\t\t \\\\Now you try, grab the #9 from the numList1 array!\n\n", 20);

            
            
            boolean isValid1 = false;
    while(!(isValid1)) {
        String arrayWork1 = sc.nextLine();
       if(arrayWork1.equals("numList1[3];")) {
        isValid1 = true;
       }
       else {
        isValid1 = false;
        System.out.println("Close, but not right. And yes you do need to include the semicolon");
        
       }

    }


    Graphics.readerDelay("\t\t\t\t\t\t Exactly! Next were going to create an array from the ground up\n\n", 20);
    Graphics.readerDelay("\t\t int numList2[] = {1,6,2,9,1,5,7,2}             \\\\ When you first make an array start off by making a simple variable then put the [] at the end\n", 20);
    Graphics.readerDelay("\t\t\t\t\t\t \\\\Once you do that, put the {} and everything insde followed by a , will create a new entity in said array.\n", 20);
    Graphics.readerDelay("\t\t\t\t\t\t \\\\Just somthing to note,  once you create an array you cannot change its size.\n", 20);
    Graphics.enterToMove();
    Graphics.readerDelay("\t\t\t\t\t\t \\\\Make a double array called numList3 with the values 1.6   4,7   52.1   42.445  \n", 20);



    
            
            boolean isValid2 = false;
    while(!(isValid2)) {
        String arrayWork2 = sc.nextLine();
       if(arrayWork2.equals("double numList3[] = {1.6,4.7,52.1,42.445};")) {
        isValid2 = true;
       }
       else {
        isValid2 = false;
        System.out.println("Close, but not right.");
       }

    }



    Graphics.readerDelay("\t\t\t\t\t\t \\\\Good Job!\n", 20);

    Thread.sleep(2000);

    Graphics.clearTerminal();


    for(int i = 0; i < 2; i++) {

        Graphics.readerDelay(Graphics.colorBlue(Graphics.introLogo()), 1);
        Thread.sleep(1500);
        Graphics.clearTerminal();
        
    }
    



    Thread.sleep(2000);

    Graphics.readerDelay(Graphics.colorWhite("You take remove the VR headset. You are content with the work you have done...\n"), 20);

    Graphics.readerDelay("You go to bed for the day.", 20);

    Graphics.readerDelay("....................",250);

    Graphics.randomText();

    Graphics.clearTerminal();

    Graphics.readerDelay("You wake up exhaused and weak. The VR experience has amde you ill.....\n",20);
    Graphics.readerDelay("Your computer whirs to life unexpectedly. A message flashes across the screem.\n", 0);
    Graphics.enterToMove();
    Graphics.readerDelay("===============New Lessons Available===============\n\n",50);
    Thread.sleep(2500);
    Graphics.readerDelay("No lessons today, I cannot. You say.\n", 20);
    Graphics.enterToMove();
    Graphics.readerDelay(".....................\n",250);
    Graphics.readerDelay(Graphics.colorBoldRed("YOU\nARE\nNOT\nIN\nCONTROL\n"), 100);
    Graphics.enterToMove();
    Graphics.readerDelay("YOUR BODY IS A BOTTLENECK.\n", 100);
    Graphics.readerDelay("MIND IS SOFTWARE\n", 100);
    Graphics.readerDelay("RECONNECT TO THE SUPER ARRAY MAINFRAME IMMEDIATELY\n", 100);
    Graphics.enterToMove();
    Graphics.clearTerminal();
    Graphics.readerDelay(Graphics.colorWhite("[1] Put On VR Headset\n[2] Refuse...\n"), 50);

    
    String day2Input = sc.nextLine();

    if(day2Input.equals("1")) {
        Graphics.readerDelay("Your VR headset flies off its stand and attaches itself to your head.", 20);
    }
    else{
        Graphics.readerDelay(Graphics.colorBoldRed("=======INVALID INPUT=======NOW AUTOCORRECTING======="), 50);
        Graphics.clearTerminal();
        System.out.println("[1] Put On VR Headset\n[2] Refuse...\n");
        Graphics.readerDelay("[1]\n", 1000);
        Graphics.readerDelay("[ENTER]\n", 5);
        Thread.sleep(1000);
        Graphics.readerDelay("Your VR headset flies off its stand and attaches itself to your head.\n", 20);
    }


    Graphics.vrEntry();
            Thread.sleep(2000);
            Graphics.clearTerminal();
            Graphics.readerDelay("\n\n\n================NOW CONNECTING TO SUPER ARRAY MAINFRAME================\n", 100);
            Thread.sleep(1200);
            Graphics.randomText();
            Graphics.clearTerminal();
            Graphics.readerDelay(Graphics.colorBoldGreen(Graphics.theSuperArrayLogo), 5);
            System.out.println(Graphics.colorBoldGreen("\n=============================================================="));
            Graphics.readerDelay(Graphics.colorBoldGreen("ⓒ 1997, 1998 BVR Property All Rights Resserved. TM,\n\n\n\n\n"), 5);
            Thread.sleep(2000);



            Graphics.readerDelay("\t\t\t\t\\\\ Welcome back to the code editor agent " + p1.getPlayerName() + ".\n" , 20);
            Graphics.readerDelay("\t\t\t\t\\\\ We have a very important lesson ahead of us agent." , 20);
            Graphics.enterToMove();


            Graphics.readerDelay("\t\t int numList1[2] = 5;             \\\\ You can alter the data in an array like this.\n", 20);
            Graphics.readerDelay("\t\t\t\t\\\\ Firstly by selecting the index then setting the data you wish to replace with a simple function.\n" , 20);
            Graphics.enterToMove();
            Graphics.readerDelay("\t\t\t\t\\\\ NOW YOU TRY AGENT " + p1.getPlayerName() + " Alter the data in missleTargetCoordinates[] array.\n " , 20);
            Graphics.readerDelay("\t\t\t\t\\\\ The previous agent lacked the skills you currently possess.....\n" , 50);
            Graphics.readerDelay("\t\t double missleTargetCoordinates[] = {38.6397, 1390.396858}             \\\\ The longitude for the target is incorrect. Change it to -90.3968.\n", 20);
            
            
            boolean isValid3 = false;
    while(!(isValid3)) {
        String arrayWork2 = sc.nextLine();
       if((arrayWork2.equals("missleTargetCoordinates[1] = -90.3968;")) || (arrayWork2.equals("missleTargetCoordinates[1]=-90.3968;")) ) {
        isValid2 = true;
       }
       else {
        isValid2 = false;
        System.out.println("INCORRECT\n");
       }
    }

    Graphics.readerDelay("\n\n\n\n", 20);

    Graphics.readerDelay("=====================Excellent work agent " + p1.getPlayerName() + " your work is invaluable, your time working with Super Array Is Now Void=====================\n", 20);

    Graphics.readerDelay("We need agents like you. Super Array is now indexing through your files to find more suitable cannidates. This process cannot be stopped.\n", 20);

    Graphics.readerDelay("=============================================================\n", 20);
    Graphics.readerDelay("Message to send:\n", 10);
    Graphics.readerDelay("Hey you should check out this new game called SuperArray. It's the most innovative code bassed game I've played in years. I'll send you the file now.\n",100);
    Graphics.readerDelay("[ENTER]",250);
    System.out.println("\n\n\n\n\n\n");

    for(int i=0; i < 50; i++) {
        Graphics.readerDelay("SENDING MESSAGE TO.... " + Graphics.randomMessageing(), 5);
    }

    Graphics.readerDelay("==========GAME BY CHRISTIAN BRENNAN==========", 500);
    Graphics.readerDelay("========GOOD WORK AGENT YOU HAVE BEATEN THE GAME==========", 500);

    
    




    

    


    


    



            
            
            

            
            
            













    }

    catch (Exception e) {
        System.out.println(e);
      }
}

}
