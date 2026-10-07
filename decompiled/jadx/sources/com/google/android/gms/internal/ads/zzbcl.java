package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import e6.t;
import g7.h;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbcl implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbcp.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzbci
                @Override // com.google.android.gms.internal.ads.zzfxg
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final Object zza(final zzbce zzbceVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbceVar.zzk();
            }
        }
        if (zzbceVar.zze() != 2) {
            return (zzbceVar.zze() == 1 && this.zzh.has(zzbceVar.zzl())) ? zzbceVar.zza(this.zzh) : zzbcp.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzbcj
                @Override // com.google.android.gms.internal.ads.zzfxg
                public final Object zza() {
                    return this.zza.zzc(zzbceVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbceVar.zzk() : zzbceVar.zzb(bundle);
    }

    public final Object zzb(zzbce zzbceVar) {
        return (this.zzd || this.zza) ? zza(zzbceVar) : zzbceVar.zzk();
    }

    public final /* synthetic */ Object zzc(zzbce zzbceVar) {
        return zzbceVar.zzc(this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b0 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:87:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:87:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:87:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:87:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0101 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:87:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0125 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:45:0x00a6, B:46:0x00aa, B:47:0x00ad, B:56:0x00dd, B:70:0x0125, B:78:0x0150, B:79:0x0157, B:81:0x0159, B:82:0x0160, B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:94:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x012a A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:87:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0142 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:87:0x0046, outer: #4 }] */
    public final void zzd(Context context) {
        Context applicationContext;
        final SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        ConditionVariable conditionVariable;
        zzbdx zzbdxVar;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzd) {
                    return;
                }
                if (!this.zza) {
                    this.zza = true;
                }
                this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zzg = context;
                try {
                    this.zzf = c.a(context).d(128, this.zzg.getPackageName()).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context2 = this.zzg;
                    AtomicBoolean atomicBoolean = h.f4242a;
                    SharedPreferences sharedPreferencesZza = null;
                    try {
                        applicationContext = context2.createPackageContext("com.google.android.gms", 3);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        applicationContext = null;
                    }
                    if (applicationContext != null || context2 == null || (applicationContext = context2.getApplicationContext()) != null) {
                        context2 = applicationContext;
                    }
                    if (context2 != null) {
                        zzbcg zzbcgVar = t.f3437d.f3439b;
                        sharedPreferencesZza = zzbcg.zza(context2);
                    }
                    if (sharedPreferencesZza != null) {
                        zzbfe.zzc(new zzbck(this, sharedPreferencesZza));
                    }
                    if (!this.zzi) {
                        zzbdx zzbdxVar2 = zzbef.zzd;
                        if (((Long) zzbdxVar2.zze()).longValue() > 0 && zzbbx.zza(this.zzg) >= ((Long) zzbdxVar2.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                            this.zza = false;
                            conditionVariable = this.zzc;
                        } else if (this.zzi) {
                            Context context3 = this.zzg;
                            if (!((Boolean) zzben.zzh.zze()).booleanValue()) {
                                if (((Boolean) zzben.zzi.zze()).booleanValue()) {
                                    if (new JSONObject((String) zzbcp.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzbch
                                        @Override // com.google.android.gms.internal.ads.zzfxg
                                        public final Object zza() {
                                            return sharedPreferences.getString("app_settings_json", "{}");
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    zzbcg zzbcgVar2 = t.f3437d.f3439b;
                                    this.zze = zzbcg.zza(context2);
                                    if (!((Boolean) zzben.zza.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                conditionVariable = this.zzc;
                            }
                            context2 = this.zzg;
                            if (context2 == null) {
                                zzbcg zzbcgVar3 = t.f3437d.f3439b;
                                this.zze = zzbcg.zza(context2);
                                if (!((Boolean) zzben.zza.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            conditionVariable = this.zzc;
                        } else {
                            zzbdxVar = zzbef.zzf;
                            if (((Long) zzbdxVar.zze()).longValue() > 0 || zzbbx.zzb(this.zzg) < ((Long) zzbdxVar.zze()).longValue()) {
                                Context context4 = this.zzg;
                                if (!((Boolean) zzben.zzh.zze()).booleanValue()) {
                                    if (((Boolean) zzben.zzi.zze()).booleanValue() && (sharedPreferences = context4.getSharedPreferences("admob", 0)) != null) {
                                        try {
                                            if (new JSONObject((String) zzbcp.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzbch
                                                @Override // com.google.android.gms.internal.ads.zzfxg
                                                public final Object zza() {
                                                    return sharedPreferences.getString("app_settings_json", "{}");
                                                }
                                            })).optBoolean("local_flags_enabled")) {
                                            }
                                        } catch (JSONException unused3) {
                                        }
                                    }
                                    if (context2 == null) {
                                        zzbcg zzbcgVar4 = t.f3437d.f3439b;
                                        this.zze = zzbcg.zza(context2);
                                        if (!((Boolean) zzben.zza.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                                            sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                        }
                                        zzg(this.zze);
                                        this.zzd = true;
                                        this.zza = false;
                                        this.zzc.open();
                                        return;
                                    }
                                    this.zza = false;
                                    conditionVariable = this.zzc;
                                }
                                context2 = this.zzg;
                                if (context2 == null) {
                                    zzbcg zzbcgVar5 = t.f3437d.f3439b;
                                    this.zze = zzbcg.zza(context2);
                                    if (!((Boolean) zzben.zza.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                conditionVariable = this.zzc;
                            } else {
                                this.zzj = true;
                                this.zzd = true;
                                this.zza = false;
                                conditionVariable = this.zzc;
                            }
                        }
                    } else if (this.zzi) {
                        zzbdxVar = zzbef.zzf;
                        if (((Long) zzbdxVar.zze()).longValue() > 0) {
                            Context context5 = this.zzg;
                            if (!((Boolean) zzben.zzh.zze()).booleanValue()) {
                                if (((Boolean) zzben.zzi.zze()).booleanValue()) {
                                    if (new JSONObject((String) zzbcp.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzbch
                                        @Override // com.google.android.gms.internal.ads.zzfxg
                                        public final Object zza() {
                                            return sharedPreferences.getString("app_settings_json", "{}");
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    zzbcg zzbcgVar6 = t.f3437d.f3439b;
                                    this.zze = zzbcg.zza(context2);
                                    if (!((Boolean) zzben.zza.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                conditionVariable = this.zzc;
                            }
                            context2 = this.zzg;
                            if (context2 == null) {
                                zzbcg zzbcgVar7 = t.f3437d.f3439b;
                                this.zze = zzbcg.zza(context2);
                                if (!((Boolean) zzben.zza.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            conditionVariable = this.zzc;
                        } else {
                            Context context6 = this.zzg;
                            if (!((Boolean) zzben.zzh.zze()).booleanValue()) {
                                if (((Boolean) zzben.zzi.zze()).booleanValue()) {
                                    if (new JSONObject((String) zzbcp.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzbch
                                        @Override // com.google.android.gms.internal.ads.zzfxg
                                        public final Object zza() {
                                            return sharedPreferences.getString("app_settings_json", "{}");
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    zzbcg zzbcgVar8 = t.f3437d.f3439b;
                                    this.zze = zzbcg.zza(context2);
                                    if (!((Boolean) zzben.zza.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                conditionVariable = this.zzc;
                            }
                            context2 = this.zzg;
                            if (context2 == null) {
                                zzbcg zzbcgVar9 = t.f3437d.f3439b;
                                this.zze = zzbcg.zza(context2);
                                if (!((Boolean) zzben.zza.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            conditionVariable = this.zzc;
                        }
                    } else {
                        Context context7 = this.zzg;
                        if (!((Boolean) zzben.zzh.zze()).booleanValue()) {
                            if (((Boolean) zzben.zzi.zze()).booleanValue()) {
                                if (new JSONObject((String) zzbcp.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzbch
                                    @Override // com.google.android.gms.internal.ads.zzfxg
                                    public final Object zza() {
                                        return sharedPreferences.getString("app_settings_json", "{}");
                                    }
                                })).optBoolean("local_flags_enabled")) {
                                }
                            }
                            if (context2 == null) {
                                zzbcg zzbcgVar10 = t.f3437d.f3439b;
                                this.zze = zzbcg.zza(context2);
                                if (!((Boolean) zzben.zza.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            conditionVariable = this.zzc;
                        }
                        context2 = this.zzg;
                        if (context2 == null) {
                            zzbcg zzbcgVar11 = t.f3437d.f3439b;
                            this.zze = zzbcg.zza(context2);
                            if (!((Boolean) zzben.zza.zze()).booleanValue()) {
                                sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzg(this.zze);
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                        this.zza = false;
                        conditionVariable = this.zzc;
                    }
                    conditionVariable.open();
                } catch (Throwable th) {
                    this.zza = false;
                    this.zzc.open();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzi;
    }
}
