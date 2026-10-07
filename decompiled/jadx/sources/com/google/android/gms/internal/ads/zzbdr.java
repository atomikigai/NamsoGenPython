package com.google.android.gms.internal.ads;

import i6.h;
import org.json.JSONException;
import q6.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbdr extends b {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbds zzb;

    public zzbdr(zzbds zzbdsVar, String str) {
        this.zza = str;
        this.zzb = zzbdsVar;
    }

    @Override // q6.b
    public final void onFailure(String str) {
        h.g("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbds zzbdsVar = this.zzb;
            zzbdsVar.zzg.a(zzbdsVar.zzc(this.zza, str).toString());
        } catch (JSONException e) {
            h.e("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // q6.b
    public final void onSuccess(q6.a aVar) {
        String str = aVar.f8042a.f3089a;
        try {
            zzbds zzbdsVar = this.zzb;
            zzbdsVar.zzg.a(zzbdsVar.zzd(this.zza, str).toString());
        } catch (JSONException e) {
            h.e("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
