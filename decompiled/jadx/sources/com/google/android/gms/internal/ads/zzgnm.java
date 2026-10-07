package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgnm {
    public static final zzgne zza = new zzgnk(null);

    public static zzgnj zza(zzgou zzgouVar) {
        zzgfy zzgfyVar;
        zzgng zzgngVar = new zzgng();
        zzgngVar.zzb(zzgouVar.zza());
        Iterator it = zzgouVar.zze().iterator();
        while (it.hasNext()) {
            for (zzgos zzgosVar : (List) it.next()) {
                int iZzf = zzgosVar.zzf() - 2;
                if (iZzf == 1) {
                    zzgfyVar = zzgfy.zza;
                } else if (iZzf == 2) {
                    zzgfyVar = zzgfy.zzb;
                } else {
                    if (iZzf != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzgfyVar = zzgfy.zzc;
                }
                int iZza = zzgosVar.zza();
                String strZze = zzgosVar.zze();
                if (strZze.startsWith("type.googleapis.com/google.crypto.")) {
                    strZze = strZze.substring(34);
                }
                zzgngVar.zza(zzgfyVar, iZza, strZze, zzgosVar.zzb().name());
            }
        }
        if (zzgouVar.zzc() != null) {
            zzgngVar.zzc(zzgouVar.zzc().zza());
        }
        try {
            return zzgngVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
