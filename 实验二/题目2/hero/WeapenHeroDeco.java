package hero;

/**
 * Created by CHEN on 2019/11/12.
 */
public class WeapenHeroDeco extends  Decorator{

    public WeapenHeroDeco(FeHero feHero) {
        super(feHero);
        this.defence *=2;
    }


    @Override
    public void status() {
        System.out.println("attack="+  this.attack+",defence"+ this.defence);
        System.out.println("status=gigantize");
    }

}
