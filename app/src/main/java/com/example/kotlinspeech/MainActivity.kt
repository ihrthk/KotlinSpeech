package com.example.kotlinspeech


import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.coroutineScope
import com.example.kotlinspeak.sample.*
import com.example.kotlinspeech.sample.Equals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    lateinit var tvContent: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvContent = findViewById(R.id.tv_content)

//        lifecycle.coroutineScope.launch {
//
//        }

//        viewLifecycleOwner.lifecycleScope.launch{
//
//        }


//        val readString = response.body()?.source()?.buffer?.also {
//            it.request(Long.MAX_VALUE)
//        }?.readString(Charset.forName("UTF-8"))

//        apiService.getUserInfo("ihrthk").enqueue(object : Callback<Repo?> {
//            override fun onResponse(call: Call<Repo?>, response: Response<Repo?>) {
//                Log.d(TAG, "onResponse() called with: call = $call, response = ${response.body()}")
//            }
//
//            override fun onFailure(call: Call<Repo?>, t: Throwable) {
//                t.printStackTrace()
//            }
//        })


        showMsg()

        Looper.getMainLooper().setMessageLogging {
            Log.d(TAG, "loop $it")
        }

        //equals
        val a: String = "a"
        val b: String = "b"
        println(Equals.check(a, b))
        //log
        DebugLog.log(MainActivity::class.java.simpleName, "msg")
        //dp2px
        ScreenUtils.dp2px(3f)
        //try
        showPrice()
        //set,get
        Config.getName2()
        //bean
        println(BaseEntity().toString())

//        lifecycle.coroutineScope.launch {
//            val calc = calc()
//            tvContent.text = calc
//        }
        lifecycle.coroutineScope.launch {
            val string = calc()
            tvContent.text = string
        }
    }

    private fun showMsg() = lifecycle.coroutineScope.launch {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val apiService = retrofit.create(ApiService::class.java)
        val repo = apiService.getUserInfo("ihrthk")
        tvContent.text = repo.toString()
    }

    suspend fun calc() = withContext(Dispatchers.IO) {
        delay(3_000)
        "Nihao"
    }
}






