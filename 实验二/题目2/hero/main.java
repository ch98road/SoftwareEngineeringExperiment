package hero;

/**
 * Created by CHEN on 2019/11/12.
 */
public class main {


    public static void main(String[] args) {

        WeapenHeroDeco weapenHeroDeco = new WeapenHeroDeco(new FeHero( ));
        weapenHeroDeco.status();
        System.out.println( );
        WeapenHeroDeco weapenHeroDeco1 = new WeapenHeroDeco(new ArmourHeroDeco(new FeHero()));
        weapenHeroDeco1.status();
    }
}
