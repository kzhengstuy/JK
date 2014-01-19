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
	Pokemon poke = new Bulbasaur();
	bob.addPokemon(poke);

    }

}
