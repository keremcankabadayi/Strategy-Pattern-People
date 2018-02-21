package People;

import Characters.Characters;
import interfaces.Fight;
import interfaces.Heal;
import interfaces.Move;
import interfaces.fight.Gun;
import interfaces.heal.LightHeal;
import interfaces.move.Run;

public class Soldier extends Characters {
	
	public Soldier() {
		// TODO Auto-generated constructor stub
		this.fight = new Gun();
		this.move = new Run();
		this.heal = new LightHeal();
	}
	
	public Soldier (Fight fight, Move move, Heal heal) {
		
		super(fight, move, heal);
	}

}
