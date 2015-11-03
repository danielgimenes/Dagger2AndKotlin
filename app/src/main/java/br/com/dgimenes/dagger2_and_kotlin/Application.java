package br.com.dgimenes.dagger2_and_kotlin;

import br.com.dgimenes.dagger2_and_kotlin.ServicesComponent;

public class Application extends android.app.Application {

    ServicesComponent servicesComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        servicesComponent = DaggerServicesComponent.builder()
                .everythingModule(new EverythingModule()).build();
    }

    public ServicesComponent getInjector() {
        return servicesComponent;
    }
}
