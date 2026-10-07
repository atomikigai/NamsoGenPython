package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zztq implements zzut {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzva zzc = new zzva();
    private final zzrk zzd = new zzrk();
    private Looper zze;
    private zzbv zzf;
    private zzoj zzg;

    @Override // com.google.android.gms.internal.ads.zzut
    public /* synthetic */ zzbv zzM() {
        return null;
    }

    public final zzoj zzb() {
        zzoj zzojVar = this.zzg;
        zzdb.zzb(zzojVar);
        return zzojVar;
    }

    public final zzrk zzc(zzur zzurVar) {
        return this.zzd.zza(0, zzurVar);
    }

    public final zzrk zzd(int i, zzur zzurVar) {
        return this.zzd.zza(0, zzurVar);
    }

    public final zzva zze(zzur zzurVar) {
        return this.zzc.zza(0, zzurVar);
    }

    public final zzva zzf(int i, zzur zzurVar) {
        return this.zzc.zza(0, zzurVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzg(Handler handler, zzrl zzrlVar) {
        this.zzd.zzb(handler, zzrlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzh(Handler handler, zzvb zzvbVar) {
        this.zzc.zzb(handler, zzvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzi(zzus zzusVar) {
        boolean zIsEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzusVar);
        if (zIsEmpty || !this.zzb.isEmpty()) {
            return;
        }
        zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzk(zzus zzusVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzusVar);
        if (zIsEmpty) {
            zzl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzm(zzus zzusVar, zzhd zzhdVar, zzoj zzojVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z4 = true;
        if (looper != null && looper != looperMyLooper) {
            z4 = false;
        }
        zzdb.zzd(z4);
        this.zzg = zzojVar;
        zzbv zzbvVar = this.zzf;
        this.zza.add(zzusVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzusVar);
            zzn(zzhdVar);
        } else if (zzbvVar != null) {
            zzk(zzusVar);
            zzusVar.zza(this, zzbvVar);
        }
    }

    public abstract void zzn(zzhd zzhdVar);

    public final void zzo(zzbv zzbvVar) {
        this.zzf = zzbvVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzus) arrayList.get(i)).zza(this, zzbvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzp(zzus zzusVar) {
        this.zza.remove(zzusVar);
        if (!this.zza.isEmpty()) {
            zzi(zzusVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    public abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzr(zzrl zzrlVar) {
        this.zzd.zzc(zzrlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzs(zzvb zzvbVar) {
        this.zzc.zzh(zzvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public /* synthetic */ void zzt(zzaw zzawVar) {
        throw null;
    }

    public final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public /* synthetic */ boolean zzv() {
        return true;
    }

    public void zzj() {
    }

    public void zzl() {
    }
}
