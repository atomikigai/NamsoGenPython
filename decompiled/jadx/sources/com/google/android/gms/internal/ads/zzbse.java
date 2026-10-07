package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import d6.p;
import e6.s;
import e6.t;
import h6.r0;
import i6.d;
import i6.h;
import java.util.Collections;
import java.util.Map;
import r.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbse extends zzbsk {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcfk zzj;
    private final Activity zzk;
    private zzche zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsl zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        f fVar = new f(7);
        Collections.addAll(fVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(fVar);
    }

    public zzbse(zzcfk zzcfkVar, zzbsl zzbslVar) {
        super(zzcfkVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcfkVar;
        this.zzk = zzcfkVar.zzi();
        this.zzo = zzbslVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzc(boolean z4) {
        zzbce zzbceVar = zzbcn.zzkx;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzky)).booleanValue()) {
            ViewParent parent = ((View) this.zzj).getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.zzj);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzkz)).booleanValue()) {
                try {
                    this.zzr.addView((View) this.zzj);
                    this.zzj.zzaj(this.zzl);
                } catch (IllegalStateException e) {
                    h.e("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                this.zzr.addView((View) this.zzj);
                this.zzj.zzaj(this.zzl);
            }
        }
        if (z4) {
            zzl("default");
            zzbsl zzbslVar = this.zzo;
            if (zzbslVar != null) {
                zzbslVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zza(final boolean z4) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkw)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzc(z4);
                    } else {
                        zzcaj.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsc
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzc(z4);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:160:0x0398 A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0032, B:19:0x0037, B:21:0x0039, B:23:0x0041, B:24:0x0046, B:26:0x0048, B:28:0x0056, B:29:0x0068, B:31:0x0076, B:32:0x0088, B:34:0x0096, B:35:0x00a8, B:37:0x00b6, B:38:0x00c8, B:40:0x00d6, B:41:0x00e4, B:43:0x00f2, B:44:0x00f4, B:46:0x00f8, B:48:0x00fc, B:50:0x0104, B:53:0x010c, B:57:0x0143, B:63:0x014f, B:121:0x0269, B:122:0x026e, B:124:0x0270, B:126:0x028c, B:128:0x0290, B:130:0x029d, B:132:0x02d6, B:138:0x0347, B:161:0x039e, B:162:0x03b6, B:163:0x03cf, B:165:0x03d7, B:166:0x03de, B:167:0x0400, B:170:0x0403, B:172:0x0423, B:173:0x0438, B:142:0x0356, B:146:0x0365, B:150:0x0374, B:154:0x0383, B:159:0x0394, B:160:0x0398, B:131:0x02d3, B:175:0x043a, B:176:0x043f, B:64:0x0156, B:66:0x015a, B:71:0x016d, B:90:0x01c8, B:97:0x01f3, B:99:0x01f6, B:101:0x01fa, B:104:0x0200, B:76:0x0184, B:77:0x018f, B:81:0x019e, B:85:0x01b1, B:89:0x01c1, B:94:0x01d3, B:95:0x01e6, B:105:0x020f, B:111:0x0247, B:117:0x0257, B:114:0x024d, B:116:0x0255, B:108:0x023f, B:110:0x0245, B:118:0x025c, B:119:0x0262, B:178:0x0441, B:179:0x0446, B:181:0x0448, B:182:0x044d), top: B:188:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01e6 A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0032, B:19:0x0037, B:21:0x0039, B:23:0x0041, B:24:0x0046, B:26:0x0048, B:28:0x0056, B:29:0x0068, B:31:0x0076, B:32:0x0088, B:34:0x0096, B:35:0x00a8, B:37:0x00b6, B:38:0x00c8, B:40:0x00d6, B:41:0x00e4, B:43:0x00f2, B:44:0x00f4, B:46:0x00f8, B:48:0x00fc, B:50:0x0104, B:53:0x010c, B:57:0x0143, B:63:0x014f, B:121:0x0269, B:122:0x026e, B:124:0x0270, B:126:0x028c, B:128:0x0290, B:130:0x029d, B:132:0x02d6, B:138:0x0347, B:161:0x039e, B:162:0x03b6, B:163:0x03cf, B:165:0x03d7, B:166:0x03de, B:167:0x0400, B:170:0x0403, B:172:0x0423, B:173:0x0438, B:142:0x0356, B:146:0x0365, B:150:0x0374, B:154:0x0383, B:159:0x0394, B:160:0x0398, B:131:0x02d3, B:175:0x043a, B:176:0x043f, B:64:0x0156, B:66:0x015a, B:71:0x016d, B:90:0x01c8, B:97:0x01f3, B:99:0x01f6, B:101:0x01fa, B:104:0x0200, B:76:0x0184, B:77:0x018f, B:81:0x019e, B:85:0x01b1, B:89:0x01c1, B:94:0x01d3, B:95:0x01e6, B:105:0x020f, B:111:0x0247, B:117:0x0257, B:114:0x024d, B:116:0x0255, B:108:0x023f, B:110:0x0245, B:118:0x025c, B:119:0x0262, B:178:0x0441, B:179:0x0446, B:181:0x0448, B:182:0x044d), top: B:188:0x0009, inners: #0 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void zzb(Map map) {
        int i;
        int i10;
        int i11;
        int i12;
        synchronized (this.zzi) {
            try {
                if (this.zzk == null) {
                    zzh("Not an activity context. Cannot resize.");
                    return;
                }
                if (this.zzj.zzO() == null) {
                    zzh("Webview is not yet available, size is not set.");
                    return;
                }
                if (this.zzj.zzO().zzi()) {
                    zzh("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (this.zzj.zzaF()) {
                    zzh("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    r0 r0Var = p.C.f2979c;
                    this.zzh = r0.k((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    r0 r0Var2 = p.C.f2979c;
                    this.zze = r0.k((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    r0 r0Var3 = p.C.f2979c;
                    this.zzf = r0.k((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    r0 r0Var4 = p.C.f2979c;
                    this.zzg = r0.k((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.zza = str;
                }
                if (this.zzh < 0 || this.zze < 0) {
                    zzh("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = this.zzk.getWindow();
                if (window != null && window.getDecorView() != null) {
                    r0 r0Var5 = p.C.f2979c;
                    Activity activity = this.zzk;
                    int[] iArrM = r0.m(activity);
                    s sVar = s.f3427f;
                    int[] iArr = {sVar.f3428a.f(activity, iArrM[0]), sVar.f3428a.f(activity, iArrM[1])};
                    int[] iArrN = r0.n(this.zzk);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    int i15 = this.zzh;
                    int[] iArr2 = null;
                    if (i15 < 50 || i15 > i13) {
                        h.g("Width is too small or too large.");
                    } else {
                        int i16 = this.zze;
                        if (i16 < 50 || i16 > i14) {
                            h.g("Height is too small or too large.");
                        } else if (i16 == i14 && i15 == i13) {
                            h.g("Cannot resize to a full-screen ad.");
                        } else if (this.zzb) {
                            switch (this.zza) {
                                case "center":
                                    i = ((this.zzc + this.zzf) + (i15 >> 1)) - 25;
                                    i11 = ((this.zzd + this.zzg) + (i16 >> 1)) - 25;
                                    break;
                                case "top-left":
                                    i = this.zzc + this.zzf;
                                    i10 = this.zzd;
                                case "bottom-left":
                                    i = this.zzc + this.zzf;
                                    i12 = this.zzd;
                                    i11 = ((i12 + this.zzg) + i16) - 50;
                                    break;
                                case "bottom-right":
                                    i = ((this.zzc + this.zzf) + i15) - 50;
                                    i12 = this.zzd;
                                    i11 = ((i12 + this.zzg) + i16) - 50;
                                    break;
                                case "bottom-center":
                                    i = ((this.zzc + this.zzf) + (i15 >> 1)) - 25;
                                    i12 = this.zzd;
                                    i11 = ((i12 + this.zzg) + i16) - 50;
                                    break;
                                case "top-center":
                                    i = ((this.zzc + this.zzf) + (i15 >> 1)) - 25;
                                    i10 = this.zzd;
                                default:
                                    i = ((this.zzc + this.zzf) + i15) - 50;
                                    i10 = this.zzd;
                                    i11 = i10 + this.zzg;
                                    break;
                            }
                            if (i >= 0 && i + 50 <= i13 && i11 >= iArrN[0] && i11 + 50 <= iArrN[1]) {
                                iArr2 = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            }
                        } else {
                            Activity activity2 = this.zzk;
                            int[] iArrM2 = r0.m(activity2);
                            int[] iArr3 = {sVar.f3428a.f(activity2, iArrM2[0]), sVar.f3428a.f(activity2, iArrM2[1])};
                            int[] iArrN2 = r0.n(this.zzk);
                            int i17 = iArr3[0];
                            int i18 = this.zzc + this.zzf;
                            int i19 = this.zzd + this.zzg;
                            if (i18 < 0) {
                                i18 = 0;
                            } else {
                                int i20 = this.zzh;
                                if (i18 + i20 > i17) {
                                    i18 = i17 - i20;
                                }
                            }
                            int i21 = iArrN2[0];
                            if (i19 < i21) {
                                i19 = i21;
                            } else {
                                int i22 = this.zze;
                                int i23 = i19 + i22;
                                int i24 = iArrN2[1];
                                if (i23 > i24) {
                                    i19 = i24 - i22;
                                }
                            }
                            iArr2 = new int[]{i18, i19};
                        }
                    }
                    if (iArr2 == null) {
                        zzh("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    d dVar = sVar.f3428a;
                    int iO = d.o(this.zzk, this.zzh);
                    int iO2 = d.o(this.zzk, this.zze);
                    ViewParent parent = ((View) this.zzj).getParent();
                    if (parent == null || !(parent instanceof ViewGroup)) {
                        zzh("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.removeView((View) this.zzj);
                    PopupWindow popupWindow = this.zzp;
                    if (popupWindow == null) {
                        this.zzr = viewGroup;
                        Object obj = this.zzj;
                        ((View) obj).setDrawingCacheEnabled(true);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                        ((View) obj).setDrawingCacheEnabled(false);
                        ImageView imageView = new ImageView(this.zzk);
                        this.zzm = imageView;
                        imageView.setImageBitmap(bitmapCreateBitmap);
                        this.zzl = this.zzj.zzO();
                        this.zzr.addView(this.zzm);
                    } else {
                        popupWindow.dismiss();
                    }
                    RelativeLayout relativeLayout = new RelativeLayout(this.zzk);
                    this.zzq = relativeLayout;
                    relativeLayout.setBackgroundColor(0);
                    this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iO, iO2));
                    PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, iO, iO2, false);
                    this.zzp = popupWindow2;
                    popupWindow2.setOutsideTouchable(false);
                    this.zzp.setTouchable(true);
                    this.zzp.setClippingEnabled(!this.zzb);
                    this.zzq.addView((View) this.zzj, -1, -1);
                    this.zzn = new LinearLayout(this.zzk);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(d.o(this.zzk, 50), d.o(this.zzk, 50));
                    String str2 = this.zza;
                    switch (str2.hashCode()) {
                        case -1364013995:
                            if (!str2.equals("center")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(13);
                            }
                            break;
                        case -1012429441:
                            if (!str2.equals("top-left")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(10);
                                layoutParams.addRule(9);
                            }
                            break;
                        case -655373719:
                            if (!str2.equals("bottom-left")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(12);
                                layoutParams.addRule(9);
                            }
                            break;
                        case 1163912186:
                            if (!str2.equals("bottom-right")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(12);
                                layoutParams.addRule(11);
                            }
                            break;
                        case 1288627767:
                            if (!str2.equals("bottom-center")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(12);
                                layoutParams.addRule(14);
                            }
                            break;
                        case 1755462605:
                            if (!str2.equals("top-center")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(10);
                                layoutParams.addRule(14);
                            }
                            break;
                        default:
                            layoutParams.addRule(10);
                            layoutParams.addRule(11);
                            break;
                    }
                    this.zzn.setOnClickListener(new zzbsd(this));
                    this.zzn.setContentDescription("Close button");
                    this.zzq.addView(this.zzn, layoutParams);
                    try {
                        this.zzp.showAtLocation(window.getDecorView(), 0, d.o(this.zzk, iArr2[0]), d.o(this.zzk, iArr2[1]));
                        int i25 = iArr2[0];
                        int i26 = iArr2[1];
                        zzbsl zzbslVar = this.zzo;
                        if (zzbslVar != null) {
                            zzbslVar.zza(i25, i26, this.zzh, this.zze);
                        }
                        this.zzj.zzaj(zzche.zzb(iO, iO2));
                        zzk(iArr2[0], iArr2[1] - r0.n(this.zzk)[0], this.zzh, this.zze);
                        zzl("resized");
                        return;
                    } catch (RuntimeException e) {
                        zzh("Cannot show popup window: " + e.getMessage());
                        this.zzq.removeView((View) this.zzj);
                        ViewGroup viewGroup2 = this.zzr;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(this.zzm);
                            this.zzr.addView((View) this.zzj);
                            this.zzj.zzaj(this.zzl);
                        }
                        return;
                    }
                }
                zzh("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(int i, int i10, boolean z4) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i10;
        }
    }

    public final void zze(int i, int i10) {
        this.zzc = i;
        this.zzd = i10;
    }

    public final boolean zzf() {
        boolean z4;
        synchronized (this.zzi) {
            z4 = this.zzp != null;
        }
        return z4;
    }
}
