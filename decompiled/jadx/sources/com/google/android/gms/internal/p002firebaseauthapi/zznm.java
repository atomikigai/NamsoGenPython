package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zznm {
    public static final zzrp zza = new zznl(null);

    public static zzrv zza(zzcl zzclVar) {
        zzbu zzbuVar;
        zzrr zzrrVar = new zzrr();
        zzrrVar.zzb(zzclVar.zzb());
        Iterator it = zzclVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzch zzchVar : (List) it.next()) {
                int iZzh = zzchVar.zzh() - 2;
                if (iZzh == 1) {
                    zzbuVar = zzbu.zza;
                } else if (iZzh == 2) {
                    zzbuVar = zzbu.zzb;
                } else {
                    if (iZzh != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzbuVar = zzbu.zzc;
                }
                int iZza = zzchVar.zza();
                String strZzf = zzchVar.zzf();
                if (strZzf.startsWith("type.googleapis.com/google.crypto.")) {
                    strZzf = strZzf.substring(34);
                }
                zzrrVar.zza(zzbuVar, iZza, strZzf, zzchVar.zzc().name());
            }
        }
        if (zzclVar.zza() != null) {
            zzrrVar.zzc(zzclVar.zza().zza());
        }
        try {
            return zzrrVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
