package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import d6.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbyr implements zzaym {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzbyr(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z4) {
        p pVar = p.C;
        if (pVar.f2998y.zzp(this.zza)) {
            synchronized (this.zzb) {
                try {
                    if (this.zzd == z4) {
                        return;
                    }
                    this.zzd = z4;
                    if (TextUtils.isEmpty(this.zzc)) {
                        return;
                    }
                    if (this.zzd) {
                        pVar.f2998y.zzf(this.zza, this.zzc);
                    } else {
                        pVar.f2998y.zzg(this.zza, this.zzc);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        zzb(zzaylVar.zzj);
    }
}
