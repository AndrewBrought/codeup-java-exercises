package AbstractLecture.pokemon;

public class Charizard extends Pokemon implements FireType{

    public Charizard(int hp, String name, String trainer){
        super(hp, name, trainer);
    }

    @Override
    public void fireBlast() {
        System.out.println("Charizard use fire blast!");
    }

    @Override
    public void flameWheel() {
        System.out.println("Charizard use flame wheel!");
    }

    @Override
    public void ember() {
        System.out.println("Charizard use ember!");
    }

    @Override
    public void attack() {
        System.out.println("Charizard attacks...");
    }
}
