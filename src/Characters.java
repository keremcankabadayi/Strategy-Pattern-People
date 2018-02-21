
public class Characters {

	// instant variables for interfaces
	public Fight fightType;
	public Move moveType;
	public Heal healType;

	// Fight, Move and Heal get and set methods
	public String tryToFight() {
		return fightType.Fight();
	}

	public void setFight(Fight newFightType) {
		fightType = newFightType;
	}

	public String tryToMove() {
		return moveType.Move();
	}

	public void setMove(Move newMoveType) {
		moveType = newMoveType;
	}

	public String tryToHeal() {
		return healType.Heal();
	}

	public void setHeal(Heal newHealType) {

		healType = newHealType;

	}

}
