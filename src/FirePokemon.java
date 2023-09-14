import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);

    }

    List<String> attacks = Arrays.asList("fireLash","flameThrower","pyroBall","inferno");


    public List<String> getAttacks() {
        return attacks;
    }

    int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals("grass")){
            setDamage(50);
            System.out.println("Its super effective!");
        } else setDamage(25);
        System.out.println(name.getName()+ " unleashes a firelash and does " +getDamage()+ " damage. " +enemy.getName()+
                " HP is now decreased to "+ (enemy.getHp()-getDamage()));
        enemy.setHp(enemy.getHp()-getDamage());
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals("grass")) {
            setDamage(110);
            System.out.println("Its super effective!");
        } else setDamage(55);
        System.out.println(name.getName()+ " burns "+enemy.getName()+" with a huge flamethrower and does "+getDamage()+
                        " damage. " +enemy.getName()+ " HP is now decreased to "+ (enemy.getHp()-getDamage()));
        enemy.setHp(enemy.getHp()-getDamage());
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals("grass")) {
            setDamage(150);
            System.out.println("Its super effective!");
        } else setDamage(75);
        System.out.println(name.getName()+ " ignites and launches a pyroball to " +enemy.getName()+
                " and does "+getDamage()+ " damage. " +enemy.getName()+ " HP is now decreased to "+ (enemy.getHp()-getDamage()));
        enemy.setHp(enemy.getHp()-getDamage());
    }

    void inferno(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals("grass")){
            setDamage(120);
            System.out.println("Its super effective!");
        } else setDamage(60);
        System.out.println(name.getName()+ " engulfing the target in an intense inferno and does "+getDamage()+ " damage. "
                +enemy.getName()+ " HP is now decreased to "+ (enemy.getHp()-getDamage()));
        enemy.setHp(enemy.getHp()-getDamage());
    }

    public String getType() {
        return "fire";
    }
}
