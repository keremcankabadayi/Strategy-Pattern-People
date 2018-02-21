import java.util.ArrayList;

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

		for (Characters c : list) {

			System.out.println("----------------");
			System.out.println("I'm a " + c.getClass().getSimpleName() + "\n" + c.tryToFight() + "\n" + c.tryToMove()
					+ "\n" + c.tryToHeal());

		}

		// Turn civil into a badass
		civil.fightType = new Gun();
		civil.moveType = new Run();
		civil.healType = new HeavyHeal();

		for (Characters c : list) {

			System.out.println("----------------");
			System.out.println("I'm a " + c.getClass().getSimpleName() + "\n" + c.tryToFight() + "\n" + c.tryToMove()
					+ "\n" + c.tryToHeal());

		}

	}

}
