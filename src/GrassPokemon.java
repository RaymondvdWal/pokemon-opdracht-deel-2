import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType() {
        return "grass";
    }


    public List<String> getAttacks() {
        return attacks;
    }

    List<String> attacks = Arrays.asList("leafStorm","solarBeam","leechSeed","leaveBlade");

    int damage;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals("water")) {
            setDamage(160);
            System.out.println("Its super effective!");
        } else setDamage(80);
        System.out.println(name.getName()+ " whips up a leafstorm and does "+getDamage()+ " damage. " +enemy.getName()+
                " HP is now decreased to "+ (enemy.getHp()-getDamage()));
        enemy.setHp(enemy.getHp()-getDamage());
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals("water")){
            setDamage(150);
            System.out.println("Its super effective!");
        } else setDamage(75);
        System.out.println(name.getName()+ " gathers light and blasts a solarbeam to "+enemy.getName()+
                " and does "+getDamage()+ " damage. " +enemy.getName()+ " HP is now decreased to "+ (enemy.getHp()-getDamage()));
        enemy.setHp(enemy.getHp()-getDamage());
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals("water")){
            setDamage(50);
            System.out.println("Its super effective!");
        } else setDamage(25);
        System.out.println(name.getName()+ " planted a seed and steals "+getDamage()+" HP from "+enemy.getName()+
               ", " +enemy.getName()+ " HP is now decreased to "+ (enemy.getHp()-getDamage())+ " and "+name.getName()+
                " HP is increased to "+(name.getHp()+getDamage()));
        enemy.setHp(enemy.getHp()-getDamage());
        name.setHp(name.getHp()+getDamage());
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals("water")){
            setDamage(90);
            System.out.println("Its super effective!");
        } else setDamage(45);
        System.out.println(name.getName()+ " handles a sharp leaf to create a leaveblade and cuts " +enemy.getName()+
               " for "+getDamage()+" damage. " +enemy.getName()+ " HP is now decreased to "+ (enemy.getHp()-getDamage()));
        enemy.setHp(enemy.getHp()-getDamage());
    }
}
