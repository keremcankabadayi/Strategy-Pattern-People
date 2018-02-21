package interfaces.heal;

import interfaces.Heal;

public class NoHeal implements Heal{

	@Override
	public void toHeal() {
		// TODO Auto-generated method stub
		System.out.println("Can't heal");
	}
	

}
