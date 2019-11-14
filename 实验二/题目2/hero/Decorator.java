package hero;

/**
 * Created by CHEN on 2019/11/12.
 */
public abstract class Decorator extends FeHero{


    public Decorator(FeHero feHero){
        attack = feHero.attack;
        defence = feHero.defence;
    }
}
