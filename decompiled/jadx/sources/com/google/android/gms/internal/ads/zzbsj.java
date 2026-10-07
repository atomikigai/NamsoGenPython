package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import d6.p;
import e6.s;
import e6.t;
import h6.r0;
import i6.d;
import i6.h;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbsj extends zzbsk implements zzbjr {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcfk zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbv zzk;
    private float zzl;
    private int zzm;

    public zzbsj(zzcfk zzcfkVar, Context context, zzbbv zzbbvVar) {
        super(zzcfkVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcfkVar;
        this.zzi = context;
        this.zzk = zzbbvVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        d dVar = s.f3427f.f3428a;
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = Math.round(displayMetrics.widthPixels / displayMetrics.density);
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = Math.round(displayMetrics2.heightPixels / displayMetrics2.density);
        Activity activityZzi = this.zzh.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            r0 r0Var = p.C.f2979c;
            int[] iArrM = r0.m(activityZzi);
            this.zzd = Math.round(iArrM[0] / this.zza.density);
            this.zze = Math.round(iArrM[1] / this.zza.density);
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbsi zzbsiVar = new zzbsi();
        zzbbv zzbbvVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbsiVar.zze(zzbbvVar.zza(intent));
        zzbbv zzbbvVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbsiVar.zzc(zzbbvVar2.zza(intent2));
        zzbsiVar.zza(this.zzk.zzb());
        zzbsiVar.zzd(this.zzk.zzc());
        zzbsiVar.zzb(true);
        boolean z4 = zzbsiVar.zza;
        boolean z10 = zzbsiVar.zzb;
        boolean z11 = zzbsiVar.zzc;
        boolean z12 = zzbsiVar.zzd;
        boolean z13 = zzbsiVar.zze;
        zzcfk zzcfkVar = this.zzh;
        try {
            jSONObjectPut = new JSONObject().put("sms", z4).put("tel", z10).put("calendar", z11).put("storePicture", z12).put("inlineVideo", z13);
        } catch (JSONException e) {
            h.e("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        zzcfkVar.zze("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        Context context = this.zzi;
        s sVar = s.f3427f;
        zzb(sVar.f3428a.f(context, iArr[0]), sVar.f3428a.f(this.zzi, iArr[1]));
        if (h.j(2)) {
            h.f("Dispatching Ready Event.");
        }
        zzi(this.zzh.zzn().f5213a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006c A[PHI: r3
      0x006c: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:11:0x0043, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzb(int i, int i10) {
        int i11;
        Context context = this.zzi;
        int i12 = 0;
        if (context instanceof Activity) {
            r0 r0Var = p.C.f2979c;
            i11 = r0.n((Activity) context)[0];
        } else {
            i11 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzcfk zzcfkVar = this.zzh;
            int width = zzcfkVar.getWidth();
            int height = zzcfkVar.getHeight();
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzaa)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height != 0) {
                    i12 = height;
                } else if (this.zzh.zzO() != null) {
                    i12 = this.zzh.zzO().zza;
                }
            } else {
                i12 = height;
            }
            Context context2 = this.zzi;
            s sVar = s.f3427f;
            this.zzf = sVar.f3428a.f(context2, width);
            this.zzg = sVar.f3428a.f(this.zzi, i12);
        }
        zzg(i, i10 - i11, this.zzf, this.zzg);
        this.zzh.zzN().zzC(i, i10);
    }
}
