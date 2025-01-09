package com.murtuza.dagger.learning.di.component

import dagger.Component
import com.murtuza.dagger.learning.di.ActivityScope
import com.murtuza.dagger.learning.di.module.ActivityModule
import com.murtuza.dagger.learning.ui.main.MainActivity

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

}
