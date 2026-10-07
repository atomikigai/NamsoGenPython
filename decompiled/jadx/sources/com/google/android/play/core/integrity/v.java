package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f2692a;

    public static synchronized o a(Context context) {
        try {
            if (f2692a == null) {
                m mVar = new m(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                mVar.a(context);
                f2692a = mVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2692a;
    }
}
