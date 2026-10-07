package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import e6.s;
import i6.d;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdzz {
    private final zzges zza;
    private final zzdzu zzb;
    private final zzfjr zzc;

    public zzdzz(zzges zzgesVar, zzdzu zzdzuVar, zzfjr zzfjrVar) {
        this.zza = zzgesVar;
        this.zzb = zzdzuVar;
        this.zzc = zzfjrVar;
    }

    public final m9.a zza(final zzbvx zzbvxVar) {
        zzfjh zzfjhVarZzb = this.zzc.zzb(zzfjl.GMS_SIGNALS, zzgei.zzm(zzgei.zzh(null), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdzw
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzbvx zzbvxVar2 = zzbvxVar;
                String strZzc = zzfxf.zzc(zzbvxVar2.zza.getString("ms"));
                ApplicationInfo applicationInfo = zzbvxVar2.zzc;
                String str = zzbvxVar2.zzh;
                return new zzbuv(applicationInfo, zzbvxVar2.zzd, zzbvxVar2.zzf, strZzc, -1, str, zzbvxVar2.zze, zzbvxVar2.zzk, zzbvxVar2.zzl);
            }
        }, this.zza));
        final zzdzu zzdzuVar = this.zzb;
        Objects.requireNonNull(zzdzuVar);
        return zzgei.zzm(zzfjhVarZzb.zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzx
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzdzuVar.zzb((zzbuv) obj);
            }
        }).zza(), new zzfwh(this) { // from class: com.google.android.gms.internal.ads.zzdzy
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbvxVar.zza;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    s sVar = s.f3427f;
                    JSONObject jSONObjectH = sVar.f3428a.h(bundle);
                    try {
                        sVar.f3428a.getClass();
                        d.j(jSONObject, jSONObjectH);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectH;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.zza);
    }
}
