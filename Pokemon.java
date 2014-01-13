import java.util.ArrayList;


public abstract class Pokemon {

    int _level = 1;
    int _hp;
    int _atk;
    int _def;
    int _spA;
    int _spD;
    int _spd;
    int _maxHP;
    String _name;

    ArrayList<String> moves = new ArrayList<String>();


    public Pokemon(String name){
	_name = name;
	_hp = _level *10;
	_atk = _level + 10;
	_def = _level + 10;
	_spA = _level + 10;
	_spD = _level + 10;
	_spd = _level + 10;
	_maxHP = _hp;

    }


    
    public abstract void move1();
    public abstract void move2();
    public abstract void move3();
    public abstract void move4();
    
					
    
    
}
