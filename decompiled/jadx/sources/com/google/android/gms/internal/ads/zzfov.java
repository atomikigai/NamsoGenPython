package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfov {
    private JSONObject zza;
    private final zzfpe zzb;

    public zzfov(zzfpe zzfpeVar) {
        this.zzb = zzfpeVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfpf(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j4) {
        this.zzb.zzb(new zzfpg(this, hashSet, jSONObject, j4));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j4) {
        this.zzb.zzb(new zzfph(this, hashSet, jSONObject, j4));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
