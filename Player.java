//file for the Player class
//this guy is the main character, the one the player plays as


import java.util.ArrayList;

public class Player extends Trainer{
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


    public  ArrayList<Pokemon> getPokemons(){
	return _pokemons;
    }


    public Pokemon addPokemon(Pokemon pkn){
	
	getPokemons().add(pkn);
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
    
    try {
    	System.out.println( "Pick your Pokemon!" );
    	System.out.println( "\t1: Bulbasaur \n\t2: Charmander \n\t3: Squirtle" );
    	i = Integer.parseInt( in.readLine() );
    }	
    catch ( IOException e ) { }
    
    if ( i == 1 ) {
    	addPokemon("Bulbasaur")
    }
    
    else if (i == 2) {
    	addPokemon("Charmander")
    }
    
    else { 
    	addPokemon("Squirtle")
    	
    }
    	
    
    

}
