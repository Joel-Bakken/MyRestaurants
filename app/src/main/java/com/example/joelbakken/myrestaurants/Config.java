package com.example.joelbakken.myrestaurants;

/**
 * Created by joelbakken on 9/5/17.
 */

@interface Config {
    Class<BuildConfig> constants();

    int sdk();
}
