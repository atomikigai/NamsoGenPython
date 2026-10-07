package com.google.android.gms.internal.ads;

import e6.h2;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzekm implements zzcxv {
    boolean zza = false;
    final /* synthetic */ zzefe zzb;
    final /* synthetic */ zzcao zzc;

    public zzekm(zzekn zzeknVar, zzefe zzefeVar, zzcao zzcaoVar) {
        this.zzb = zzefeVar;
        this.zzc = zzcaoVar;
    }

    private final synchronized void zze(h2 h2Var) {
        int i = 1;
        if (true == ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzft)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzeff(i, h2Var));
    }

    @Override // com.google.android.gms.internal.ads.zzcxv
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new h2(i, zzekn.zze(this.zzb.zza, i), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxv
    public final synchronized void zzb(h2 h2Var) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(h2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcxv
    public final synchronized void zzc(int i, String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzekn.zze(this.zzb.zza, i);
            }
            zze(new h2(i, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxv
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
