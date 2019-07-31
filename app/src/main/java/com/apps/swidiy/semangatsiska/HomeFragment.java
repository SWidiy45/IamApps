package com.apps.swidiy.semangatsiska;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private PostingAdapter adapter;
    private ArrayList<Posting> postings = new ArrayList<>();


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        addData();

        //recyclerView = (RecyclerView)findViewByID(R.id.recycler_view);
        //adapter = new PostingAdapter(postings);
       // RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomeFragment .this);
        //recyclerView.setLayoutManager(layoutManager);
        //recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        PostingAdapter adapter = new PostingAdapter(getContext(), postings);
        recyclerView.setAdapter(adapter);
        return view;
    }

    void addData(){
        postings = new ArrayList<>();
        postings.add(new Posting("Vs", "Pilih ga minum  atau ga makan? "));
        postings.add(new Posting("No Title", "Kunci Kesuksesan adalah keberanian \n Berani menghadapi resika \n Berani menjalani prosesnya"));
        postings.add(new Posting("What The", "Gilaa tugas numpuk bangeet"));
        postings.add(new Posting("Mamah", "Sebuah cahaya yang tak pernah padam \n Mentari yang selelu bersinar \n Angin sejuk yang membuat hati tenang \n Mamah..."));
        postings.add(new Posting("", "Astagfirullahaladzim \n Nugas bembur bagai Qudaa \n Sampai lupa orangtua"));
        postings.add(new Posting("Semangaaaat Jangan nyerah", "Aku bisa \n Aku pasti bisa \n Kutamau berputus asa \n Bila ku gagal itu tak mengapa \n Setidaknya ku tlah mencoba"));
        postings.add(new Posting("Ingeet", "Jangan lupa dengerin radio \n hadeeeeuh"));
        postings.add(new Posting("", "Niat nugas, Buka laptop eh malah ngedrakor"));
        postings.add(new Posting("Wadidaw", ""));
    }

    /*@Override
    protected void onCreat(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);*/

}
