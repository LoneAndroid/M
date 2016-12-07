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

        оружие = new Weapon[23];
        оружие[0] = new Weapon("Винчестер 'Шерлок'", 450, R.drawable.w1);
        оружие[1] = new Weapon("Сверчек Офисный", 50, R.drawable.w2);
        оружие[2] = new Weapon("Турболазер 'Ледокол'", 1685, R.drawable.w3);
        оружие[3] = new Weapon("АнтиДалек 'ДокторКто'", 1200, R.drawable.w4 );
        оружие[4] = new Weapon("Н-винтовка Мк1+Мк2", 4250, R.drawable.w5);
        оружие[5] = new Weapon("АнтиДалек фермерский", 125, R.drawable.w6);
        оружие[6] = new Weapon("Лазерная Штурмовая/окопная винтовка ", 1245, R.drawable.w7);
        оружие[7] = new Weapon("Футур Револьвер", 680, R.drawable.w8);
        оружие[8] = new Weapon("GN-808", 1100, R.drawable.w9);
        оружие[9] = new Weapon("Снайперский турболазер", 1850, R.drawable.w10);
        оружие[10] = new Weapon("ОФИ 'Оффи'", 950, R.drawable.w11);
        оружие[11] = new Weapon("XTRZ-435149", 860, R.drawable.w12);
        оружие[12] = new Weapon("CDI 'Контрабандист'", 735, R.drawable.w13);
        оружие[13] = new Weapon("Плазменная пушка 'Makarov'", 2400, R.drawable.w14);
        оружие[14] = new Weapon("Пучковый бластер+Пульсар", 2055, R.drawable.w15);
        оружие[15] = new Weapon("Лазерная снайперская винтовка", 1780, R.drawable.w16);
        оружие[16] = new Weapon("Плазменная снайперская винтовка 'SVD'", 5200, R.drawable.w17);
        оружие[17] = new Weapon("Гвардейский клинок Литии", 8000, R.drawable.s1);
        оружие[18] = new Weapon("Клинок Древних Родонтинов- рассы первого поколения", 120000, R.drawable.s2);
        оружие[19] = new Weapon("Кристальный клинок АстроШумеров", 4500, R.drawable.s3);
        оружие[20] = new Weapon("Клинок СпэйсЭльфов", 9300, R.drawable.s4);
        оружие[21] = new Weapon("Меч Темной материи", 50000, R.drawable.s5);
        оружие[22] = new Weapon("Шокер для Крысолюдов", 20, R.drawable.s6);

        ListView listView = (ListView) findViewById(R.id.Табличище);
        int itemLayout = android.R.layout.simple_list_item_1;
        Adapturus adapter = new Adapturus(this, itemLayout, оружие);
        listView.setAdapter(adapter);




        }


    }

