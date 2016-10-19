
package test;

public class Sprite {

	public String getResourceKey() {
		return resourceKey;
	}

	public void setResourceKey(String resourceKey) {
		this.resourceKey = resourceKey;
	}

	private String resourceKey;
	
	public void move(String target){
		System.out.println("Sprite move to " + target);
	}
	
}
