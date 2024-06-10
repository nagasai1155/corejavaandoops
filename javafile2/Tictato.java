package javafile2;




import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

        public class Tictato {

            static String [] board;
            static String turn;

            static String checkWinner()
            {
                String line = null;
                for(int a = 0;a<8;a++)
                {
                    switch (a)
                    {
                        case 0:
                            line = board[0]+board[1]+board[2]; // x+  x +x= xxx
                            break;
                        case 1:
                            line = board[3]+board[4]+board[5];
                            break;

                        case 2:
                            line = board[6]+board[7]+board[8];
                            break;
                        case 3:
                            line = board[0]+board[1]+board[2];
                            break;
                        case 4:
                            line = board[1]+board[4]+board[7];
                            break;
                        case 5:
                            line = board[2]+board[5]+board[8];
                            break;
                        case 6:
                            line = board[0]+board[4]+board[8];
                            break;
                        case 7:
                            line = board[2]+board[4]+board[6];
                            break;

                    }
                    //for x winner
                    if(line.equals("xxx"))
                    {
                        return "x";
                    }
                    else if(line.equals("OOO"))
                    {
                        return"O";
                    }


                }
                for(int a = 0;a<9;a++)
                {

                    if(Arrays.asList(board).contains(String.valueOf(a+1)))
                    {
                        break;
                    }
                    else if(a==8)
                    {
                        return "draw";
                    }
                }
                System.out.println(turn + "s turn ;enter a slot number to play " + turn+ "in : ");
                return null;
            }


            static void printBoard()
            {
                System.out.println("|---|---|---|");
                System.out.println("|"+board[0]+"|"+board[1]+"|"+board[2]+"|");
                System.out.println("-----------");
                System.out.println("|"+board[3]+"|"+board[4]+"|"+board[5]+"|");
                System.out.println("-----------");
                System.out.println("|"+board[6]+"|"+board[7]+"|"+board[8]+"|");
                System.out.println("-----------");

                System.out.println("|---|---|---|");

            }
            public static void main(String args[])
            {
                Scanner in = new Scanner(System.in);
                board = new String [9];
                turn = "x";
                String winner=null;
                for(int a=0;a<9;a++)
                {
                    board[a]=String.valueOf(a+1);
                }
                System.out.println("welcome to 3x3 Tic tac toe");

                printBoard();
                System.out.println("x will play first enter a slot number to place x in :");
                while(winner == null)
                {
                    int numInput ;
                    try{
                        numInput = in.nextInt();
                        if(!(numInput>0&&numInput<=9))
                        {
                            System.out.println("invalid input; re-enter slot number:");
                            continue;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("invalid input; re-enter slot number:");
                        continue;
                    }
                    if(board[numInput-1].equals(String.valueOf(numInput)))
                    {
                        board[numInput-1]=turn;
                        if(turn.equals("x"))
                        {

                            turn="O";
                        }
                        else {
                            turn="x";
                        }
                        printBoard();
                        winner=checkWinner();
                    }
                    else{
                        System.out.println("slot already taken;re - enter slot number");
                    }
                }
                if(winner.equalsIgnoreCase("draw"))
                {
                    System.out.println("its a draw thanku for playing ");
                }
                else {
                    System.out.println("congratulations !"+winner+"s have won ! thanks");
                }
                in.close();

            }
        }



