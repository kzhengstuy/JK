//file for the Player class
//this guy is the main character, the one the player plays as


import java.util.ArrayList;
import cs1.Keyboard;
import java.io.*;
import java.util.*;

public class Player extends Trainer{
    /* private InputStreamReader isr;
    private BufferedReader in;
    isr = new InputStreamReader( System.in);
    in = new BufferedReader(isr);    */
    int _numBadges;



    public Player(String name){
	super(name);
	_numBadges = 0;
	_moneys = 2000;


    }



    //acessor methods


    public String getName(){
	return _name;
    }

    public int getBadges(){
	return _numBadges;
    }

    public double getMoney(){
	return _moneys;
    }


    public  ArrayList<Pokemon> getPokemons(){// out of comissions
	return _pokemons;
    }


    public void  addPokemon(Pokemon pkn){//out of commission
	
	_pokemons.add(pkn);
	
    }
    public String toString(){

	String ret = "";
	ret += "Trainer: " + getName() + "\n";
	ret += "Moneys: " + getMoney() + "\n";

	ret += "Pokemon: \n";
	PAS.getPokemons();


	return ret;
    }


    
    /*  public static void main(String[] args){
	Player bob = new Player("Bob");
	
	try {
	    System.out.println( "Pick your Pokemon!" );
	    System.out.println( "\t1: Bulbasaur \n\t2: Charmander \n\t3: Squirtle" );
	    int i = Integer.parseInt( Keyboard.readString() );
	}	
	catch ( IOException e ) { }
    
	if ( i == 1 ) {
	    addPokemon(new Bulbasaur());
	}
    
	else if (i == 2) {
	    addPokemon(new Bulbasaur());
	}
    
	else { 
	    addPokemon(new Squirtle());
	
	}
    
    
    
    
    }*/
}
