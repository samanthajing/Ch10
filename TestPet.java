public class TestPet {
    
    public static void main(String[] args) {
        VirtualPet mochi = new VirtualPet("Mochi");
        VirtualPet rex = new VirtualPet("Rex", 9, 9);
        System.out.println(mochi);
        System.out.println(rex.isHappy());
        mochi.play();
        mochi.play();
        System.out.println(mochi);
        mochi.feed();
        mochi.feed();
        mochi.feed();
        System.out.println(mochi.getHunger());
        System.out.println(mochi.isHappy());
        rex.play();
		rex.play();
        System.out.println(rex);
    }
}

