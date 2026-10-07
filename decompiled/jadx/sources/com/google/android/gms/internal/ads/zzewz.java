package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import d6.p;
import e6.s;
import e6.t;
import i6.d;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzewz implements zzevz {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbzq zzg;

    public zzewz(zzbzq zzbzqVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z4, boolean z10) {
        this.zzg = zzbzqVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z4;
        this.zzf = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        zzbce zzbceVar = zzbcn.zzbb;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            return zzgei.zzg(new Exception("Did not ad Ad ID into query param."));
        }
        return (zzgdz) zzgei.zze((zzgdz) zzgei.zzo((zzgdz) zzgei.zzm(zzgdz.zzu(this.zzg.zza(this.zza, this.zzd)), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzewx
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return this.zza.zzc((b6.a) obj);
            }
        }, this.zzc), ((Long) tVar.f3440c.zza(zzbcn.zzbc)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzewy
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, this.zzc);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final zzexa zzc(b6.a aVar) {
        zzfth zzfthVar = new zzfth();
        if (!this.zze) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdi)).booleanValue()) {
                zzftl zzftlVarZzj = zzftl.zzj(this.zza);
                Objects.requireNonNull(aVar);
                String str = aVar.f1406a;
                Objects.requireNonNull(str);
                zzfthVar = zzftlVarZzj.zzi(str, this.zza.getPackageName(), ((Long) t.f3437d.f3440c.zza(zzbcn.zzdo)).longValue(), this.zzf);
            } else if (this.zze) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdj)).booleanValue()) {
                    try {
                        zzftl zzftlVarZzj2 = zzftl.zzj(this.zza);
                        Objects.requireNonNull(aVar);
                        String str2 = aVar.f1406a;
                        Objects.requireNonNull(str2);
                        zzfthVar = zzftlVarZzj2.zzi(str2, this.zza.getPackageName(), ((Long) t.f3437d.f3440c.zza(zzbcn.zzdo)).longValue(), this.zzf);
                    } catch (IOException | IllegalArgumentException e) {
                        p.C.f2982g.zzw(e, "AdIdInfoSignalSource.getPaidV1");
                        zzfthVar = new zzfth();
                    }
                }
            }
        } else if (this.zze) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdj)).booleanValue()) {
                zzftl zzftlVarZzj3 = zzftl.zzj(this.zza);
                Objects.requireNonNull(aVar);
                String str3 = aVar.f1406a;
                Objects.requireNonNull(str3);
                zzfthVar = zzftlVarZzj3.zzi(str3, this.zza.getPackageName(), ((Long) t.f3437d.f3440c.zza(zzbcn.zzdo)).longValue(), this.zzf);
            }
        }
        return new zzexa(aVar, null, zzfthVar);
    }

    public final zzexa zzd(Throwable th) {
        d dVar = s.f3427f.f3428a;
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzexa(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfth());
    }
}
