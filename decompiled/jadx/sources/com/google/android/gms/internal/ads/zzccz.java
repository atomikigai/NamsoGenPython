package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import d6.p;
import e6.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import n7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzccz implements zzgd {
    private final Context zza;
    private final zzgd zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbax zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzgi zzl;

    public zzccz(Context context, zzgd zzgdVar, String str, int i, zzhd zzhdVar, zzccy zzccyVar) {
        this.zza = context;
        this.zzb = zzgdVar;
        this.zzc = str;
        this.zzd = i;
        new AtomicLong(-1L);
        this.zze = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbW)).booleanValue();
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        zzbce zzbceVar = zzbcn.zzes;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() || this.zzj) {
            return ((Boolean) tVar.f3440c.zza(zzbcn.zzet)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i10) : this.zzb.zza(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws IOException {
        Long l2;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzgiVar.zza;
        this.zzh = uri;
        this.zzl = zzgiVar;
        this.zzi = zzbax.zza(uri);
        zzbce zzbceVar = zzbcn.zzep;
        t tVar = t.f3437d;
        zzbau zzbauVarZzb = null;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgiVar.zze;
                this.zzi.zzi = zzfxf.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbauVarZzb = p.C.i.zzb(this.zzi);
            }
            if (zzbauVarZzb != null && zzbauVarZzb.zze()) {
                this.zzj = zzbauVarZzb.zzg();
                this.zzk = zzbauVarZzb.zzf();
                if (!zzg()) {
                    this.zzf = zzbauVarZzb.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgiVar.zze;
            this.zzi.zzi = zzfxf.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l2 = (Long) tVar.f3440c.zza(zzbcn.zzer);
            } else {
                l2 = (Long) tVar.f3440c.zza(zzbcn.zzeq);
            }
            long jLongValue = l2.longValue();
            p.C.f2983j.getClass();
            SystemClock.elapsedRealtime();
            Future futureZza = zzbbi.zza(this.zza, this.zzi);
            try {
                try {
                    try {
                        zzbbj zzbbjVar = (zzbbj) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                        zzbbjVar.zzd();
                        this.zzj = zzbbjVar.zzf();
                        this.zzk = zzbbjVar.zze();
                        zzbbjVar.zza();
                        if (!zzg()) {
                            this.zzf = zzbbjVar.zzc();
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        futureZza.cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            p.C.f2983j.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzgg zzggVarZza = zzgiVar.zza();
            zzggVarZza.zzd(Uri.parse(this.zzi.zza));
            this.zzl = zzggVarZza.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            c.d(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzf(zzhd zzhdVar) {
    }
}
