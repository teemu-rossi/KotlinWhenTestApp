package pw.rossi.whentestapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView debugTextLabel = findViewById(R.id.debug_text_label);
        String result = new TestClass().testMethod(TestClass.TestType.ONE);
        debugTextLabel.setText(result);
        Log.w("MainActivity", result);
    }
}
