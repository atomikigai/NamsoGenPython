package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import d6.p;
import e6.t;
import i6.h;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import o.n;
import o6.b;
import o6.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ta.c;
import w5.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbds {
    private final ScheduledExecutorService zza;
    private final x zzb;
    private final b zzc;
    private final zzdsr zzd;
    private Runnable zze;
    private zzbdp zzf;
    private n zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbds(ScheduledExecutorService scheduledExecutorService, x xVar, b bVar, zzdsr zzdsrVar) {
        this.zza = scheduledExecutorService;
        this.zzb = xVar;
        this.zzc = bVar;
        this.zzd = zzdsrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (((java.lang.Boolean) e6.t.f3437d.f3440c.zza(com.google.android.gms.internal.ads.zzbcn.zzjv)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbdp r0 = r6.zzf
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            i6.h.d(r0)
            return
        La:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r6.zzh
            if (r0 == 0) goto L98
            o.n r0 = r6.zzg
            if (r0 == 0) goto L98
            java.util.concurrent.ScheduledExecutorService r0 = r6.zza
            if (r0 == 0) goto L98
            long r0 = r6.zzi
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L3c
        L2a:
            d6.p r0 = d6.p.C
            n7.b r0 = r0.f2983j
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.zzi
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L3c
            goto L4e
        L3c:
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzjv
            e6.t r1 = e6.t.f3437d
            com.google.android.gms.internal.ads.zzbcl r1 = r1.f3440c
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L98
        L4e:
            o.n r0 = r6.zzg
            java.lang.String r1 = r6.zzh
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.getClass()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            o.g r3 = r0.f7432c
            b.d r0 = r0.f7431b
            android.os.Bundle r4 = new android.os.Bundle     // Catch: android.os.RemoteException -> L7e
            r4.<init>()     // Catch: android.os.RemoteException -> L7e
            boolean r5 = r4.isEmpty()     // Catch: android.os.RemoteException -> L7e
            if (r5 == 0) goto L6e
            r4 = 0
        L6e:
            if (r4 == 0) goto L79
            r2.putAll(r4)     // Catch: android.os.RemoteException -> L7e
            b.b r0 = (b.b) r0     // Catch: android.os.RemoteException -> L7e
            r0.K(r3, r1, r2)     // Catch: android.os.RemoteException -> L7e
            goto L7e
        L79:
            b.b r0 = (b.b) r0     // Catch: android.os.RemoteException -> L7e
            r0.J(r3, r1)     // Catch: android.os.RemoteException -> L7e
        L7e:
            java.util.concurrent.ScheduledExecutorService r0 = r6.zza
            java.lang.Runnable r1 = r6.zze
            com.google.android.gms.internal.ads.zzbce r2 = com.google.android.gms.internal.ads.zzbcn.zzjw
            e6.t r3 = e6.t.f3437d
            com.google.android.gms.internal.ads.zzbcl r3 = r3.f3440c
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L98:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            h6.k0.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbds.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) t.f3437d.f3440c.zza(zzbcn.zzjy));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e) {
            h.e("Error fetching the PACT active eids JSON: ", e);
        }
    }

    public final n zzb() {
        return this.zzg;
    }

    public final JSONObject zzc(String str, String str2) throws JSONException {
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            jLongValue = ((Long) t.f3437d.f3440c.zza(zzbcn.zzjz)).longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject.put("sdk_ttl_ms", jLongValue);
        zzk(jSONObject);
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            jSONObject.put("appLevelSignals", this.zzc.a());
        }
        return jSONObject;
    }

    public final JSONObject zzd(String str, String str2) throws JSONException {
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            jLongValue = ((Long) t.f3437d.f3440c.zza(zzbcn.zzjz)).longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject.put("sdk_ttl_ms", jLongValue);
        zzk(jSONObject);
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            jSONObject.put("appLevelSignals", this.zzc.a());
        }
        return jSONObject;
    }

    public final void zzf() {
        p.C.f2983j.getClass();
        this.zzi = SystemClock.elapsedRealtime() + ((long) ((Integer) t.f3437d.f3440c.zza(zzbcn.zzju)).intValue());
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, o.h hVar, String str, o.a aVar) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzbdp zzbdpVar = new zzbdp(this, aVar, this.zzd);
        this.zzf = zzbdpVar;
        n nVarB = hVar.b(zzbdpVar);
        this.zzg = nVarB;
        if (nVarB == null) {
            h.d("CustomTabsClient failed to create new session.");
        }
        android.support.v4.media.session.a.N(this.zzd, "pact_action", new Pair("pe", "pact_init"));
    }

    public final void zzh(String str) {
        try {
            n nVar = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbes.zza.zze()).booleanValue()) {
                jSONObject.put("appLevelSignals", this.zzc.a());
            }
            nVar.a(jSONObject.toString());
            zzbdr zzbdrVar = new zzbdr(this, str);
            if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
                this.zzb.b(this.zzg, zzbdrVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            Context context = this.zzl;
            c cVar = new c();
            cVar.e(bundle);
            q6.a.a(context, new g(cVar), zzbdrVar);
        } catch (JSONException e) {
            h.e("Error creating JSON: ", e);
        }
    }

    public final void zzi(long j4) {
        this.zzj = j4;
    }
}
