//driver file meant to run the pokemon adventure simulator



import cs1.Keyboard;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class PAS{
    //generic player
    static Player player;
    private InputStreamReader isr;
    private BufferedReader in;
    ArrayList _pokemons = new ArrayList();

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
   
    public static ArrayList<Pokemon> getPokemons(){
        return player._pokemons;
    }

    public static void addPokemon(Pokemon pkn){// adding a pokemon to the party
        player.getPokemons().add(pkn);
	
        
    }


    /* public static ArrayList<Pokemon> getPokemons(){
        return player._pokemons;
	}*/

    public static void pick(){//picking the first pokemon
        System.out.println("You have three choices to pick from:\n1)Bulbasaur\t2)Charmander\t3)Squirtle\nDon't be shy! Pick one! [1/2/3]");
        String choice = Keyboard.readString();
	Pokemon select;

        if( choice.equals(1)){
	    select = new Bulbasaur();
	    player.addPokemon(select);
	    // System.out.println(select);
        }
	else if (choice.equals(2)){
	    select = new Charmander();
	    player.addPokemon(select);
            // System.out.print(select);
        }
        else if (choice.equals(3)){
	    select = new Squirtle();
	    player.addPokemon(select);
            // System.out.print(select);
        }
        
	System.out.println("Let's go into battle!");
	playTurn();

    }

    public static boolean playTurn() {
	int i = 1;
	int d1, d2;
	System.out.println("Oh look, an enemy!");
	return true;
	
    }

        public static void play(){
            System.out.println("Time to play!!\nWe'll start by picking your first Pokemon: ");
            pick();
            
        }


        public static void main(String[]args){
        
          
            System.out.println("Okay, this is Pokemon. Not much explainging or story to do. Let's get started. What's your name?");
        
        player = new Player(Keyboard.readString());
        
        beginning();
        
        
            
        }
        
        
        
        
}

    
