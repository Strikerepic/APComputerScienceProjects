package DataLabStarter;

public class Cereal {
    private String name = "";
    private int cals = 0;
    private int rating = 0;


    public Cereal(String n, int c, int r) {
       name = n;
       cals = c;
       rating = r;
    }




    public String getName() {
        return name;
    }

    public void setName(String a) {
        name = a;
    }

    public int getCals() {
        return cals;
    }

    public void setCals(int a) {
        a = cals;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int a) {
        a = rating;
    }
}
