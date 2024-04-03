package com.javarnbridge;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class CounterModule extends ReactContextBaseJavaModule {
    private int count = 0;

    public CounterModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "Counter";
    }

    @ReactMethod
    public void increase() {
        count+=2;
    }

    @ReactMethod
    public void decrease() {
        count--;
    }

    @ReactMethod
    public void getCount(Callback callback) {
        callback.invoke(count);
    }
}
