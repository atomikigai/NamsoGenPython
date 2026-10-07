package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdsp implements zzfjs {
    private final zzdsh zzb;
    private final n7.a zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdsp(zzdsh zzdshVar, Set set, n7.a aVar) {
        this.zzb = zzdshVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdso zzdsoVar = (zzdso) it.next();
            this.zzd.put(zzdsoVar.zzc, zzdsoVar);
        }
        this.zzc = aVar;
    }

    private final void zze(zzfjl zzfjlVar, boolean z4) {
        zzfjl zzfjlVar2 = ((zzdso) this.zzd.get(zzfjlVar)).zzb;
        if (this.zza.containsKey(zzfjlVar2)) {
            String str = true != z4 ? "f." : "s.";
            n7.a aVar = this.zzc;
            Map map = this.zza;
            ((b) aVar).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfjlVar2)).longValue();
            this.zzb.zzb().put("label.".concat(((zzdso) this.zzd.get(zzfjlVar)).zza), str.concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzd(zzfjl zzfjlVar, String str) {
        if (this.zza.containsKey(zzfjlVar)) {
            n7.a aVar = this.zzc;
            Map map = this.zza;
            ((b) aVar).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfjlVar)).longValue();
            zzdsh zzdshVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzdshVar.zzb().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfjlVar)) {
            zze(zzfjlVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdD(zzfjl zzfjlVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfjlVar)) {
            n7.a aVar = this.zzc;
            Map map = this.zza;
            ((b) aVar).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfjlVar)).longValue();
            zzdsh zzdshVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzdshVar.zzb().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfjlVar)) {
            zze(zzfjlVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdE(zzfjl zzfjlVar, String str) {
        ((b) this.zzc).getClass();
        this.zza.put(zzfjlVar, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdC(zzfjl zzfjlVar, String str) {
    }
}
