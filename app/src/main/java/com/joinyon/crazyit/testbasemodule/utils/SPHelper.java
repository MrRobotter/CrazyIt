package com.joinyon.crazyit.testbasemodule.utils;

import com.joinyon.basemodule.utils.PreferencesUtils;

public class SPHelper {
    private static final String TOKEN = "token";
    private static final String UID = "uid";
    private static final String USER_ID="user_id";

    public static String getToken() {
        return PreferencesUtils.getString(TOKEN, "");
    }


    public static String getUid() {
        return PreferencesUtils.getString(UID, "");
    }


    public static String getUserId() {
        return PreferencesUtils.getString(USER_ID, "");
    }


}
