package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import e6.t;
import h6.k0;
import i6.h;
import i6.k;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p6.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzdsu {
    protected final Map zza;
    protected final Context zzb;
    protected final Executor zzc;
    protected final k zzd;
    protected final boolean zze;
    private final c zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicReference zzj;

    public zzdsu(Executor executor, k kVar, c cVar, Context context) {
        this.zza = new HashMap();
        this.zzi = new AtomicBoolean();
        this.zzj = new AtomicReference(new Bundle());
        this.zzc = executor;
        this.zzd = kVar;
        zzbce zzbceVar = zzbcn.zzcd;
        t tVar = t.f3437d;
        this.zze = ((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue();
        this.zzf = cVar;
        this.zzg = ((Boolean) tVar.f3440c.zza(zzbcn.zzcg)).booleanValue();
        this.zzh = ((Boolean) tVar.f3440c.zza(zzbcn.zzgP)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map, boolean z4) {
        Bundle bundleW;
        if (map.isEmpty()) {
            h.b("Empty paramMap.");
            return;
        }
        if (map.isEmpty()) {
            h.b("Empty or null paramMap.");
        } else {
            if (!this.zzi.getAndSet(true)) {
                final String str = (String) t.f3437d.f3440c.zza(zzbcn.zzkh);
                Context context = this.zzb;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdst
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        this.zza.zzd(str, sharedPreferences, str2);
                    }
                };
                if (TextUtils.isEmpty(str)) {
                    bundleW = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    bundleW = p3.a.w(context, str);
                }
                this.zzj.set(bundleW);
            }
            Bundle bundle = (Bundle) this.zzj.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        final String strA = this.zzf.a(map);
        k0.k(strA);
        boolean z10 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z4 || this.zzg) {
                if (!z10 || this.zzh) {
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdss
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzd.zza(strA);
                        }
                    });
                }
            }
        }
    }

    public final String zzb(Map map) {
        return this.zzf.a(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zza);
    }

    public final /* synthetic */ void zzd(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzj.set(p3.a.w(this.zzb, str));
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    public final void zzf(Map map) {
        zza(map, false);
    }
}
