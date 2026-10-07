package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfph extends zzfpc {
    public zzfph(zzfov zzfovVar, HashSet hashSet, JSONObject jSONObject, long j4) {
        super(zzfovVar, hashSet, jSONObject, j4);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfon.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfpd, android.os.AsyncTask
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzfnr zzfnrVarZza;
        if (!TextUtils.isEmpty(str) && (zzfnrVarZza = zzfnr.zza()) != null) {
            for (zzfna zzfnaVar : zzfnrVarZza.zzc()) {
                if (((zzfpc) this).zza.contains(zzfnaVar.zzh())) {
                    zzfnaVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
