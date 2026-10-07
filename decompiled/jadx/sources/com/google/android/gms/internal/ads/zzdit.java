package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import d6.p;
import e6.n1;
import e6.q1;
import e6.t;
import e6.y1;
import h6.r0;
import i6.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import q7.b;
import r.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdit extends zzcrq {
    public static final /* synthetic */ int zzc = 0;
    private final Executor zzd;
    private final zzdiy zze;
    private final zzdjg zzf;
    private final zzdjy zzg;
    private final zzdjd zzh;
    private final zzdjj zzi;
    private final zzhfr zzj;
    private final zzhfr zzk;
    private final zzhfr zzl;
    private final zzhfr zzm;
    private final zzhfr zzn;
    private zzdku zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbyr zzs;
    private final zzavc zzt;
    private final i6.a zzu;
    private final Context zzv;
    private final zzdiv zzw;
    private final zzemv zzx;
    private final Map zzy;
    private final List zzz;

    static {
        zzfzo.zzs("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public zzdit(zzcrp zzcrpVar, Executor executor, zzdiy zzdiyVar, zzdjg zzdjgVar, zzdjy zzdjyVar, zzdjd zzdjdVar, zzdjj zzdjjVar, zzhfr zzhfrVar, zzhfr zzhfrVar2, zzhfr zzhfrVar3, zzhfr zzhfrVar4, zzhfr zzhfrVar5, zzbyr zzbyrVar, zzavc zzavcVar, i6.a aVar, Context context, zzdiv zzdivVar, zzemv zzemvVar, zzayo zzayoVar) {
        super(zzcrpVar);
        this.zzd = executor;
        this.zze = zzdiyVar;
        this.zzf = zzdjgVar;
        this.zzg = zzdjyVar;
        this.zzh = zzdjdVar;
        this.zzi = zzdjjVar;
        this.zzj = zzhfrVar;
        this.zzk = zzhfrVar2;
        this.zzl = zzhfrVar3;
        this.zzm = zzhfrVar4;
        this.zzn = zzhfrVar5;
        this.zzs = zzbyrVar;
        this.zzt = zzavcVar;
        this.zzu = aVar;
        this.zzv = context;
        this.zzw = zzdivVar;
        this.zzx = zzemvVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
    }

    public static boolean zzY(View view) {
        zzbce zzbceVar = zzbcn.zzkl;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        r0 r0Var = p.C.f2979c;
        long jI = r0.I(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jI >= ((Integer) tVar.f3440c.zza(zzbcn.zzkm)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized ImageView.ScaleType zzaa() {
        zzdku zzdkuVar = this.zzo;
        if (zzdkuVar == null) {
            h.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        q7.a aVarZzj = zzdkuVar.zzj();
        if (aVarZzj != null) {
            return (ImageView.ScaleType) b.I(aVarZzj);
        }
        return zzdjy.zza;
    }

    private final void zzab(String str, boolean z4) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfk)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        m9.a aVarZzw = this.zze.zzw();
        if (aVarZzw == null) {
            return;
        }
        zzgei.zzr(aVarZzw, new zzdir(this, "Google", true), this.zzd);
    }

    private final synchronized void zzac(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzaa());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad(View view, zzeew zzeewVar) {
        zzcfk zzcfkVarZzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzeewVar == null || zzcfkVarZzr == null || view == null) {
            return;
        }
        p.C.f2997x.zzj(zzeewVar.zza(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzz(zzdku zzdkuVar) {
        Iterator<String> itKeys;
        View view;
        zzaux zzauxVarZzc;
        try {
            if (!this.zzp) {
                this.zzo = zzdkuVar;
                this.zzg.zze(zzdkuVar);
                this.zzf.zzy(zzdkuVar.zzf(), zzdkuVar.zzm(), zzdkuVar.zzn(), zzdkuVar, zzdkuVar);
                zzbce zzbceVar = zzbcn.zzcJ;
                t tVar = t.f3437d;
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && (zzauxVarZzc = this.zzt.zzc()) != null) {
                    zzauxVarZzc.zzo(zzdkuVar.zzf());
                }
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzbQ)).booleanValue()) {
                    zzfet zzfetVar = this.zzb;
                    if (zzfetVar.zzak && (itKeys = zzfetVar.zzaj.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                            this.zzy.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzayn zzaynVar = new zzayn(this.zzv, view);
                                this.zzz.add(zzaynVar);
                                zzaynVar.zzc(new zzdiq(this, next));
                            }
                        }
                    }
                }
                if (zzdkuVar.zzi() != null) {
                    zzdkuVar.zzi().zzc(this.zzs);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzA(zzdku zzdkuVar) {
        this.zzf.zzz(zzdkuVar.zzf(), zzdkuVar.zzl());
        if (zzdkuVar.zzh() != null) {
            zzdkuVar.zzh().setClickable(false);
            zzdkuVar.zzh().removeAllViews();
        }
        if (zzdkuVar.zzi() != null) {
            zzdkuVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzl(zzdit zzditVar) {
        try {
            zzdiy zzdiyVar = zzditVar.zze;
            int iZzc = zzdiyVar.zzc();
            if (iZzc == 1) {
                if (zzditVar.zzi.zzb() != null) {
                    zzditVar.zzab("Google", true);
                    zzditVar.zzi.zzb().zze((zzbgp) zzditVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 2) {
                if (zzditVar.zzi.zza() != null) {
                    zzditVar.zzab("Google", true);
                    zzditVar.zzi.zza().zze((zzbgn) zzditVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 3) {
                if (zzditVar.zzi.zzd(zzdiyVar.zzA()) != null) {
                    if (zzditVar.zze.zzs() != null) {
                        zzditVar.zzf("Google", true);
                    }
                    zzditVar.zzi.zzd(zzditVar.zze.zzA()).zze((zzbgs) zzditVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 6) {
                if (zzditVar.zzi.zzf() != null) {
                    zzditVar.zzab("Google", true);
                    zzditVar.zzi.zzf().zze((zzbhv) zzditVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzc != 7) {
                h.d("Wrong native template id!");
                return;
            }
            zzdjj zzdjjVar = zzditVar.zzi;
            if (zzdjjVar.zzg() != null) {
                zzdjjVar.zzg().zzg((zzbme) zzditVar.zzm.zzb());
            }
        } catch (RemoteException e) {
            h.e("RemoteException when notifyAdLoad is called", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006a A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[Catch: all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    public final synchronized void zzB(View view, Map map, Map map2, boolean z4) {
        Iterator it;
        View view2;
        try {
            if (!this.zzq) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbQ)).booleanValue() && this.zzb.zzak) {
                    Iterator it2 = this.zzy.keySet().iterator();
                    while (it2.hasNext()) {
                        if (!((Boolean) this.zzy.get((String) it2.next())).booleanValue()) {
                        }
                    }
                    if (!z4) {
                        zzac(view, map, map2);
                        return;
                    }
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdW)).booleanValue()) {
                        it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                            if (view2 == null) {
                            }
                        }
                    }
                } else {
                    if (!z4) {
                        zzac(view, map, map2);
                        return;
                    }
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdW)).booleanValue() && map != null) {
                        it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                            if (view2 == null && zzY(view2)) {
                                zzac(view, map, map2);
                                return;
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzC(q1 q1Var) {
        this.zzf.zzj(q1Var);
    }

    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z4) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z4, zzaa());
        if (this.zzr) {
            zzdiy zzdiyVar = this.zze;
            if (zzdiyVar.zzs() != null) {
                zzdiyVar.zzs().zzd("onSdkAdUserInteractionClick", new e(0));
            }
        }
    }

    public final synchronized void zzE(final View view, final int i) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlh)).booleanValue()) {
            zzdku zzdkuVar = this.zzo;
            if (zzdkuVar == null) {
                h.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z4 = zzdkuVar instanceof zzdjs;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdin
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzx(view, z4, i);
                    }
                });
            }
        }
    }

    public final synchronized void zzF(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzH() {
        zzdku zzdkuVar = this.zzo;
        if (zzdkuVar == null) {
            h.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z4 = zzdkuVar instanceof zzdjs;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdip
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzy(z4);
                }
            });
        }
    }

    public final void zzI(Bundle bundle) {
        final zzcfk zzcfkVarZzs = this.zze.zzs();
        if (zzcfkVarZzs == null) {
            h.d("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdim
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzdit.zzc;
                    zzcfkVarZzs.zze("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e) {
            h.e("Error reading event signals", e);
        }
    }

    public final synchronized void zzJ() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzK(View view) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfk)).booleanValue()) {
            zzad(view, this.zze.zzu());
            return;
        }
        zzcao zzcaoVarZzp = this.zze.zzp();
        if (zzcaoVarZzp == null) {
            return;
        }
        zzgei.zzr(zzcaoVarZzp, new zzdis(this, view), this.zzd);
    }

    public final synchronized void zzL(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzM(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzN(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzO() {
        this.zzf.zzv();
    }

    public final synchronized void zzP(n1 n1Var) {
        this.zzf.zzw(n1Var);
    }

    public final synchronized void zzQ(y1 y1Var) {
        this.zzx.zza(y1Var);
    }

    public final synchronized void zzR(zzbhs zzbhsVar) {
        this.zzf.zzx(zzbhsVar);
    }

    public final synchronized void zzS(final zzdku zzdkuVar) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbO)).booleanValue()) {
            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdii
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzz(zzdkuVar);
                }
            });
        } else {
            zzz(zzdkuVar);
        }
    }

    public final synchronized void zzT(final zzdku zzdkuVar) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbO)).booleanValue()) {
            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdij
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzA(zzdkuVar);
                }
            });
        } else {
            zzA(zzdkuVar);
        }
    }

    public final boolean zzU() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzV() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzW() {
        return this.zzf.zzB();
    }

    public final boolean zzX() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzZ(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzC = this.zzf.zzC(bundle);
        this.zzq = zZzC;
        return zZzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdio
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzw();
            }
        });
        super.zzb();
    }

    public final zzdiv zzc() {
        return this.zzw;
    }

    public final zzeew zzf(String str, boolean z4) {
        String str2;
        zzeet zzeetVar;
        zzees zzeesVar;
        String str3;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdiy zzdiyVar = this.zze;
        zzcfk zzcfkVarZzr = zzdiyVar.zzr();
        zzcfk zzcfkVarZzs = zzdiyVar.zzs();
        if (zzcfkVarZzr == null && zzcfkVarZzs == null) {
            h.g("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z10 = zzcfkVarZzr != null;
        boolean z11 = zzcfkVarZzs != null;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfi)).booleanValue()) {
            this.zzh.zza();
            int iZzc = this.zzh.zza().zzc();
            int i = iZzc - 1;
            if (i != 0) {
                if (i != 1) {
                    if (iZzc != 1) {
                        str3 = iZzc != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    h.g("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                    return null;
                }
                if (zzcfkVarZzr == null) {
                    h.g("Omid media type was display but there was no display webview.");
                    return null;
                }
                z11 = false;
                z10 = true;
            } else {
                if (zzcfkVarZzs == null) {
                    h.g("Omid media type was video but there was no video webview.");
                    return null;
                }
                z10 = false;
                z11 = true;
            }
        }
        if (z10) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzcfkVarZzr = zzcfkVarZzs;
        }
        zzcfkVarZzr.zzG();
        Context context = this.zzv;
        p pVar = p.C;
        zzeeq zzeeqVar = pVar.f2997x;
        zzeeq zzeeqVar2 = pVar.f2997x;
        if (!zzeeqVar.zzl(context)) {
            h.g("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        i6.a aVar = this.zzu;
        String str4 = aVar.f5214b + "." + aVar.f5215c;
        if (z11) {
            zzeesVar = zzees.VIDEO;
            zzeetVar = zzeet.DEFINED_BY_JAVASCRIPT;
        } else {
            zzdiy zzdiyVar2 = this.zze;
            zzees zzeesVar2 = zzees.NATIVE_DISPLAY;
            zzeetVar = zzdiyVar2.zzc() == 3 ? zzeet.UNSPECIFIED : zzeet.ONE_PIXEL;
            zzeesVar = zzeesVar2;
        }
        zzeew zzeewVarZzb = pVar.f2997x.zzb(str4, zzcfkVarZzr.zzG(), "", "javascript", str2, str, zzeetVar, zzeesVar, this.zzb.zzal);
        if (zzeewVarZzb == null) {
            h.g("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zze.zzW(zzeewVarZzb);
        zzcfkVarZzr.zzat(zzeewVarZzb);
        if (z11) {
            zzeeqVar2.zzj(zzeewVarZzb.zza(), zzcfkVarZzs.zzF());
            this.zzr = true;
        }
        if (z4) {
            zzeeqVar2.zzk(zzeewVarZzb.zza());
            zzcfkVarZzr.zzd("onSdkLoaded", new e(0));
        }
        return zzeewVarZzb;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzaa());
    }

    public final synchronized JSONObject zzj(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzaa());
    }

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final void zzk() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdik
            @Override // java.lang.Runnable
            public final void run() {
                zzdit.zzl(this.zza);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdjg zzdjgVar = this.zzf;
            Objects.requireNonNull(zzdjgVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdil
                @Override // java.lang.Runnable
                public final void run() {
                    zzdjgVar.zzp();
                }
            });
        }
        super.zzk();
    }

    public final void zzu(View view) {
        zzeew zzeewVarZzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzeewVarZzu == null || view == null) {
            return;
        }
        p.C.f2997x.zzg(zzeewVarZzu.zza(), view);
    }

    public final synchronized void zzv() {
        this.zzf.zzh();
    }

    public final /* synthetic */ void zzw() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    public final /* synthetic */ void zzx(View view, boolean z4, int i) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z4, zzaa(), i);
    }

    public final /* synthetic */ void zzy(boolean z4) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z4, zzaa(), 0);
    }
}
