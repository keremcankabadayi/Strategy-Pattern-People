package People;

import Characters.Characters;
import interfaces.Fight;
import interfaces.Heal;
import interfaces.Move;
import interfaces.fight.Knife;
import interfaces.heal.HeavyHeal;

public class Medic extends Characters {
	
	public Medic() {
		// TODO Auto-generated constructor stub
		super();
		this.heal = new HeavyHeal();
		this.fight = new Knife();
		
	}
	
	public Medic(Fight fight, Move move, Heal heal) {
		
		super(fight, move, heal);
	}
	

}
