package com.google.android.gms.internal.ads;

import d6.p;
import h6.r0;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbou implements zzgdp {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final m9.a zzb;

    public zzbou(m9.a aVar, String str, zzbob zzbobVar, zzboa zzboaVar) {
        this.zzb = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdp
    public final m9.a zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final m9.a zzb(final Object obj) {
        return zzgei.zzn(this.zzb, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzbos
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj2) {
                return this.zza.zzc(obj, (zzbnv) obj2);
            }
        }, zzcaj.zzf);
    }

    public final m9.a zzc(Object obj, zzbnv zzbnvVar) throws Exception {
        zzcao zzcaoVar = new zzcao();
        r0 r0Var = p.C.f2979c;
        String string = UUID.randomUUID().toString();
        zzbjq.zzo.zzc(string, new zzbot(this, zzcaoVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbnvVar.zzl(this.zza, jSONObject);
        return zzcaoVar;
    }
}
