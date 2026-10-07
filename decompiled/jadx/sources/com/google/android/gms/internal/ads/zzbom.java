package com.google.android.gms.internal.ads;

import d6.p;
import h6.k0;
import h6.r0;
import i6.h;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbom implements zzbny {
    private final zzboa zza;
    private final zzbob zzb;
    private final zzbnu zzc;
    private final String zzd;

    public zzbom(zzbnu zzbnuVar, String str, zzbob zzbobVar, zzboa zzboaVar) {
        this.zzc = zzbnuVar;
        this.zzd = str;
        this.zzb = zzbobVar;
        this.zza = zzboaVar;
    }

    public static void zzd(zzbom zzbomVar, zzbno zzbnoVar, zzbnv zzbnvVar, Object obj, zzcao zzcaoVar) {
        try {
            r0 r0Var = p.C.f2979c;
            String string = UUID.randomUUID().toString();
            zzbjq.zzo.zzc(string, new zzbol(zzbomVar, zzbnoVar, zzcaoVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", zzbomVar.zzb.zzb(obj));
            zzbnvVar.zzl(zzbomVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcaoVar.zzd(e);
                h.e("Unable to invokeJavascript", e);
            } finally {
                zzbnoVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdp
    public final m9.a zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final m9.a zzb(Object obj) {
        zzcao zzcaoVar = new zzcao();
        zzbno zzbnoVarZzb = this.zzc.zzb(null);
        k0.k("callJs > getEngine: Promise created");
        zzbnoVarZzb.zzj(new zzboj(this, zzbnoVarZzb, obj, zzcaoVar), new zzbok(this, zzcaoVar, zzbnoVarZzb));
        return zzcaoVar;
    }
}
