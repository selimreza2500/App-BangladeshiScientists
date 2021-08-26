package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView profileimage;
    private TextView profilename,profiledetails,profilesubtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileimage = findViewById(R.id.profileImageId);
        profilename = findViewById(R.id.profileNameId);
        profilesubtitle = findViewById(R.id.profileSubtitleId);
        profiledetails = findViewById(R.id.profileDetailsId);
        String value = getIntent().getStringExtra("scientist_Name");

        if(value.equals("Zafar Iqbal")){
            setTitle("Zafar Iqbal");
            profileimage.setImageResource(R.drawable.zafar_iqbal);
            profilename.setText("Zafar Iqbal");
            profilesubtitle.setText("Physicist");
            profiledetails.setText(R.string.zafar_iqbal);
        }
        if(value.equals("Jagadish Chandra Bose")){
            setTitle("Jagadish Chandra Bose");
            profileimage.setImageResource(R.drawable.jagadish_chandra_bose);
            profilename.setText("Jagadish Chandra Bose");
            profilesubtitle.setText("Biologist, Physicist, Botanist");
            profiledetails.setText(R.string.jagadish_chandra_bose);
        }
        if(value.equals("Muhammad Qudrat-i-Khuda")){
            setTitle("Muhammad Qudrat-i-Khuda");
            profileimage.setImageResource(R.drawable.muhammad_qudrat_i_khuda);
            profilename.setText("Muhammad Qudrat-i-Khuda");
            profilesubtitle.setText("Organic Chemist");
            profiledetails.setText(R.string.muhammad_qudrat_i_khuda);
        }
        if(value.equals("Jamal Nazrul Islam")){
            setTitle("Jamal Nazrul Islam");
            profileimage.setImageResource(R.drawable.jamal_nazrul_islam);
            profilename.setText("Jamal Nazrul Islam");
            profilesubtitle.setText("Cosmologist");
            profiledetails.setText(R.string.jamal_nazrul_islam);
        }
        if(value.equals("Mohammad Kaykobad")){
            setTitle("Mohammad Kaykobad");
            profileimage.setImageResource(R.drawable.mohammad_kaykobad);
            profilename.setText("Mohammad Kaykobad");
            profilesubtitle.setText("Computer Scientist");
            profiledetails.setText(R.string.mohammad_kaykobad);
        }
        if(value.equals("Syed Akhter Hossain")){
            setTitle("Syed Akhter Hossain");
            profileimage.setImageResource(R.drawable.syed_akhter_hossain);
            profilename.setText("Syed Akhter Hossain");
            profilesubtitle.setText("Computer Scientist");
            profiledetails.setText(R.string.syed_akhter_hossain);
        }
        if(value.equals("Abdus Sattar Khan")){
            setTitle("Abdus Sattar Khan");
            profileimage.setImageResource(R.drawable.abdur_sattar_khan);
            profilename.setText("Abdus Sattar Khan");
            profilesubtitle.setText("Aerospace Scientist");
            profiledetails.setText(R.string.abdus_sattar_khan);
        }
        if(value.equals("Arun Kumar Basak")){
            setTitle("Arun Kumar Basak");
            profileimage.setImageResource(R.drawable.arun_kumar_basak);
            profilename.setText("Arun Kumar Basak");
            profilesubtitle.setText("Physicist");
            profiledetails.setText(R.string.arun_kumar_basak);
        }
        if(value.equals("Shahriar Manzoor")){
            setTitle("Shahriar Manzoor");
            profileimage.setImageResource(R.drawable.shahriar_manzoor);
            profilename.setText("Shahriar Manzoor");
            profilesubtitle.setText("Computer Scientist");
            profiledetails.setText(R.string.shahriar_manzoor);
        }
        if(value.equals("Fazlur_Rahman_Khan")){
            setTitle("Fazlur_Rahman_Khan");
            profileimage.setImageResource(R.drawable.fazlul_rahman_khan);
            profilename.setText("Fazlur_Rahman_Khan");
            profilesubtitle.setText("Greatest Structural Engineer");
            profiledetails.setText(R.string.fazlur_rahman_khan);
        }
        if(value.equals("Prafulla Chandra Ray")){
            setTitle("Prafulla Chandra Ray");
            profileimage.setImageResource(R.drawable.prafulla_chandra_ray);
            profilename.setText("Prafulla Chandra Ray");
            profilesubtitle.setText("Chemist");
            profiledetails.setText(R.string.prafulla_chandra_ray);
        }
        if(value.equals("Tanzima Hashem")){
            setTitle("Tanzima Hashem");
            profileimage.setImageResource(R.drawable.tanzima_hashem);
            profilename.setText("Tanzima Hashem");
            profilesubtitle.setText("Computer Scientist");
            profiledetails.setText(R.string.tanzima_hashem);
        }
        if(value.equals("Hiranmay Sen Gupta")){
            setTitle("Hiranmay Sen Gupta");
            profileimage.setImageResource(R.drawable.hiranmay_sen_gupta);
            profilename.setText("Hiranmay Sen Gupta");
            profilesubtitle.setText("Nuclear physicist");
            profiledetails.setText(R.string.hiranmay_sen_gupta);
        }
        if(value.equals("M. A. Wazed Miah")){
            setTitle("M. A. Wazed Miah");
            profileimage.setImageResource(R.drawable.m_a_wazed_miah);
            profilename.setText("M. A. Wazed Miah");
            profilesubtitle.setText("Physicist");
            profiledetails.setText(R.string.m_a_wazed_miah);
        }
        if(value.equals("Maqsudul Alam")){
            setTitle("Maqsudul Alam");
            profileimage.setImageResource(R.drawable.maqsudul_alam);
            profilename.setText("Maqsudul Alam");
            profilesubtitle.setText("life-science scientist");
            profiledetails.setText(R.string.maqsudul_alam);
        }
        if(value.equals("Nasima Akhter")){
            setTitle("Nasima Akhter");
            profileimage.setImageResource(R.drawable.nasima_akhter);
            profilename.setText("Nasima Akhter");
            profilesubtitle.setText("Specialized in Nuclear Medicine");
            profiledetails.setText(R.string.nasima_akhter);
        }
        if(value.equals("Samir Kumar Saha")){
            setTitle("Samir Kumar Saha");
            profileimage.setImageResource(R.drawable.samir_kumar_saha);
            profilename.setText("Samir Kumar Saha");
            profilesubtitle.setText("Microbiologist");
            profiledetails.setText(R.string.samir_kumar_saha);
        }
        if(value.equals("Senjuti Saha")){
            setTitle("Senjuti Saha");
            profileimage.setImageResource(R.drawable.senjuti_saha);
            profilename.setText("Senjuti Saha");
            profilesubtitle.setText("Speciality in Genetics and Microbiology");
            profiledetails.setText(R.string.senjuti_saha);
        }
        if(value.equals("Hasibun Naher")){
            setTitle("Hasibun Naher");
            profileimage.setImageResource(R.drawable.hasibun_naher);
            profilename.setText("Hasibun Naher");
            profilesubtitle.setText("Mathematician");
            profiledetails.setText(R.string.hasibun_naher);
        }
        if(value.equals("Shah M. Faruque")){
            setTitle("Shah M. Faruque");
            profileimage.setImageResource(R.drawable.shah_m_faruque);
            profilename.setText("Shah M. Faruque");
            profilesubtitle.setText("Environmental and Bacterial Specialist");
            profiledetails.setText(R.string.shah_m_faruque);
        }
        if(value.equals("M Afzal Hossain")) {
            setTitle("M Afzal Hossain");
            profileimage.setImageResource(R.drawable.m_afzal_hossain);
            profilename.setText("M Afzal Hossain");
            profilesubtitle.setText("Agriculturist and Biochemist");
            profiledetails.setText(R.string.m_afzal_hossain);
        }
    }
}