package com.google.android.gms.internal.ads;

import e6.t;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxh extends zzaxt {
    public zzaxh(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10) {
        super(zzawfVar, "5M/doPlP18zj3rcFgQUszE+WSqXh/st9yUF5JdFdktMd87cDlxgzyepiU5bej2uF", "KwLCo2LsichRi68Y4oRLpNy6fN1z6Wq88wujVx/pAjo=", zzasfVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) t.f3437d.f3440c.zza(zzbcn.zzcU);
        bool.booleanValue();
        zzavl zzavlVar = new zzavl((String) this.zze.invoke(null, this.zza.zzb(), bool));
        synchronized (this.zzd) {
            this.zzd.zzj(zzavlVar.zza);
            this.zzd.zzC(zzavlVar.zzb);
        }
    }
}
