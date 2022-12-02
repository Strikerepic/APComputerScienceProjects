package GuessingGame;

import java.util.List;

public class Guessing {

    String letterList = "";
    
    public String printLetterList(String list[], int roundNum) {

        
            int randomNum = (int) (Math.random() * list.length);
           
            letterList = letterList + list[randomNum];


            return letterList;
           
        }

        public String getLetterList() {
            return letterList;
        }


    }

