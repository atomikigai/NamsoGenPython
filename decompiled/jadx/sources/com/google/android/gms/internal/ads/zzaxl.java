package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxl extends zzaxt {
    private final StackTraceElement[] zzh;

    public zzaxl(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10, StackTraceElement[] stackTraceElementArr) {
        super(zzawfVar, "XiB4JwXCMuAhsrPKvk3dS2LvKyxjCmXSaJ2VZGWg6jlAdLRjKnhTMhSQBaeXXZDY", "3gV4tnMlvvkjR90RI+zlkPr5OOXNb6rIM0OBAfjFnhQ=", zzasfVar, i, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzavw zzavwVar = new zzavw((String) this.zze.invoke(null, stackTraceElementArr));
            synchronized (this.zzd) {
                try {
                    this.zzd.zzF(zzavwVar.zza.longValue());
                    if (zzavwVar.zzb.booleanValue()) {
                        this.zzd.zzac(true != zzavwVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        this.zzd.zzac(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
