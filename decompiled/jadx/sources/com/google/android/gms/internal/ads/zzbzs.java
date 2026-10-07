package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import e6.o3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbzs {
    private final n7.a zza;
    private final zzcad zzb;
    private final String zze;
    private final String zzf;
    private final Object zzd = new Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final LinkedList zzc = new LinkedList();

    public zzbzs(n7.a aVar, zzcad zzcadVar, String str, String str2) {
        this.zza = aVar;
        this.zzb = zzcadVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final Bundle zza() {
        Bundle bundle;
        synchronized (this.zzd) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.zze);
                bundle.putString("slotid", this.zzf);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.zzj);
                bundle.putLong("tresponse", this.zzk);
                bundle.putLong("timp", this.zzg);
                bundle.putLong("tload", this.zzh);
                bundle.putLong("pcc", this.zzi);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzbzr) it.next()).zzb());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String zzc() {
        return this.zze;
    }

    public final void zzd() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    zzbzr zzbzrVar = new zzbzr(this);
                    zzbzrVar.zzd();
                    this.zzc.add(zzbzrVar);
                    this.zzi++;
                    this.zzb.zzf();
                    this.zzb.zze(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1 && !this.zzc.isEmpty()) {
                    zzbzr zzbzrVar = (zzbzr) this.zzc.getLast();
                    if (zzbzrVar.zza() == -1) {
                        zzbzrVar.zzc();
                        this.zzb.zze(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1 && this.zzg == -1) {
                    ((b) this.zza).getClass();
                    this.zzg = SystemClock.elapsedRealtime();
                    this.zzb.zze(this);
                }
                this.zzb.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzh(boolean z4) {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    ((b) this.zza).getClass();
                    this.zzh = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zzb.zzi();
        }
    }

    public final void zzj(o3 o3Var) {
        synchronized (this.zzd) {
            ((b) this.zza).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zzj = jElapsedRealtime;
            this.zzb.zzj(o3Var, jElapsedRealtime);
        }
    }

    public final void zzk(long j4) {
        synchronized (this.zzd) {
            try {
                this.zzk = j4;
                if (j4 != -1) {
                    this.zzb.zze(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
