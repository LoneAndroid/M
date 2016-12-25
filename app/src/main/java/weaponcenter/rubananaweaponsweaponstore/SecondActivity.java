package weaponcenter.rubananaweaponsweaponstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Weapon weapon =  (Weapon) getIntent().getSerializableExtra("ОРУЖИЕ");
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        if (!TextUtils.isEmpty(weapon.foto)) {
            Picasso.with(getApplicationContext())
                    .load(weapon.foto)
                    .fit()
                    .into(imageView);
        }


        TextView modelTextView = (TextView) findViewById(R.id.model_text_view);
        modelTextView.setText(weapon.model);  // title

        TextView costTextView = (TextView) findViewById(R.id.cost_text_view);
        costTextView.setText(String.valueOf(weapon.ценаВМежМировойПятерочке));

        TextView prodavecTextView = (TextView) findViewById(R.id.prodavec_text_view);
        prodavecTextView.setText(weapon.Продавец);

        TextView infoTextView = (TextView) findViewById(R.id.info_text_view);
        infoTextView.setText(weapon.Инфо);
    }
}
