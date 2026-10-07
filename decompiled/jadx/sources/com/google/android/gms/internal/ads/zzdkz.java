package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import d6.p;
import e6.n1;
import e6.q1;
import e6.t;
import h6.r0;
import i6.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdkz implements zzdjg {
    private final zzbpv zza;
    private final zzcxe zzb;
    private final zzcwk zzc;
    private final zzdej zzd;
    private final Context zze;
    private final zzfet zzf;
    private final i6.a zzg;
    private final zzffo zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbpr zzl;
    private final zzbps zzm;

    public zzdkz(zzbpr zzbprVar, zzbps zzbpsVar, zzbpv zzbpvVar, zzcxe zzcxeVar, zzcwk zzcwkVar, zzdej zzdejVar, Context context, zzfet zzfetVar, i6.a aVar, zzffo zzffoVar) {
        this.zzl = zzbprVar;
        this.zzm = zzbpsVar;
        this.zza = zzbpvVar;
        this.zzb = zzcxeVar;
        this.zzc = zzcwkVar;
        this.zzd = zzdejVar;
        this.zze = context;
        this.zzf = zzfetVar;
        this.zzg = aVar;
        this.zzh = zzffoVar;
    }

    private final void zzb(View view) {
        try {
            zzbpv zzbpvVar = this.zza;
            if (zzbpvVar != null && !zzbpvVar.zzA()) {
                this.zza.zzw(new b(view));
                this.zzc.onAdClicked();
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkt)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbpr zzbprVar = this.zzl;
            if (zzbprVar != null && !zzbprVar.zzx()) {
                this.zzl.zzs(new b(view));
                this.zzc.onAdClicked();
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkt)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbps zzbpsVar = this.zzm;
            if (zzbpsVar == null || zzbpsVar.zzv()) {
                return;
            }
            this.zzm.zzq(new b(view));
            this.zzc.onAdClicked();
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkt)).booleanValue()) {
                this.zzd.zzdG();
            }
        } catch (RemoteException e) {
            h.h("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzB() {
        return this.zzf.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzg() {
        h.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzj(q1 q1Var) {
        h.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzk(View view, View view2, Map map, Map map2, boolean z4, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzL) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzo(View view, View view2, Map map, Map map2, boolean z4, ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            h.g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzL) {
            zzb(view2);
        } else {
            h.g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = p.C.f2987n.o(this.zze, this.zzg.f5213a, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbpv zzbpvVar = this.zza;
                if (zzbpvVar != null && !zzbpvVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbpr zzbprVar = this.zzl;
                if (zzbprVar != null && !zzbprVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbps zzbpsVar = this.zzm;
                if (zzbpsVar == null || zzbpsVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            h.h("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzw(n1 n1Var) {
        h.g("Mute This Ad is not supported for 3rd party ads");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ce A[Catch: RemoteException -> 0x002c, JSONException -> 0x0048, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x002c, blocks: (B:2:0x0000, B:4:0x001c, B:8:0x0026, B:13:0x0032, B:15:0x0039, B:16:0x0048, B:18:0x004e, B:20:0x005a, B:23:0x0066, B:26:0x006d, B:28:0x0083, B:30:0x008b, B:45:0x00aa, B:35:0x0095, B:39:0x009e, B:48:0x00b1, B:49:0x00b5, B:51:0x00ce, B:55:0x00e2, B:57:0x00f0, B:58:0x00fe, B:60:0x0102, B:61:0x0115, B:63:0x0119), top: B:70:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00cc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ArrayList arrayList;
        ClassLoader classLoader;
        int size;
        int i;
        Object obj2;
        q7.a aVarZzn;
        try {
            b bVar = new b(view);
            JSONObject jSONObject = this.zzf.zzaj;
            boolean z4 = true;
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbD)).booleanValue() && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbE)).booleanValue() && next.equals("3010")) {
                                zzbpv zzbpvVar = this.zza;
                                Object objI = null;
                                if (zzbpvVar != null) {
                                    try {
                                        aVarZzn = zzbpvVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbpr zzbprVar = this.zzl;
                                    if (zzbprVar != null) {
                                        aVarZzn = zzbprVar.zzk();
                                    } else {
                                        zzbps zzbpsVar = this.zzm;
                                        aVarZzn = zzbpsVar != null ? zzbpsVar.zzj() : null;
                                    }
                                }
                                if (aVarZzn != null) {
                                    objI = b.I(aVarZzn);
                                }
                                if (objI != null) {
                                    cls = objI.getClass();
                                    arrayList = new ArrayList();
                                    qd.b.J(jSONArrayOptJSONArray, arrayList);
                                    r0 r0Var = p.C.f2979c;
                                    classLoader = this.zze.getClassLoader();
                                    size = arrayList.size();
                                    i = 0;
                                    while (true) {
                                        if (i < size) {
                                            obj2 = arrayList.get(i);
                                            i++;
                                            if (Class.forName((String) obj2, false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    arrayList = new ArrayList();
                                    qd.b.J(jSONArrayOptJSONArray, arrayList);
                                    r0 r0Var2 = p.C.f2979c;
                                    classLoader = this.zze.getClassLoader();
                                    size = arrayList.size();
                                    i = 0;
                                    while (true) {
                                        if (i < size) {
                                            obj2 = arrayList.get(i);
                                            i++;
                                            if (Class.forName((String) obj2, false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z4 = false;
                        break;
                    }
                }
            }
            this.zzk = z4;
            HashMap mapZzc = zzc(map);
            HashMap mapZzc2 = zzc(map2);
            zzbpv zzbpvVar2 = this.zza;
            if (zzbpvVar2 != null) {
                zzbpvVar2.zzy(bVar, new b(mapZzc), new b(mapZzc2));
                return;
            }
            zzbpr zzbprVar2 = this.zzl;
            if (zzbprVar2 != null) {
                zzbprVar2.zzv(bVar, new b(mapZzc), new b(mapZzc2));
                this.zzl.zzu(bVar);
                return;
            }
            zzbps zzbpsVar2 = this.zzm;
            if (zzbpsVar2 != null) {
                zzbpsVar2.zzt(bVar, new b(mapZzc), new b(mapZzc2));
                this.zzm.zzs(bVar);
            }
        } catch (RemoteException e) {
            h.h("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzz(View view, Map map) {
        try {
            b bVar = new b(view);
            zzbpv zzbpvVar = this.zza;
            if (zzbpvVar != null) {
                zzbpvVar.zzz(bVar);
                return;
            }
            zzbpr zzbprVar = this.zzl;
            if (zzbprVar != null) {
                zzbprVar.zzw(bVar);
                return;
            }
            zzbps zzbpsVar = this.zzm;
            if (zzbpsVar != null) {
                zzbpsVar.zzu(bVar);
            }
        } catch (RemoteException e) {
            h.h("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzx(zzbhs zzbhsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }
}
