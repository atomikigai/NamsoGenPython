package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import d6.p;
import e6.t;
import h6.k0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbdp extends o.a {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) t.f3437d.f3440c.zza(zzbcn.zzjx)).split(","));
    private final zzbds zzc;
    private final o.a zzd;
    private final zzdsr zze;

    public zzbdp(zzbds zzbdsVar, o.a aVar, zzdsr zzdsrVar) {
        this.zzd = aVar;
        this.zzc = zzbdsVar;
        this.zze = zzdsrVar;
    }

    private final void zzb(String str) {
        android.support.v4.media.session.a.N(this.zze, "pact_action", new Pair("pe", str));
    }

    @Override // o.a
    public final void extraCallback(String str, Bundle bundle) {
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.extraCallback(str, bundle);
        }
    }

    @Override // o.a
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        o.a aVar = this.zzd;
        if (aVar != null) {
            return aVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // o.a
    public final void onActivityResized(int i, int i10, Bundle bundle) {
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onActivityResized(i, i10, bundle);
        }
    }

    @Override // o.a
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onMessageChannelReady(bundle);
        }
    }

    @Override // o.a
    public final void onNavigationEvent(int i, Bundle bundle) {
        List list;
        this.zza.set(false);
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onNavigationEvent(i, bundle);
        }
        zzbds zzbdsVar = this.zzc;
        p.C.f2983j.getClass();
        zzbdsVar.zzi(System.currentTimeMillis());
        if (this.zzc == null || (list = this.zzb) == null || !list.contains(String.valueOf(i))) {
            return;
        }
        this.zzc.zzf();
        zzb("pact_reqpmc");
    }

    @Override // o.a
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzh(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            k0.l("Message is not in JSON format: ", e);
        }
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onPostMessage(str, bundle);
        }
    }

    @Override // o.a
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z4, Bundle bundle) {
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onRelationshipValidationResult(i, uri, z4, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
