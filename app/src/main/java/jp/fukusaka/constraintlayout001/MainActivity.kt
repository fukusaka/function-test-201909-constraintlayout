package jp.fukusaka.constraintlayout001

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableBoolean
import jp.fukusaka.constraintlayout001.databinding.ActivityMainBinding

private const val KEY_IS_PADDING = "isPadding"

class MainActivity : AppCompatActivity() {

    val isPadding = ObservableBoolean(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        savedInstanceState?.let {
            isPadding.set(it.getBoolean(KEY_IS_PADDING, false))
        }

        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
            .let { binding ->
                binding.lifecycleOwner = this
                binding.handler = this
            }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean(KEY_IS_PADDING, isPadding.get())
    }
}
