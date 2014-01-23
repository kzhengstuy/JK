//File for the Trainer class
//This encompasses the Player, the Gym Leaders, and the random trainers

import java.util.ArrayList;

public class Trainer{
    //variables for generic trainers:
    int _moneys;
    String _name;
    
    ArrayList<Pokemon> _pokemons;



    public Trainer(String name){
	_name = name;
	

    }

    public String toString(){

	String ret = "";

	ret += "Trainer: " + _name + "\n";
	ret += "Moneys: " + _moneys + "\n";

	ret += "Pokemon: \n";
	if (_pokemons.size() > 6){
	    for (int i = 0; i < 6; i++){
		ret += _pokemons.get(i) + "\t";
	    }
	    
	}
	else {

	    for (Pokemon p: _pokemons){
		ret += p + "\t";
	    }
	}


	return ret;
    }


}
