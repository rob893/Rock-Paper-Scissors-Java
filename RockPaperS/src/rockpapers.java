import java.util.Scanner;

public class rockpapers {
	
	public static void game(){
		double num=Math.random();
		Scanner in=new Scanner(System.in);
		System.out.println(compare(playerChoice(in), computerChoice(num)));
		System.out.println("The computer picked " +computerChoice(num));
		playAgain(in);
	}
	
	public static String playerChoice(Scanner in){
		System.out.println("Do you choose rock, paper, or scissors?");
		String playerChoice1 = in.next();
		return playerChoice1;
	}
	
	public static void playAgain(Scanner in){
		System.out.println("Do you want to play again?");
		String answer = in.next();
		if(answer.equals("no")){
			System.out.println("Bye!");
		} else
			game();
	}
	
	public static String computerChoice(double num){
		if (num < 0.34) {
			return "rock";
		} else if(num <= 0.67) {
			 return "paper";
		} else {
			return "scissors";
		}
	}
	
	public static String compare(String choice1, String choice2){
		if(choice1.equals(choice2)){
	        return "The result is a tie!";
	    } 
		else if(choice1.equals("rock")){
	        if(choice2.equals("scissors")) {
	            return "You win!";
	        } else if(choice2.equals("paper")) {
	            return "The computer wins!";
	        } else
	        	return "invalid";
	    } 
		else if(choice1.equals("paper")){
	        if(choice2.equals("rock")) {
	            return "You win!";
	        } else if(choice2.equals("scissors")){
	            return "The computer wins!";
	        } else
	        	return "invalid";
	    } 
		else if(choice1.equals("scissors")){
	        if(choice2.equals("paper")) {
	            return "You win!";
	        } else if(choice2.equals("rock")){
	            return "The computer wins!";
	        } else
	        	return "invalid";
		} else return "invalid";
	}

	public static void main(String[] args){
		game();
	}
}
