package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends com.google.android.gms.common.api.v implements com.google.android.gms.common.api.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f2149a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2150b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f2151c;

    public t0(WeakReference weakReference) {
        com.google.android.gms.common.internal.i0.j(weakReference, "GoogleApiClient reference must not be null");
        this.f2151c = weakReference;
        com.google.android.gms.common.api.o oVar = (com.google.android.gms.common.api.o) weakReference.get();
        new s0(this, oVar != null ? ((i0) oVar).f2119b.getLooper() : Looper.getMainLooper());
    }

    public final void a(Status status) {
        synchronized (this.f2150b) {
            synchronized (this.f2150b) {
            }
        }
    }
}
