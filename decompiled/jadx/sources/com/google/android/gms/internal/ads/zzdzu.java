package com.google.android.gms.internal.ads;

import d6.p;
import e6.t;
import h6.r0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdzu {
    private final zzges zza;
    private final zzges zzb;
    private final zzeam zzc;

    public zzdzu(zzges zzgesVar, zzges zzgesVar2, zzeam zzeamVar) {
        this.zza = zzgesVar;
        this.zzb = zzgesVar2;
        this.zzc = zzeamVar;
    }

    public final m9.a zza(zzbuv zzbuvVar) throws Exception {
        return this.zzc.zza(zzbuvVar, ((Long) t.f3437d.f3440c.zza(zzbcn.zzlj)).longValue());
    }

    public final m9.a zzb(final zzbuv zzbuvVar) {
        String str = zzbuvVar.zzb;
        r0 r0Var = p.C.f2979c;
        return (zzgdz) zzgei.zzn((zzgdz) zzgei.zzf(zzgdz.zzu(r0.c(str) ? zzgei.zzg(new zzdyw(1, "Ads signal service force local")) : zzgei.zzf(zzgei.zzk(new zzgdo() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // com.google.android.gms.internal.ads.zzgdo
            public final m9.a zza() {
                return this.zza.zza(zzbuvVar);
            }
        }, this.zza), ExecutionException.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return zzgei.zzg(cause);
            }
        }, this.zzb)), zzdyw.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzs
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzh(null);
            }
        }, this.zzb), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzt
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zzgei.zzh(jSONObject);
                }
                try {
                    r0 r0Var2 = p.C.f2979c;
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                    StringBuilder sb2 = new StringBuilder(8192);
                    char[] cArr = new char[2048];
                    while (true) {
                        int i = inputStreamReader.read(cArr);
                        if (i == -1) {
                            break;
                        }
                        sb2.append(cArr, 0, i);
                    }
                    jSONObject = new JSONObject(sb2.toString());
                } catch (IOException | JSONException e) {
                    p.C.f2982g.zzw(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return zzgei.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
