package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private String[] scientistsName;
    private String[] scientistsSpeciality;
    private MyAdapter adapter;
    private int[] image = {R.drawable.zafar_iqbal,R.drawable.jagadish_chandra_bose,R.drawable.muhammad_qudrat_i_khuda,R.drawable.jamal_nazrul_islam,R.drawable.mohammad_kaykobad,R.drawable.syed_akhter_hossain,R.drawable.abdur_sattar_khan,R.drawable.arun_kumar_basak,R.drawable.shahriar_manzoor,R.drawable.fazlul_rahman_khan,R.drawable.prafulla_chandra_ray,R.drawable.tanzima_hashem,R.drawable.hiranmay_sen_gupta,
            R.drawable.m_a_wazed_miah,R.drawable.maqsudul_alam,R.drawable.nasima_akhter,R.drawable.samir_kumar_saha,R.drawable.senjuti_saha,R.drawable.hasibun_naher,R.drawable.shah_m_faruque,R.drawable.m_afzal_hossain};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        scientistsName = getResources().getStringArray(R.array.scientist);
        scientistsSpeciality = getResources().getStringArray(R.array.speciality);
        listView = findViewById(R.id.listViewId);

        adapter = new MyAdapter(scientistsName,scientistsSpeciality,image,ListActivity.this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = scientistsName[position].toString();
                Intent intent = new Intent(ListActivity.this,ProfileActivity.class);
                intent.putExtra("scientist_Name",value);
                startActivity(intent);
            }
        });


    }
}