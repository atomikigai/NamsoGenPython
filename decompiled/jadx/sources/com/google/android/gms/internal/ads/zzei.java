package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzei implements zzdm {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzei(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzeg zzegVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzegVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzeg zzm() {
        zzeg zzegVar;
        List list = zza;
        synchronized (list) {
            try {
                zzegVar = list.isEmpty() ? new zzeg(null) : (zzeg) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final zzdl zzb(int i) {
        Handler handler = this.zzb;
        zzeg zzegVarZzm = zzm();
        zzegVarZzm.zzb(handler.obtainMessage(i), this);
        return zzegVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final zzdl zzc(int i, Object obj) {
        Handler handler = this.zzb;
        zzeg zzegVarZzm = zzm();
        zzegVarZzm.zzb(handler.obtainMessage(i, obj), this);
        return zzegVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final zzdl zzd(int i, int i10, int i11) {
        Handler handler = this.zzb;
        zzeg zzegVarZzm = zzm();
        zzegVarZzm.zzb(handler.obtainMessage(1, i10, i11), this);
        return zzegVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final void zzf(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final boolean zzg(int i) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final boolean zzi(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final boolean zzj(int i, long j4) {
        return this.zzb.sendEmptyMessageAtTime(2, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final boolean zzk(zzdl zzdlVar) {
        return ((zzeg) zzdlVar).zzc(this.zzb);
    }
}
