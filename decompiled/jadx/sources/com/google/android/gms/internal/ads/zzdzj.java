package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import d6.p;
import h6.r0;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdzj {
    private final zzges zza;
    private final zzdyn zzb;
    private final zzhfr zzc;
    private final zzfko zzd;
    private final Context zze;
    private final i6.a zzf;

    public zzdzj(zzges zzgesVar, zzdyn zzdynVar, zzhfr zzhfrVar, zzfko zzfkoVar, Context context, i6.a aVar) {
        this.zza = zzgesVar;
        this.zzb = zzdynVar;
        this.zzc = zzhfrVar;
        this.zzd = zzfkoVar;
        this.zze = context;
        this.zzf = aVar;
    }

    private final m9.a zzh(final zzbvx zzbvxVar, zzdzi zzdziVar, final zzdzi zzdziVar2, final zzgdp zzgdpVar) {
        String str = zzbvxVar.zzd;
        r0 r0Var = p.C.f2979c;
        return (zzgdz) zzgei.zzf((zzgdz) zzgei.zzn((zzgdz) zzgei.zzn(zzgdz.zzu(r0.c(str) ? zzgei.zzg(new zzdyw(1)) : zzgei.zzf(zzdziVar.zza(zzbvxVar), ExecutionException.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzh
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return zzgei.zzg(cause);
            }
        }, this.zza)), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzf
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzh(((zzdyx) obj).zzb());
            }
        }, this.zza), zzgdpVar, this.zza), zzdyw.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzg
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzc(zzdziVar2, zzbvxVar, zzgdpVar, (zzdyw) obj);
            }
        }, this.zza);
    }

    public final m9.a zza(final zzbvx zzbvxVar) {
        zzgdp zzgdpVar = new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzc
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                String str = new String(zzgce.zzb((InputStream) obj), StandardCharsets.UTF_8);
                zzbvx zzbvxVar2 = zzbvxVar;
                zzbvxVar2.zzj = str;
                return zzgei.zzh(zzbvxVar2);
            }
        };
        final zzdyn zzdynVar = this.zzb;
        Objects.requireNonNull(zzdynVar);
        return zzh(zzbvxVar, new zzdzi() { // from class: com.google.android.gms.internal.ads.zzdzd
            @Override // com.google.android.gms.internal.ads.zzdzi
            public final m9.a zza(zzbvx zzbvxVar2) {
                return zzdynVar.zza(zzbvxVar2);
            }
        }, new zzdzi() { // from class: com.google.android.gms.internal.ads.zzdze
            @Override // com.google.android.gms.internal.ads.zzdzi
            public final m9.a zza(zzbvx zzbvxVar2) {
                return this.zza.zzd(zzbvxVar2);
            }
        }, zzgdpVar);
    }

    public final m9.a zzb(JSONObject jSONObject) {
        return (zzgdz) zzgei.zzn(zzgdz.zzu(zzgei.zzh(jSONObject)), p.C.f2990q.zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbof.zza, new zzboa() { // from class: com.google.android.gms.internal.ads.zzdyy
            @Override // com.google.android.gms.internal.ads.zzboa
            public final Object zza(JSONObject jSONObject2) {
                return new zzbvz(jSONObject2);
            }
        }), this.zza);
    }

    public final /* synthetic */ m9.a zzc(zzdzi zzdziVar, zzbvx zzbvxVar, zzgdp zzgdpVar, zzdyw zzdywVar) throws Exception {
        return zzgei.zzn(zzdziVar.zza(zzbvxVar), zzgdpVar, this.zza);
    }

    public final /* synthetic */ m9.a zzd(zzbvx zzbvxVar) {
        return ((zzebg) this.zzc.zzb()).zzb(zzbvxVar, Binder.getCallingUid());
    }

    public final /* synthetic */ m9.a zze(zzbvx zzbvxVar) {
        return this.zzb.zzd(zzbvxVar.zzh);
    }

    public final /* synthetic */ m9.a zzf(zzbvx zzbvxVar) {
        return ((zzebg) this.zzc.zzb()).zzj(zzbvxVar.zzh);
    }

    public final m9.a zzg(zzbvx zzbvxVar) {
        return zzh(zzbvxVar, new zzdzi() { // from class: com.google.android.gms.internal.ads.zzdza
            @Override // com.google.android.gms.internal.ads.zzdzi
            public final m9.a zza(zzbvx zzbvxVar2) {
                return this.zza.zze(zzbvxVar2);
            }
        }, new zzdzi() { // from class: com.google.android.gms.internal.ads.zzdzb
            @Override // com.google.android.gms.internal.ads.zzdzi
            public final m9.a zza(zzbvx zzbvxVar2) {
                return this.zza.zzf(zzbvxVar2);
            }
        }, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdyz
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzh(null);
            }
        });
    }
}
