/**
 * Created by Anatoliy on 09.06.2017.
 */
public class Knight extends Character {
    iWeaponBehavior iWeaponBehavior = new AxeBehavior();

    @Override
    public void fight() {
        System.out.println("i am the knight with ");
    }
}
