package br.com.dgimenes.dagger2_and_kotlin;

import android.content.Context;

public class HelloWorldService {

    public String getHelloWorld(Context context) {
        return context.getResources().getString(R.string.hello_world);
    }
}
