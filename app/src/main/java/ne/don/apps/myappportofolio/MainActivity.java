package ne.don.apps.myappportofolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button)findViewById(R.id.btn_spotstream);
        btn1.setOnClickListener(this);
        btn2= (Button)findViewById(R.id.btn_scores);
        btn2.setOnClickListener(this);
        btn3= (Button)findViewById(R.id.btn_libapp);
        btn3.setOnClickListener(this);
        btn4= (Button)findViewById(R.id.btn_buildit);
        btn4.setOnClickListener(this);
        btn5= (Button)findViewById(R.id.btn_xyzreader);
        btn5.setOnClickListener(this);
        btn6= (Button)findViewById(R.id.btn_capstone);
        btn6.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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


    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_spotstream :
                Toast.makeText(getApplicationContext(),"This will launch "+btn1.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_scores:
                Toast.makeText(getApplicationContext(),"This will launch "+btn2.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_libapp:
                Toast.makeText(getApplicationContext(),"This will launch "+btn3.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_buildit:
                Toast.makeText(getApplicationContext(),"This will launch "+btn4.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_xyzreader:
                Toast.makeText(getApplicationContext(),"This will launch "+btn5.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(getApplicationContext(),"This will launch "+btn6.getText().toString(),Toast.LENGTH_LONG).show();
                break;


        }
    }
}
