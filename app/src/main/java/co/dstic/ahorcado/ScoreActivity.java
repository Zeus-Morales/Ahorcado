package co.dstic.ahorcado;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class ScoreActivity extends Activity {

    Game gm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        ListView lstPuntuaciones = (ListView)findViewById(R.id.lstPuntuaciones);
        gm = new Game(this);
        ArrayList<String> results = gm.getScore();
        lstPuntuaciones.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, results));
    }

    public void Regresar(View v)
    {
        finish();
    }

    public void Borrar(View v)
    {
        gm.deleteScore();
        finish();
    }
}
