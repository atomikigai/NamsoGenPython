package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzful;
import com.google.android.gms.internal.ads.zzfum;
import com.google.android.gms.internal.ads.zzfvf;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzfvx;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements com.google.android.gms.common.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2117d;
    public Object e = new o3.y(this, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2118f = new o3.y(this, false);

    public h0(Context context, o3.n nVar, h6.o0 o0Var) {
        this.f2115b = context;
        this.f2116c = nVar;
        this.f2117d = o0Var;
    }

    public synchronized boolean a() {
        boolean zJ;
        Boolean bool = (Boolean) this.e;
        if (bool != null) {
            zJ = bool.booleanValue();
        } else {
            try {
                zJ = ((n9.g) this.f2115b).j();
            } catch (IllegalStateException unused) {
                zJ = false;
            }
        }
        c(zJ);
        return zJ;
    }

    @Override // com.google.android.gms.common.internal.d
    public void b(g7.b bVar) {
        ((h) this.f2118f).f2112y.post(new a1(1, this, bVar));
    }

    public void c(boolean z4) {
        String str;
        String str2 = z4 ? "ENABLED" : "DISABLED";
        if (((Boolean) this.e) == null) {
            str = "global Firebase setting";
        } else {
            str = this.f2114a ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String strK = da.v.k("Crashlytics automatic data collection ", str2, " by ", str, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strK, null);
        }
    }

    public void d(g7.b bVar) {
        f0 f0Var = (f0) ((h) this.f2118f).f2108u.get((a) this.f2116c);
        if (f0Var != null) {
            f0Var.n(bVar);
        }
    }

    public void e(String str, String str2) {
        h6.k0.k(str);
        if (((zzcfk) this.f2117d) != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zzcaj.zze.execute(new b3.b(this, "onError", map, 4, false));
        }
    }

    public void f(zzcfk zzcfkVar, zzfvf zzfvfVar) {
        if (zzcfkVar == null) {
            e("adWebview missing", "onLMDShow");
            return;
        }
        this.f2117d = zzcfkVar;
        if (!this.f2114a && !g(zzcfkVar.getContext())) {
            e("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzlf)).booleanValue()) {
            this.f2116c = zzfvfVar.zzh();
        }
        if (((a5.b) this.f2118f) == null) {
            this.f2118f = new a5.b(this, 14);
        }
        zzful zzfulVar = (zzful) this.e;
        if (zzfulVar != null) {
            zzfulVar.zzd(zzfvfVar, (a5.b) this.f2118f);
        }
    }

    public synchronized boolean g(Context context) {
        if (!zzfvx.zza(context)) {
            return false;
        }
        try {
            this.e = zzfum.zza(context);
        } catch (NullPointerException e) {
            h6.k0.k("Error connecting LMD Overlay service");
            d6.p.C.f2982g.zzw(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (((zzful) this.e) == null) {
            this.f2114a = false;
            return false;
        }
        if (((a5.b) this.f2118f) == null) {
            this.f2118f = new a5.b(this, 14);
        }
        this.f2114a = true;
        return true;
    }

    public zzfvk h() {
        zzfvj zzfvjVarZzc = zzfvk.zzc();
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzlf)).booleanValue() || TextUtils.isEmpty((String) this.f2116c)) {
            String str = (String) this.f2115b;
            if (str != null) {
                zzfvjVarZzc.zzb(str);
            } else {
                e("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfvjVarZzc.zza((String) this.f2116c);
        }
        return zzfvjVarZzc.zzc();
    }
}
