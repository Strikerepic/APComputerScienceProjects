public class Desktop extends Computer {

    private String osType = "";

    public Desktop(String osType) {    
        super(1,true);     // Cannot change OS after object is created. Done on purpose
        this.osType = osType;

    }

    public String getosType() {
        return osType;
    }

    public void makeFunnyNoises() {
        System.out.println("bejajiojeajhsdjj aklsjd;fa");
    }



    
}
