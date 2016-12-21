package weaponcenter.rubananaweaponsweaponstore;

import java.io.Serializable;

/**
 * Created by Chaos! on 12/3/2316.
 */
public class Weapon implements Serializable {
    String model;   // title
    int ценаВМежМировойПятерочке;
    String foto;
    String Продавец;

    public Weapon(String model, int ценаВМежМировойПятерочке, String foto, String Продавец) {
        this.model = model;
        this.ценаВМежМировойПятерочке = ценаВМежМировойПятерочке;
        this.foto = foto;
        this.Продавец = Продавец;


    }
}
