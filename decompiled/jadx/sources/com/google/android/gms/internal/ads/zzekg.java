package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.t;
import i6.h;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzekg implements zzefd {
    private final zzelk zza;
    private final zzdqd zzb;

    public zzekg(zzelk zzelkVar, zzdqd zzdqdVar) {
        this.zza = zzelkVar;
        this.zzb = zzdqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzefe zza(String str, JSONObject jSONObject) throws zzffv {
        zzbrf zzbrfVarZzb;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbK)).booleanValue()) {
            try {
                zzbrfVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e) {
                h.e("Coundn't create RTB adapter: ", e);
                zzbrfVarZzb = null;
            }
        } else {
            zzbrfVarZzb = this.zza.zza(str);
        }
        if (zzbrfVarZzb == null) {
            return null;
        }
        return new zzefe(zzbrfVarZzb, new zzegx(), str);
    }
}
