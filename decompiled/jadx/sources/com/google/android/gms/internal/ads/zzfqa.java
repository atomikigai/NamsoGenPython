package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfqa {
    private final Context zza;
    private final Looper zzb;

    public zzfqa(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfqn zzfqnVarZza = zzfqq.zza();
        zzfqnVarZza.zza(this.zza.getPackageName());
        zzfqnVarZza.zzc(2);
        zzfqk zzfqkVarZza = zzfqm.zza();
        zzfqkVarZza.zza(str);
        zzfqkVarZza.zzb(2);
        zzfqnVarZza.zzb(zzfqkVarZza);
        new zzfqb(this.zza, this.zzb, (zzfqq) zzfqnVarZza.zzbr()).zza();
    }
}
