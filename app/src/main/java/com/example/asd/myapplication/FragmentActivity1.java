package com.example.asd.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import static com.example.asd.myapplication.MainActivity.data;


public class FragmentActivity1 extends Fragment {

    static final String ARG_PARAM1 = "param1";

    static String hamburgerName;
    static int hamburgerPrice;
    static int hamburgerImage;

    public FragmentActivity1(){

    }
    @Nullable

    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_fragment1,container,false);
        ListView listview = (ListView)v.findViewById(R.id.listview355);

        ListviewAdapter adapter = new ListviewAdapter(getActivity(),R.layout.activity_itemlist,data);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                hamburgerName =  data.get(position).name;
                hamburgerPrice = data.get(position).price;
                hamburgerImage = data.get(position).image;

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.framelayout,FragmentActivity3.newInstance(data.get(position).image, data.get(position).name, data.get(position).price, data.get(position).text));

                ft.commit();
            }
        });

        return v;

        }
}
