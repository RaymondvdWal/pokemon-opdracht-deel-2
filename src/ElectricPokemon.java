import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType() {
        return "electric";
    }

    public List<String> getAttacks() {
        return attacks;
    }

    List<String> attacks = Arrays.asList("thunderPunch","electroBall","thunder","voltTackle");

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName()+ " punches "+enemy.getName()+" with a electrified fist "+
                "and deals 35 damage " +enemy.getName()+ " HP is now decreased to "+ (enemy.getHp()-35));
        enemy.setHp(enemy.getHp()-35);
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName()+ " hurls an electric orb at " +enemy.getName()+ " and deals 40 damage "+
                enemy.getName()+ " HP is now decreased to "+ (enemy.getHp()-40));
        enemy.setHp(enemy.getHp()-40);
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName()+ " drops a wicked thunderbolt at " +enemy.getName()+ " and hits it for 75 damage "
                +enemy.getName()+ " HP is now decreased to "+ (enemy.getHp()-75));
        enemy.setHp(enemy.getHp()-75);
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName()+ " electrifies itself and charges " +enemy.getName()+ " this caused 80 damage "
                + " ,but it has also damaged " +name.getName()+ " for 25 HP " +enemy.getName()+
                " HP is now decreased to "+ (enemy.getHp()-80)+ " and " +name.getName()+ " HP is decreased to"+
                (name.getHp()-80));
        enemy.setHp(enemy.getHp()-80);
        name.setHp(name.getHp()-25);
    }
}
