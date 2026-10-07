package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfpg extends zzfpc {
    public zzfpg(zzfov zzfovVar, HashSet hashSet, JSONObject jSONObject, long j4) {
        super(zzfovVar, hashSet, jSONObject, j4);
    }

    private final void zzc(String str) {
        zzfnr zzfnrVarZza = zzfnr.zza();
        if (zzfnrVarZza != null) {
            for (zzfna zzfnaVar : zzfnrVarZza.zzc()) {
                if (((zzfpc) this).zza.contains(zzfnaVar.zzh())) {
                    zzfnaVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfpd, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfpd
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
