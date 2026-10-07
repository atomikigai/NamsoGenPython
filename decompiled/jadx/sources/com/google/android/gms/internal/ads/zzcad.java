package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import d6.p;
import e6.o3;
import e6.t;
import h6.m0;
import h6.n0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcad implements zzazf {
    final zzcaa zza;
    private final m0 zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzcab zzf = new zzcab();

    public zzcad(String str, m0 m0Var) {
        this.zza = new zzcaa(str, m0Var);
        this.zze = m0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzazf
    public final void zza(boolean z4) {
        long j4;
        int i;
        p.C.f2983j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z4) {
            n0 n0Var = (n0) this.zze;
            n0Var.l();
            synchronized (n0Var.f5036a) {
                j4 = n0Var.f5047o;
            }
            if (jCurrentTimeMillis - j4 > ((Long) t.f3437d.f3440c.zza(zzbcn.zzba)).longValue()) {
                this.zza.zzd = -1;
            } else {
                zzcaa zzcaaVar = this.zza;
                n0 n0Var2 = (n0) this.zze;
                n0Var2.l();
                synchronized (n0Var2.f5036a) {
                    i = n0Var2.f5049q;
                }
                zzcaaVar.zzd = i;
            }
            this.zzg = true;
            return;
        }
        n0 n0Var3 = (n0) this.zze;
        n0Var3.l();
        synchronized (n0Var3.f5036a) {
            try {
                if (n0Var3.f5047o != jCurrentTimeMillis) {
                    n0Var3.f5047o = jCurrentTimeMillis;
                    SharedPreferences.Editor editor = n0Var3.f5041g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", jCurrentTimeMillis);
                        n0Var3.f5041g.apply();
                    }
                    n0Var3.m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m0 m0Var = this.zze;
        int i10 = this.zza.zzd;
        n0 n0Var4 = (n0) m0Var;
        n0Var4.l();
        synchronized (n0Var4.f5036a) {
            try {
                if (n0Var4.f5049q == i10) {
                    return;
                }
                n0Var4.f5049q = i10;
                SharedPreferences.Editor editor2 = n0Var4.f5041g;
                if (editor2 != null) {
                    editor2.putInt("request_in_session_count", i10);
                    n0Var4.f5041g.apply();
                }
                n0Var4.m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int zzb() {
        int iZza;
        synchronized (this.zzd) {
            iZza = this.zza.zza();
        }
        return iZza;
    }

    public final zzbzs zzc(n7.a aVar, String str) {
        return new zzbzs(aVar, this, this.zzf.zza(), str);
    }

    public final String zzd() {
        return this.zzf.zzb();
    }

    public final void zze(zzbzs zzbzsVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzbzsVar);
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzj(o3 o3Var, long j4) {
        synchronized (this.zzd) {
            this.zza.zzg(o3Var, j4);
        }
    }

    public final void zzk() {
        synchronized (this.zzd) {
            this.zza.zzh();
        }
    }

    public final void zzl(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzm() {
        return this.zzg;
    }

    public final Bundle zzn(Context context, zzfgw zzfgwVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zzb(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzbzs) it2.next()).zza());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfgwVar.zzc(hashSet);
        return bundle;
    }
}
