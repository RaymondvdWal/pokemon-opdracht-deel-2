import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{


    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType() {
        return "water";
    }

    public List<String> getAttacks() {
        return attacks;
    }

    List<String> attacks = Arrays.asList("surf","hydroPump","hydroCanon","rainDance");

    int damage;
    boolean rainDancing;
    int turn;

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isRainDancing() {
        return rainDancing;
    }

    public void setRainDancing(boolean rainDancing) {
        this.rainDancing = rainDancing;
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(rainDancing);
        System.out.println(getTurn());
        if (getTurn()==3){
            setRainDancing(false);
            setDamage(50);
        }
        if (isRainDancing()) {
            setDamage(60);
            setTurn(getTurn()+1);
            System.out.println(rainDancing);
        }
        else setDamage(50);

        if (enemy.getType().equals("fire")){
            setDamage(getDamage()*2);
            System.out.println("Its super effective!");
        } else setDamage(getDamage());

        System.out.println(name.getName()+ " swamps the entire battlefield with a giant wave and does "+getDamage()+
                " damage. " +enemy.getName()+ " HP is now decreased to "+ (enemy.getHp()-(getDamage())));
        enemy.setHp(enemy.getHp()-getDamage());
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        if (getTurn()==3){
            setRainDancing(false);
            setDamage(60);
        }
        if (isRainDancing()) {
            setDamage(75);
            setTurn(getTurn()+1);
        }
        else setDamage(60);

        if (enemy.getType().equals("fire")){
            setDamage(getDamage()*2);
            System.out.println("Its super effective!");
        } else setDamage(getDamage());

        System.out.println(name.getName()+ " blasts a hydropump with high pressure to " +enemy.getName()+
               " and does "+getDamage()+ " damage. " +enemy.getName()+ " HP is now decreased to " +(enemy.getHp()-(getDamage())));
        enemy.setHp(enemy.getHp()-getDamage());
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        if (getTurn()==3){
            setRainDancing(false);
            setDamage(95);
        }
        if (isRainDancing()) {
            setDamage(110);
            setTurn(getTurn()+1);
        }
        else setDamage(95);

        if (enemy.getType().equals("fire")){
            setDamage(getDamage()*2);
            System.out.println("Its super effective!");
        } else setDamage(getDamage());

        System.out.println(name.getName()+ " hits " +enemy.getName()+ " with a huge watery blast " +
               "and does "+getDamage()+ " damage. " +enemy.getName()+ " HP is now decreased to "+(enemy.getHp()-(getDamage())));
        enemy.setHp(enemy.getHp()-getDamage());
    }

    void rainDance(@NotNull Pokemon name, Pokemon enemy) {
        System.out.println(name.getName()+ " summons a heavy rain and powers up water moves for three rounds, "
                +name.getName()+ " attack is now increased ");
        System.out.println(rainDancing);
        setRainDancing(true);
        setTurn(0);
        System.out.println(rainDancing);
    }
}
