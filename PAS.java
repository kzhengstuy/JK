//driver file meant to run the pokemon adventure simulator



import cs1.Keyboard;
public class PAS{
    //generic player
    static Player player;


    public static void beginning(){


	System.out.println("Right... so your name is " + player._name + "? Are you sure? [Y/N]");
	if (Keyboard.readString().equals("Y")){
	    play();
	    }
	else if(Keyboard.readString().equals("N")){
	    System.out.println("Okay... so what's your name?");
	    player._name = Keyboard.readString();
	    beginning();
	}

    }



	public static void play(){
	    System.out.println("Time to play!!\nWe'll start by picking your first Pokemon: ");
	    
	}


	public static void main(String[]args){
	
	
	System.out.println("Okay, this is Pokemon. Not much explainging or story to do. Let's get started. What's your name?");
	
	player = new Player(Keyboard.readString());
	
	beginning();
	
	
	
	}
	
	
	
	
	
	
    }
    
