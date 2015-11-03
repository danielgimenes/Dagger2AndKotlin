package br.com.dgimenes.dagger2_and_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import javax.inject.Inject

public class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var service: HelloWorldService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (getApplication() as Application).getInjector().inject(this)
        (findViewById(R.id.hello_world) as TextView).setText(HelloWorldService().getHelloWorld(this));
    }
}
