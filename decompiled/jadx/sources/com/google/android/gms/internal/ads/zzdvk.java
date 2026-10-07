package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import d6.p;
import e6.s;
import e6.t;
import e6.u1;
import h6.m0;
import h6.n0;
import i6.d;
import i6.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdvk implements zzdwl, zzduv {
    private final zzdvv zza;
    private final zzdwm zzb;
    private final zzduw zzc;
    private final zzdvf zzd;
    private final zzduu zze;
    private final zzdwh zzf;
    private final zzdvr zzg;
    private final zzdvr zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = "{}";
    private long zzq = Long.MAX_VALUE;
    private zzdvg zzr = zzdvg.NONE;
    private zzdvj zzv = zzdvj.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    public zzdvk(zzdvv zzdvvVar, zzdwm zzdwmVar, zzduw zzduwVar, Context context, i6.a aVar, zzdvf zzdvfVar, zzdwh zzdwhVar, zzdvr zzdvrVar, zzdvr zzdvrVar2, String str) {
        this.zza = zzdvvVar;
        this.zzb = zzdwmVar;
        this.zzc = zzduwVar;
        this.zze = new zzduu(context);
        this.zzi = aVar.f5213a;
        this.zzk = str;
        this.zzd = zzdvfVar;
        this.zzf = zzdwhVar;
        this.zzg = zzdvrVar;
        this.zzh = zzdvrVar2;
        this.zzj = context;
        p.C.f2987n.f5034g = this;
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((zzdvg) Enum.valueOf(zzdvg.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", "{}");
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject zzt() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.zzl.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzduy zzduyVar : (List) entry.getValue()) {
                    if (zzduyVar.zzg()) {
                        jSONArray.put(zzduyVar.zzd());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void zzu() {
        String str;
        String str2;
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        zzbce zzbceVar = zzbcn.zzjc;
        t tVar = t.f3437d;
        if (!TextUtils.isEmpty((CharSequence) tVar.f3440c.zza(zzbceVar))) {
            this.zzg.zzb(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) tVar.f3440c.zza(zzbceVar)).split(",")));
        }
        zzbce zzbceVar2 = zzbcn.zzjd;
        if (!TextUtils.isEmpty((CharSequence) tVar.f3440c.zza(zzbceVar2))) {
            this.zzh.zzb(this.zzj.getSharedPreferences("admob", 0), Arrays.asList(((String) tVar.f3440c.zza(zzbceVar2)).split(",")));
        }
        p pVar = p.C;
        n0 n0Var = (n0) pVar.f2982g.zzi();
        n0Var.l();
        synchronized (n0Var.f5036a) {
            str = n0Var.f5056x;
        }
        zzA(str);
        n0 n0Var2 = (n0) pVar.f2982g.zzi();
        n0Var2.l();
        synchronized (n0Var2.f5036a) {
            str2 = n0Var2.A;
        }
        this.zzx = str2;
    }

    private final void zzv() {
        m0 m0VarZzi = p.C.f2982g.zzi();
        String strZzd = zzd();
        n0 n0Var = (n0) m0VarZzi;
        n0Var.getClass();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziz)).booleanValue()) {
            n0Var.l();
            synchronized (n0Var.f5036a) {
                try {
                    if (n0Var.f5056x.equals(strZzd)) {
                        return;
                    }
                    n0Var.f5056x = strZzd;
                    SharedPreferences.Editor editor = n0Var.f5041g;
                    if (editor != null) {
                        editor.putString("inspector_info", strZzd);
                        n0Var.f5041g.apply();
                    }
                    n0Var.m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final synchronized void zzw(zzdvg zzdvgVar, boolean z4) {
        try {
            if (this.zzr != zzdvgVar) {
                if (zzq()) {
                    zzy();
                }
                this.zzr = zzdvgVar;
                if (zzq()) {
                    zzz();
                }
                if (z4) {
                    zzv();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    private final synchronized void zzx(boolean z4, boolean z10) {
        try {
            if (this.zzs != z4) {
                this.zzs = z4;
                if (z4) {
                    if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zziO)).booleanValue() || !p.C.f2987n.m()) {
                        zzz();
                    } else if (!zzq()) {
                        zzy();
                    }
                } else if (!zzq()) {
                    zzy();
                }
                if (z10) {
                    zzv();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzy() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzz() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzc();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    public final zzdvg zza() {
        return this.zzr;
    }

    public final synchronized m9.a zzb(String str) {
        zzcao zzcaoVar;
        try {
            zzcaoVar = new zzcao();
            if (this.zzm.containsKey(str)) {
                zzcaoVar.zzc((zzduy) this.zzm.get(str));
            } else {
                if (!this.zzn.containsKey(str)) {
                    this.zzn.put(str, new ArrayList());
                }
                ((List) this.zzn.get(str)).add(zzcaoVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzcaoVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziz)).booleanValue() && zzq()) {
            long j4 = this.zzq;
            p.C.f2983j.getClass();
            if (j4 < System.currentTimeMillis() / 1000) {
                this.zzo = "{}";
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals("{}")) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            long j4 = this.zzq;
            p.C.f2983j.getClass();
            if (j4 > System.currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!TextUtils.isEmpty(this.zzk)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.zzk);
                }
                jSONObject.put("internalSdkVersion", this.zzi);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.zzd.zza());
                zzbce zzbceVar = zzbcn.zziZ;
                t tVar = t.f3437d;
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                    String strZzn = p.C.f2982g.zzn();
                    if (!TextUtils.isEmpty(strZzn)) {
                        jSONObject.put("plugin", strZzn);
                    }
                }
                long j4 = this.zzq;
                p pVar = p.C;
                pVar.f2983j.getClass();
                if (j4 < System.currentTimeMillis() / 1000) {
                    this.zzo = "{}";
                }
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("adSlots", zzt());
                jSONObject.put("appInfo", this.zze.zza());
                String strZzc = ((n0) pVar.f2982g.zzi()).n().zzc();
                if (!TextUtils.isEmpty(strZzc)) {
                    jSONObject.put("cld", new JSONObject(strZzc));
                }
                if (((Boolean) tVar.f3440c.zza(zzbcn.zziP)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                    h.b("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.zzp);
                }
                if (((Boolean) tVar.f3440c.zza(zzbcn.zziO)).booleanValue()) {
                    jSONObject.put("openAction", this.zzv);
                    jSONObject.put("gesture", this.zzr);
                }
                jSONObject.put("isGamRegisteredTestDevice", pVar.f2987n.m());
                d dVar = s.f3427f.f3428a;
                jSONObject.put("isSimulator", d.m());
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzjb)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.zzx));
                }
                if (!TextUtils.isEmpty((CharSequence) tVar.f3440c.zza(zzbcn.zzjd))) {
                    jSONObject.put("gmaDisk", this.zzh.zza());
                }
                if (!TextUtils.isEmpty((CharSequence) tVar.f3440c.zza(zzbcn.zzjc))) {
                    jSONObject.put("userDisk", this.zzg.zza());
                }
            } catch (JSONException e) {
                p.C.f2982g.zzv(e, "Inspector.toJson");
                h.h("Ad inspector encountered an error", e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzduy zzduyVar) {
        zzbce zzbceVar = zzbcn.zziz;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && zzq()) {
            if (this.zzt >= ((Integer) tVar.f3440c.zza(zzbcn.zziB)).intValue()) {
                h.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzl.containsKey(str)) {
                this.zzl.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) this.zzl.get(str)).add(zzduyVar);
            if (((Boolean) tVar.f3440c.zza(zzbcn.zziX)).booleanValue()) {
                String strZzc = zzduyVar.zzc();
                this.zzm.put(strZzc, zzduyVar);
                if (this.zzn.containsKey(strZzc)) {
                    List list = (List) this.zzn.get(strZzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcao) it.next()).zzc(zzduyVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        String str;
        boolean z4;
        zzbce zzbceVar = zzbcn.zziz;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            if (((Boolean) tVar.f3440c.zza(zzbcn.zziO)).booleanValue()) {
                n0 n0Var = (n0) p.C.f2982g.zzi();
                n0Var.l();
                synchronized (n0Var.f5036a) {
                    z4 = n0Var.f5057y;
                }
                if (z4) {
                    zzu();
                    return;
                }
            }
            n0 n0Var2 = (n0) p.C.f2982g.zzi();
            n0Var2.l();
            synchronized (n0Var2.f5036a) {
                str = n0Var2.f5056x;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (new JSONObject(str).optBoolean("isTestMode", false)) {
                    zzu();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(u1 u1Var, zzdvj zzdvjVar) {
        if (!zzq()) {
            try {
                u1Var.zze(zzfgq.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                h.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziz)).booleanValue()) {
            this.zzv = zzdvjVar;
            this.zza.zzj(u1Var, new zzbkl(this), new zzbke(this.zzf), new zzbjs(this));
            return;
        } else {
            try {
                u1Var.zze(zzfgq.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                h.g("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized void zzi(String str, long j4) {
        this.zzo = str;
        this.zzq = j4;
        zzv();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        ((n0) p.C.f2982g.zzi()).b(this.zzx);
    }

    public final synchronized void zzk(long j4) {
        this.zzw += j4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    public final void zzl(boolean z4) {
        if (this.zzu) {
            if (z4) {
                if (!this.zzs) {
                    zzz();
                    return;
                }
            }
        } else if (z4) {
            zzu();
            if (!this.zzs) {
                zzz();
                return;
            }
        }
        if (zzq()) {
            return;
        }
        zzy();
    }

    public final void zzm(zzdvg zzdvgVar) {
        zzw(zzdvgVar, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z4) {
        if (!this.zzu && z4) {
            zzu();
        }
        zzx(z4, true);
    }

    public final boolean zzp() {
        return this.zzp != null;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziO)).booleanValue()) {
            return this.zzs || p.C.f2987n.m();
        }
        return this.zzs;
    }

    public final synchronized boolean zzr() {
        return this.zzs;
    }

    public final boolean zzs() {
        return this.zzw < ((Long) t.f3437d.f3440c.zza(zzbcn.zziU)).longValue();
    }
}
