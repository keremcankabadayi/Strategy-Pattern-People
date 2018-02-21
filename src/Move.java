
public interface Move {

	String Move();
}

class Run implements Move {

	@Override
	public String Move() {
		// TODO Auto-generated method stub
		return "I run";
	}

}

class Walk implements Move {

	@Override
	public String Move() {
		// TODO Auto-generated method stub
		return "I walk";
	}

}
