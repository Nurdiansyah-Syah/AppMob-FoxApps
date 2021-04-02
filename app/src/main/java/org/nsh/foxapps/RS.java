package org.nsh.foxapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void  onCreate (Bundle isicle){
        super.onCreate(isicle);
        String[] listRS = new String[] {"RS Awal Bross", "RS Eka Hospital", "RS Jiwa Tampan", "RS Arifin Ahmad", "RS Aulia"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listRS));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("RS Awal Bross")) {
                a = new Intent(this, RSAwalBross.class);

            } else if (pilihan.equals("RS Eka Hospital")) {
                a = new Intent(this, RSEkaHospital.class);

            } else if (pilihan.equals("RS Jiwa Tampan")) {
                a = new Intent(this, RSJiwaTampan.class);

            } else if (pilihan.equals("RS Arifin Ahmad")) {
                a = new Intent(this, RSArifinAhmad.class);

            } else if (pilihan.equals("RS Aulia")) {
                a = new Intent(this, RSAulia.class);

            }
            startActivity(a);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
