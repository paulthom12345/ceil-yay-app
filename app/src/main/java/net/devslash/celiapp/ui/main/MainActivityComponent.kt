package net.devslash.celiapp.ui.main

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules=[MainActivityModule::class])
interface MainActivityComponent: AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainActivity>()
}