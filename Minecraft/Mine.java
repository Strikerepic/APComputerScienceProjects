
package Minecraft;

import java.util.Scanner;

public class Mine {
    arrayPrint ap = new arrayPrint();
    Scanner sc = new Scanner(System.in);



    private int woodLogs;
    private int cstone;
    private int iron;
    private int diamonds;
    private int stick;
    private int rand;
    private boolean diamondSword;
    private String currentPick = "";

    String[][] ironPickReceipe = {{"I", "I", "I"}, {" ", "S", ""}, {" ", "S", " "} };

    String[][] cobblePickReceipe = {{"C", "C", "C"}, {" ", "S", " "}, {" ", "S", " "} };
    
    String[][] woodPickReceipe = {{"W", "W", "W"}, {" ", "S", " "}, {" ", "S", " "} };

    String[][] diamondSwordReceipe = {{" ", "D", " "}, {" ", "D", " "}, {" ", "S", " "} };
    
    String[][] stickReceipe = {{" ", " ", " "}, {" ", "W", " "}, {" ", "W", " "}};
   




    public Mine(){

    }

    public void whatToDo(){
        while(diamondSword == false){
            Scanner sc = new Scanner(System.in);
            System.out.println("What do you want to do? \n[1] Cut wood \n[2] Mine \n[3] Craft");
            int question = sc.nextInt();
    
            if (question == 1){
                cutWood();
            }
            else if(question == 2){
                mine();
            }
            else if(question == 3){
                craft();
            }     
        }
        System.out.println("Wow I am so happy I made a diamond sword!");
     
    }

    

    public void cutWood(){
        rand = ((int) ((Math.random()) * 4) + 1);
        System.out.println("You try to cut some wood");
        // 75% chance that user succeeds cutting wood
        if(!(rand == 4)){ 
            rand = ((int) ((Math.random()) * 4) + 1);
            addWoodLogs(rand);
            System.out.println("You have " + getWoodLogs() + " pieces of wood");
        }
        else{
            System.out.println("You failed to cut any wood");
        }
        // Frank norris is pretty cool
        for(int i=1; i > 0; i++){
            whatToDo();
        }
    }

    public void mine(){
        //woodpick
        if(currentPick.equals("wood")){
            rand = ((int) ((Math.random()) * 4));
            addCStone(rand);
            
            System.out.println("You go on a mining trip with your " + currentPick + " pickaxe.\nYou get " + rand + " pieces of cobblestone " );
            System.out.println("You have " + getCStone() + " pieces of cobblestone in your inventory.");
        }

        //stonepick
        else if(currentPick.equals("stone")){
            rand = ((int) ((Math.random()) * 5) + 1);
            if((rand == 1)|| (rand == 2)){
                rand = ((int) ((Math.random()) * 4));
                addIron(rand);
                System.out.println("You go on a mining trip with your " + currentPick + "pickaxe.\nYou get " + rand + " pieces of iron " );
                System.out.println("You have " + getIron() + " pieces of iron in your inventory.");
            }
            else{
                rand = ((int) ((Math.random()) * 5)+ 1);
                addCStone(rand);
                System.out.println("You go on a mining trip with your " + currentPick + "axe.\nYou get " + rand + " pieces of cobblestone " );
                System.out.println("You have " + getCStone() + " pieces of cobblestone in your inventory.");
            }
        }

        //ironpick
        else if(currentPick.equals("iron")){
            rand = ((int) ((Math.random()) * 10) + 1);
            if(!(rand == 10)){
                rand = ((int) ((Math.random()) * 5) + 1);
                addIron(rand);
                System.out.println("You go on a mining trip with your " + currentPick + "pickaxe.\nYou get " + rand + " pieces of iron " );
                System.out.println("You have " + getIron() + " pieces of iron in your inventory.");
            }
            else{
                rand = ((int) ((Math.random()) * 2));
                addDiamonds(rand);
                System.out.println("You go on a mining trip with your " + currentPick + "pickaxe.\nYou get " + rand + " pieces of diamond " );
                System.out.println("You have " + getDiamond() + " pieces of diamond in your inventory.");
            }
            }
        else{
            System.out.println("You don't have a pickaxe!");
            whatToDo();
        }




    }

    public void craft(){

        boolean woodKnow = false;
        if((getWoodLogs() > 0) || woodKnow )
        {
            System.out.println("Sticks:");
            ap.print(stickReceipe);
            System.out.print("\n");
            System.out.println("Wooden Pickaxe:");
            ap.print(woodPickReceipe);
            woodKnow = true;
            System.out.println("\n\n\n");
        }

 
        boolean cStoneKnow = false;
        if ((getCStone() > 0) || cStoneKnow) {
            System.out.println("Cobble Pickaxe:");
            ap.print(cobblePickReceipe);
            cStoneKnow = true;
            System.out.println("\n\n\n");
        }

        boolean ironKnow = false;
        if ((getCStone() > 0) || ironKnow) {
            System.out.println("Iron Pickaxe:");
            ap.print(ironPickReceipe);
            ironKnow = true;
            System.out.println("\n\n\n");
        }

        

        boolean diamondKnow = false;
        if ((getCStone() > 0) || diamondKnow) {
            System.out.println("Diamond Sword:");
            ap.print(diamondSwordReceipe);
            diamondKnow = true;
        }

        boolean crafted = false;

        System.out.println("Materials:\nWood: " + getWoodLogs() + "\nSticks: " + getSticks() + "\nStone: " + getCStone() + "\nIron: " + getIron() + "\nDiamonds: " + getDiamond());

        String craftQuestion = "";
        System.out.println("\n\nWhat do you want to craft? (Ex: Wood Pickaxe)");
    
         craftQuestion = sc.nextLine().toUpperCase();


         if(craftQuestion.equals("WOOD PICKAXE") && (getWoodLogs() >= 3)) {
            addWoodLogs(-3);
            addSticks(-2);
            currentPick = "wood";
            System.out.print("Successfuly Crafted");
            crafted = true;
         }

         if(craftQuestion.equals("STICKS") && (getWoodLogs() >= 2)) {
            addWoodLogs(-2);
            addSticks(4);
            System.out.print("Successfuly Crafted");
            crafted = true;
            
         }
        

         if(craftQuestion.equals("STONE PICKAXE") && (getCStone() >= 3)) {
            addCStone(-3);
            addSticks(-2);
            currentPick = "stone";
            System.out.print("Successfuly Crafted");
            crafted = true;
         }

         if(craftQuestion.equals("IRON PICKAXE") && (getIron() >= 3)) {
            addIron(-3);
            addSticks(-2);
            currentPick = "iron";
            System.out.print("Successfuly Crafted");
            crafted = true;
         }


         if(craftQuestion.equals("DIAMOND SWORD") && (getDiamond() >= 2)) {
            addWoodLogs(-3);
            addSticks(-1);
            diamondSword = true;
            System.out.print("Successfuly Crafted");
            crafted = true;
         }


         if(!crafted) {
            System.out.println("Nothing was crafted...");
         }
         System.out.println("");

         




        
        

    }
    





    
   
    public int getWoodLogs(){
        return woodLogs;
    }
    public int getSticks(){
        return stick;
    }
    public void addSticks(int add) {
        stick = stick + add;
    }


    public void addWoodLogs(int add) {
        woodLogs = woodLogs + add;
    }

    public int getCStone() {
        return cstone;
    }

    public void addCStone(int add) {
        cstone = cstone + add;
    }

    public int getIron(){
        return iron;
    }

    public void addIron(int add ) {
        iron = iron + add;
    }

    public int getDiamond(){
        return diamonds;
    }

    public void addDiamonds(int add ) {
        diamonds = diamonds + add;
    }





    

    

}
