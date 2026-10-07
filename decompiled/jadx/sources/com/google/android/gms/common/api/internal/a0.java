package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2058b;

    public /* synthetic */ a0(Object obj, Object obj2) {
        this.f2058b = obj;
        this.f2057a = obj2;
    }

    public void a(Status status, boolean z4) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f2057a)) {
            map = new HashMap((Map) this.f2057a);
        }
        synchronized (((Map) this.f2058b)) {
            map2 = new HashMap((Map) this.f2058b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.j(status));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((a0) this.f2058b).f2058b).remove((TaskCompletionSource) this.f2057a);
    }

    public a0() {
        this.f2057a = Collections.synchronizedMap(new WeakHashMap());
        this.f2058b = Collections.synchronizedMap(new WeakHashMap());
    }
}
