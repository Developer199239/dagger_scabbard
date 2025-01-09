package com.murtuza.dagger.learning.di.component

import dagger.Component
import com.murtuza.dagger.learning.di.FragmentScope
import com.murtuza.dagger.learning.di.module.FragmentModule
import com.murtuza.dagger.learning.ui.home.HomeFragment

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(fragment: HomeFragment)

}
