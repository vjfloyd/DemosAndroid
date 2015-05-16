package com.moviles.simpleuserinterface;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MostrarMensajeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mostrar_mensaje);
        Intent intent = getIntent();
        String mensaje = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(mensaje);

        setContentView(textView);



       if (savedInstanceState == null){
        //   getSupportFragmentManager().beginTransaction().add( R.id.container , new PlaceholderFragment() ).commit();
       }



    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static class PlaceholderFragment extends Fragment{

        public PlaceholderFragment(){

        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
                        View rootView = inflater.inflate(R.layout.activity_mostrar_mensaje  , container, false);
            return rootView;
        }

    }
}
