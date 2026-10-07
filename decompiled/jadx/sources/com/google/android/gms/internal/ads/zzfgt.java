package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfgt {
    static Task zza;
    public static u6.a zzb;
    private static final Object zzc = new Object();

    public static Task zza(Context context) {
        Task task;
        zzb(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }

    public static void zzb(Context context, boolean z4) {
        synchronized (zzc) {
            try {
                if (zzb == null) {
                    zzb = new com.google.android.gms.internal.appset.zzr(context);
                }
                Task task = zza;
                if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z4 && zza.isComplete()))) {
                    u6.a aVar = zzb;
                    i0.j(aVar, "the appSetIdClient shouldn't be null");
                    zza = aVar.getAppSetIdInfo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
