package pw.rossi.whentestapp

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

enum class TestType {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN
}

class TestClass {
    fun testMethod(type: TestType): String {
        val testFloat: Float = when (type) {
            TestType.ONE -> 1000.0f
            TestType.TWO -> 5000.0f
            TestType.THREE -> 10000.0f
            TestType.FOUR -> 1609.34f
            TestType.FIVE -> 8046.72f
            TestType.SIX -> 16093.4f
            else -> 5f
        }
        val before = "Before alloc type=$type testFloat=$testFloat\n"
        Log.e("TestClass", "Before alloc type=$type testFloat=$testFloat")

        val dummyObjects = List(200_000) { 1024 }

        Log.e("TestClass", "After alloc type=$type testFloat=$testFloat")
        return before + "After alloc type=$type testFloat=$testFloat"
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        debug_text_label.text = TestClass().testMethod(TestType.ONE)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
