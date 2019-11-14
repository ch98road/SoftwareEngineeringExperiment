package hero;

/**
 * Created by CHEN on 2019/11/12.
 */
public class ArmourHeroDeco extends Decorator {


    public ArmourHeroDeco(FeHero feHero) {
        super(feHero);
        this.attack *= 2;
        status();
    }

    @Override
    public void status() {
        System.out.println("attack=" + this.attack + ",defence" + this.defence);
        System.out.println("status=furious");
    }

}
