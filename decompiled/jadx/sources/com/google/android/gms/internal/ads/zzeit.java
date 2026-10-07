package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import e6.h2;
import e6.t;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzeit implements zzgee {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfew zzb;
    final /* synthetic */ zzfet zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfln zze;
    final /* synthetic */ zzfff zzf;
    final /* synthetic */ zzeiv zzg;

    public zzeit(zzeiv zzeivVar, long j4, zzfew zzfewVar, zzfet zzfetVar, String str, zzfln zzflnVar, zzfff zzfffVar) {
        this.zza = j4;
        this.zzb = zzfewVar;
        this.zzc = zzfetVar;
        this.zzd = str;
        this.zze = zzflnVar;
        this.zzf = zzfffVar;
        this.zzg = zzeivVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x006b, B:34:0x0073, B:36:0x007f, B:40:0x0089, B:41:0x008d, B:43:0x009f, B:44:0x00b4, B:46:0x00bc, B:48:0x00be, B:56:0x00f6, B:57:0x0101, B:51:0x00db, B:53:0x00df, B:55:0x00e9), top: B:61:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007f A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x006b, B:34:0x0073, B:36:0x007f, B:40:0x0089, B:41:0x008d, B:43:0x009f, B:44:0x00b4, B:46:0x00bc, B:48:0x00be, B:56:0x00f6, B:57:0x0101, B:51:0x00db, B:53:0x00df, B:55:0x00e9), top: B:61:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009f A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x006b, B:34:0x0073, B:36:0x007f, B:40:0x0089, B:41:0x008d, B:43:0x009f, B:44:0x00b4, B:46:0x00bc, B:48:0x00be, B:56:0x00f6, B:57:0x0101, B:51:0x00db, B:53:0x00df, B:55:0x00e9), top: B:61:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc A[Catch: all -> 0x0085, DONT_GENERATE, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x006b, B:34:0x0073, B:36:0x007f, B:40:0x0089, B:41:0x008d, B:43:0x009f, B:44:0x00b4, B:46:0x00bc, B:48:0x00be, B:56:0x00f6, B:57:0x0101, B:51:0x00db, B:53:0x00df, B:55:0x00e9), top: B:61:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00be A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x006b, B:34:0x0073, B:36:0x007f, B:40:0x0089, B:41:0x008d, B:43:0x009f, B:44:0x00b4, B:46:0x00bc, B:48:0x00be, B:56:0x00f6, B:57:0x0101, B:51:0x00db, B:53:0x00df, B:55:0x00e9), top: B:61:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x006b, B:34:0x0073, B:36:0x007f, B:40:0x0089, B:41:0x008d, B:43:0x009f, B:44:0x00b4, B:46:0x00bc, B:48:0x00be, B:56:0x00f6, B:57:0x0101, B:51:0x00db, B:53:0x00df, B:55:0x00e9), top: B:61:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        int i;
        int i10;
        h2 h2VarZzb;
        Integer numValueOf;
        zzeiv zzeivVar;
        zzeiv zzeivVar2;
        h2 h2VarZza;
        int i11;
        h2 h2Var;
        ((b) this.zzg.zza).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zza;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzeid) {
                i = 3;
            } else if (th instanceof CancellationException) {
                i10 = 4;
            } else {
                if (!(th instanceof zzffv)) {
                    if (th instanceof zzdwn) {
                        i10 = zzfgq.zza(th).f3314a == 3 ? 1 : 6;
                        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbI)).booleanValue() && (th instanceof zzeff) && (h2VarZzb = ((zzeff) th).zzb()) != null) {
                            numValueOf = Integer.valueOf(h2VarZzb.f3314a);
                            i = i10;
                        }
                    } else {
                        i = 6;
                    }
                    synchronized (this.zzg) {
                        try {
                            zzeivVar = this.zzg;
                            if (zzeivVar.zze) {
                                zzeivVar.zzb.zza(this.zzb, this.zzc, i, th instanceof zzeff ? (zzeff) th : null, jElapsedRealtime);
                                jElapsedRealtime = jElapsedRealtime;
                            }
                            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhY)).booleanValue()) {
                                zzflr zzflrVar = this.zzg.zzc;
                                zzfln zzflnVar = this.zze;
                                zzfff zzfffVar = this.zzf;
                                zzfet zzfetVar = this.zzc;
                                zzflrVar.zzd(zzflnVar.zzc(zzfffVar, zzfetVar, zzfetVar.zzn));
                            }
                            zzeivVar2 = this.zzg;
                            if (zzeivVar2.zzg) {
                                return;
                            }
                            LinkedHashMap linkedHashMap = zzeivVar2.zzd;
                            zzfet zzfetVar2 = this.zzc;
                            linkedHashMap.put(zzfetVar2, new zzeiu(this.zzd, zzfetVar2.zzaf, i, jElapsedRealtime, numValueOf));
                            h2VarZza = zzfgq.zza(th);
                            i11 = h2VarZza.f3314a;
                            if ((i11 != 3 || i11 == 0) && (h2Var = h2VarZza.f3317d) != null && !h2Var.f3316c.equals("com.google.android.gms.ads")) {
                            }
                            this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, h2VarZza);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                i10 = 5;
            }
            numValueOf = null;
            synchronized (this.zzg) {
                zzeivVar = this.zzg;
                if (zzeivVar.zze) {
                    zzeivVar.zzb.zza(this.zzb, this.zzc, i, th instanceof zzeff ? (zzeff) th : null, jElapsedRealtime);
                    jElapsedRealtime = jElapsedRealtime;
                }
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhY)).booleanValue()) {
                    zzflr zzflrVar2 = this.zzg.zzc;
                    zzfln zzflnVar2 = this.zze;
                    zzfff zzfffVar2 = this.zzf;
                    zzfet zzfetVar3 = this.zzc;
                    zzflrVar2.zzd(zzflnVar2.zzc(zzfffVar2, zzfetVar3, zzfetVar3.zzn));
                }
                zzeivVar2 = this.zzg;
                if (zzeivVar2.zzg) {
                    return;
                }
                LinkedHashMap linkedHashMap2 = zzeivVar2.zzd;
                zzfet zzfetVar4 = this.zzc;
                linkedHashMap2.put(zzfetVar4, new zzeiu(this.zzd, zzfetVar4.zzaf, i, jElapsedRealtime, numValueOf));
                h2VarZza = zzfgq.zza(th);
                i11 = h2VarZza.f3314a;
                h2VarZza = i11 != 3 ? zzfgq.zza(new zzeff(13, h2VarZza.f3317d)) : zzfgq.zza(new zzeff(13, h2VarZza.f3317d));
                this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, h2VarZza);
            }
        }
        i10 = 2;
        i = i10;
        numValueOf = null;
        synchronized (this.zzg) {
            zzeivVar = this.zzg;
            if (zzeivVar.zze) {
                zzeivVar.zzb.zza(this.zzb, this.zzc, i, th instanceof zzeff ? (zzeff) th : null, jElapsedRealtime);
                jElapsedRealtime = jElapsedRealtime;
            }
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhY)).booleanValue()) {
                zzflr zzflrVar3 = this.zzg.zzc;
                zzfln zzflnVar3 = this.zze;
                zzfff zzfffVar3 = this.zzf;
                zzfet zzfetVar5 = this.zzc;
                zzflrVar3.zzd(zzflnVar3.zzc(zzfffVar3, zzfetVar5, zzfetVar5.zzn));
            }
            zzeivVar2 = this.zzg;
            if (zzeivVar2.zzg) {
                return;
            }
            LinkedHashMap linkedHashMap3 = zzeivVar2.zzd;
            zzfet zzfetVar6 = this.zzc;
            linkedHashMap3.put(zzfetVar6, new zzeiu(this.zzd, zzfetVar6.zzaf, i, jElapsedRealtime, numValueOf));
            h2VarZza = zzfgq.zza(th);
            i11 = h2VarZza.f3314a;
            if (i11 != 3) {
            }
            this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, h2VarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        long j4;
        ((b) this.zzg.zza).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            try {
                zzeiv zzeivVar = this.zzg;
                if (zzeivVar.zze) {
                    j4 = jElapsedRealtime;
                    zzeivVar.zzb.zza(this.zzb, this.zzc, 0, null, j4);
                } else {
                    j4 = jElapsedRealtime;
                }
                zzeiv zzeivVar2 = this.zzg;
                if (zzeivVar2.zzg) {
                    return;
                }
                if (zzeivVar2.zzq(this.zzc)) {
                    ((zzeiu) this.zzg.zzd.get(this.zzc)).zzd = j4;
                } else {
                    LinkedHashMap linkedHashMap = this.zzg.zzd;
                    zzfet zzfetVar = this.zzc;
                    long j10 = j4;
                    j4 = j10;
                    linkedHashMap.put(zzfetVar, new zzeiu(this.zzd, zzfetVar.zzaf, 0, j10, null));
                }
                this.zzg.zzf.zzg(this.zzc, j4, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
