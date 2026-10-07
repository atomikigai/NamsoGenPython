package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import e6.s;
import e6.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdxh implements zzhfx {
    private final zzhgp zza;

    public zzdxh(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        String strValueOf;
        zzffo zzffoVarZza = ((zzcwd) this.zza).zza();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgW)).booleanValue()) {
            String str = zzffoVarZza.zzd.I;
            if (!TextUtils.isEmpty(str)) {
                try {
                    strValueOf = new JSONObject(str).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        if (zzffoVarZza.zzd.D != null) {
                            try {
                                strValueOf = new JSONObject(zzffoVarZza.zzd.D.f3362a).getString("request_id");
                                if (TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = String.valueOf(s.f3427f.e.nextInt() & f.API_PRIORITY_OTHER);
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            strValueOf = String.valueOf(s.f3427f.e.nextInt() & f.API_PRIORITY_OTHER);
                        }
                    }
                } catch (JSONException unused2) {
                }
            } else if (zzffoVarZza.zzd.D != null) {
                strValueOf = new JSONObject(zzffoVarZza.zzd.D.f3362a).getString("request_id");
                if (TextUtils.isEmpty(strValueOf)) {
                    strValueOf = String.valueOf(s.f3427f.e.nextInt() & f.API_PRIORITY_OTHER);
                }
            } else {
                strValueOf = String.valueOf(s.f3427f.e.nextInt() & f.API_PRIORITY_OTHER);
            }
        } else {
            strValueOf = String.valueOf(s.f3427f.e.nextInt() & f.API_PRIORITY_OTHER);
        }
        zzhgf.zzb(strValueOf);
        return strValueOf;
    }
}
