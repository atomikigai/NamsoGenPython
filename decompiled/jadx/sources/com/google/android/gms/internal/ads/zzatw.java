package com.google.android.gms.internal.ads;

import a5.f;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzatw implements PackageManager$OnChecksumsReadyListener {
    final zzgfa zza = zzgfa.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksumC = f.c(list.get(i));
                if (apkChecksumC.getType() == 8) {
                    zzgfa zzgfaVar = this.zza;
                    zzgcb zzgcbVarZzf = zzgcb.zzi().zzf();
                    byte[] value = apkChecksumC.getValue();
                    zzgfaVar.zzc(zzgcbVarZzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc("");
    }
}
