public class Piece {
    //Creating attributes for each side of the cube (every small cubic piece has 6 sides)
    private String side1;
    private String side2;
    private String side3;
    private String side4;
    private String side5;
    private String side6;

    //Creating a constructor for the Piece class
    public Piece(String side1, String side2, String side3, String side4, String side5, String side6) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
        this.side6 = side6;
    }

    //Creating getters for the attributes
    public String getSide1() {
        return side1;
    }

    public String getSide2() {
        return side2;
    }

    public String getSide3() {
        return side3;
    }

    public String getSide4() {
        return side4;
    }

    public String getSide5() {
        return side5;
    }

    public String getSide6() {
        return side6;
    }

    //Creating setters for the attributes
    public void setSide1(String side1) {
        this.side1 = side1;
    }

    public void setSide2(String side2) {
        this.side2 = side2;
    }

    public void setSide3(String side3) {
        this.side3 = side3;
    }

    public void setSide4(String side4) {
        this.side4 = side4;
    }

    public void setSide5(String side5) {
        this.side5 = side5;
    }

    public void setSide6(String side6) {
        this.side6 = side6;
    }
}