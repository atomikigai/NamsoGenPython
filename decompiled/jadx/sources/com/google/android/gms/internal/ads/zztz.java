package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zztz extends zztq {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhd zzc;

    public abstract void zzA(Object obj, zzut zzutVar, zzbv zzbvVar);

    public final void zzB(final Object obj, zzut zzutVar) {
        zzdb.zzd(!this.zza.containsKey(obj));
        zzus zzusVar = new zzus() { // from class: com.google.android.gms.internal.ads.zztw
            @Override // com.google.android.gms.internal.ads.zzus
            public final void zza(zzut zzutVar2, zzbv zzbvVar) {
                this.zza.zzA(obj, zzutVar2, zzbvVar);
            }
        };
        zztx zztxVar = new zztx(this, obj);
        this.zza.put(obj, new zzty(zzutVar, zzusVar, zztxVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzutVar.zzh(handler, zztxVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzutVar.zzg(handler2, zztxVar);
        zzutVar.zzm(zzusVar, this.zzc, zzb());
        if (zzu()) {
            return;
        }
        zzutVar.zzi(zzusVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzj() {
        for (zzty zztyVar : this.zza.values()) {
            zztyVar.zza.zzi(zztyVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzl() {
        for (zzty zztyVar : this.zza.values()) {
            zztyVar.zza.zzk(zztyVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public void zzn(zzhd zzhdVar) {
        this.zzc = zzhdVar;
        this.zzb = zzen.zzy(null);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public void zzq() {
        for (zzty zztyVar : this.zza.values()) {
            zztyVar.zza.zzp(zztyVar.zzb);
            zztyVar.zza.zzs(zztyVar.zzc);
            zztyVar.zza.zzr(zztyVar.zzc);
        }
        this.zza.clear();
    }

    public int zzw(Object obj, int i) {
        return 0;
    }

    public zzur zzy(Object obj, zzur zzurVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public void zzz() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzty) it.next()).zza.zzz();
        }
    }

    public long zzx(Object obj, long j4, zzur zzurVar) {
        return j4;
    }
}
