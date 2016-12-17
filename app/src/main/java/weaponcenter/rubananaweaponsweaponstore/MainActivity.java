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

        String[] fotos = new String[] {
                "https://lh3.googleusercontent.com/-cuC8gA_HptY/UkCNmBqWNHI/AAAAAAAAB4Y/6vv_gJeT9Ic/s800/20130923_143839.jpg"
                ,"http://s00.yaplakal.com/pics/pics_original/7/2/4/2618427.jpg"
                ,"https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTON_Iy5X1YCiqTroDDBk5yBUAFWxiVnzrhqGGJunsH6Dn4FfYu"
                ,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQahOh_fAvCwnTgLUDPBa9HUzZxd2aAY2P-Vxi4RAQUAPa6ddco"
                ,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUh8ZuEa9PKDivGtae9DO2_dC5R-55T8SqIzn0SPvdtSUYpgbG6RXpXhc"
                ,"https://i.ytimg.com/vi/zV0bPd6lQAM/hqdefault.jpg?custom=true&w=168&h=94&stc=true&jpg444=true&jpgq=90&sp=68&sigh=IZNo2mBJ2hi_lw8hlrzSu-yEqoc"
                ,"http://s01.riotpixels.net/data/94/a3/94a3f484-68cb-4e04-be43-db190dac66b7.png/artwork.xcom-enemy-unknown.1385x799.2012-09-09.161.png"
                ,"http://i58.photobucket.com/albums/g277/dransifl/IMG_9459-1.jpg"
                ,"https://pp.vk.me/c618129/v618129093/157e8/RfqNx0Ext1I.jpg"
                ,"https://johnsonarms.files.wordpress.com/2013/02/20130214-162209.jpg"
                ,"https://s-media-cache-ak0.pinimg.com/236x/a6/72/b8/a672b86abd11faa7032560c1fb7601fc.jpg"
                ,"http://orig03.deviantart.net/55de/f/2014/334/b/9/sci_fi_weapon_concept_by_dustycrosley-d887m5c.jpg"
                ,"https://s-media-cache-ak0.pinimg.com/236x/be/43/c3/be43c3b35d7ec8a4081762ee5bfc5e4b.jpg"
                ,"http://fc01.deviantart.net/fs70/f/2010/321/2/8/plazma_gun_by_nitro_killer-d332460.jpg"
                ,"https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b6bf6f34678071.56d950eae8d51.jpg"
                ,"http://samlib.ru/img/s/shemelin_f_n/engineer/23.jpg"
                ,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTj6DWRK6FFnSZyDHsdOiSMa_k56XzikighMBw_EK1mQtzBjsAkoA"
                ,"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTTxC5kdkIl3Sz_Mtzq2aR4diZwzF8nFUyXoQyfkgMA-Z6p6HHq"
                ,"http://pic.xenomorph.ru/2016-09/1474141455_commission_sci_fi_sword_by_ah_kai-d9dv2cq.png.jpg"
                ,"https://i11.fotocdn.net/s21/96/public_pin_l/303/2539728479.jpg"
                ,"https://s-media-cache-ak0.pinimg.com/originals/95/ef/67/95ef67f9a45d05c464cccec3b35bda9e.png"
                ,"https://i08.fotocdn.net/s21/93/public_pin_l/303/2539728476.jpg"
                ,"https://cdnb1.artstation.com/p/assets/images/images/001/306/681/large/weijian-liew-katana6.jpg?1444066276"
        };

        оружие = new Weapon[23];
        оружие[0] = new Weapon("Винчестер 'Шерлок'", 450, fotos[0]);
        оружие[1] = new Weapon("Сверчек Офисный", 50, fotos[1]);
        оружие[2] = new Weapon("Турболазер 'Ледокол'", 1685, fotos[2]);
        оружие[3] = new Weapon("АнтиДалек 'ДокторКто'", 1200, fotos[3] );
        оружие[4] = new Weapon("Н-винтовка Мк1+Мк2", 4250, fotos[4]);
        оружие[5] = new Weapon("АнтиДалек фермерский", 125, fotos[5]);
        оружие[6] = new Weapon("Лазерная Штурмовая/окопная винтовка ", 1245, fotos[6]);
        оружие[7] = new Weapon("Футур Револьвер", 680, fotos[7]);
        оружие[8] = new Weapon("GN-808", 1100, fotos[8]);
        оружие[9] = new Weapon("Снайперский турболазер", 1850, fotos[9]);
        оружие[10] = new Weapon("ОФИ 'Оффи'", 950, fotos[10]);
        оружие[11] = new Weapon("XTRZ-435149", 860, fotos[11]);
        оружие[12] = new Weapon("CDI 'Контрабандист'", 735, fotos[12]);
        оружие[13] = new Weapon("Плазменная пушка 'Makarov'", 2400, fotos[13]);
        оружие[14] = new Weapon("Пучковый бластер+Пульсар", 2055, fotos[14]);
        оружие[15] = new Weapon("Лазерная снайперская винтовка", 1780, fotos[15]);
        оружие[16] = new Weapon("Плазменная снайперская винтовка 'SVD'", 5200, fotos[16]);
        оружие[17] = new Weapon("Гвардейский клинок Литии", 8000, fotos[17]);
        оружие[18] = new Weapon("Клинок Древних Родонтинов- рассы первого поколения", 120000, fotos[18]);
        оружие[19] = new Weapon("Кристальный клинок АстроШумеров", 4500, fotos[19]);
        оружие[20] = new Weapon("Клинок СпэйсЭльфов", 9300, fotos[20]);
        оружие[21] = new Weapon("Меч Темной материи", 50000, fotos[21]);
        оружие[22] = new Weapon("Шокер для Крысолюдов", 20, fotos[22]);

        ListView listView = (ListView) findViewById(R.id.Табличище);
        int itemLayout = android.R.layout.simple_list_item_1;
        Adapturus adapter = new Adapturus(this, itemLayout, оружие);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Weapon  выбранноеОружие = оружие[position];
              Intent intent = new Intent(MainActivity.this, SecondActivity.class);
              intent.putExtra("ОРУЖИЕ",выбранноеОружие);
              startActivity(intent);
          }
        });





        }


    }

