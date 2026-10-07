package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzlf {
    private final zzoj zza;
    private final zzle zze;
    private final zzlw zzh;
    private final zzdm zzi;
    private boolean zzj;
    private zzhd zzk;
    private zzwj zzl = new zzwj(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlf(zzle zzleVar, zzlw zzlwVar, zzdm zzdmVar, zzoj zzojVar) {
        this.zza = zzojVar;
        this.zze = zzleVar;
        this.zzh = zzlwVar;
        this.zzi = zzdmVar;
    }

    private final void zzr(int i, int i10) {
        while (i < this.zzb.size()) {
            ((zzld) this.zzb.get(i)).zzd += i10;
            i++;
        }
    }

    private final void zzs(zzld zzldVar) {
        zzlc zzlcVar = (zzlc) this.zzf.get(zzldVar);
        if (zzlcVar != null) {
            zzlcVar.zza.zzi(zzlcVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzld zzldVar = (zzld) it.next();
            if (zzldVar.zzc.isEmpty()) {
                zzs(zzldVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzld zzldVar) {
        if (zzldVar.zze && zzldVar.zzc.isEmpty()) {
            zzlc zzlcVar = (zzlc) this.zzf.remove(zzldVar);
            zzlcVar.getClass();
            zzlcVar.zza.zzp(zzlcVar.zzb);
            zzlcVar.zza.zzs(zzlcVar.zzc);
            zzlcVar.zza.zzr(zzlcVar.zzc);
            this.zzg.remove(zzldVar);
        }
    }

    private final void zzv(zzld zzldVar) {
        zzum zzumVar = zzldVar.zza;
        zzus zzusVar = new zzus() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // com.google.android.gms.internal.ads.zzus
            public final void zza(zzut zzutVar, zzbv zzbvVar) {
                this.zza.zzf(zzutVar, zzbvVar);
            }
        };
        zzlb zzlbVar = new zzlb(this, zzldVar);
        this.zzf.put(zzldVar, new zzlc(zzumVar, zzusVar, zzlbVar));
        zzumVar.zzh(new Handler(zzen.zzz(), null), zzlbVar);
        zzumVar.zzg(new Handler(zzen.zzz(), null), zzlbVar);
        zzumVar.zzm(zzusVar, this.zzk, this.zza);
    }

    private final void zzw(int i, int i10) {
        while (true) {
            i10--;
            if (i10 < i) {
                return;
            }
            zzld zzldVar = (zzld) this.zzb.remove(i10);
            this.zzd.remove(zzldVar.zzb);
            zzr(i10, -zzldVar.zza.zzC().zzc());
            zzldVar.zze = true;
            if (this.zzj) {
                zzu(zzldVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzbv zzb() {
        if (this.zzb.isEmpty()) {
            return zzbv.zza;
        }
        int iZzc = 0;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzld zzldVar = (zzld) this.zzb.get(i);
            zzldVar.zzd = iZzc;
            iZzc += zzldVar.zza.zzC().zzc();
        }
        return new zzll(this.zzb, this.zzl);
    }

    public final zzbv zzc(int i, int i10, List list) {
        zzdb.zzd(i >= 0 && i <= i10 && i10 <= zza());
        zzdb.zzd(list.size() == i10 - i);
        for (int i11 = i; i11 < i10; i11++) {
            ((zzld) this.zzb.get(i11)).zza.zzt((zzaw) list.get(i11 - i));
        }
        return zzb();
    }

    public final /* synthetic */ void zzf(zzut zzutVar, zzbv zzbvVar) {
        this.zze.zzh();
    }

    public final void zzg(zzhd zzhdVar) {
        zzdb.zzf(!this.zzj);
        this.zzk = zzhdVar;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzld zzldVar = (zzld) this.zzb.get(i);
            zzv(zzldVar);
            this.zzg.add(zzldVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzlc zzlcVar : this.zzf.values()) {
            try {
                zzlcVar.zza.zzp(zzlcVar.zzb);
            } catch (RuntimeException e) {
                zzdt.zzd("MediaSourceList", "Failed to release child source.", e);
            }
            zzlcVar.zza.zzs(zzlcVar.zzc);
            zzlcVar.zza.zzr(zzlcVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzup zzupVar) {
        zzld zzldVar = (zzld) this.zzc.remove(zzupVar);
        zzldVar.getClass();
        zzldVar.zza.zzG(zzupVar);
        zzldVar.zzc.remove(((zzuj) zzupVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzldVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzbv zzk(int i, List list, zzwj zzwjVar) {
        if (!list.isEmpty()) {
            this.zzl = zzwjVar;
            for (int i10 = i; i10 < list.size() + i; i10++) {
                zzld zzldVar = (zzld) list.get(i10 - i);
                if (i10 > 0) {
                    zzld zzldVar2 = (zzld) this.zzb.get(i10 - 1);
                    zzldVar.zzc(zzldVar2.zza.zzC().zzc() + zzldVar2.zzd);
                } else {
                    zzldVar.zzc(0);
                }
                zzr(i10, zzldVar.zza.zzC().zzc());
                this.zzb.add(i10, zzldVar);
                this.zzd.put(zzldVar.zzb, zzldVar);
                if (this.zzj) {
                    zzv(zzldVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzldVar);
                    } else {
                        zzs(zzldVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzbv zzl(int i, int i10, int i11, zzwj zzwjVar) {
        zzdb.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzbv zzm(int i, int i10, zzwj zzwjVar) {
        boolean z4 = false;
        if (i >= 0 && i <= i10 && i10 <= zza()) {
            z4 = true;
        }
        zzdb.zzd(z4);
        this.zzl = zzwjVar;
        zzw(i, i10);
        return zzb();
    }

    public final zzbv zzn(List list, zzwj zzwjVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzwjVar);
    }

    public final zzbv zzo(zzwj zzwjVar) {
        int iZza = zza();
        if (zzwjVar.zzc() != iZza) {
            zzwjVar = zzwjVar.zzf().zzg(0, iZza);
        }
        this.zzl = zzwjVar;
        return zzb();
    }

    public final zzup zzp(zzur zzurVar, zzys zzysVar, long j4) {
        int i = zzll.zzb;
        Object obj = zzurVar.zza;
        Object obj2 = ((Pair) obj).first;
        zzur zzurVarZza = zzurVar.zza(((Pair) obj).second);
        zzld zzldVar = (zzld) this.zzd.get(obj2);
        zzldVar.getClass();
        this.zzg.add(zzldVar);
        zzlc zzlcVar = (zzlc) this.zzf.get(zzldVar);
        if (zzlcVar != null) {
            zzlcVar.zza.zzk(zzlcVar.zzb);
        }
        zzldVar.zzc.add(zzurVarZza);
        zzuj zzujVarZzI = zzldVar.zza.zzI(zzurVarZza, zzysVar, j4);
        this.zzc.put(zzujVarZzI, zzldVar);
        zzt();
        return zzujVarZzI;
    }

    public final zzwj zzq() {
        return this.zzl;
    }
}
