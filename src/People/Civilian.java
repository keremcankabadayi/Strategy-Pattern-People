package People;

import Characters.Characters;
import interfaces.Fight;
import interfaces.Heal;
import interfaces.Move;

public class Civilian extends Characters {
	
	public Civilian() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Civilian(Fight fight, Move move, Heal heal) {
		
		super(fight, move, heal);
	}

}
