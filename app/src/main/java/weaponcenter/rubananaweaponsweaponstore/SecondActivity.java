package weaponcenter.rubananaweaponsweaponstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Weapon оружие= (Weapon) getIntent().getSerializableExtra("ОРУЖИЕ");

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(оружие.model);  // title
    }
}
