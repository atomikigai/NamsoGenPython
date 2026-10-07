package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.common.api.f;
import e6.t;
import h6.m0;
import h6.n0;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcnb {
    zzbul zza;
    zzbul zzb;
    private final Context zzc;
    private final m0 zzd;
    private final zzeex zze;
    private final zzdps zzf;
    private final zzges zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcnb(Context context, m0 m0Var, zzeex zzeexVar, zzdps zzdpsVar, zzges zzgesVar, zzges zzgesVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = m0Var;
        this.zze = zzeexVar;
        this.zzf = zzdpsVar;
        this.zzg = zzgesVar;
        this.zzh = zzgesVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) t.f3437d.f3440c.zza(zzbcn.zzjP));
    }

    private final m9.a zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            zzbce zzbceVar = zzbcn.zzjP;
            t tVar = t.f3437d;
            if (!str.contains((CharSequence) tVar.f3440c.zza(zzbceVar)) || ((n0) this.zzd).k()) {
                return zzgei.zzh(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) tVar.f3440c.zza(zzbcn.zzjQ), String.valueOf(random.nextInt(f.API_PRIORITY_OTHER)));
            if (inputEvent != null) {
                return (zzgdz) zzgei.zzf((zzgdz) zzgei.zzn(zzgdz.zzu(this.zze.zza()), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcmv
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final m9.a zza(Object obj) {
                        return this.zza.zzd(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcmw
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final m9.a zza(Object obj) {
                        return this.zza.zze(builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) tVar.f3440c.zza(zzbcn.zzjR), "11");
            return zzgei.zzh(builderBuildUpon.toString());
        } catch (Exception e) {
            return zzgei.zzg(e);
        }
    }

    public final m9.a zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgei.zzh(str) : zzgei.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcms
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzc(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final /* synthetic */ m9.a zzc(String str, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg(th);
            }
        });
        return zzgei.zzh(str);
    }

    public final m9.a zzd(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) t.f3437d.f3440c.zza(zzbcn.zzjR), "10");
            return zzgei.zzh(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        zzbce zzbceVar = zzbcn.zzjS;
        t tVar = t.f3437d;
        builderBuildUpon.appendQueryParameter((String) tVar.f3440c.zza(zzbceVar), "1");
        builderBuildUpon.appendQueryParameter((String) tVar.f3440c.zza(zzbcn.zzjR), "12");
        if (str.contains((CharSequence) tVar.f3440c.zza(zzbcn.zzjT))) {
            builderBuildUpon.authority((String) tVar.f3440c.zza(zzbcn.zzjU));
        }
        return (zzgdz) zzgei.zzn(zzgdz.zzu(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcmx
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                String str2 = (String) t.f3437d.f3440c.zza(zzbcn.zzjR);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgei.zzh(builder2.toString());
            }
        }, this.zzh);
    }

    public final m9.a zze(Uri.Builder builder, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(th);
            }
        });
        builder.appendQueryParameter((String) t.f3437d.f3440c.zza(zzbcn.zzjR), "9");
        return zzgei.zzh(builder.toString());
    }

    public final void zzg(Throwable th) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjW)).booleanValue()) {
            zzbul zzbulVarZzc = zzbuj.zzc(this.zzc);
            this.zzb = zzbulVarZzc;
            zzbulVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbul zzbulVarZza = zzbuj.zza(this.zzc);
            this.zza = zzbulVarZza;
            zzbulVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public final void zzh(Throwable th) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjW)).booleanValue()) {
            zzbul zzbulVarZzc = zzbuj.zzc(this.zzc);
            this.zzb = zzbulVarZzc;
            zzbulVarZzc.zzh(th, "AttributionReporting");
        } else {
            zzbul zzbulVarZza = zzbuj.zza(this.zzc);
            this.zza = zzbulVarZza;
            zzbulVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    public final void zzi(String str, zzflr zzflrVar, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgei.zzr(zzgei.zzo(zzk(str, this.zzf.zza(), random), ((Integer) t.f3437d.f3440c.zza(zzbcn.zzjV)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcna(this, zzflrVar, str), this.zzg);
    }
}
