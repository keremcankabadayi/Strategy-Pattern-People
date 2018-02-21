package Characters;

import interfaces.Fight;
import interfaces.Heal;
import interfaces.Move;
import interfaces.fight.Peace;
import interfaces.heal.NoHeal;
import interfaces.move.Walk;

public abstract class Characters {

	protected Fight fight = new Peace();
	protected Heal heal = new NoHeal();
	protected Move move = new Walk();

	public Characters() {
		// TODO Auto-generated constructor stub

		System.out.println("New Character create");
	}

	public Characters(Fight fight, Move move, Heal heal) {
		// TODO Auto-generated constructor stub

		this.fight = fight;
		this.move = move;
		this.heal = heal;
	}

	public void figting() {
		// TODO Auto-generated method stub
		fight.toFight();
	}

	public void moving() {
		// TODO Auto-generated method stub
		move.toMove();
	}

	public void healing() {
		// TODO Auto-generated method stub
		heal.toHeal();
	}

	public void setFighting(Fight f) {

		this.fight = f;
	}

	public void setMoving(Move m) {

		this.move = m;
	}

	public void setHealing(Heal h) {

		this.heal = h;
	}

}
