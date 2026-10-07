package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import e6.h2;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfgw implements zzcwp {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcad zzc;

    public zzfgw(Context context, zzcad zzcadVar) {
        this.zzb = context;
        this.zzc = zzcadVar;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final synchronized void zzdB(h2 h2Var) {
        if (h2Var.f3314a != 3) {
            this.zzc.zzl(this.zza);
        }
    }
}
