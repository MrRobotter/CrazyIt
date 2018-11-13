package com.joinyon.crazyit.testbasemodule;

import com.joinyon.basemodule.base.BaseApplication;
import com.joinyon.basemodule.utils.PreferencesUtils;

public class MyApp extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        PreferencesUtils.init(this);
    }
}
