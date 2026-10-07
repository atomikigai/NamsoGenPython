package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends androidx.fragment.app.s implements l {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final WeakHashMap f2094i0 = new WeakHashMap();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Map f2095f0 = Collections.synchronizedMap(new r.e(0));

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f2096g0 = 0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Bundle f2097h0;

    @Override // androidx.fragment.app.s
    public final void A(int i, int i10, Intent intent) {
        super.A(i, i10, intent);
        Iterator it = this.f2095f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i, i10, intent);
        }
    }

    @Override // androidx.fragment.app.s
    public final void C(Bundle bundle) {
        super.C(bundle);
        this.f2096g0 = 1;
        this.f2097h0 = bundle;
        for (Map.Entry entry : this.f2095f0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.s
    public final void E() {
        this.N = true;
        this.f2096g0 = 5;
        Iterator it = this.f2095f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.N = true;
        this.f2096g0 = 3;
        Iterator it = this.f2095f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.s
    public final void J(Bundle bundle) {
        for (Map.Entry entry : this.f2095f0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.s
    public final void K() {
        this.N = true;
        this.f2096g0 = 2;
        Iterator it = this.f2095f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.s
    public final void L() {
        this.N = true;
        this.f2096g0 = 4;
        Iterator it = this.f2095f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f2095f0;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(da.v.i("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f2096g0 > 0) {
            new zzi(Looper.getMainLooper()).post(new b3.b(this, lifecycleCallback, str, 2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final LifecycleCallback e(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f2095f0.get(str));
    }

    @Override // androidx.fragment.app.s
    public final void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.n(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f2095f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
