package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.common.internal.i0;
import d6.p;
import e6.t;
import h6.k0;
import h6.r0;
import i6.h;
import java.util.HashMap;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcbt extends FrameLayout implements zzcbk {
    final zzcch zza;
    private final zzccf zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbdc zze;
    private final long zzf;
    private final zzcbl zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcbt(Context context, zzccf zzccfVar, int i, boolean z4, zzbdc zzbdcVar, zzcce zzcceVar) {
        zzcbl zzcbjVar;
        zzbdc zzbdcVar2;
        zzcbl zzcezVar;
        super(context);
        this.zzb = zzccfVar;
        this.zze = zzbdcVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        i0.i(zzccfVar.zzj());
        zzcbx zzcbxVar = zzccfVar.zzj().f2924a;
        zzccg zzccgVar = new zzccg(context, zzccfVar.zzn(), zzccfVar.zzdi(), zzbdcVar, zzccfVar.zzk());
        if (i == 3) {
            zzcezVar = new zzcez(context, zzccgVar);
            zzbdcVar2 = zzbdcVar;
        } else {
            if (i == 2) {
                zzcbjVar = new zzccx(context, zzccgVar, zzccfVar, z4, zzcbm.zza(zzccfVar), zzcceVar);
                zzbdcVar2 = zzbdcVar;
            } else {
                zzbdcVar2 = zzbdcVar;
                zzcbjVar = new zzcbj(context, zzccfVar, z4, zzcbm.zza(zzccfVar), zzcceVar, new zzccg(context, zzccfVar.zzn(), zzccfVar.zzdi(), zzbdcVar, zzccfVar.zzk()));
            }
            zzcezVar = zzcbjVar;
        }
        this.zzg = zzcezVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcezVar, new FrameLayout.LayoutParams(-1, -1, 17));
        zzbce zzbceVar = zzbcn.zzP;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzM)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) tVar.f3440c.zza(zzbcn.zzR)).longValue();
        boolean zBooleanValue = ((Boolean) tVar.f3440c.zza(zzbcn.zzO)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbdcVar2 != null) {
            zzbdcVar.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new zzcch(this);
        zzcezVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", map);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzcbt zzcbtVar, String str, String[] strArr) {
        zzcbtVar.zzK(str, strArr);
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcbl zzcblVar = this.zzg;
            if (zzcblVar != null) {
                zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcblVar.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z4) {
        super.onWindowFocusChanged(z4);
        if (z4) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzq(z4);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcbk
    public final void onWindowVisibilityChanged(int i) {
        boolean z4;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z4 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z4 = false;
        }
        r0.f5068l.post(new zzcbs(this, z4));
    }

    public final void zzA(int i) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzz(i);
    }

    public final void zzB(int i) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzA(i);
    }

    public final void zzC(int i) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzP)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzB(i);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i, int i10, int i11, int i12) {
        if (k0.m()) {
            StringBuilder sbD = b.d(i, i10, "Set video bounds to x:", ";y:", ";w:");
            sbD.append(i11);
            sbD.append(";h:");
            sbD.append(i12);
            k0.k(sbD.toString());
        }
        if (i11 == 0 || i12 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12);
        layoutParams.setMargins(i, i10, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f10) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzb.zze(f10);
        zzcblVar.zzn();
    }

    public final void zzH(float f10, float f11) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar != null) {
            zzcblVar.zzu(f10, f11);
        }
    }

    public final void zzI() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzb.zzd(false);
        zzcblVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zza() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbY)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zze() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbY)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z4 = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z4;
            if (!z4) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzf() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar != null && this.zzm == 0) {
            float fZzc = zzcblVar.zzc();
            zzcbl zzcblVar2 = this.zzg;
            zzK("canplaythrough", "duration", String.valueOf(fZzc / 1000.0f), "videoWidth", String.valueOf(zzcblVar2.zze()), "videoHeight", String.valueOf(zzcblVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzg() {
        this.zzd.setVisibility(4);
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzh() {
        this.zza.zzb();
        r0.f5068l.post(new zzcbq(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        r0.f5068l.post(new zzcbr(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzj(int i, int i10) {
        if (this.zzk) {
            zzbce zzbceVar = zzbcn.zzQ;
            t tVar = t.f3437d;
            int iMax = Math.max(i / ((Integer) tVar.f3440c.zza(zzbceVar)).intValue(), 1);
            int iMax2 = Math.max(i10 / ((Integer) tVar.f3440c.zza(zzbceVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        p pVar = p.C;
        pVar.f2983j.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        pVar.f2983j.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (k0.m()) {
            k0.k("Spinner frame grab took " + jElapsedRealtime2 + "ms");
        }
        if (jElapsedRealtime2 > this.zzf) {
            h.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbdc zzbdcVar = this.zze;
            if (zzbdcVar != null) {
                zzbdcVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    public final Integer zzl() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar != null) {
            return zzcblVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        TextView textView = new TextView(zzcblVar.getContext());
        Resources resourcesZze = p.C.f2982g.zze();
        textView.setText(String.valueOf(resourcesZze == null ? "AdMob - " : resourcesZze.getString(R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar != null) {
            zzcblVar.zzt();
        }
        zzJ();
    }

    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void zzq(boolean z4) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z4));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            this.zzg.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzb.zzd(true);
        zzcblVar.zzn();
    }

    public final void zzt() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        long jZza = zzcblVar.zza();
        if (this.zzl == jZza || jZza <= 0) {
            return;
        }
        float f10 = jZza / 1000.0f;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbW)).booleanValue()) {
            String strValueOf = String.valueOf(f10);
            String strValueOf2 = String.valueOf(this.zzg.zzh());
            String strValueOf3 = String.valueOf(this.zzg.zzf());
            String strValueOf4 = String.valueOf(this.zzg.zzg());
            String strValueOf5 = String.valueOf(this.zzg.zzb());
            p.C.f2983j.getClass();
            zzK("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f10));
        }
        this.zzl = jZza;
    }

    public final void zzu() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzo();
    }

    public final void zzv() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzp();
    }

    public final void zzw(int i) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzq(i);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzx(i);
    }

    public final void zzz(int i) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzy(i);
    }
}
