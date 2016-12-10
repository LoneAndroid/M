package weaponcenter.rubananaweaponsweaponstore;

import java.io.Serializable;

/**
 * Created by MONROZE! on 12/3/2316.
 */
public class Weapon implements Serializable {
    String model;   // title
    int ценаВМежМировойПятерочке;
    int ex;

    public Weapon(String model, int ценаВМежМировойПятерочке, int ex) {
        this.model = model;
        this.ценаВМежМировойПятерочке = ценаВМежМировойПятерочке;
        this.ex = ex;


    }
}
