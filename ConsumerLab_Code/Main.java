public class Main {

    public static void main(String args[]) {
        

        System.out.println(Review.totalSentiment("/workspace/APComputerScienceProjects/ConsumerLab_Code/MacsReview.txt"));
        System.out.println(Review.starRating("/workspace/APComputerScienceProjects/ConsumerLab_Code/MacsReview.txt") + " Star Resturant");
        System.out.println(Review.fakeReview("/workspace/APComputerScienceProjects/ConsumerLab_Code/CustomReview.txt"));
        System.out.println(Review.fakeOnlyReallyGood("/workspace/APComputerScienceProjects/ConsumerLab_Code/CustomReview.txt"));
        System.out.println(Review.sentimentVal("abheek"));

   
        


    }
}