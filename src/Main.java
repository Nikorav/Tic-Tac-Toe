import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] symbols = new char[3][3];
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                symbols[i][j] = ' ';
            }
        }
        //ветка 2
        printGame(symbols);
        boolean HasX = false;
        boolean HasO = false;
        int counter = 9;
        while (true) {
            System.out.println("Enter the coordinates:");
            int NumX1 = in.nextInt();
            int NumX2 = in.nextInt();
            while (NumX1 < 1 || NumX1 > 3 || NumX2 < 1 || NumX2 > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                NumX1 = in.nextInt();
                NumX2 = in.nextInt();
            }
            while (symbols[3 - NumX2][NumX1 - 1] == 'X' || symbols[3 - NumX2][NumX1 - 1] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                NumX1 = in.nextInt();
                NumX2 = in.nextInt();
                while (NumX1 < 1 || NumX1 > 3 || NumX2 < 1 || NumX2 > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    NumX1 = in.nextInt();
                    NumX2 = in.nextInt();
                }
            }
            symbols[3 - NumX2][NumX1 - 1] = 'X';
            counter--;
            printGame(symbols);
            if (symbols[0][0] == symbols[1][1] && symbols[1][1] == symbols[2][2] || symbols[0][2] == symbols[1][1] && symbols[1][1] == symbols[2][0] || symbols[0][1] == symbols[1][1] && symbols[1][1] == symbols[2][1] || symbols[1][0] == symbols[1][1] && symbols[1][1] == symbols[1][2]) {
                switch (symbols[1][1]) {
                    case 'X':
                        HasX = true;
                        break;
                    case 'O':
                        HasO = true;
                        break;
                    default:
                        break;
                }
            }
            if (symbols[0][0] == symbols[0][1] && symbols[0][1] == symbols[0][2]) {
                switch (symbols[0][0]) {
                    case 'X':
                        HasX = true;
                        break;
                    case 'O':
                        HasO = true;
                        break;
                    default:
                        break;
                }
            }
            if (symbols[2][0] == symbols[2][1] && symbols[2][1] == symbols[2][2]) {
                switch (symbols[2][1]) {
                    case 'X':
                        HasX = true;
                        break;
                    case 'O':
                        HasO = true;
                        break;
                    default:
                        break;
                }
            }
            if (symbols[0][0] == symbols[1][0] && symbols[1][0] == symbols[2][0]) {
                switch (symbols[2][0]) {
                    case 'X':
                        HasX = true;
                        break;
                    case 'O':
                        HasO = true;
                        break;
                    default:
                        break;
                }
            }
            if (symbols[0][2] == symbols[1][2] && symbols[1][2] == symbols[2][2]) {
                switch (symbols[2][2]) {
                    case 'X':
                        HasX = true;
                        break;
                    case 'O':
                        HasO = true;
                        break;
                    default:
                        break;
                }
            }
            if (HasO) {
                System.out.println("O wins");
                break;
            } else {
                if (HasX) {
                    System.out.println("X wins");
                    break;
                } else {
                    if (counter == 0) {
                        System.out.println("Draw");
                        break;
                    }
                }
            }

            System.out.println("Enter the coordinates:");
            int NumO1 = in.nextInt();
            int NumO2 = in.nextInt();
            while (NumO1 < 1 || NumO1 > 3 || NumO2 < 1 || NumO2 > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                NumO1 = in.nextInt();
                NumO2 = in.nextInt();
            }
            while (symbols[3 - NumO2][NumO1 - 1] == 'X' || symbols[3 - NumO2][NumO1 - 1] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                NumO1 = in.nextInt();
                NumO2 = in.nextInt();
                while (NumO1 < 1 || NumO1 > 3 || NumO2 < 1 || NumO2 > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    NumO1 = in.nextInt();
                    NumO2 = in.nextInt();
                }
            }
            symbols[3 - NumO2][NumO1 - 1] = 'O';
            counter--;
            printGame(symbols);

            if (symbols[0][0] == symbols[1][1] && symbols[1][1] == symbols[2][2] || symbols[0][2] == symbols[1][1] && symbols[1][1] == symbols[2][0] || symbols[0][1] == symbols[1][1] && symbols[1][1] == symbols[2][1] || symbols[1][0] == symbols[1][1] && symbols[1][1] == symbols[1][2]) {
                switch (symbols[1][1]) {
                    case 'X':
                        HasX = true;
                        break;
                    case 'O':
                        HasO = true;
                        break;
                    default:
                        break;
                }
            }
            if (symbols[0][0] == symbols[0][1] && symbols[0][1] == symbols[0][2]) {
                switch (symbols[0][0]) {
                    case 'X':
                        HasX = true;
                        break;
                    case 'O':
                        HasO = true;
                        break;
                    default:
                        break;
                }
            }
            if (symbols[2][0] == symbols[2][1] && symbols[2][1] == symbols[2][2]) {
                switch (symbols[2][1]) {
                    case 'X':
                        HasX = true;
                        break;
                    case 'O':
                        HasO = true;
                        break;
                    default:
                        break;
                }
            }
            if (symbols[0][0] == symbols[1][0] && symbols[1][0] == symbols[2][0]) {
                switch (symbols[2][0]) {
                    case 'X':
                        HasX = true;
                        break;
                    case 'O':
                        HasO = true;
                        break;
                    default:
                        break;
                }
            }
            if (symbols[0][2] == symbols[1][2] && symbols[1][2] == symbols[2][2]) {
                switch (symbols[2][2]) {
                    case 'X':
                        HasX = true;
                        break;
                    case 'O':
                        HasO = true;
                        break;
                    default:
                        break;
                }
            }

            if (HasO) {
                System.out.println("O wins");
                break;
            } else {
                if (HasX) {
                    System.out.println("X wins");
                    break;
                } else {
                    if (counter == 0) {
                        System.out.println("Draw");
                        break;
                    }
                }
            }
        }
    }

    public static void printGame(char symbols[][]) {
        System.out.println("---------");
        System.out.println("| " + symbols[0][0] + " " + symbols[0][1] + " " + symbols[0][2] + " |");
        System.out.println("| " + symbols[1][0] + " " + symbols[1][1] + " " + symbols[1][2] + " |");
        System.out.println("| " + symbols[2][0] + " " + symbols[2][1] + " " + symbols[2][2] + " |");
        System.out.println("---------");
    }
}