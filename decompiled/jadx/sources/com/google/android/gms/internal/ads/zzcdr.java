package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import i6.d;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcdr {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcdr(zzccf zzccfVar) {
        Context context = zzccfVar.getContext();
        this.zza = context;
        this.zzb = p.C.f2979c.w(context, zzccfVar.zzn().f5213a);
        this.zzc = new WeakReference(zzccfVar);
    }

    public static /* bridge */ /* synthetic */ void zze(zzcdr zzcdrVar, String str, Map map) {
        zzccf zzccfVar = (zzccf) zzcdrVar.zzc.get();
        if (zzccfVar != null) {
            zzccfVar.zzd("onPrecacheEvent", map);
        }
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        d.f5219b.post(new zzcdq(this, str, str2, str3, str4));
    }

    public final void zzh(String str, String str2, int i) {
        d.f5219b.post(new zzcdo(this, str, str2, i));
    }

    public final void zzj(String str, String str2, long j4) {
        d.f5219b.post(new zzcdp(this, str, str2, j4));
    }

    public final void zzn(String str, String str2, int i, int i10, long j4, long j10, boolean z4, int i11, int i12) {
        d.f5219b.post(new zzcdn(this, str, str2, i, i10, j4, j10, z4, i11, i12));
    }

    public final void zzo(String str, String str2, long j4, long j10, boolean z4, long j11, long j12, long j13, int i, int i10) {
        d.f5219b.post(new zzcdm(this, str, str2, j4, j10, j11, j12, j13, z4, i, i10));
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcdj zzcdjVar) {
        return zzt(str);
    }

    public void release() {
    }

    public void zzp(int i) {
    }

    public void zzq(int i) {
    }

    public void zzr(int i) {
    }

    public void zzs(int i) {
    }
}
