import java.util.Random;
import java.util.Scanner;

class Ladder_And_Snake_Game {

    public static void main(String[] args) {
        boolean start = true;
        Scanner sc = new Scanner(System.in);
        String Username[] = new String[10];
        String Password[] = new String[10];
        int usercount = 0;
        int Option;
        String input ;

        
        
        do {
            System.out.println(
                "\n                 Welcome to Ladder And Snake Game!!!\n\n                           1. Sign Up\n                           2. Log In\n                             3. Exit");
                System.out.print("\nEnter your Option:");
                input = sc.next();
                
                try {
                    Option = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number (1, 2, or 3)!");
                    continue;  // Go back to the menu
                }
                switch (Option) {
                    case 1:
                        String username;
                        String password;
                        boolean isUserInsert;
                        System.out.print("Enter your Username:");
                        username = sc.next();

                        if(username.length()>10){
                            System.out.println("Username word limit exceed!!! Please make username of less than 10 chararters.");
                            continue;
                        }
        
                        do {
                            isUserInsert = true;
        
                            for (int j = 0; j < Username.length; j++) {
                                if (Username[j] != null && Username[j].equals(username)) {
                                    System.out.println("Username is already taken!!");
                                    isUserInsert = false;
                                    break;
                                }
                            }
        
                        } while (isUserInsert == false);
        
                        if (isUserInsert == true) {
                            Username[usercount] = username;
                        }
        
                        boolean isPasswordValid;
        
                        do {
        
                            boolean hasUpper = false;
                            boolean hasLower = false;
                            boolean hasDigit = false;
                            boolean hasSpecial = false;
        
                            System.out.println(
                                "\nPassworrd must contains Upeercase, Lowercase, Number and Special character(@,#,$,%,&,*)!!!");
                            System.out.print("Create your password:");
        
                                password = sc.next();
                                
                                for (int j = 0; j < password.length(); j++) {
                                    char ch = password.charAt(j);
                                    if (Character.isUpperCase(ch)) {
                                        hasUpper = true;
                                    }
                                    if (Character.isLowerCase(ch)) {
                                        hasLower = true;
                                    }
                                if (Character.isDigit(ch)) {
                                    hasDigit = true;
                                }
                                if (ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '&' || ch == '*') {
                                    hasSpecial = true;
                                }
        
                            }
                            
                            isPasswordValid = hasUpper && hasLower && hasDigit && hasSpecial;
                            if (!isPasswordValid) {
                                System.out.println("Invalid Password!!! , Please try again.");
                            }
                        } while (!isPasswordValid);
                        if(username.length()>10){
                            System.out.println("Password word limit exceed!!! Please make password of less than 10 chararters.");
                        }
                        Password[usercount] = password;
                        usercount++;
                        System.out.println("SignUp Successfull!!!");
                        
                        // for(int i = 0; i <Username.length;i++){
                        //     System.out.println(Username[i]);
                        //     }
                        //     for(int i = 0 ; i<Password.length;i++){
                        //         System.out.println(Password[i]);
                        //         }
                        //         System.out.println(usercount);
                                
                    break;
                            
                    case 2:
                        String LogIn_Username;
                        String LogIn_Password;
                        Boolean isUserExists = false;
                        int index = -1;
        
                        System.out.print("\nEnter your Username: ");
                        LogIn_Username = sc.next();
                        
                        for (int i = 0; i < Username.length; i++) {
                            if (Username[i] != null && Username[i].equals(LogIn_Username)) {
                                isUserExists = true;
                                index = i;
                                break;
                            }
                        }
                        if (isUserExists) {
                            System.out.print("Enter your Password:");
                            LogIn_Password = sc.next();
        
                            if (LogIn_Password.equals(Password[index])) {
                                System.out.println(" \n **************************************************************\n                      Welcome " + Username[index] + "!!!\n**************************************************************\n");
                                startGame(sc);
                            } else {
                                System.out.println("Entered password doesn't match!!");
                                break;
                            }
        
                        } else {
                            System.out.println("User not found!!");
                            for(int i = 0; i <Username.length;i++){
                                System.out.println(Username[i]);
                            }
                            for(int i = 0 ; i<Password.length;i++){
                            System.out.println(Password[i]);
                            }
                            System.out.println(usercount);
                        }
        
                    break;
    
                    case 3:
                        start = false;
                        System.out.println("You Exit!!");
                    break;
    
                    default:
                        System.out.println("Enter valid option!!");
                    break;
            }
    
        } while (start);
        sc.close();
        
        
        
    }

    static void startGame(Scanner sc){

        
        
        int arr[][]={
            {100,99,98,97,96,95,94,93,92,91},
            { 81,82,83,84,85,86,87,88,89,90},
            { 80,79,78,77,76,75,74,73,72,71},
            { 61,62,63,64,65,66,67,68,69,70},
            { 60,59,58,57,56,55,54,53,52,51},
            { 41,42,43,44,45,46,47,48,49,50},
            { 40,39,38,37,36,35,34,33,32,31},
            { 21,22,23,24,25,26,27,28,29,30},
            { 20,19,18,17,16,15,14,13,12,11},
            { 01,02,03,04,05,06,07, 8, 9,10}
        }; 
        System.out.println("|| Snake And Ladder PlayBoard ||\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        
        int moves [] = new int[110];
        
        for(int i = 0; i<=100;i++){
            moves[i]=-1;
        }
        
        // ladder moves
        moves[1]= 22;
        moves[7]= 11;
        moves[16]= 92;
        moves[28]= 53;
        moves[31]= 50;
        moves[38]= 79;
        moves[61]= 77;
        moves[69]= 88;
        moves[74]= 95;
        
        // snake moves 
        moves[30]=13;
        moves[40]=19;
        moves[58]=36;
        moves[66]=49;
        moves[81]=60;
        moves[91]=75;
        moves[98]=3;
        
        System.out.println("\n Enter number of Players:\n\n       1. One player\n       2. Two players");
        String Option = sc.next();
        int op= -1;


        try {
            op = Integer.parseInt(Option);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number (1, 2, or 3)!");
            // continue;  // Go back to the menu
        }

        switch (op) {
            case 1:
                one_player(sc,moves);
            break;
            
            case 2:
                two_players(sc,moves);
                break;
        
            default:
                System.out.println("Enter valid Option!!");
                break;
        }
        

    }
    
    
    static void one_player(Scanner sc, int moves[]){
        int player1_pos= 0;
        int computer_pos= 0;
        boolean isPlayer1_turn = true;
        int dice_num;
    
        while(player1_pos<100 && computer_pos<100){
            System.out.print((isPlayer1_turn? "Your's turn : You" : "Computer")+" Roll dice (r/R): ");
            char roll;
            if(isPlayer1_turn){
                roll= sc.next().charAt(0);
            }else{
                roll='r';
            }
            if(roll=='r' || roll =='R'){
                // Ladder_And_Snake_Game roll_dice = new Ladder_And_Snake_Game();
                dice_num = rollDice();
                System.out.println("\nGet number : " + dice_num);
    
                if(isPlayer1_turn){
                    player1_pos= player_position(player1_pos,dice_num, moves);
                    System.out.println("Player 1 is now at position : "+player1_pos);
                }else{
                    computer_pos= player_position(computer_pos,dice_num, moves);
                    System.out.println("Computer is now at position : "+computer_pos);
                }

                if(player1_pos==100){
                    System.out.println("\n************************************************************************\n                        HURRAY!!!  You Win! \n************************************************************************\n");
                    // dashboard();
                    
                    
                }if(computer_pos == 100){
                    System.out.println("\n************************************************************************\n                        HURRAY!!!  Computer Win!\n************************************************************************\n");
                    // dashboard();
                    
    
                }
                isPlayer1_turn = !isPlayer1_turn;
                
            }else{
                System.out.println("Enter valid character!!!");
            }
            
        }

    }
    
    static void two_players(Scanner sc, int moves[]){
        int player1_pos= 0;
        int player2_pos = 0;
        boolean isPlayer1_turn = true;
        int dice_num;
    
        while(player1_pos<100 && player2_pos<100){
            System.out.print((isPlayer1_turn? "Player 1" : "Player 2")+" Roll dice (r/R): ");
            char roll = sc.next().charAt(0);
            if(roll=='r' || roll =='R'){
                // Ladder_And_Snake_Game roll_dice = new Ladder_And_Snake_Game();
                dice_num = rollDice();
                System.out.println("Get number : " + dice_num);
    
                if(isPlayer1_turn){
                    player1_pos= player_position(player1_pos,dice_num, moves);
                    System.out.println("Player 1 is now at position : "+player1_pos);
                }else{
                    player2_pos= player_position(player2_pos,dice_num, moves);
                    System.out.println("Player 2 is now at position : "+player2_pos);
                }
                if(player1_pos==100){
                    System.out.println("\n************************************************************************\n                        HURRAY!!!  Player 1 Win! \n************************************************************************\n");
                    // dashboard();
                    
                    
                }if(player2_pos == 100){
                    System.out.println("\n************************************************************************\n                        HURRAY!!!  Player 2 Win!\n************************************************************************\n");
                    // dashboard();
                    
    
                }
                isPlayer1_turn = !isPlayer1_turn;
    
            }else{
                System.out.println("Enter valid character!!!");
            }
            
        }

    }

    static int player_position(int player_old_pos,int dice_num, int moves[]){
        int player_pos= player_old_pos + dice_num;
        if(player_pos>100){
            System.out.println("Number is more than the victory number 100!!");
            return player_old_pos;
            
        }else{
            
        }
        if(moves[player_pos]!=-1){
            if(player_pos>moves[player_pos]){
                System.out.println("Ohh it was snake!! you move from "+player_pos+" to "+moves[player_pos] );
            }
            if(player_pos<moves[player_pos]){
                System.out.println("Yupp it is laddar!! you move from "+player_pos+" to "+moves[player_pos] );
            }
            player_pos= moves[player_pos];
        }else{
            System.out.println("You move from "+ player_old_pos+" to "+ player_pos  );
        }
        return player_pos;
        
    }
    public static int rollDice(){
        return new Random().nextInt(6)+1;
    }
}