package br.com.dgimenes.dagger2_and_kotlin;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = EverythingModule.class)
public interface ServicesComponent {
    void inject(Object object);
}
