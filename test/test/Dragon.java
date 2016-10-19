package test;

public class Dragon extends Sprite{

	private String name = "Noname";

	public Dragon(){
	}
	
	public Dragon(String name){
		this.name = name;
	}
	
	@Override
	public void move(String target) {
		System.out.println(String.format("Dragon %s move to " + target, name));
	}
}
