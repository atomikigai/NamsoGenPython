package com.google.android.gms.internal.consent_sdk;

import java.util.HashSet;
import l9.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzw {
    private final zzx zza;
    private final zzch zzb;
    private int zzc = 0;
    private f zzd = f.f6875a;

    public zzw(zzx zzxVar, zzch zzchVar) {
        this.zza = zzxVar;
        this.zzb = zzchVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    public final zzz zza() throws zzg {
        String str;
        int i = this.zzb.zzf;
        this.zza.zzc.zzh(i == 8);
        int i10 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                this.zzc = 3;
                break;
            case 4:
                this.zzc = 2;
                break;
            case 5:
                this.zzc = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(this.zzb.zzc)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(this.zzb.zzc)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        zzch zzchVar = this.zzb;
        int i11 = zzchVar.zzg;
        int i12 = i11 - 1;
        if (i11 == 0) {
            throw null;
        }
        if (i12 == 1) {
            this.zzd = f.f6877c;
        } else {
            if (i12 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.zzd = f.f6876b;
        }
        String str2 = zzchVar.zza;
        zzbm zzbmVar = str2 == null ? null : new zzbm(zzchVar.zzb, str2);
        this.zza.zzc.zzj(new HashSet(zzchVar.zzd));
        for (zzcg zzcgVar : this.zzb.zze) {
            int i13 = zzcgVar.zzb;
            int i14 = i13 - 1;
            if (i13 == 0) {
                throw null;
            }
            if (i14 == 0) {
                str = null;
            } else if (i14 == 1) {
                str = "write";
            } else if (i14 != 2) {
                str = null;
            } else {
                str = "clear";
            }
            if (str != null) {
                zzx zzxVar = this.zza;
                zzxVar.zza.zzb(str, zzcgVar.zza, zzxVar.zzb);
            }
        }
        return new zzz(this.zzc, this.zzd, zzbmVar, null);
    }
}
