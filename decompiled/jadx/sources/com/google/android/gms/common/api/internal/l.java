package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    void a(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback e(Class cls, String str);

    Activity g();

    void startActivityForResult(Intent intent, int i);
}
