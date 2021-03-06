package weaponcenter.rubananaweaponsweaponstore;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by LoneAndroid on 11/6/1918.
 */

public class Adapturus extends ArrayAdapter {

    public Adapturus(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // создаём элемент для geirb с фотографией и двумя nhtvz xtnshtvz полями gjkzvb
        View view = LayoutInflater.from(getContext()).inflate(R.layout.weapon_item, parent, false);

        Weapon weapon = (Weapon) getItem(position);

        TextView textView = (TextView) view.findViewById(R.id.model_text_view);
        textView.setText(weapon.model);

        TextView textViewW = (TextView) view.findViewById(R.id.textView3);
        textViewW.setText(String.valueOf(weapon.ценаВМежМировойПятерочке));

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView2);
        if (!TextUtils.isEmpty(weapon.foto)) {
            Picasso.with(getContext())
                    .load(weapon.foto)
                    .fit()
                    .into(imageView);
        }

//        ImageView pistolImaageView = (ImageView) findViewById(R.pistol);

        // возращаем созданный элементик Огня, Земли, Воды и Воздуха.
        return view;
    }

}
