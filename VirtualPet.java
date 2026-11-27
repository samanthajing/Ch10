public class VirtualPet {
	private int hunger;
    private int happiness;
    private String name;
	public VirtualPet(String name) {
		name = name;
		hunger = 5; 
		happiness = 5;
	}
	VirtualPet(String name, int hunger, int happiness) {
		name = name;
		hunger = hunger;
		happiness = happiness;
	}
	public String getName() {
        return name;
    }
    public int getHunger() {
        return hunger; 
	}
    public int getHappiness() {
        return happiness;
	}
	public void feed() {
		if (hunger>=3) hunger-=3;
	}
	public void play() {
		if (hunger<=9) hunger+=1;
		if (happiness<=8) happiness+=2;
	}
	public boolean isHappy() {
		return happiness>=7 && hunger<=4; 
	}
	public String toString() {
		return name + " (hunger " + hunger + ", happiness " + happiness + ")";
	}
}
