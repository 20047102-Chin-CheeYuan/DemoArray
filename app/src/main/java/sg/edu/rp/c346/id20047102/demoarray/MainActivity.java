package sg.edu.rp.c346.id20047102.demoarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        ArrayList<String> fruits;
        fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        fruits.remove(fruits.size()-1);
        fruits.add("dragon fruit");

        String text = "Fruits\n";
        text += "=====\n";

        for(int i = 0; i < fruits.size(); i++){
            text += fruits.get(i) + "\n";
        }


        String theFruit = fruits.get(1);

        tv.setText(text);

    }
}
