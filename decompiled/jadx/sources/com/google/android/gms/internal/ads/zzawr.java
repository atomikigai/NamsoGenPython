package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzawr extends zzaxt {
    public zzawr(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10) {
        super(zzawfVar, "cASF9v3LVjFjcts3pzkxEpbZ/yZ0Z6rgUJw8wYZADCZYBHbsegUqurxqMOQQnwLa", "YV8d9qma0OL6XD+53oet9uRH00OzaYnpRo+iusl6DCM=", zzasfVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzaa(3);
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzasf zzasfVar = this.zzd;
            int i = 1;
            if (true == zBooleanValue) {
                i = 2;
            }
            zzasfVar.zzaa(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
