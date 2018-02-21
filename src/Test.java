import java.util.ArrayList;

import Characters.Characters;
import People.Civilian;
import People.Medic;
import People.Soldier;
import interfaces.fight.Gun;
import interfaces.heal.HeavyHeal;
import interfaces.move.Run;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Characters civil = new Civilian();
		Characters medic = new Medic();
		Characters soldier = new Soldier();
		
		ArrayList<Characters> list = new ArrayList<>();
		
		list.add(civil);
		list.add(medic);
		list.add(soldier);

		for(Characters c : list) {
			
			System.out.println("----------------");
			System.out.println("I am a " + c.getClass().getSimpleName());
			c.figting();
			c.moving();
			c.healing();
		}
		
		civil.setFighting(new Gun());
		civil.setMoving(new Run());
		civil.setHealing(new HeavyHeal());
		
		for(Characters c : list) {
			
			System.out.println("----------------");
			System.out.println("I am a " + c.getClass().getSimpleName());
			c.figting();
			c.moving();
			c.healing();
		}
	}

}
