import java.util.Random;
//Rubic Cube class
public class RubicCube {
    // 3D array of pieces
    Piece[][][] cube = new Piece[3][3][3];

    // Constructor
    public RubicCube(Piece[][][] cube) {
        this.cube = cube;
    }

    // Method to display the cube
    public void displayCube()
    {
        System.out.println("       " + cube[2][0][0].getSide2() + " " + cube[2][0][1].getSide2() + " " + cube[2][0][2].getSide2());
        System.out.println("       " + cube[1][0][0].getSide2() + " " + cube[1][0][1].getSide2() + " " + cube[2][0][2].getSide2());
        System.out.println("       " + cube[0][0][0].getSide2() + " " + cube[0][0][1].getSide2() + " " + cube[0][0][2].getSide2());

        System.out.println(cube[2][0][0].getSide1() + " " + cube[1][0][0].getSide1() + " " + cube[0][0][0].getSide1() + "  "
                + cube[0][0][0].getSide6() + " " + cube[0][0][1].getSide6() + " " + cube[0][0][2].getSide6() + "  "
                + cube[0][0][2].getSide3() + " " + cube[1][0][2].getSide3() + " " + cube[2][0][2].getSide3() + "  "
                + cube[2][0][2].getSide5() + " " + cube[2][0][1].getSide5() + " " + cube[2][0][0].getSide5() + "  ");
        System.out.println(cube[2][1][0].getSide1() + " " + cube[1][1][0].getSide1() + " " + cube[0][1][0].getSide1() + "  "
                + cube[0][1][0].getSide6() + " " + cube[0][1][1].getSide6() + " " + cube[0][1][2].getSide6() + "  "
                + cube[0][1][2].getSide3() + " " + cube[1][1][2].getSide3() + " " + cube[2][1][2].getSide3() + "  "
                + cube[2][1][2].getSide5() + " " + cube[2][1][1].getSide5() + " " + cube[2][1][0].getSide5() + "  ");
        System.out.println(cube[2][2][0].getSide1() + " " + cube[1][2][0].getSide1() + " " + cube[0][2][0].getSide1() + "  "
                + cube[0][2][0].getSide6() + " " + cube[0][2][1].getSide6() + " " + cube[0][2][2].getSide6() + "  "
                + cube[0][2][2].getSide3() + " " + cube[1][2][2].getSide3() + " " + cube[2][2][2].getSide3() + "  "
                + cube[2][2][2].getSide5() + " " + cube[2][2][1].getSide5() + " " + cube[2][2][0].getSide5() + "  ");

        System.out.println("       " + cube[0][2][0].getSide4() + " " + cube[0][2][1].getSide4() + " " + cube[0][2][2].getSide4());
        System.out.println("       " + cube[1][2][0].getSide4() + " " + cube[1][2][1].getSide4() + " " + cube[1][2][2].getSide4());
        System.out.println("       " + cube[2][2][0].getSide4() + " " + cube[2][2][1].getSide4() + " " + cube[2][2][2].getSide4());
    }

    //Rotating the right face of the cube clock wise
    public void rotateRightClock() {

        Piece temp1 = new Piece(null, null, null, null, null, null);
        Piece temp2 = new Piece(null, null, null, null, null, null);
        Piece temp3 = new Piece(null, null, null, null, null, null);

        temp1.setSide6(cube[0][2][2].getSide6());
        temp2.setSide6(cube[0][1][2].getSide6());
        temp3.setSide6(cube[0][0][2].getSide6());

        cube[0][2][2].setSide6(cube[2][2][2].getSide4());
        cube[0][1][2].setSide6(cube[1][2][2].getSide4());
        cube[0][0][2].setSide6(cube[0][2][2].getSide4());

        cube[0][2][2].setSide4(cube[2][2][2].getSide5());
        cube[1][2][2].setSide4(cube[2][1][2].getSide5());
        cube[2][2][2].setSide4(cube[2][0][2].getSide5());

        cube[2][2][2].setSide5(cube[2][0][2].getSide2());
        cube[2][1][2].setSide5(cube[1][0][2].getSide2());
        cube[2][0][2].setSide5(cube[0][0][2].getSide2());

        cube[2][0][2].setSide2(temp1.getSide6());
        cube[1][0][2].setSide2(temp2.getSide6());
        cube[0][0][2].setSide2(temp3.getSide6());

        Piece temp4 = new Piece(null, null, null, null, null, null);
        Piece temp5 = new Piece(null, null, null, null, null, null);
        Piece temp6 = new Piece(null, null, null, null, null, null);

        temp4.setSide3(cube[0][2][2].getSide3());
        temp5.setSide3(cube[0][1][2].getSide3());
        temp6.setSide3(cube[0][0][2].getSide3());

        cube[0][2][2].setSide3(cube[2][2][2].getSide3());
        cube[0][1][2].setSide3(cube[1][2][2].getSide3());
        cube[0][0][2].setSide3(cube[0][2][2].getSide3());

        cube[2][2][2].setSide3(cube[2][0][2].getSide3());
        cube[1][2][2].setSide3(cube[2][1][2].getSide3());
        cube[2][1][2].setSide3(cube[1][0][2].getSide3());

        cube[2][0][2].setSide3(temp6.getSide3());
        cube[1][0][2].setSide3(temp5.getSide3());
        cube[0][0][2].setSide3(temp4.getSide3());
    }

    //Rotating the right face of the cube anti clock wise
    public void rotateRightAntiClock() {

        Piece temp1 = new Piece(null, null, null, null, null, null);
        Piece temp2 = new Piece(null, null, null, null, null, null);
        Piece temp3 = new Piece(null, null, null, null, null, null);

        temp1.setSide6(cube[0][2][2].getSide6());
        temp2.setSide6(cube[0][1][2].getSide6());
        temp3.setSide6(cube[0][0][2].getSide6());

        cube[0][2][2].setSide6(cube[0][0][2].getSide2());
        cube[0][1][2].setSide6(cube[1][0][2].getSide2());
        cube[0][0][2].setSide6(cube[2][0][2].getSide2());

        cube[2][0][2].setSide2(cube[2][2][2].getSide5());
        cube[1][0][2].setSide2(cube[2][1][2].getSide5());
        cube[0][0][2].setSide2(cube[2][0][2].getSide5());

        cube[2][2][2].setSide5(cube[0][2][2].getSide4());
        cube[2][1][2].setSide5(cube[1][2][2].getSide4());
        cube[2][0][2].setSide5(cube[2][2][2].getSide4());

        cube[0][2][2].setSide4(temp1.getSide6());
        cube[1][2][2].setSide4(temp2.getSide6());
        cube[2][2][2].setSide4(temp3.getSide6());

        Piece temp4 = new Piece(null, null, null, null, null, null);
        Piece temp5 = new Piece(null, null, null, null, null, null);
        Piece temp6 = new Piece(null, null, null, null, null, null);

        temp4.setSide3(cube[0][2][2].getSide3());
        temp5.setSide3(cube[0][1][2].getSide3());
        temp6.setSide3(cube[0][0][2].getSide3());

        cube[0][2][2].setSide3(cube[0][0][2].getSide3());
        cube[0][1][2].setSide3(cube[1][0][2].getSide3());
        cube[0][0][2].setSide3(cube[2][0][2].getSide3());

        cube[1][0][2].setSide3(cube[2][1][2].getSide3());
        cube[2][0][2].setSide3(cube[2][2][2].getSide3());
        cube[2][1][2].setSide3(cube[1][2][2].getSide3());

        cube[2][2][2].setSide3(temp4.getSide3());
        cube[1][2][2].setSide3(temp5.getSide3());
        cube[0][2][2].setSide3(temp6.getSide3());
    }

    //Rotating the left face of the cube clock wise
    public void rotateLeftClock() {
        Piece temp1 = new Piece(null, null, null, null, null, null);
        Piece temp2 = new Piece(null, null, null, null, null, null);
        Piece temp3 = new Piece(null, null, null, null, null, null);

        temp1.setSide6(cube[0][2][0].getSide6());
        temp2.setSide6(cube[0][1][0].getSide6());
        temp3.setSide6(cube[0][0][0].getSide6());

        cube[0][2][0].setSide6(cube[2][2][0].getSide4());
        cube[0][1][0].setSide6(cube[1][2][0].getSide4());
        cube[0][0][0].setSide6(cube[0][2][0].getSide4());

        cube[0][2][0].setSide4(cube[2][2][0].getSide5());
        cube[1][2][0].setSide4(cube[2][1][0].getSide5());
        cube[2][2][0].setSide4(cube[2][0][0].getSide5());

        cube[2][2][0].setSide5(cube[2][0][0].getSide2());
        cube[2][1][0].setSide5(cube[1][0][0].getSide2());
        cube[2][0][0].setSide5(cube[0][0][0].getSide2());

        cube[2][0][0].setSide2(temp1.getSide6());
        cube[1][0][0].setSide2(temp2.getSide6());
        cube[0][0][0].setSide2(temp3.getSide6());

        Piece temp4 = new Piece(null, null, null, null, null, null);
        Piece temp5 = new Piece(null, null, null, null, null, null);
        Piece temp6 = new Piece(null, null, null, null, null, null);

        temp4.setSide1(cube[0][0][0].getSide1());
        temp5.setSide1(cube[0][1][0].getSide1());
        temp6.setSide1(cube[0][2][0].getSide1());

        cube[0][0][0].setSide1(cube[0][2][0].getSide1());
        cube[0][1][0].setSide1(cube[1][2][0].getSide1());
        cube[0][2][0].setSide1(cube[2][2][0].getSide1());

        cube[1][2][0].setSide1(cube[2][1][0].getSide1());
        cube[2][2][0].setSide1(cube[2][0][0].getSide1());
        cube[2][1][0].setSide1(cube[1][0][0].getSide1());

        cube[2][0][0].setSide1(temp4.getSide1());
        cube[1][0][0].setSide1(temp5.getSide1());
        cube[0][0][0].setSide1(temp6.getSide1());
    }

    //Rotating the left face of the cube anti clock wise
    public void rotateLeftAntiClock(){
        Piece temp1 = new Piece(null, null, null, null, null, null);
        Piece temp2 = new Piece(null, null, null, null, null, null);
        Piece temp3 = new Piece(null, null, null, null, null, null);

        temp1.setSide6(cube[0][2][0].getSide6());
        temp2.setSide6(cube[0][1][0].getSide6());
        temp3.setSide6(cube[0][0][0].getSide6());

        cube[0][2][0].setSide6(cube[0][0][0].getSide2());
        cube[0][1][0].setSide6(cube[1][0][0].getSide2());
        cube[0][0][0].setSide6(cube[2][0][0].getSide2());

        cube[2][0][0].setSide2(cube[2][2][0].getSide5());
        cube[1][0][0].setSide2(cube[2][1][0].getSide5());
        cube[0][0][0].setSide2(cube[2][0][0].getSide5());

        cube[2][2][0].setSide5(cube[0][2][0].getSide4());
        cube[2][1][0].setSide5(cube[1][2][0].getSide4());
        cube[2][0][0].setSide5(cube[2][2][0].getSide4());

        cube[0][2][0].setSide4(temp1.getSide6());
        cube[1][2][0].setSide4(temp2.getSide6());
        cube[2][2][0].setSide4(temp3.getSide6());

        Piece temp4 = new Piece(null, null, null, null, null, null);
        Piece temp5 = new Piece(null, null, null, null, null, null);
        Piece temp6 = new Piece(null, null, null, null, null, null);

        temp4.setSide1(cube[0][0][0].getSide1());
        temp5.setSide1(cube[0][1][0].getSide1());
        temp6.setSide1(cube[0][2][0].getSide1());

        cube[0][0][0].setSide1(cube[2][0][0].getSide1());
        cube[0][1][0].setSide1(cube[1][0][0].getSide1());
        cube[0][2][0].setSide1(cube[0][0][0].getSide1());

        cube[1][0][0].setSide1(cube[2][1][0].getSide1());
        cube[2][0][0].setSide1(cube[2][2][0].getSide1());
        cube[2][1][0].setSide1(cube[1][2][0].getSide1());

        cube[2][2][0].setSide1(temp6.getSide1());
        cube[1][2][0].setSide1(temp5.getSide1());
        cube[0][2][0].setSide1(temp4.getSide1());
    }

    //Rotating the front face of the cube clock wise
    public void rotateFrontClock() {
        Piece temp1 = new Piece(null, null, null, null, null, null);
        Piece temp2 = new Piece(null, null, null, null, null, null);
        Piece temp3 = new Piece(null, null, null, null, null, null);

        temp1.setSide6(cube[0][2][0].getSide6());
        temp2.setSide6(cube[0][2][1].getSide6());
        temp3.setSide6(cube[0][2][2].getSide6());

        cube[0][2][0].setSide6(cube[2][2][0].getSide1());
        cube[0][2][1].setSide6(cube[1][2][0].getSide1());
        cube[0][2][2].setSide6(cube[0][2][0].getSide1());

        cube[2][2][0].setSide1(cube[2][2][2].getSide5());
        cube[1][2][0].setSide1(cube[2][2][1].getSide5());
        cube[0][2][0].setSide1(cube[2][2][0].getSide5());

        cube[2][2][2].setSide5(cube[0][2][2].getSide3());
        cube[2][2][1].setSide5(cube[1][2][2].getSide3());
        cube[2][2][0].setSide5(cube[2][2][2].getSide3());

        cube[0][2][2].setSide3(temp1.getSide6());
        cube[1][2][2].setSide3(temp2.getSide6());
        cube[2][2][2].setSide3(temp3.getSide6());

        Piece temp4 = new Piece(null, null, null, null, null, null);
        Piece temp5 = new Piece(null, null, null, null, null, null);
        Piece temp6 = new Piece(null, null, null, null, null, null);

        temp4.setSide4(cube[0][2][0].getSide4());
        temp5.setSide4(cube[0][2][1].getSide4());
        temp6.setSide4(cube[0][2][2].getSide4());

        cube[0][2][0].setSide4(cube[2][2][0].getSide4());
        cube[0][2][1].setSide4(cube[1][2][0].getSide4());
        cube[0][2][2].setSide4(cube[0][2][0].getSide4());

        cube[1][2][0].setSide4(cube[2][2][1].getSide4());
        cube[2][2][0].setSide4(cube[2][2][2].getSide4());
        cube[2][2][1].setSide4(cube[1][2][2].getSide4());

        cube[2][2][2].setSide4(temp6.getSide4());
        cube[1][2][2].setSide4(temp5.getSide4());
        cube[0][2][2].setSide4(temp4.getSide4());
    }

    //Rotating the front face of the cube anti clock wise
    public void rotateFrontAntiClock()
    {
        Piece temp1 = new Piece(null, null, null, null, null, null);
        Piece temp2 = new Piece(null, null, null, null, null, null);
        Piece temp3 = new Piece(null, null, null, null, null, null);

        temp1.setSide6(cube[0][2][0].getSide6());
        temp2.setSide6(cube[0][2][1].getSide6());
        temp3.setSide6(cube[0][2][2].getSide6());

        cube[0][2][0].setSide6(cube[0][2][2].getSide3());
        cube[0][2][1].setSide6(cube[1][2][2].getSide3());
        cube[0][2][2].setSide6(cube[2][2][2].getSide3());

        cube[0][2][2].setSide3(cube[2][2][2].getSide5());
        cube[1][2][2].setSide3(cube[2][2][1].getSide5());
        cube[2][2][2].setSide3(cube[2][2][0].getSide5());

        cube[2][2][2].setSide5(cube[2][2][0].getSide1());
        cube[2][2][1].setSide5(cube[1][2][0].getSide1());
        cube[2][2][0].setSide5(cube[0][2][0].getSide1());

        cube[2][2][0].setSide1(temp1.getSide6());
        cube[1][2][0].setSide1(temp2.getSide6());
        cube[0][2][0].setSide1(temp3.getSide6());

        Piece temp4 = new Piece(null, null, null, null, null, null);
        Piece temp5 = new Piece(null, null, null, null, null, null);
        Piece temp6 = new Piece(null, null, null, null, null, null);

        temp4.setSide4(cube[0][2][0].getSide4());
        temp5.setSide4(cube[0][2][1].getSide4());
        temp6.setSide4(cube[0][2][2].getSide4());

        cube[0][2][0].setSide4(cube[0][2][0].getSide4());
        cube[0][2][1].setSide4(cube[1][2][2].getSide4());
        cube[0][2][2].setSide4(cube[2][2][2].getSide4());

        cube[1][2][2].setSide4(cube[2][2][1].getSide4());
        cube[2][2][2].setSide4(cube[2][2][0].getSide4());
        cube[2][2][1].setSide4(cube[1][2][0].getSide4());

        cube[2][2][0].setSide4(temp4.getSide4());
        cube[1][2][0].setSide4(temp5.getSide4());
        cube[0][2][0].setSide4(temp6.getSide4());
    }

    //Rotating the top face of the cube clock wise
    public void rotateTopClock() {
        Piece temp1 = new Piece(null, null, null, null, null, null);
        Piece temp2 = new Piece(null, null, null, null, null, null);
        Piece temp3 = new Piece(null, null, null, null, null, null);

        temp1.setSide4(cube[0][2][0].getSide4());
        temp2.setSide4(cube[0][2][1].getSide4());
        temp3.setSide4(cube[0][2][2].getSide4());

        cube[0][2][0].setSide4(cube[0][0][0].getSide1());
        cube[0][2][1].setSide4(cube[0][1][0].getSide1());
        cube[0][2][2].setSide4(cube[0][2][0].getSide1());

        cube[0][0][0].setSide1(cube[0][0][0].getSide2());
        cube[0][1][0].setSide1(cube[0][0][1].getSide2());
        cube[0][2][0].setSide1(cube[0][0][2].getSide2());

        cube[0][0][0].setSide2(cube[0][0][2].getSide3());
        cube[0][0][1].setSide2(cube[0][1][2].getSide3());
        cube[0][0][2].setSide2(cube[0][2][2].getSide3());

        cube[0][0][2].setSide3(temp3.getSide4());
        cube[0][1][2].setSide3(temp2.getSide4());
        cube[0][2][2].setSide3(temp1.getSide4());

        Piece temp4 = new Piece(null, null, null, null, null, null);
        Piece temp5 = new Piece(null, null, null, null, null, null);
        Piece temp6 = new Piece(null, null, null, null, null, null);

        temp4.setSide6(cube[0][2][0].getSide6());
        temp5.setSide6(cube[0][2][1].getSide6());
        temp6.setSide6(cube[0][2][2].getSide6());

        cube[0][2][0].setSide6(cube[0][0][0].getSide6());
        cube[0][2][1].setSide6(cube[0][1][0].getSide6());
        cube[0][2][2].setSide6(cube[0][2][0].getSide6());

        cube[0][1][0].setSide6(cube[0][0][1].getSide6());
        cube[0][0][0].setSide6(cube[0][0][2].getSide6());
        cube[0][0][1].setSide6(cube[0][1][2].getSide6());

        cube[0][0][2].setSide6(temp6.getSide6());
        cube[0][1][2].setSide6(temp5.getSide6());
        cube[0][2][2].setSide6(temp4.getSide6());
    }

    //Rotating the top face of the cube anti clock wise
    public void rotateTopAntiClock(){
        Piece temp1 = new Piece(null, null, null, null, null, null);
        Piece temp2 = new Piece(null, null, null, null, null, null);
        Piece temp3 = new Piece(null, null, null, null, null, null);

        temp1.setSide4(cube[0][2][0].getSide4());
        temp2.setSide4(cube[0][2][1].getSide4());
        temp3.setSide4(cube[0][2][2].getSide4());

        cube[0][2][0].setSide4(cube[0][2][2].getSide3());
        cube[0][2][1].setSide4(cube[0][1][2].getSide3());
        cube[0][2][2].setSide4(cube[0][0][2].getSide3());

        cube[0][2][2].setSide3(cube[0][0][2].getSide2());
        cube[0][1][2].setSide3(cube[0][0][1].getSide2());
        cube[0][0][2].setSide3(cube[0][0][0].getSide2());

        cube[0][0][2].setSide2(cube[0][0][0].getSide1());
        cube[0][0][1].setSide2(cube[0][1][0].getSide1());
        cube[0][0][0].setSide2(cube[0][2][0].getSide1());

        cube[0][0][0].setSide1(temp1.getSide4());
        cube[0][1][0].setSide1(temp2.getSide4());
        cube[0][2][0].setSide1(temp3.getSide4());

        Piece temp4 = new Piece(null, null, null, null, null, null);
        Piece temp5 = new Piece(null, null, null, null, null, null);
        Piece temp6 = new Piece(null, null, null, null, null, null);

        temp4.setSide6(cube[0][2][0].getSide6());
        temp5.setSide6(cube[0][2][1].getSide6());
        temp6.setSide6(cube[0][2][2].getSide6());

        cube[0][2][0].setSide6(cube[0][2][2].getSide6());
        cube[0][2][1].setSide6(cube[0][1][2].getSide6());
        cube[0][2][2].setSide6(cube[0][0][2].getSide6());

        cube[0][1][2].setSide6(cube[0][0][1].getSide6());
        cube[0][0][2].setSide6(cube[0][0][0].getSide6());
        cube[0][0][1].setSide6(cube[0][1][0].getSide6());

        cube[0][0][0].setSide6(temp4.getSide6());
        cube[0][1][0].setSide6(temp5.getSide6());
        cube[0][2][0].setSide6(temp6.getSide6());
    }

    //Rotating the bottom face of the cube clock wise updated
    public void rotateBottomClock() {
        Piece temp1 = new Piece(null, null, null, null, null, null);
        Piece temp2 = new Piece(null, null, null, null, null, null);
        Piece temp3 = new Piece(null, null, null, null, null, null);

        temp1.setSide4(cube[2][2][0].getSide4());
        temp2.setSide4(cube[2][2][1].getSide4());
        temp3.setSide4(cube[2][2][2].getSide4());

        cube[2][2][0].setSide4(cube[2][0][0].getSide1());
        cube[2][2][1].setSide4(cube[2][1][0].getSide1());
        cube[2][2][2].setSide4(cube[2][2][0].getSide1());

        cube[2][0][0].setSide1(cube[2][0][0].getSide2());
        cube[2][1][0].setSide1(cube[2][0][1].getSide2());
        cube[2][2][0].setSide1(cube[2][0][2].getSide2());

        cube[2][0][0].setSide2(cube[2][0][2].getSide3());
        cube[2][0][1].setSide2(cube[2][1][2].getSide3());
        cube[2][0][2].setSide2(cube[2][2][2].getSide3());

        cube[2][0][2].setSide3(temp3.getSide4());
        cube[2][1][2].setSide3(temp2.getSide4());
        cube[2][2][2].setSide3(temp1.getSide4());

        Piece temp4 = new Piece(null, null, null, null, null, null);
        Piece temp5 = new Piece(null, null, null, null, null, null);
        Piece temp6 = new Piece(null, null, null, null, null, null);

        temp4.setSide5(cube[2][2][0].getSide5());
        temp5.setSide5(cube[2][2][1].getSide5());
        temp6.setSide5(cube[2][2][2].getSide5());

        cube[2][2][0].setSide5(cube[2][0][0].getSide5());
        cube[2][2][1].setSide5(cube[2][1][0].getSide5());
        cube[2][2][2].setSide5(cube[2][2][0].getSide5());

        cube[2][1][0].setSide5(cube[2][0][1].getSide5());
        cube[2][0][0].setSide5(cube[2][0][2].getSide5());
        cube[2][0][1].setSide5(cube[2][1][2].getSide5());

        cube[2][0][2].setSide5(temp6.getSide5());
        cube[2][1][2].setSide5(temp5.getSide5());
        cube[2][2][2].setSide5(temp4.getSide5());
    }

    //Rotating the bottom face of the cube anti clock wise updated
    public void rotateBottomAntiClock() {
        Piece temp1 = new Piece(null, null, null, null, null, null);
        Piece temp2 = new Piece(null, null, null, null, null, null);
        Piece temp3 = new Piece(null, null, null, null, null, null);

        temp1.setSide4(cube[2][2][0].getSide4());
        temp2.setSide4(cube[2][2][1].getSide4());
        temp3.setSide4(cube[2][2][2].getSide4());

        cube[2][2][0].setSide4(cube[2][2][2].getSide3());
        cube[2][2][1].setSide4(cube[2][1][2].getSide3());
        cube[2][2][2].setSide4(cube[2][0][2].getSide3());

        cube[2][2][2].setSide3(cube[2][0][2].getSide2());
        cube[2][1][2].setSide3(cube[2][0][1].getSide2());
        cube[2][0][2].setSide3(cube[2][0][0].getSide2());

        cube[2][0][2].setSide2(cube[2][0][0].getSide1());
        cube[2][0][1].setSide2(cube[2][1][0].getSide1());
        cube[2][0][0].setSide2(cube[2][2][0].getSide1());

        cube[2][0][0].setSide1(temp1.getSide4());
        cube[2][1][0].setSide1(temp2.getSide4());
        cube[2][2][0].setSide1(temp3.getSide4());

        Piece temp4 = new Piece(null, null, null, null, null, null);
        Piece temp5 = new Piece(null, null, null, null, null, null);
        Piece temp6 = new Piece(null, null, null, null, null, null);

        temp4.setSide5(cube[2][2][0].getSide5());
        temp5.setSide5(cube[2][2][1].getSide5());
        temp6.setSide5(cube[2][2][2].getSide5());

        cube[2][2][0].setSide5(cube[2][2][2].getSide5());
        cube[2][2][1].setSide5(cube[2][1][2].getSide5());
        cube[2][2][2].setSide5(cube[2][0][2].getSide5());

        cube[2][1][2].setSide5(cube[2][0][1].getSide5());
        cube[2][0][2].setSide5(cube[2][0][0].getSide5());
        cube[2][0][1].setSide5(cube[2][1][0].getSide5());

        cube[2][0][0].setSide5(temp4.getSide5());
        cube[2][1][0].setSide5(temp5.getSide5());
        cube[2][2][0].setSide5(temp6.getSide5());
    }

    //Method to shuffle the cube
    public void shuffleCube()
    {
        //Shuffle the cube 100 times
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 1) + 1) + 1;
        switch (randomNum) {
            case 1:
                rotateFrontClock();
                break;
            case 2:
                rotateFrontAntiClock();
                break;
            case 3:
                rotateLeftClock();
                break;
            case 4:
                rotateLeftAntiClock();
                break;
            case 5:
                rotateRightClock();
                break;
            case 6:
                rotateRightAntiClock();
                break;
            case 7:
                rotateTopClock();
                break;
            case 8:
                rotateTopAntiClock();
                break;
            case 9:
                rotateBottomClock();
                break;
            case 10:
                rotateBottomAntiClock();
                break;
        }
    }
}