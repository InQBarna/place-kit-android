/*
 * Copyright 2020 Supasin Tatiyanupanwong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.tatiyanupanwong.supasin.android.libraries.kits.places;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;

import me.tatiyanupanwong.supasin.android.libraries.kits.internal.Preconditions;
import me.tatiyanupanwong.supasin.android.libraries.kits.places.model.Autocomplete;
import me.tatiyanupanwong.supasin.android.libraries.kits.places.model.Place;
import me.tatiyanupanwong.supasin.android.libraries.kits.places.model.Status;
import me.tatiyanupanwong.supasin.android.libraries.kits.places.net.PlacesClient;

/**
 * The main entry point for Place Kit APIs.
 *
 * @since 1.0.0
 */
public final class PlaceKit {

    private static final PlacesFactory FACTORY = PlacesPlatform.get().getFactory();

    /**
     * Creates an instance of {@link PlacesClient} for a given {@link Context}.
     *
     * @return an instance of {@link PlacesClient} for a given {@link Context}.
     */
    public static @NonNull PlacesClient createClient(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        return FACTORY.createClient(context);
    }

    public static @NonNull Autocomplete createAutocomplete() {
        return FACTORY.createAutocomplete();
    }

    public static Place getPlaceFromIntent(Intent intent) {
        return createAutocomplete().getPlaceFromIntent(intent);
    }

    public static Status getStatusFromIntent(Intent intent) {
        return createAutocomplete().getStatusFromIntent(intent);
    }

}
