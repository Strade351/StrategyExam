/**
 * Created by Anatoliy on 09.06.2017.
 */
public class King extends Character {
    iWeaponBehavior weaponBehavior = new SwordBehavior();

    @Override
    void fight() {
        System.out.println("i am the king with ");
        weaponBehavior.useWeapon();
    }
}
