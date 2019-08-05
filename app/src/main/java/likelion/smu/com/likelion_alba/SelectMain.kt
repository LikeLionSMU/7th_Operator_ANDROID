package likelion.smu.com.likelion_alba

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_select.*


class SelectMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_select)

        // 참여 버튼
        btnLeft.setOnClickListener {
            val intent = Intent(this, Participation::class.java)
            startActivity(intent)
            finish()
        }

        // 생성 버튼
        btnRight.setOnClickListener {
            val intent = Intent(this,Making::class.java)
            startActivity(intent)
            finish()
        }

    }


}