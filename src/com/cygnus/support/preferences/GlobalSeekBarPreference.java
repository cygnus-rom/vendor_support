package com.cygnus.support.preferences;

import android.content.Context;
import android.util.AttributeSet;

public class GlobalSeekBarPreference extends CustomSeekBarPreference {

    public GlobalSeekBarPreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setPreferenceDataStore(new GlobalSettingsStore(context.getContentResolver()));
    }

    public GlobalSeekBarPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPreferenceDataStore(new GlobalSettingsStore(context.getContentResolver()));
    }

    public GlobalSeekBarPreference(Context context) {
        super(context, null);
        setPreferenceDataStore(new GlobalSettingsStore(context.getContentResolver()));
    }
}
