package croom.konekom.in.grupee;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import croom.konekom.in.grupee.listener.NetworkResponseListener;
import croom.konekom.in.grupee.network.FetchData;

class MainActivity extends AppCompatActivity implements View.OnClickListener, NetworkResponseListener {

    private Toolbar toolbar;
    private FloatingActionButton likedDetails;
    private FetchData fetchData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiseView();
        setSupportActionBar(toolbar);

    }

    private void initialiseView() {
        toolbar = findViewById(R.id.toolbar);
        likedDetails = toolbar.findViewById(R.id.likedDetails);
        likedDetails.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.likedDetails:

                break;
        }
    }

    @Override
    public void preRequest() {

    }

    @Override
    public void postRequest(String result) {

    }
}
