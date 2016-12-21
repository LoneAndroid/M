package weaponcenter.rubananaweaponsweaponstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainTitle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_title);

        View bigLayout = findViewById(R.id.activity_main_title);
        bigLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent = new Intent(MainTitle.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

