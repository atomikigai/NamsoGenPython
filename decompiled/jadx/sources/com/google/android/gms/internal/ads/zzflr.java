package com.google.android.gms.internal.ads;

import android.content.Context;
import i6.k;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzflr {
    private final Context zza;
    private final Executor zzb;
    private final k zzc;
    private final zzfko zzd;

    public zzflr(Context context, Executor executor, k kVar, zzfko zzfkoVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = kVar;
        this.zzd = zzfkoVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    public final /* synthetic */ void zzb(String str, zzfkl zzfklVar) {
        zzfka zzfkaVarZza = zzfjz.zza(this.zza, 14);
        zzfkaVarZza.zzi();
        zzfkaVarZza.zzg(this.zzc.zza(str));
        if (zzfklVar == null) {
            this.zzd.zzb(zzfkaVarZza.zzm());
        } else {
            zzfklVar.zza(zzfkaVarZza);
            zzfklVar.zzh();
        }
    }

    public final void zzc(final String str, final zzfkl zzfklVar) {
        if (zzfko.zza() && ((Boolean) zzbeg.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb(str, zzfklVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
