package br.com.dgimenes.dagger2_and_kotlin;

import dagger.Module;
import dagger.Provides;
import kotlin.reflect.jvm.internal.impl.javax.inject.Singleton;

@Module
public class EverythingModule {

    @Provides
    @Singleton
    public HelloWorldService getHelloWorldServiceInstance() {
        return new HelloWorldService();
    }

}
