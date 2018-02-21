

public interface Heal {
	
	String Heal();
}

class HeavyHeal implements Heal {

	@Override
	public String Heal() {
		// TODO Auto-generated method stub
		return "provide heavy heal";
	}
	
}

class LightHeal implements Heal {

	@Override
	public String Heal() {
		// TODO Auto-generated method stub
		return "provide light heal";
	}
	
	
}

class NoHeal implements Heal{

	@Override
	public String Heal() {
		// TODO Auto-generated method stub
		return "I can't heal";
	}
	
	
}