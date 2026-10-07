package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import d6.p;
import e6.n1;
import e6.q1;
import e6.s;
import e6.t;
import h6.r0;
import i6.d;
import i6.h;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import n7.b;
import n7.c;
import org.json.JSONException;
import org.json.JSONObject;
import r7.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdhu implements zzdjg {
    private n1 zzC;
    private final Context zza;
    private final zzdjj zzb;
    private final JSONObject zzc;
    private final zzdoc zzd;
    private final zzdiy zze;
    private final zzavc zzf;
    private final zzcxe zzg;
    private final zzcwk zzh;
    private final zzdej zzi;
    private final zzfet zzj;
    private final i6.a zzk;
    private final zzffo zzl;
    private final zzcny zzm;
    private final zzdkc zzn;
    private final n7.a zzo;
    private final zzdef zzp;
    private final zzflr zzq;
    private final zzdps zzr;
    private final zzfkl zzs;
    private final zzeea zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdhu(Context context, zzdjj zzdjjVar, JSONObject jSONObject, zzdoc zzdocVar, zzdiy zzdiyVar, zzavc zzavcVar, zzcxe zzcxeVar, zzcwk zzcwkVar, zzdej zzdejVar, zzfet zzfetVar, i6.a aVar, zzffo zzffoVar, zzcny zzcnyVar, zzdkc zzdkcVar, n7.a aVar2, zzdef zzdefVar, zzflr zzflrVar, zzfkl zzfklVar, zzeea zzeeaVar, zzdps zzdpsVar) {
        this.zza = context;
        this.zzb = zzdjjVar;
        this.zzc = jSONObject;
        this.zzd = zzdocVar;
        this.zze = zzdiyVar;
        this.zzf = zzavcVar;
        this.zzg = zzcxeVar;
        this.zzh = zzcwkVar;
        this.zzi = zzdejVar;
        this.zzj = zzfetVar;
        this.zzk = aVar;
        this.zzl = zzffoVar;
        this.zzm = zzcnyVar;
        this.zzn = zzdkcVar;
        this.zzo = aVar2;
        this.zzp = zzdefVar;
        this.zzq = zzflrVar;
        this.zzs = zzfklVar;
        this.zzt = zzeeaVar;
        this.zzr = zzdpsVar;
    }

    private final String zzD(View view) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdD)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, null);
        } catch (Exception unused) {
            h.d("Exception getting data.");
            return null;
        }
    }

    private final String zzE(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzc = this.zze.zzc();
        if (iZzc == 1) {
            return "1099";
        }
        if (iZzc == 2) {
            return "2099";
        }
        if (iZzc != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzF(String str) {
        JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean zzG() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzH(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z4) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdD)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z4);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            r0 r0Var = p.C.f2979c;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            zzdht zzdhtVar = null;
            try {
                int i = displayMetrics.widthPixels;
                s sVar = s.f3427f;
                jSONObject7.put("width", sVar.f3428a.f(context, i));
                jSONObject7.put("height", sVar.f3428a.f(context, displayMetrics.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzij)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new zzdhr(this, zzdhtVar));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdhq(this, zzdhtVar));
            }
            this.zzd.zzl("/nativeImpression", new zzdhs(this, zzdhtVar));
            zzcam.zza(this.zzd.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzu) {
                return true;
            }
            zzfet zzfetVar = this.zzj;
            this.zzu = p.C.f2987n.o(this.zza, this.zzk.f5213a, zzfetVar.zzC.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e) {
            h.e("Unable to create impression JSON.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzA() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlh)).booleanValue()) {
            return this.zzl.zzi.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzB() {
        return zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzC(Bundle bundle) {
        JSONObject jSONObjectH;
        if (!zzF("impression_reporting")) {
            h.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        d dVar = s.f3427f.f3428a;
        dVar.getClass();
        if (bundle != null) {
            try {
                jSONObjectH = dVar.h(bundle);
            } catch (JSONException e) {
                h.e("Error converting Bundle to JSON", e);
                jSONObjectH = null;
            }
        } else {
            jSONObjectH = null;
        }
        return zzH(null, null, null, null, ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzld)).booleanValue() ? zzD(null) : null, jSONObjectH, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlh)).booleanValue()) {
            return this.zzl.zzi.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectN = g.N(context, map, map2, view, scaleType);
        JSONObject jSONObjectQ = g.Q(context, view);
        JSONObject jSONObjectP = g.P(view);
        JSONObject jSONObjectO = g.O(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectN);
            jSONObject.put("ad_view_signal", jSONObjectQ);
            jSONObject.put("scroll_view_signal", jSONObjectP);
            jSONObject.put("lock_screen_signal", jSONObjectO);
            return jSONObject;
        } catch (JSONException e) {
            h.e("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectZze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzG()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZze != null) {
                jSONObject.put("nas", jSONObjectZze);
            }
            return jSONObject;
        } catch (JSONException e) {
            h.e("Unable to create native click meta data JSON.", e);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzg() {
        try {
            n1 n1Var = this.zzC;
            if (n1Var != null) {
                n1Var.zze();
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzh() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzi() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzj(q1 q1Var) {
        try {
            if (this.zzw) {
                return;
            }
            if (q1Var == null) {
                zzdiy zzdiyVar = this.zze;
                if (zzdiyVar.zzk() != null) {
                    this.zzw = true;
                    this.zzq.zzc(zzdiyVar.zzk().f3457b, this.zzs);
                    zzg();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzc(q1Var.zzf(), this.zzs);
            zzg();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzk(View view, View view2, Map map, Map map2, boolean z4, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectN = g.N(context, map, map2, view2, scaleType);
        JSONObject jSONObjectQ = g.Q(context, view2);
        JSONObject jSONObjectP = g.P(view2);
        JSONObject jSONObjectO = g.O(context, view2);
        String strZzE = zzE(view, map);
        zzn(true == ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdK)).booleanValue() ? view2 : view, jSONObjectQ, jSONObjectN, jSONObjectP, jSONObjectO, strZzE, g.M(strZzE, context, this.zzz, this.zzy), null, z4, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzl(String str) {
        zzn(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzm(Bundle bundle) {
        if (bundle == null) {
            h.b("Click data is null. No click is reported.");
            return;
        }
        if (!zzF("click_reporting")) {
            h.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObjectH = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        d dVar = s.f3427f.f3428a;
        dVar.getClass();
        try {
            jSONObjectH = dVar.h(bundle);
        } catch (JSONException e) {
            h.e("Error converting Bundle to JSON", e);
        }
        zzn(null, null, null, null, null, string, null, jSONObjectH, false, false);
    }

    public final void zzn(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z4, boolean z10) {
        String strZzd;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z4);
            zzbfn zzbfnVar = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbfnVar != null && zzbfnVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.zze.zzH().isEmpty() || this.zze.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            ((b) this.zzo).getClass();
            jSONObject8.put("timestamp", System.currentTimeMillis());
            if (this.zzx && zzG()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z10) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzd = this.zzf.zzc().zzd(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                h.e("Exception obtaining click signals", e);
                strZzd = null;
            }
            jSONObject8.put("click_signals", strZzd);
            jSONObject8.put("open_chrome_custom_tab", true);
            zzbce zzbceVar = zzbcn.zzin;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && c.i()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzio)).booleanValue() && c.i()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            ((b) this.zzo).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", jCurrentTimeMillis - this.zzA);
            jSONObject9.put("time_from_last_touch", jCurrentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.zzj.zzai) {
                JSONObject jSONObject10 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzq(string, this.zze);
                }
            }
            zzcam.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e4) {
            h.e("Unable to create click JSON.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzo(View view, View view2, Map map, Map map2, boolean z4, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        boolean z10 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlh)).booleanValue()) {
                z10 = true;
            }
        }
        if (!z10) {
            if (!this.zzx) {
                h.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzG()) {
                h.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectN = g.N(this.zza, map, map2, view2, scaleType);
        JSONObject jSONObjectQ = g.Q(this.zza, view2);
        boolean z11 = z10;
        JSONObject jSONObjectP = g.P(view2);
        JSONObject jSONObjectO = g.O(this.zza, view2);
        String strZzE = zzE(view, map);
        JSONObject jSONObjectM = g.M(strZzE, this.zza, this.zzz, this.zzy);
        if (z11) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e) {
                        e = e;
                        h.e("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e4) {
                    e = e4;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e10) {
                h.e("Error occurred while adding CustomClickGestureSignals to adJson.", e10);
                p.C.f2982g.zzw(e10, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, jSONObjectQ, jSONObjectN, jSONObjectP, jSONObjectO, strZzE, jSONObjectM, null, z4, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcam.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            h.e("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzH(g.Q(context, view), g.N(context, map, map2, view, scaleType), g.P(view), g.O(context, view), zzD(view), null, g.R(context, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzr() {
        zzH(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
        int[] iArr = new int[2];
        if (view2 != null) {
            view2.getLocationOnScreen(iArr);
        }
        this.zzy = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        ((b) this.zzo).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zzB = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = jCurrentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        motionEventObtain.setLocation(point.x, point.y);
        this.zzf.zzd(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            h.b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!zzF("touch_reporting")) {
            h.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            h.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdkc zzdkcVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdkcVar);
        view.setClickable(true);
        zzdkcVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzv() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzw(n1 n1Var) {
        this.zzC = n1Var;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzx(zzbhs zzbhsVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc(zzbhsVar);
        } else {
            h.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zS = g.S(this.zzk.f5215c);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zS) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zS) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzz(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }
}
