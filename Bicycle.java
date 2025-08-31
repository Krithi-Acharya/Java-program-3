package Transport;

public class Bicycle extends vehicle {

	public Bicycle(String id) {
		super(id);
		System.out.println("Bicycle constructor() called");
	}

	@Override
	public void deliver(String item, String place) {
		// TODO Auto-generated method stub
		System.out.println("Delivering  "+ item + " to place "+ place + " by bicycle");

	}

}
