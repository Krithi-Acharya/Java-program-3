package Transport;

public abstract class vehicle {
	protected String id;
		public vehicle(String id) {
		this.id=id;
		System.out.println("Vehicle constructor() is called");
	}
	public abstract void deliver(String item, String place);
}
	