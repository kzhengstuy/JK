	//file for the Player class
//this guy is the main character, the one the player plays as


import java.util.ArrayList;
import java.io.*;
import java.util.*;
import cs1.Keyboard;

public class Player extends Trainer{
    int _numBadges;
    private InputStreamReader isr;
    private BufferedReader in;
 
    

    public Player(String name){
	super(name);
	_numBadges = 0;
	_moneys = 2000;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
    

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


    public  ArrayList<Pokemon> getPokemons(){
	return _pokemons;
    }


    public Pokemon addPokemon(Pokemon pkn){
	
	_pokemons.add(pkn);
	return pkn;
    }
    public String toString(){

	String ret = "";
	ret += "Trainer: " + getName();
	ret += getPokemons();

	return ret;
    }



    public static void main(String[] args){
	Player bob = new Player("Bob");
	int i = 1;
	
	try {
	    System.out.println( "Pick your Pokemon!" );
	    System.out.println( "\t1: Bulbasaur \n\t2: Charmander\n\t3: Squirtle" );
	    i = Integer.parseInt( in.readLine() );
	}	
	catch ( IOException e ) { }
    
	if ( i == 1 ) {
	    Bulbasaur b = new Bulbasaur();
	    bob.addPokemon(b);
	}
    
	else if (i == 2) {
	    Charmander c = new Charmander();
	    bob.addPokemon(c);
	}
    
	else { 
	    Squirtle s = new Squirtle();
	    bob.addPokemon(s);
    	
	}
    
    }
    
    
}

