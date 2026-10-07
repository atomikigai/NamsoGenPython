package com.google.android.gms.internal.ads;

import h6.k0;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbnw implements zzbmo, zzbnv {
    private final zzbnv zza;
    private final HashSet zzb = new HashSet();

    public zzbnw(zzbnv zzbnvVar) {
        this.zza = zzbnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmo, com.google.android.gms.internal.ads.zzbmy
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmo, com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbmn.zzc(this, str, str2);
    }

    public final void zzc() {
        for (AbstractMap.SimpleEntry simpleEntry : this.zzb) {
            k0.k("Unregistering eventhandler: ".concat(String.valueOf(((zzbjr) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbjr) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbmn.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmo, com.google.android.gms.internal.ads.zzbmm
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbmn.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbmn.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzq(String str, zzbjr zzbjrVar) {
        this.zza.zzq(str, zzbjrVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbjrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzr(String str, zzbjr zzbjrVar) {
        this.zza.zzr(str, zzbjrVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbjrVar));
    }
}
