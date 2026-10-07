package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import e6.t;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzawp extends zzaxt {
    private final Activity zzh;
    private final View zzi;

    public zzawp(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10, View view, Activity activity) {
        super(zzawfVar, "s0uE9hdlawP+tYGHYSI6i0EWhWy7Tdc9XW5A0finsHWGrmLjBRDuDmlHo7fmD8mf", "0+4i1BfON/tZfr/zJSlwHIdubE7ug8Met8dVp0E6y4I=", zzasfVar, i, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi == null) {
            return;
        }
        Boolean bool = (Boolean) t.f3437d.f3440c.zza(zzbcn.zzcI);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, this.zzi, this.zzh, bool);
        synchronized (this.zzd) {
            try {
                this.zzd.zzc(((Long) objArr[0]).longValue());
                this.zzd.zze(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.zzd.zzd((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
