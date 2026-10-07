package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaeq extends LifecycleCallback {
    private final List zza;

    private zzaeq(l lVar, List list) {
        super(lVar);
        this.mLifecycleFragment.a("PhoneAuthActivityStopCallback", this);
        this.zza = list;
    }

    public static void zza(Activity activity, List list) {
        l fragment = LifecycleCallback.getFragment(activity);
        if (((zzaeq) fragment.e(zzaeq.class, "PhoneAuthActivityStopCallback")) == null) {
            new zzaeq(fragment, list);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.zza) {
            this.zza.clear();
        }
    }
}
