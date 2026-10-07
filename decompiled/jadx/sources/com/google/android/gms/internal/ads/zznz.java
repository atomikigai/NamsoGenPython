package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zznz {
    private final zzbt zza;
    private zzfzo zzb = zzfzo.zzn();
    private zzfzr zzc = zzfzr.zzd();
    private zzur zzd;
    private zzur zze;
    private zzur zzf;

    public zznz(zzbt zzbtVar) {
        this.zza = zzbtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzur zzj(zzbp zzbpVar, zzfzo zzfzoVar, zzur zzurVar, zzbt zzbtVar) {
        zzbv zzbvVarZzn = zzbpVar.zzn();
        int iZze = zzbpVar.zze();
        Object objZzf = zzbvVarZzn.zzo() ? null : zzbvVarZzn.zzf(iZze);
        int iZzc = -1;
        if (!zzbpVar.zzw() && !zzbvVarZzn.zzo()) {
            iZzc = zzbvVarZzn.zzd(iZze, zzbtVar, false).zzc(zzen.zzs(zzbpVar.zzk()));
        }
        int i = iZzc;
        for (int i10 = 0; i10 < zzfzoVar.size(); i10++) {
            zzur zzurVar2 = (zzur) zzfzoVar.get(i10);
            if (zzm(zzurVar2, objZzf, zzbpVar.zzw(), zzbpVar.zzb(), zzbpVar.zzc(), i)) {
                return zzurVar2;
            }
        }
        if (zzfzoVar.isEmpty() && zzurVar != null && zzm(zzurVar, objZzf, zzbpVar.zzw(), zzbpVar.zzb(), zzbpVar.zzc(), i)) {
            return zzurVar;
        }
        return null;
    }

    private final void zzk(zzfzq zzfzqVar, zzur zzurVar, zzbv zzbvVar) {
        if (zzurVar == null) {
            return;
        }
        if (zzbvVar.zza(zzurVar.zza) != -1) {
            zzfzqVar.zza(zzurVar, zzbvVar);
            return;
        }
        zzbv zzbvVar2 = (zzbv) this.zzc.get(zzurVar);
        if (zzbvVar2 != null) {
            zzfzqVar.zza(zzurVar, zzbvVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzl(zzbv zzbvVar) {
        zzfzq zzfzqVar = new zzfzq();
        if (this.zzb.isEmpty()) {
            zzk(zzfzqVar, this.zze, zzbvVar);
            if (!zzfwn.zza(this.zzf, this.zze)) {
                zzk(zzfzqVar, this.zzf, zzbvVar);
            }
            if (!zzfwn.zza(this.zzd, this.zze) && !zzfwn.zza(this.zzd, this.zzf)) {
                zzk(zzfzqVar, this.zzd, zzbvVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfzqVar, (zzur) this.zzb.get(i), zzbvVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfzqVar, this.zzd, zzbvVar);
            }
        }
        this.zzc = zzfzqVar.zzc();
    }

    private static boolean zzm(zzur zzurVar, Object obj, boolean z4, int i, int i10, int i11) {
        if (!zzurVar.zza.equals(obj)) {
            return false;
        }
        if (z4) {
            return zzurVar.zzb == i && zzurVar.zzc == i10;
        }
        return zzurVar.zzb == -1 && zzurVar.zze == i11;
    }

    public final zzbv zza(zzur zzurVar) {
        return (zzbv) this.zzc.get(zzurVar);
    }

    public final zzur zzb() {
        return this.zzd;
    }

    public final zzur zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfzo zzfzoVar = this.zzb;
        if (zzfzoVar == null) {
            Iterator<E> it = zzfzoVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzfzoVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzfzoVar.get(zzfzoVar.size() - 1);
        }
        return (zzur) obj;
    }

    public final zzur zzd() {
        return this.zze;
    }

    public final zzur zze() {
        return this.zzf;
    }

    public final void zzg(zzbp zzbpVar) {
        this.zzd = zzj(zzbpVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzur zzurVar, zzbp zzbpVar) {
        this.zzb = zzfzo.zzl(list);
        if (!list.isEmpty()) {
            this.zze = (zzur) list.get(0);
            zzurVar.getClass();
            this.zzf = zzurVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzbpVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzbpVar.zzn());
    }

    public final void zzi(zzbp zzbpVar) {
        this.zzd = zzj(zzbpVar, this.zzb, this.zze, this.zza);
        zzl(zzbpVar.zzn());
    }
}
