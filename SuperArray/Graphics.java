package SuperArray;

import java.lang.Thread;
import java.util.Random;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Graphics {
    Scanner sc = new Scanner(System.in);

    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED

   
        

public String coloRed(String input) {
    String output = RED + input;
    return output;
}

public String colorBoldRed(String input) {
    String output = RED_BOLD_BRIGHT + input;
    return output;
}

public String colorGreen(String input) {
    String output = GREEN + input;
    return output;
}

public String colorYellow(String input) {
    String output = YELLOW + input;
    return output;
}

public String colorBlue(String input) {
    String output = BLUE + input;
    return output;
}

public String colorBoldGreen(String input) {
    String output = GREEN_BOLD_BRIGHT + input;
    return output;
}

public String colorWhite(String input) {
    String output = WHITE + input;
    return output;
}

    

public String introLogo() {

    String a = "\n$$$$$$\\                                                 $$$$$$\\                                         \n$$  __$$\\                                               $$  __$$\\                                        \n$$ /  \\__|$$\\   $$\\  $$$$$$\\   $$$$$$\\   $$$$$$\\        $$ /  $$ | $$$$$$\\   $$$$$$\\  $$$$$$\\  $$\\   $$\\ \n\\$$$$$$\\  $$ |  $$ |$$  __$$\\ $$  __$$\\ $$  __$$\\       $$$$$$$$ |$$  __$$\\ $$  __$$\\ \\____$$\\ $$ |  $$ |\n \\____$$\\ $$ |  $$ |$$ /  $$ |$$$$$$$$ |$$ |  \\__|      $$  __$$ |$$ |  \\__|$$ |  \\__|$$$$$$$ |$$ |  $$ |\n$$\\   $$ |$$ |  $$ |$$ |  $$ |$$   ____|$$ |            $$ |  $$ |$$ |      $$ |     $$  __$$ |$$ |  $$ |\n\\$$$$$$  |\\$$$$$$  |$$$$$$$  |\\$$$$$$$\\ $$ |            $$ |  $$ |$$ |      $$ |     \\$$$$$$$ |\\$$$$$$$ |\n \\______/  \\______/ $$  ____/  \\_______|\\__|            \\__|  \\__|\\__|      \\__|      \\_______| \\____$$ |\n                    $$ |                                                                       $$\\   $$ |\n                    $$ |                                                                       \\$$$$$$  |\n                    \\__|                                                                        \\______/";

    return a;

}

public void enterToMove() {
    System.out.println("Press Enter to  Continue\n");
    sc.nextLine();
}

public void isValidInput(String validator) {

    boolean isValid = false;
    String input = "";


    while(!(isValid)) {

       input = sc.nextLine();

       if(input.equals(validator)) {
        isValid = true;
       }
       else {
        isValid = false;
        System.out.println("Not Valid!");
       }

    }


}



 // Part by Aditya
    public void randomText() {
        System.out.println("\033[H\033[2J");
        // String[] words = text.split(" ");
        String randomParagraph = "";
        byte[] array = new byte[7]; // length is bounded by 7
        for (int i = 0; i < 1500; i++) {
            randomParagraph = "";
            for (int j = 0; j < 100; j++) {
                new Random().nextBytes(array);
                randomParagraph += new String(array, Charset.forName("UTF-8"));
            }
            System.out.print(randomParagraph);
        }
    }


    public void clearTerminal() {
        System.out.println("\033[H\033[2J");
    }

    public void killGame() {
        System.exit(1);
    }

    public void readerDelay(String a, int delay) throws InterruptedException {
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
            Thread.sleep(delay);
        }
    }



    public void terminalCorrupt(int miliDelay ) {

        
        for(int i=1; i<miliDelay; i++) {
            
        }
    }


    public void vrEntry() {
        System.out.println("\t\t\t\tfahjkfgesnageyuoabifs;iuenvai;fuj;jafjfalealfhje");
        System.out.println("\t\t\t\tzsdfgvbh[------------------------------]ftyujhjj");
        System.out.println("\t\t\t\trghbghjm|                              |jkl*jh^%");
        System.out.println("\t\t\t\tsjknrkgg|                              |kqwdjaja");
        System.out.println("\t\t\t\tanjksfda|                              |78HJKHbn%");
        System.out.println("\t\t\t\tuywrqqwq|                              |kasdajas");
        System.out.println("\t\t\t\tja;skldf|                              |235&*^(s");
        System.out.println("\t\t\t\tnegijaff|                              |ksdjajas");
        System.out.println("\t\t\t\tvfadjklf|       Super                  |ksdjajas");
        System.out.println("\t\t\t\tasfaksjl|                Array         |2sj;ajas");
        System.out.println("\t\t\t\tasjd;jkj|                              |kswerjas");
        System.out.println("\t\t\t\tvnzqurye|                              |HJK(&^bn");
        System.out.println("\t\t\t\tlksdjaja|                              |YUIT&*^n");
        System.out.println("\t\t\t\tlksdjaja|                              |&G*VN<>T");
        System.out.println("\t\t\t\tlksdjaja|                              |wercv&ss");
        System.out.println("\t\t\t\tlksdjaja|                              |67g*UOHH");
        System.out.println("\t\t\t\tlksdjaja|                              |&*(^YHNM");
        System.out.println("\t\t\t\tfahjkfges------------------------------]lealfhje");
        System.out.println("\t\t\t\tzsdfgvbhjuhgvcfaeuinvpuihaefufihtghjiuhgftyujhjj");

    }

    String LIST = "\t\t\t\tfahjkfgesnageyuoabifs;iuenvai;fuj;jafjfalealfhje\n\t\t\t\tzsdfgvbh[------------------------------]ftyujhjj\n \t\t\t\trghbghjm|a;sljdf;asjdf;lajsd;fljksjd;as|jkl*jh^%\n\t\t\t\tsjknrkgg|ajsdf;asjkdf;lajsdkfl;askl;djf|kqwdjaja\n\t\t\t\tanjksfda|juhwqp98u343qiw&*T(UIHUkjl;af|78HJKHbn%\n\t\t\t\tuywrqqwq|zbhuvsoeaigjw;nafsldjfak;lsjdf|kasdajas\n\t\t\t\tja;skldf|iqowafjknsvfai;oslkiowaoijafsf|235&*^(s\n\t\t\t\tnegijaff|28u94q3oiaefhjwknsdofjf;asdfkf|ksdjajas\n\t\t\t\tvfadjklf|zxnmczljbkoarg98834750qyuahfi*|ksdjajas\n\t\t\t\tasfaksjl|(*Y&TYGUBHN:JBHLGOUYFIWI:HWEFK|2sj;ajas\n\t\t\t\tasjd;jkj|JOIUHO*&(U)IOHBIHUjas;dlkfaks;|kswerjas\n\t\t\t\tvnzqurye|j:IUHY*&T^%FRCTUGVUBOHA(PHIOBG|HJK(&^bn\n\t\t\t\tlksdjaja|NOJIHUBIGYVFTCYDRX^ED%YTU^IY&U|YUIT&*^n\n\t\t\t\tlksdjaja|NIOUBYI&T*^&FRUTCFYVIGUOUYGITF|&G*VN<>T\n\t\t\t\tlksdjaja|U*Y(&^FTVGYGOGYGYGY(G*&*UJHJ:K|wercv&ss\n\t\t\t\tlksdjaja|JIOU(H*)&(^FT&VYUB*)&&^*%RTFYG|67g*UOHH\n\t\t\t\tlksdjaja|NU*&^(*%DRCTVYGBUNIOIUYHJKHJHK|&*(^YHNM\n\t\t\t\tfahjkfges------------------------------]lealfhj)\n(\t\t\t\tzsdfgvbhjuhgvcfaeuinvpuihaefufihtghjiuhgftyujhjj\n";    
    String theSuperArrayLogo = "\n  _____                          ___                         \n  / ___/__  ______  ___  _____   /   |  ______________ ___  __\n  \\__ \\/ / / / __ \\/ _ \\/ ___/  / /| | / ___/ ___/ __ `/ / / /\n ___/ / /_/ / /_/ /  __/ /     / ___ |/ /  / /  / /_/ / /_/ / \n/____/\\__,_/ .___/\\___/_/     /_/  |_/_/  /_/   \\__,_/\\__, /  \n          /_/                                        /____/";


    public void SkLN() {
        System.out.println("\n");
    }



    public String superArraySuper() {                                                                                     
   String theSuper = "\nSSSSSSSSSSSSSSS                                                                                 \nSS:::::::::::::::S                                                                               \nS:::::SSSSSS::::::S                                                                               \nS:::::S     SSSSSSS                                                                               \nS:::::S            uuuuuu    uuuuuu ppppp   ppppppppp       eeeeeeeeeeee    rrrrr   rrrrrrrrr     \nS:::::S            u::::u    u::::u p::::ppp:::::::::p    ee::::::::::::ee  r::::rrr:::::::::r     \nS::::SSSS         u::::u    u::::u p:::::::::::::::::p  e::::::eeeee:::::eer:::::::::::::::::r     \nSS::::::SSSSS    u::::u    u::::u pp::::::ppppp::::::pe::::::e     e:::::err::::::rrrrr::::::r      \nSSS::::::::SS  u::::u    u::::u  p:::::p     p:::::pe:::::::eeeee::::::e r:::::r     r:::::r         \nSSSSSS::::S u::::u    u::::u  p:::::p     p:::::pe:::::::::::::::::e  r:::::r     rrrrrrr              \nS:::::Su::::u    u::::u  p:::::p     p:::::pe::::::eeeeeeeeeee   r:::::r                          \nS:::::Su:::::uuuu:::::u  p:::::p    p::::::pe:::::::e            r:::::r              \nSSSSSSS     S:::::Su:::::::::::::::uup:::::ppppp:::::::pe::::::::e           r:::::r              \nS::::::SSSSSS:::::S u:::::::::::::::up::::::::::::::::p  e::::::::eeeeeeee   r:::::r              \nS:::::::::::::::SS   uu::::::::uu:::up::::::::::::::pp    ee:::::::::::::e   r:::::r               \nSSSSSSSSSSSSSSS       uuuuuuuu  uuuup::::::pppppppp        eeeeeeeeeeeeee   rrrrrrr                                                   \np:::::p                                                                                           \np:::::p                                                                                          \np:::::::p                                                                                         \np:::::::p                                                                                         \np:::::::p                                                                                         \nppppppppp";
   return theSuper;
    }

    public String superArrayArray() {                                                                                                          
String a ="               \nAAA                                                                                                          \nA:::A                                                                                                        \nA:::::A                                                                                                      \nA:::::::A                                                                                                    \nA:::::::::A          rrrrr   rrrrrrrrr   rrrrr   rrrrrrrrr   aaaaaaaaaaaaayyyyyyy           yyyyyyy          \nA:::::A:::::A         r::::rrr:::::::::r  r::::rrr:::::::::r  a::::::::::::ay:::::y         y:::::y          \nA:::::A A:::::A        r:::::::::::::::::r r:::::::::::::::::r aaaaaaaaa:::::ay:::::y       y:::::y          \nA:::::A   A:::::A       rr::::::rrrrr::::::rrr::::::rrrrr::::::r         a::::a y:::::y     y:::::y          \nA:::::A     A:::::A       r:::::r     r:::::r r:::::r     r:::::r  aaaaaaa:::::a  y:::::y   y:::::y          \nA:::::AAAAAAAAA:::::A      r:::::r     rrrrrrr r:::::r     rrrrrrraa::::::::::::a   y:::::y y:::::y          \nA:::::::::::::::::::::A     r:::::r             r:::::r           a::::aaaa::::::a    y:::::y:::::y          \nA:::::AAAAAAAAAAAAA:::::A    r:::::r             r:::::r          a::::a    a:::::a     y:::::::::y          \nA:::::A             A:::::A   r:::::r             r:::::r          a::::a    a:::::a      y:::::::y          \nA:::::A               A:::::A  r:::::r             r:::::r          a:::::aaaa::::::a       y:::::y          \nA:::::A                 A:::::A r:::::r             r:::::r           a::::::::::aa:::a     y:::::y          \nAAAAAAA                   AAAAAAArrrrrrr             rrrrrrr            aaaaaaaaaa  aaaa    y:::::y                                                                                                      \ny:::::y                                                                                                      \ny:::::y                                                                                                      \ny:::::y                                                                                                      \ny:::::y                                                                                                      \nyyyyyyy";
return a;
    }




    public String randomMessageing() {

        int firstSet = (int) (Math.random() * 19);
        int sectSet = (int) (Math.random() * 19);
        String areaCodes[] = {"342","252","972","521","529","943","901","911","967","429","943","737","263","160","111","128","436","573","500"};

        int thirSet = (int) (Math.random() * 21);
        String endingCodes[] = {"5215","2527","6234","8342","7235","6298","2790","9212","0212","7111","8911","0111","0000","1008","8321","0659","9969","9012","3434","0018","7011"};


        String phoneNumber = "+1-" + areaCodes[firstSet] + "-" + areaCodes[sectSet] + "-" + endingCodes[thirSet];
        return phoneNumber;

        }



    







    
}
