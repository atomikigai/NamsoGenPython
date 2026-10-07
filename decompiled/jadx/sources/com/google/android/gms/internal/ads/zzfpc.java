package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfpc extends zzfpd {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfpc(zzfov zzfovVar, HashSet hashSet, JSONObject jSONObject, long j4) {
        super(zzfovVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j4;
    }
}
