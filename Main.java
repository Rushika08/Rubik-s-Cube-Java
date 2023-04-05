import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creating 27 pieces as objects of the piece class and assigning them the correct sides
        Piece piece1 = new Piece("G", "W", null, null, null, "R");
        Piece piece2 = new Piece(null, "W", null, null, null, "R");
        Piece piece3 = new Piece(null, "W", "B", null, null, "R");
        Piece piece4 = new Piece("G", null, null, null, null, "R");
        Piece piece5 = new Piece(null, null, null, null, null, "R");
        Piece piece6 = new Piece(null, null, "B", null, null, "R");
        Piece piece7 = new Piece("G", null, null, "Y", null, "R");
        Piece piece8 = new Piece(null, null, null, "Y", null, "R");
        Piece piece9 = new Piece(null, null, "B", "Y", null, "R");

        Piece piece10 = new Piece("G", "W", null, null, null, null);
        Piece piece11 = new Piece(null, "W", null, null, null, null);
        Piece piece12 = new Piece(null, "W", "B", null, null, null);
        Piece piece13 = new Piece("G", null, null, null, null, null);
        Piece piece14 = new Piece(null, null, null, null, null, null);
        Piece piece15 = new Piece(null, null, "B", null, null, null);
        Piece piece16 = new Piece("G", null, null, "Y", null, null);
        Piece piece17 = new Piece(null, null, null, "Y", null, null);
        Piece piece18 = new Piece(null, null, "B", "Y", null, null);

        Piece piece19 = new Piece("G", "W", null, null, "O", null);
        Piece piece20 = new Piece(null, "W", null, null, "O", null);
        Piece piece21 = new Piece(null, "W", "B", null, "O", null);
        Piece piece22 = new Piece("G", null, null, null, "O", null);
        Piece piece23 = new Piece(null, null, null, null, "O", null);
        Piece piece24 = new Piece(null, null, "B", null, "O", null);
        Piece piece25 = new Piece("G", null, null, "Y", "O", null);
        Piece piece26 = new Piece(null, null, null, "Y", "O", null);
        Piece piece27 = new Piece(null, null, "B", "Y", "O", null);

        //Creating a 3D array to store the 27 pieces
        Piece[][][] cube = new Piece[3][3][3];

        //Assigning the pieces to the 3D array
        cube[0][0][0] = piece1;
        cube[0][0][1] = piece2;
        cube[0][0][2] = piece3;
        cube[0][1][0] = piece4;
        cube[0][1][1] = piece5;
        cube[0][1][2] = piece6;
        cube[0][2][0] = piece7;
        cube[0][2][1] = piece8;
        cube[0][2][2] = piece9;

        cube[1][0][0] = piece10;
        cube[1][0][1] = piece11;
        cube[1][0][2] = piece12;
        cube[1][1][0] = piece13;
        cube[1][1][1] = piece14;
        cube[1][1][2] = piece15;
        cube[1][2][0] = piece16;
        cube[1][2][1] = piece17;
        cube[1][2][2] = piece18;

        cube[2][0][0] = piece19;
        cube[2][0][1] = piece20;
        cube[2][0][2] = piece21;
        cube[2][1][0] = piece22;
        cube[2][1][1] = piece23;
        cube[2][1][2] = piece24;
        cube[2][2][0] = piece25;
        cube[2][2][1] = piece26;
        cube[2][2][2] = piece27;

        //Creating an object of the RubicCube class
        RubicCube rubicCube = new RubicCube(cube);

        //Displaying the format of the Rubic Cube
        System.out.println("\n\n");
        System.out.println("Format of the Rubic Cube");
        System.out.println("\n");
        System.out.println("       " + "Back");
        System.out.println(" ");
        System.out.println("Left" + " " + "   Top " + " " + " Right" + " " + " Bottom");
        System.out.println(" ");
        System.out.println("       " + "Front");

        System.out.println("\n\n");
        rubicCube.displayCube();
        System.out.println("\n");

        //Shuffling the cube
        for (int i = 0; i < 100; i++) {
            rubicCube.shuffleCube();
        }
        System.out.println("Cube aftre shuffling - ");
        rubicCube.displayCube();

        //Creating a scanner object to take input from the user
        Scanner sc1 = new Scanner(System.in);
        Boolean exit = false;

        //Taking input commands from the user until exit is not pressed
        do {
            System.out.println("\n");

            System.out.println("Enter the command you want to perform - ");
            System.out.println("F+ Rotate Front Face Clockwise");
            System.out.println("F+ Rotate Front Face Anti-Clockwise");
            System.out.println("L+ Rotate Left Face Clockwise");
            System.out.println("L- Rotate Left Face Anti-Clockwise");
            System.out.println("R+ Rotate Right Face Clockwise");
            System.out.println("R- Rotate Right Face Anti-Clockwise");
            System.out.println("U+ Rotate Top Face Clockwise");
            System.out.println("U- Rotate Top Face Anti-Clockwise");
            System.out.println("B+ Rotate Bottom Face Clockwise");
            System.out.println("B- Rotate Bottom Face Anti-Clockwise");
            System.out.println("RS Reshuffle the cube");
            System.out.println("EX Exit the game");

            String rInput = sc1.nextLine();
            rInput = rInput.toUpperCase();

            //Checking the input command and performing the corresponding operation
            if (rInput.equals("F+")) {
                rubicCube.rotateFrontClock();
            } else if (rInput.equals("F-")) {
                rubicCube.rotateFrontAntiClock();
            } else if (rInput.equals("L+")) {
                rubicCube.rotateLeftClock();
            } else if (rInput.equals("L-")) {
                rubicCube.rotateLeftAntiClock();
            } else if (rInput.equals("R+")) {
                rubicCube.rotateRightClock();
            } else if (rInput.equals("R-")) {
                rubicCube.rotateRightAntiClock();
            } else if (rInput.equals("U+")) {
                rubicCube.rotateTopClock();
            } else if (rInput.equals("U-")) {
                rubicCube.rotateTopAntiClock();
            } else if (rInput.equals("B+")) {
                rubicCube.rotateBottomClock();
            } else if (rInput.equals("B-")) {
                rubicCube.rotateBottomAntiClock();
            } else if (rInput.equals("RS")) {
                for (int i = 0; i < 50; i++) {
                    rubicCube.shuffleCube();
                }
            } else if (rInput.equals("EX")) {
                System.out.println("Exiting the game");
                exit = true;
                break;
            } else {
                System.out.println("Invalid Input");
            }

            //Checking if the cube is solved or not
            if((cube[0][0][0].getSide6()==cube[0][0][1].getSide6())&&
                    (cube[0][0][1].getSide6()==cube[0][0][2].getSide6())&&
                    (cube[0][0][2].getSide6()==cube[0][1][0].getSide6())&&
                    (cube[0][1][0].getSide6()==cube[0][1][1].getSide6())&&
                    (cube[0][1][1].getSide6()==cube[0][1][2].getSide6())&&
                    (cube[0][1][2].getSide6()==cube[0][2][0].getSide6())&&
                    (cube[0][2][0].getSide6()==cube[0][2][1].getSide6())&&
                    (cube[0][2][1].getSide6()==cube[0][2][2].getSide6())&&

                    (cube[0][2][0].getSide4()==cube[0][2][1].getSide4())&&
                    (cube[0][2][1].getSide4()==cube[0][2][2].getSide4())&&
                    (cube[0][2][2].getSide4()==cube[1][2][0].getSide4())&&
                    (cube[1][2][0].getSide4()==cube[1][2][1].getSide4())&&
                    (cube[1][2][1].getSide4()==cube[1][2][2].getSide4())&&
                    (cube[1][2][2].getSide4()==cube[2][2][0].getSide4())&&
                    (cube[2][2][0].getSide4()==cube[2][2][1].getSide4())&&
                    (cube[2][2][1].getSide4()==cube[2][2][2].getSide4())&&

                    (cube[0][0][0].getSide1()==cube[0][1][0].getSide1())&&
                    (cube[0][1][0].getSide1()==cube[0][2][0].getSide1())&&
                    (cube[0][2][0].getSide1()==cube[1][0][0].getSide1())&&
                    (cube[1][0][0].getSide1()==cube[1][1][0].getSide1())&&
                    (cube[1][1][0].getSide1()==cube[1][2][0].getSide1())&&
                    (cube[1][2][0].getSide1()==cube[2][0][0].getSide1())&&
                    (cube[2][0][0].getSide1()==cube[2][1][0].getSide1())&&
                    (cube[2][1][0].getSide1()==cube[2][2][0].getSide1())&&

                    (cube[0][2][2].getSide3()==cube[0][1][2].getSide3())&&
                    (cube[0][1][2].getSide3()==cube[0][0][2].getSide3())&&
                    (cube[0][0][2].getSide3()==cube[1][2][2].getSide3())&&
                    (cube[1][2][2].getSide3()==cube[1][1][2].getSide3())&&
                    (cube[1][1][2].getSide3()==cube[1][0][2].getSide3())&&
                    (cube[1][0][2].getSide3()==cube[2][2][2].getSide3())&&
                    (cube[2][2][2].getSide3()==cube[2][1][2].getSide3())&&
                    (cube[2][1][2].getSide3()==cube[2][0][2].getSide3()))
            {
                System.out.println("Rubic Cube Solved, You Win");
                exit = true;
            }

            //Displaying the cube
            rubicCube.displayCube();

        } while (exit == false);
    }
}