package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import h6.k0;
import i6.h;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzebq extends zzbvi {
    private final Context zza;
    private final zzexs zzb;
    private final zzexq zzc;
    private final zzeby zzd;
    private final zzges zze;
    private final zzbwf zzf;

    public zzebq(Context context, zzexs zzexsVar, zzexq zzexqVar, zzebv zzebvVar, zzeby zzebyVar, zzges zzgesVar, zzbwf zzbwfVar) {
        this.zza = context;
        this.zzb = zzexsVar;
        this.zzc = zzexqVar;
        this.zzd = zzebyVar;
        this.zze = zzgesVar;
        this.zzf = zzbwfVar;
    }

    private final void zzc(m9.a aVar, zzbvm zzbvmVar) {
        zzgei.zzr((zzgdz) zzgei.zzn(zzgdz.zzu(aVar), new zzgdp(this) { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzh(zzfgp.zza((InputStream) obj));
            }
        }, zzcaj.zza), new zzebp(this, zzbvmVar), zzcaj.zzf);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    public final m9.a zzb(zzbvb zzbvbVar, int i) {
        m9.a aVarZzh;
        HashMap map = new HashMap();
        Bundle bundle = zzbvbVar.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        final zzebs zzebsVar = new zzebs(zzbvbVar.zza, zzbvbVar.zzb, map, zzbvbVar.zzd, "", zzbvbVar.zze);
        zzexr zzexrVarZzb = this.zzc.zza(new zzeyo(zzbvbVar)).zzb();
        if (zzebsVar.zzf) {
            String str2 = zzbvbVar.zza;
            String str3 = (String) zzbeu.zzb.zze();
            if (TextUtils.isEmpty(str3)) {
                aVarZzh = zzgei.zzh(zzebsVar);
            } else {
                String host = Uri.parse(str2).getHost();
                if (TextUtils.isEmpty(host)) {
                    aVarZzh = zzgei.zzh(zzebsVar);
                } else {
                    Iterator it = zzfxd.zzb(zzfwf.zzc(';')).zzc(str3).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            aVarZzh = zzgei.zzm(zzexrVarZzb.zza().zza(new JSONObject(), new Bundle()), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzebi
                                @Override // com.google.android.gms.internal.ads.zzfwh
                                public final Object apply(Object obj) {
                                    zzebs zzebsVar2 = zzebsVar;
                                    zzeby.zza(zzebsVar2.zzc, (JSONObject) obj);
                                    return zzebsVar2;
                                }
                            }, this.zze);
                        }
                    }
                    aVarZzh = zzgei.zzh(zzebsVar);
                }
            }
        } else {
            aVarZzh = zzgei.zzh(zzebsVar);
        }
        zzfjr zzfjrVarZzb = zzexrVarZzb.zzb();
        return zzgei.zzn(zzfjrVarZzb.zzb(zzfjl.HTTP, aVarZzh).zze(new zzebu(this.zza, "", this.zzf, i)).zza(), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzebj
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) throws JSONException {
                zzebt zzebtVar = (zzebt) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzebtVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str4 : zzebtVar.zzb.keySet()) {
                        if (str4 != null) {
                            List<String> list = (List) zzebtVar.zzb.get(str4);
                            JSONArray jSONArray = new JSONArray();
                            for (String str5 : list) {
                                if (str5 != null) {
                                    jSONArray.put(str5);
                                }
                            }
                            jSONObject2.put(str4, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzebtVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzebtVar.zzd);
                    return zzgei.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    h.g("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(zzbvb zzbvbVar, zzbvm zzbvmVar) {
        zzc(zzb(zzbvbVar, Binder.getCallingUid()), zzbvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(zzbuv zzbuvVar, zzbvm zzbvmVar) {
        final zzext zzextVarZzb = this.zzb.zza(new zzexh(zzbuvVar, Binder.getCallingUid())).zzb();
        zzfjr zzfjrVarZzb = zzextVarZzb.zzb();
        zzfix zzfixVarZza = zzfjrVarZzb.zzb(zzfjl.GMS_SIGNALS, zzgei.zzi()).zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzebm
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzextVarZzb.zza().zza(new JSONObject(), new Bundle());
            }
        }).zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzebl
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                k0.k("GMS AdRequest Signals: ");
                k0.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzebk
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zzfixVarZza, zzbvmVar);
        if (((Boolean) zzben.zzf.zze()).booleanValue()) {
            final zzeby zzebyVar = this.zzd;
            Objects.requireNonNull(zzebyVar);
            zzfixVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebo
                @Override // java.lang.Runnable
                public final void run() {
                    zzebyVar.zzb();
                }
            }, this.zze);
        }
    }
}
