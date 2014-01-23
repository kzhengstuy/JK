//driver file meant to run the pokemon adventure simulator



import cs1.Keyboard;

import java.util.ArrayList;
public class PAS{
    //generic player
    static Player player;


    public static void beginning(){


	System.out.println("Right... so your name is " + player._name + "? Are you sure? [Y/N]");
	String string = Keyboard.readString();
	if(string.equals("N")){
	    System.out.println("Okay... so what's your name?");
	    player._name = Keyboard.readString();
	    beginning();
	}
	else if (string.equals("Y")){
	    play();
	}

    }

    public static void pick(){//picking the first pokemon
	System.out.println("You have three choices to pick from:\n1)Bulbasaur\t2)Charmander\t3)Squirtle\nDon't be shy! Pick one! [1/2/3]");
	String choice = Keyboard.readString();
	if( choice.equals("1")){
	    player.addPokemon(new Bulbasaur());
	    }
	System.out.println("So this is okay?");
	System.out.println(player.getPokemons());

    }

	public static void play(){
	    System.out.println("Time to play!!\nWe'll start by picking your first Pokemon: ");
	    pick();
	    
	}


	public static void main(String[]args){
	
	    /*    player = new Player("Jim");
	    Bulbasaur pkmn = new Bulbasaur();
	    player.addPokemon(pkmn);
	    System.out.println(player.getPokemons());
	    */

	    System.out.println("Okay, this is Pokemon. Not much explainging or story to do. Let's get started. What's your name?");
	
	player = new Player(Keyboard.readString());
	
	beginning();
	
	
	    
	}
	
	
	
	
	
	
    }
    
