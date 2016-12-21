package weaponcenter.rubananaweaponsweaponstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;

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


        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(weapon.model);  // title
    }
}
