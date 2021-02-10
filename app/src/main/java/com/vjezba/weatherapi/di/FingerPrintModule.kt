/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vjezba.weatherapi.di

import android.content.Context
import com.vjezba.weatherapi.ui.utilities.FingerPrintUtils
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext


@InstallIn(ActivityComponent::class)
@Module
class FingerPrintModule {

    @Provides
    fun provideFingerPrintData(@ActivityContext context: Context): FingerPrintUtils {
        return FingerPrintUtils(context)
    }

}
