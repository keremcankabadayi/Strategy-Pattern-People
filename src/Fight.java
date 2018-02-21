

public interface Fight {

	String Fight();

}

class Gun implements Fight {

	@Override
	public String Fight() {
		// TODO Auto-generated method stub
		return "Fight with a gun!";
	}

}

class Knife implements Fight {

	@Override
	public String Fight() {
		// TODO Auto-generated method stub
		return "Fight with a knife!";
	}
	
}

class Peace implements Fight {

	@Override
	public String Fight() {
		// TODO Auto-generated method stub
		return "I don't fight";
	}
	
	
	
}