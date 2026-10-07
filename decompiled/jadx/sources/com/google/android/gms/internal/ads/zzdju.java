package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import d6.p;
import e6.t;
import i6.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import q7.b;
import r7.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdju extends zzbgb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdku {
    public static final zzfzo zza = zzfzo.zzq("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzges zzf;
    private View zzg;
    private zzdit zzi;
    private zzayn zzj;
    private zzbfv zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private q7.a zzk = null;
    private boolean zzn = false;
    private final int zzh = 243799000;

    public zzdju(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        p pVar = p.C;
        zzcaw zzcawVar = pVar.B;
        zzcaw.zza(frameLayout, this);
        zzcaw zzcawVar2 = pVar.B;
        zzcaw.zzb(frameLayout, this);
        this.zzf = zzcaj.zze;
        this.zzj = new zzayn(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.zze.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.zze.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        h.h("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.zze.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzs();
            }
        });
    }

    private final synchronized void zzv() {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlh)).booleanValue() || this.zzi.zza() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdka(this.zzi, this));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdit zzditVar = this.zzi;
        if (zzditVar == null || !zzditVar.zzV()) {
            return;
        }
        this.zzi.zzv();
        this.zzi.zzD(view, this.zzd, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdit zzditVar = this.zzi;
        if (zzditVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzditVar.zzB(frameLayout, zzl(), zzm(), zzdit.zzY(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdit zzditVar = this.zzi;
        if (zzditVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzditVar.zzB(frameLayout, zzl(), zzm(), zzdit.zzY(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdit zzditVar = this.zzi;
        if (zzditVar != null) {
            zzditVar.zzL(view, motionEvent, this.zzd);
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlh)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final synchronized q7.a zzb(String str) {
        return new b(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final synchronized void zzc() {
        try {
            if (this.zzn) {
                return;
            }
            zzdit zzditVar = this.zzi;
            if (zzditVar != null) {
                zzditVar.zzT(this);
                this.zzi = null;
            }
            this.zzc.clear();
            this.zzd.removeAllViews();
            this.zze.removeAllViews();
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzg = null;
            this.zzj = null;
            this.zzn = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zzd(q7.a aVar) {
        onTouch(this.zzd, (MotionEvent) b.I(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final synchronized void zzdv(String str, q7.a aVar) {
        zzq(str, (View) b.I(aVar), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final synchronized void zzdw(q7.a aVar) {
        this.zzi.zzN((View) b.I(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final synchronized void zzdx(zzbfv zzbfvVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbfvVar;
            zzdit zzditVar = this.zzi;
            if (zzditVar != null) {
                zzditVar.zzc().zzb(zzbfvVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final synchronized void zzdy(q7.a aVar) {
        if (this.zzn) {
            return;
        }
        this.zzk = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final synchronized void zzdz(q7.a aVar) {
        if (this.zzn) {
            return;
        }
        Object objI = b.I(aVar);
        if (!(objI instanceof zzdit)) {
            h.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdit zzditVar = this.zzi;
        if (zzditVar != null) {
            zzditVar.zzT(this);
        }
        zzu();
        zzdit zzditVar2 = (zzdit) objI;
        this.zzi = zzditVar2;
        zzditVar2.zzS(this);
        this.zzi.zzK(this.zzd);
        this.zzi.zzu(this.zze);
        if (this.zzm) {
            this.zzi.zzc().zzb(this.zzl);
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdX)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
            zzt(this.zzi.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final synchronized void zze(q7.a aVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final synchronized View zzg(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final zzayn zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final q7.a zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final synchronized JSONObject zzo() {
        zzdit zzditVar = this.zzi;
        if (zzditVar == null) {
            return null;
        }
        return zzditVar.zzi(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final synchronized JSONObject zzp() {
        zzdit zzditVar = this.zzi;
        if (zzditVar == null) {
            return null;
        }
        return zzditVar.zzj(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final synchronized void zzq(String str, View view, boolean z4) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (g.S(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    public final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
