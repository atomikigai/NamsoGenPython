package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n9.g;
import q9.a;
import z7.y1;
import za.c;
import za.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f2696b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzef f2697a;

    public FirebaseAnalytics(zzef zzefVar) {
        i0.i(zzefVar);
        this.f2697a = zzefVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f2696b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f2696b == null) {
                        f2696b = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2696b;
    }

    public static y1 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzef zzefVarZzg = zzef.zzg(context, null, null, null, bundle);
        if (zzefVarZzg == null) {
            return null;
        }
        return new a(zzefVarZzg);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = c.f11536m;
            return (String) Tasks.await(((c) g.d().b(d.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e4) {
            throw new IllegalStateException(e4.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f2697a.zzH(activity, str, str2);
    }
}
