//file for the Player class
//this guy is the main character, the one the player plays as


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

}
