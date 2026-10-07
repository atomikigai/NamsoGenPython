package com.google.android.gms.internal.p001authapiphone;

import a.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzu extends i {
    final /* synthetic */ TaskCompletionSource zza;

    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void onResult(Status status) {
        if (status.f2045a == 6) {
            this.zza.trySetException(i0.n(status));
        } else {
            a.o(status, null, this.zza);
        }
    }
}
