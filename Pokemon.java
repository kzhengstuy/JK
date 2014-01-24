import java.util.ArrayList;


public  class Pokemon {

    int _level = 1;
    int _hp;
    int _atk;
    int _def;
    int _spA;
    int _spD;
    int _spd;
    int _maxHP;
    String _type;
    String _name;
    boolean _isFainted;


    ArrayList<String> moves = new ArrayList<String>();


    public Pokemon(String name){
        _name = name;
        _hp = _level*10 + 10;
        _atk = _level + 10;
        _def = _level + 10;
        _spA = _level + 10;
        _spD = _level + 10;
        _spd = _level + 10;
        _maxHP = _hp;
        _isFainted = false;
    }

    public String toString(){

	String retStr = "";
	retStr += "Name:" + _name + "\n";
	retStr += "HP:" + _hp + "\n";
	retStr += "Attack:" + _atk + "\n";
	retStr += "Defense:" + _def + "\n";
	retStr += "Special Attack:" + _spA + "\n";
	retStr += "Special Defense:" + _spD + "\n";
        retStr += "Speed:" + _spd + "\n";
	return retStr;
	

    }
}

   
