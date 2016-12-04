package weaponcenter.rubananaweaponsweaponstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Weapon[] оружие;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        оружие = new Weapon[5];
        оружие[0] = new Weapon("Винчестер 'Шерлок'", 450, R.drawable.w1);
        оружие[1] = new Weapon("Сверчек Офисный", 50, R.drawable.w2);
        оружие[2] = new Weapon("Турболазер 'Ледокол'", 1685, R.drawable.w3);
        оружие[3] = new Weapon("АнтиДалек 'ДокторКто'", 1200, R.drawable.w4 );
        оружие[4] = new Weapon("Н-винтовка Мк1+Мк2", 4250, R.drawable.w5);
//        оружие[5] = new Weapon("");
//        оружие[6] = new Weapon("");
//        оружие[7] = new Weapon("");
//        оружие[8] = new Weapon("");
//        оружие[9] = new Weapon("");
//        оружие[10] = new Weapon("");
//        оружие[11] = new Weapon("");
//        оружие[12] = new Weapon("");
//        оружие[13] = new Weapon("");
//        оружие[14] = new Weapon("");
//        оружие[15] = new Weapon("");
//        оружие[16] = new Weapon("");
//        оружие[17] = new Weapon("");
//        оружие[18] = new Weapon("");
//        оружие[19] = new Weapon("");
//        оружие[20] = new Weapon("");
//        оружие[21] = new Weapon("");
//        оружие[22] = new Weapon("");

        ListView listView = (ListView) findViewById(R.id.Табличище);
        int itemLayout = android.R.layout.simple_list_item_1;
        ArrayAdapter adapter = new ArrayAdapter<Weapon>(this, itemLayout, оружие);
        listView.setAdapter(adapter);


    }

}