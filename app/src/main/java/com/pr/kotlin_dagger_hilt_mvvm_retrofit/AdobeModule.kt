package com.pr.kotlin_dagger_hilt_mvvm_retrofit

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class AdobeModule {

    @Provides
    fun prvidePremierePro():PremierePro{
        val premierePro=PremierePro()
        return premierePro
    }

}