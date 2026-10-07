package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import d6.p;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzecx implements zzfjs {
    private final zzecl zza;
    private final zzecp zzb;

    public zzecx(zzecl zzeclVar, zzecp zzecpVar) {
        this.zza = zzeclVar;
        this.zzb = zzecpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzd(zzfjl zzfjlVar, String str) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgc)).booleanValue() && zzfjl.RENDERER == zzfjlVar && this.zza.zzc() != 0) {
            zzecl zzeclVar = this.zza;
            p.C.f2983j.getClass();
            zzeclVar.zzf(SystemClock.elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdD(zzfjl zzfjlVar, String str, Throwable th) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgc)).booleanValue() && zzfjl.RENDERER == zzfjlVar && this.zza.zzc() != 0) {
            zzecl zzeclVar = this.zza;
            p.C.f2983j.getClass();
            zzeclVar.zzf(SystemClock.elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdE(zzfjl zzfjlVar, String str) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgc)).booleanValue()) {
            if (zzfjl.RENDERER == zzfjlVar) {
                zzecl zzeclVar = this.zza;
                p.C.f2983j.getClass();
                zzeclVar.zzg(SystemClock.elapsedRealtime());
            } else if (zzfjl.PRELOADED_LOADER == zzfjlVar || zzfjl.SERVER_TRANSACTION == zzfjlVar) {
                zzecl zzeclVar2 = this.zza;
                p.C.f2983j.getClass();
                zzeclVar2.zzh(SystemClock.elapsedRealtime());
                final zzecp zzecpVar = this.zzb;
                final long jZzd = this.zza.zzd();
                zzecpVar.zza.zza(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzeco
                    @Override // com.google.android.gms.internal.ads.zzfiv
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzecpVar.zzf()) {
                            return null;
                        }
                        long j4 = jZzd;
                        zzbbs.zzaf.zza.C0002zza c0002zzaZzn = zzbbs.zzaf.zza.zzn();
                        c0002zzaZzn.zzP(j4);
                        byte[] bArrZzaV = c0002zzaZzn.zzbr().zzaV();
                        zzecw.zzf(sQLiteDatabase, false, false);
                        zzecw.zzc(sQLiteDatabase, j4, bArrZzaV);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdC(zzfjl zzfjlVar, String str) {
    }
}
