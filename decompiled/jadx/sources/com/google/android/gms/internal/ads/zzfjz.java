package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import e6.o3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzfjz {
    public static zzfka zza(Context context, int i) {
        boolean zBooleanValue;
        if (zzfko.zza()) {
            int i10 = i - 2;
            if (i10 != 20 && i10 != 21) {
                switch (i10) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbeg.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbeg.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbeg.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzbeg.zze.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfkc(context, i);
            }
        }
        return new zzfle();
    }

    public static zzfka zzb(Context context, int i, int i10, o3 o3Var) {
        zzfka zzfkaVarZza = zza(context, i);
        if (zzfkaVarZza instanceof zzfkc) {
            zzfkaVarZza.zzi();
            zzfkaVarZza.zzn(i10);
            Bundle bundle = o3Var.f3382x;
            String str = o3Var.A;
            zzfkaVarZza.zzf(android.support.v4.media.session.a.I(bundle));
            if (zzfkk.zze(str)) {
                zzfkaVarZza.zze(str);
            }
        }
        return zzfkaVarZza;
    }
}
