package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.internal.i0;
import d6.p;
import g7.f;
import h6.r0;
import h6.v;
import h6.x;
import i6.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbyc implements zzbyh {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhct zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbye zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbyc(Context context, i6.a aVar, zzbye zzbyeVar, String str, zzbyd zzbydVar) {
        i0.j(zzbyeVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbyeVar;
        Iterator it = zzbyeVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhct zzhctVarZzc = zzhes.zzc();
        zzhctVarZzc.zzn(9);
        zzhctVarZzc.zzj(str);
        zzhctVarZzc.zzh(str);
        zzhcu zzhcuVarZzc = zzhcv.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzhcuVarZzc.zza(str2);
        }
        zzhctVarZzc.zzg((zzhcv) zzhcuVarZzc.zzbr());
        zzhej zzhejVarZzc = zzhek.zzc();
        zzhejVarZzc.zzc(c.a(this.zzh).h());
        String str3 = aVar.f5213a;
        if (str3 != null) {
            zzhejVarZzc.zza(str3);
        }
        f fVar = f.f4241b;
        Context context2 = this.zzh;
        fVar.getClass();
        long jA = f.a(context2);
        if (jA > 0) {
            zzhejVarZzc.zzb(jA);
        }
        zzhctVarZzc.zzf((zzhek) zzhejVarZzc.zzbr());
        this.zzd = zzhctVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final zzbye zza() {
        return this.zzi;
    }

    public final /* synthetic */ m9.a zzb(Map map) throws Exception {
        zzheh zzhehVar;
        m9.a aVarZzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.zzj) {
                            try {
                                int length = jSONArrayOptJSONArray.length();
                                synchronized (this.zzj) {
                                    zzhehVar = (zzheh) this.zze.get(str);
                                }
                                if (zzhehVar == null) {
                                    zzbyg.zza("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i = 0; i < length; i++) {
                                        zzhehVar.zza(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                    }
                                    this.zza = (length > 0) | this.zza;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbev.zza.zze()).booleanValue()) {
                    h.c("Failed to get SafeBrowsing metadata", e);
                }
                return zzgei.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z4 = this.zza;
        if (!(z4 && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z4 || !this.zzi.zzd))) {
            return zzgei.zzh(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzc((zzhei) ((zzheh) it.next()).zzbr());
                }
                this.zzd.zza(this.zzf);
                this.zzd.zzb(this.zzg);
                if (zzbyg.zzb()) {
                    StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                    for (zzhei zzheiVar : this.zzd.zzm()) {
                        sb2.append("    [");
                        sb2.append(zzheiVar.zzc());
                        sb2.append("] ");
                        sb2.append(zzheiVar.zzg());
                    }
                    zzbyg.zza(sb2.toString());
                }
                byte[] bArrZzaV = ((zzhes) this.zzd.zzbr()).zzaV();
                String str2 = this.zzi.zzb;
                new x(this.zzh);
                v vVarA = x.a(1, str2, null, bArrZzaV);
                if (zzbyg.zzb()) {
                    vVarA.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbyg.zza("Pinged SB successfully.");
                        }
                    }, zzcaj.zza);
                }
                aVarZzm = zzgei.zzm(vVarA, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbya
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        int i10 = zzbyc.zzb;
                        return null;
                    }
                }, zzcaj.zzf);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final void zzd(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((zzheh) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzheh zzhehVarZzd = zzhei.zzd();
            int iZza = zzheg.zza(i);
            if (iZza != 0) {
                zzhehVarZzd.zze(iZza);
            }
            zzhehVarZzd.zzb(this.zze.size());
            zzhehVarZzd.zzd(str);
            zzhdg zzhdgVarZzc = zzhdj.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhde zzhdeVarZzc = zzhdf.zzc();
                        zzhdeVarZzc.zza(zzgxp.zzw(str2));
                        zzhdeVarZzc.zzb(zzgxp.zzw(str3));
                        zzhdgVarZzc.zza((zzhdf) zzhdeVarZzc.zzbr());
                    }
                }
            }
            zzhehVarZzd.zzc((zzhdj) zzhdgVarZzc.zzbr());
            this.zze.put(str, zzhehVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            m9.a aVarZzh = zzgei.zzh(Collections.EMPTY_MAP);
            zzgdp zzgdpVar = new zzgdp() { // from class: com.google.android.gms.internal.ads.zzbxx
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final m9.a zza(Object obj) {
                    return this.zza.zzb((Map) obj);
                }
            };
            zzges zzgesVar = zzcaj.zzf;
            m9.a aVarZzn = zzgei.zzn(aVarZzh, zzgdpVar, zzgesVar);
            m9.a aVarZzo = zzgei.zzo(aVarZzn, 10L, TimeUnit.SECONDS, zzcaj.zzd);
            zzgei.zzr(aVarZzn, new zzbyb(this, aVarZzo), zzgesVar);
            zzc.add(aVarZzo);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgxn zzgxnVarZzt = zzgxp.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzgxnVarZzt);
        synchronized (this.zzj) {
            zzhct zzhctVar = this.zzd;
            zzheb zzhebVarZzc = zzhed.zzc();
            zzhebVarZzc.zza(zzgxnVarZzt.zzb());
            zzhebVarZzc.zzb("image/png");
            zzhebVarZzc.zzc(2);
            zzhctVar.zzi((zzhed) zzhebVarZzc.zzbr());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final void zzg(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            r0 r0Var = p.C.f2979c;
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        h.e("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e4) {
                    e = e4;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            h.g("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e10) {
                        h.e("Fail to capture the webview", e10);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzbyg.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxy
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf(bitmap);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                zzcaj.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final void zzh(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzd();
                } else {
                    this.zzd.zze(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final boolean zzi() {
        return this.zzi.zzc && !this.zzl;
    }
}
