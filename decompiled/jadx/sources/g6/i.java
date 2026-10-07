package g6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbbl;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfx;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzcwz;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzeeb;
import com.google.android.gms.internal.ads.zzeec;
import com.google.android.gms.internal.ads.zzeeu;
import com.google.android.gms.internal.ads.zzeew;
import d6.p;
import e6.s;
import e6.t;
import h6.k0;
import h6.r0;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends zzbtf {
    public static final int H = Color.argb(0, 0, 0, 0);
    public boolean A;
    public boolean B;
    public Toolbar F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f4196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdOverlayInfoParcel f4197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzcfk f4198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f7.k f4199d;
    public o e;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FrameLayout f4201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f4202s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g f4205v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public androidx.activity.i f4209z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4200f = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4203t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4204u = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4206w = false;
    public int G = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f4207x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.google.android.material.datepicker.l f4208y = new com.google.android.material.datepicker.l(this, 2);
    public boolean C = false;
    public boolean D = false;
    public boolean E = true;

    public i(Activity activity) {
        this.f4196a = activity;
    }

    public static final void L(View view, zzeew zzeewVar) {
        if (zzeewVar == null || view == null) {
            return;
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfd)).booleanValue() && zzeewVar.zzb()) {
            return;
        }
        p.C.f2997x.zzj(zzeewVar.zza(), view);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    public final void I(boolean z4) throws f {
        boolean z10;
        zzbsz zzbszVar;
        boolean z11 = this.B;
        Activity activity = this.f4196a;
        if (!z11) {
            activity.requestWindowFeature(1);
        }
        Window window = activity.getWindow();
        if (window == null) {
            throw new f("Invalid activity, no window available.");
        }
        zzcfk zzcfkVar = this.f4197b.f1966d;
        zzchc zzchcVarZzN = zzcfkVar != null ? zzcfkVar.zzN() : null;
        boolean z12 = zzchcVarZzN != null && zzchcVarZzN.zzS();
        this.f4206w = false;
        if (z12) {
            int i = this.f4197b.f1971u;
            if (i == 6) {
                z10 = activity.getResources().getConfiguration().orientation == 1;
                this.f4206w = z10;
            } else if (i == 7) {
                z10 = activity.getResources().getConfiguration().orientation == 2;
                this.f4206w = z10;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        i6.h.b("Delay onShow to next orientation change: " + z10);
        y(this.f4197b.f1971u);
        window.setFlags(16777216, 16777216);
        i6.h.b("Hardware acceleration on the AdActivity window enabled.");
        if (this.f4204u) {
            this.f4205v.setBackgroundColor(H);
        } else {
            this.f4205v.setBackgroundColor(-16777216);
        }
        activity.setContentView(this.f4205v);
        this.B = true;
        if (z4) {
            try {
                zzcfx zzcfxVar = p.C.f2980d;
                Activity activity2 = this.f4196a;
                zzcfk zzcfkVar2 = this.f4197b.f1966d;
                zzche zzcheVarZzO = zzcfkVar2 != null ? zzcfkVar2.zzO() : null;
                zzcfk zzcfkVar3 = this.f4197b.f1966d;
                String strZzU = zzcfkVar3 != null ? zzcfkVar3.zzU() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.f4197b;
                i6.a aVar = adOverlayInfoParcel.f1974x;
                zzcfk zzcfkVar4 = adOverlayInfoParcel.f1966d;
                zzcfk zzcfkVarZza = zzcfx.zza(activity2, zzcheVarZzO, strZzU, true, z12, null, null, aVar, null, null, zzcfkVar4 != null ? zzcfkVar4.zzj() : null, zzbbl.zza(), null, null, null, null);
                this.f4198c = zzcfkVarZza;
                zzchc zzchcVarZzN2 = zzcfkVarZza.zzN();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f4197b;
                zzbih zzbihVar = adOverlayInfoParcel2.A;
                zzbij zzbijVar = adOverlayInfoParcel2.e;
                c cVar = adOverlayInfoParcel2.f1970t;
                zzcfk zzcfkVar5 = adOverlayInfoParcel2.f1966d;
                zzchcVarZzN2.zzU(null, zzbihVar, null, zzbijVar, cVar, true, null, zzcfkVar5 != null ? zzcfkVar5.zzN().zzd() : null, null, null, null, null, null, null, null, null, null, null, null);
                this.f4198c.zzN().zzB(new ib.c(this, 17));
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f4197b;
                String str = adOverlayInfoParcel3.f1973w;
                if (str != null) {
                    this.f4198c.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.f1969s;
                    if (str2 == null) {
                        throw new f("No URL or HTML to display in ad overlay.");
                    }
                    this.f4198c.loadDataWithBaseURL(adOverlayInfoParcel3.f1967f, str2, "text/html", "UTF-8", null);
                }
                zzcfk zzcfkVar6 = this.f4197b.f1966d;
                if (zzcfkVar6 != null) {
                    zzcfkVar6.zzaw(this);
                }
            } catch (Exception e) {
                i6.h.e("Error obtaining webview.", e);
                throw new f("Could not obtain webview for the overlay.", e);
            }
        } else {
            zzcfk zzcfkVar7 = this.f4197b.f1966d;
            this.f4198c = zzcfkVar7;
            zzcfkVar7.zzan(activity);
        }
        if (this.f4197b.H) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f4198c.zzG(), false);
        }
        this.f4198c.zzai(this);
        zzcfk zzcfkVar8 = this.f4197b.f1966d;
        if (zzcfkVar8 != null) {
            L(this.f4205v, zzcfkVar8.zzQ());
        }
        if (this.f4197b.f1972v != 5) {
            ViewParent parent = this.f4198c.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f4198c.zzF());
            }
            if (this.f4204u) {
                this.f4198c.zzam();
            }
            if (this.f4197b.H) {
                Toolbar toolbar = new Toolbar(activity);
                this.F = toolbar;
                toolbar.setId(View.generateViewId());
                this.f4198c.zzF().setId(View.generateViewId());
                this.F.setBackgroundColor(-12303292);
                this.F.setVisibility(0);
                try {
                    this.F.setNavigationIcon(p.C.f2982g.zze().getDrawable(R.drawable.admob_close_button_white_cross, null));
                } catch (Resources.NotFoundException | NullPointerException e4) {
                    k0.l("Error obtaining close icon.", e4);
                }
                this.F.setNavigationOnClickListener(this.f4208y);
                this.F.setTitleMarginStart(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.f4205v.addView(this.F, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.F.getId());
                layoutParams2.addRule(12);
                this.f4205v.addView(this.f4198c.zzF(), layoutParams2);
                J(this.F);
            } else {
                this.f4205v.addView(this.f4198c.zzF(), -1, -1);
            }
        }
        if (!z4 && !this.f4206w) {
            this.f4198c.zzaa();
        }
        if (this.f4197b.f1972v != 5) {
            M(z12);
            if (this.f4198c.zzaB()) {
                N(z12, true);
                return;
            }
            return;
        }
        zzeeb zzeebVarZze = zzeec.zze();
        zzeebVarZze.zza(activity);
        zzeebVarZze.zzb(this);
        zzeebVarZze.zzc(this.f4197b.B);
        zzeebVarZze.zzd(this.f4197b.C);
        zzeec zzeecVarZze = zzeebVarZze.zze();
        try {
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f4197b;
            if (adOverlayInfoParcel4 == null || (zzbszVar = adOverlayInfoParcel4.G) == null) {
                throw new f("noioou");
            }
            zzbszVar.zzg(new q7.b(zzeecVarZze));
        } catch (RemoteException | f e10) {
            throw new f(e10.getMessage(), e10);
        }
    }

    public final void J(View view) {
        zzeew zzeewVarZzQ;
        zzeeu zzeeuVarZzP;
        zzcfk zzcfkVar = this.f4198c;
        if (zzcfkVar == null) {
            return;
        }
        zzbce zzbceVar = zzbcn.zzfe;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && (zzeeuVarZzP = zzcfkVar.zzP()) != null) {
            zzeeuVarZzP.zza(view);
        } else if (((Boolean) tVar.f3440c.zza(zzbcn.zzfd)).booleanValue() && (zzeewVarZzQ = zzcfkVar.zzQ()) != null && zzeewVarZzQ.zzb()) {
            p.C.f2997x.zzg(zzeewVarZzQ.zza(), view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public final void K(Configuration configuration) {
        boolean zIsInMultiWindowMode;
        d6.i iVar;
        int i;
        d6.i iVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f4197b;
        boolean z4 = true;
        boolean z10 = false;
        boolean z11 = (adOverlayInfoParcel == null || (iVar2 = adOverlayInfoParcel.f1976z) == null || !iVar2.f2955b) ? false : true;
        p.C.e.getClass();
        zzbce zzbceVar = zzbcn.zzeQ;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        boolean zBooleanValue = ((Boolean) zzbclVar.zza(zzbceVar)).booleanValue();
        Activity activity = this.f4196a;
        if (!zBooleanValue) {
            zIsInMultiWindowMode = false;
        } else if (((Boolean) zzbclVar.zza(zzbcn.zzeS)).booleanValue()) {
            zIsInMultiWindowMode = activity.isInMultiWindowMode();
        } else {
            i6.d dVar = s.f3427f.f3428a;
            int iO = i6.d.o(activity, configuration.screenHeightDp);
            int iL = i6.d.l(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp);
            WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i10 = displayMetrics.heightPixels;
            int i11 = displayMetrics.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int iIntValue = ((Integer) zzbclVar.zza(zzbcn.zzeO)).intValue() * ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d));
            if (Math.abs(i10 - (iO + dimensionPixelSize)) > iIntValue || Math.abs(i11 - iL) > iIntValue) {
                zIsInMultiWindowMode = true;
            } else {
                zIsInMultiWindowMode = false;
            }
        }
        if ((!this.f4204u || z11 || ((Boolean) zzbclVar2.zza(zzbcn.zzaN)).booleanValue()) && (!zIsInMultiWindowMode || ((Boolean) zzbclVar2.zza(zzbcn.zzaM)).booleanValue())) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f4197b;
            if (adOverlayInfoParcel2 != null && (iVar = adOverlayInfoParcel2.f1976z) != null && iVar.f2959r) {
                z10 = true;
            }
        } else {
            z4 = false;
        }
        Window window = activity.getWindow();
        if (((Boolean) zzbclVar2.zza(zzbcn.zzbl)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z4) {
                i = z10 ? 5894 : 5380;
            } else {
                i = 256;
            }
            decorView.setSystemUiVisibility(i);
            return;
        }
        if (!z4) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z10) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    public final void M(boolean z4) {
        if (this.f4197b.H) {
            return;
        }
        zzbce zzbceVar = zzbcn.zzeU;
        t tVar = t.f3437d;
        int iIntValue = ((Integer) tVar.f3440c.zza(zzbceVar)).intValue();
        boolean z10 = ((Boolean) tVar.f3440c.zza(zzbcn.zzbh)).booleanValue() || z4;
        n nVar = new n();
        nVar.f4220a = 0;
        nVar.f4221b = 0;
        nVar.f4222c = 0;
        nVar.f4223d = 50;
        nVar.f4220a = true != z10 ? 0 : iIntValue;
        nVar.f4221b = true != z10 ? iIntValue : 0;
        nVar.f4222c = iIntValue;
        this.e = new o(this.f4196a, nVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z10 ? 9 : 11);
        N(z4, this.f4197b.f1968r);
        this.f4205v.addView(this.e, layoutParams);
        J(this.e);
    }

    public final void N(boolean z4, boolean z10) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        d6.i iVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        d6.i iVar2;
        zzbce zzbceVar = zzbcn.zzbf;
        t tVar = t.f3437d;
        boolean z11 = true;
        boolean z12 = ((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && (adOverlayInfoParcel2 = this.f4197b) != null && (iVar2 = adOverlayInfoParcel2.f1976z) != null && iVar2.f2960s;
        boolean z13 = ((Boolean) tVar.f3440c.zza(zzbcn.zzbg)).booleanValue() && (adOverlayInfoParcel = this.f4197b) != null && (iVar = adOverlayInfoParcel.f1976z) != null && iVar.f2961t;
        if (z4 && z10 && z12 && !z13) {
            new zzbsk(this.f4198c, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        o oVar = this.e;
        if (oVar != null) {
            if (!z13 && (!z10 || z12)) {
                z11 = false;
            }
            ImageButton imageButton = oVar.f4224a;
            if (!z11) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) tVar.f3440c.zza(zzbcn.zzbj)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void y(int i) {
        Activity activity = this.f4196a;
        int i10 = activity.getApplicationInfo().targetSdkVersion;
        zzbce zzbceVar = zzbcn.zzfR;
        t tVar = t.f3437d;
        if (i10 >= ((Integer) tVar.f3440c.zza(zzbceVar)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) tVar.f3440c.zza(zzbcn.zzfS)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) tVar.f3440c.zza(zzbcn.zzfT)).intValue()) {
                    if (i11 <= ((Integer) tVar.f3440c.zza(zzbcn.zzfU)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            p.C.f2982g.zzv(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        l lVar;
        if (!this.f4196a.isFinishing() || this.C) {
            return;
        }
        this.C = true;
        zzcfk zzcfkVar = this.f4198c;
        if (zzcfkVar != null) {
            zzcfkVar.zzZ(this.G - 1);
            synchronized (this.f4207x) {
                try {
                    if (!this.A && this.f4198c.zzaC()) {
                        zzbce zzbceVar = zzbcn.zzeP;
                        t tVar = t.f3437d;
                        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && !this.D && (adOverlayInfoParcel = this.f4197b) != null && (lVar = adOverlayInfoParcel.f1965c) != null) {
                            lVar.zzdq();
                        }
                        androidx.activity.i iVar = new androidx.activity.i(this, 19);
                        this.f4209z = iVar;
                        r0.f5068l.postDelayed(iVar, ((Long) tVar.f3440c.zza(zzbcn.zzbe)).longValue());
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final boolean zzH() {
        this.G = 1;
        if (this.f4198c == null) {
            return true;
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziz)).booleanValue() && this.f4198c.canGoBack()) {
            this.f4198c.goBack();
            return false;
        }
        boolean zZzaH = this.f4198c.zzaH();
        if (!zZzaH) {
            this.f4198c.zzd("onbackblocked", Collections.EMPTY_MAP);
        }
        return zZzaH;
    }

    public final void zzb() {
        this.G = 3;
        Activity activity = this.f4196a;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f4197b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f1972v != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    public final void zzc() {
        zzcfk zzcfkVar;
        l lVar;
        if (this.D) {
            return;
        }
        this.D = true;
        zzcfk zzcfkVar2 = this.f4198c;
        if (zzcfkVar2 != null) {
            this.f4205v.removeView(zzcfkVar2.zzF());
            f7.k kVar = this.f4199d;
            if (kVar != null) {
                this.f4198c.zzan((Context) kVar.f3639b);
                this.f4198c.zzaq(false);
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmq)).booleanValue() && this.f4198c.getParent() != null) {
                    ((ViewGroup) this.f4198c.getParent()).removeView(this.f4198c.zzF());
                }
                ViewGroup viewGroup = (ViewGroup) this.f4199d.f3641d;
                View viewZzF = this.f4198c.zzF();
                f7.k kVar2 = this.f4199d;
                viewGroup.addView(viewZzF, kVar2.f3638a, (ViewGroup.LayoutParams) kVar2.f3640c);
                this.f4199d = null;
            } else {
                Activity activity = this.f4196a;
                if (activity.getApplicationContext() != null) {
                    this.f4198c.zzan(activity.getApplicationContext());
                }
            }
            this.f4198c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f4197b;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f1965c) != null) {
            lVar.zzdu(this.G);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f4197b;
        if (adOverlayInfoParcel2 == null || (zzcfkVar = adOverlayInfoParcel2.f1966d) == null) {
            return;
        }
        L(this.f4197b.f1966d.zzF(), zzcfkVar.zzQ());
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f4197b;
        if (adOverlayInfoParcel != null && this.f4200f) {
            y(adOverlayInfoParcel.f1971u);
        }
        if (this.f4201r != null) {
            this.f4196a.setContentView(this.f4205v);
            this.B = true;
            this.f4201r.removeAllViews();
            this.f4201r = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f4202s;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f4202s = null;
        }
        this.f4200f = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzi() {
        this.G = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzk(q7.a aVar) {
        K((Configuration) q7.b.I(aVar));
    }

    public void zzl(Bundle bundle) {
        boolean z4 = this.B;
        Activity activity = this.f4196a;
        if (!z4) {
            activity.requestWindowFeature(1);
        }
        this.f4203t = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelG = AdOverlayInfoParcel.g(activity.getIntent());
            this.f4197b = adOverlayInfoParcelG;
            if (adOverlayInfoParcelG == null) {
                throw new f("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelG.H) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.f4197b.f1974x.f5215c > 7500000) {
                this.G = 4;
            }
            if (activity.getIntent() != null) {
                this.E = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f4197b;
            d6.i iVar = adOverlayInfoParcel.f1976z;
            int i = adOverlayInfoParcel.f1972v;
            if (iVar != null) {
                boolean z10 = iVar.f2954a;
                this.f4204u = z10;
                if (z10) {
                    if (i != 5 && iVar.f2958f != -1) {
                        new h(this).zzb();
                    }
                }
            } else if (i == 5) {
                this.f4204u = true;
                if (i != 5) {
                    new h(this).zzb();
                }
            } else {
                this.f4204u = false;
            }
            if (bundle == null) {
                if (this.E) {
                    zzcwz zzcwzVar = this.f4197b.E;
                    if (zzcwzVar != null) {
                        zzcwzVar.zze();
                    }
                    l lVar = this.f4197b.f1965c;
                    if (lVar != null) {
                        lVar.zzdr();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f4197b;
                if (adOverlayInfoParcel2.f1972v != 1) {
                    e6.a aVar = adOverlayInfoParcel2.f1964b;
                    if (aVar != null) {
                        aVar.onAdClicked();
                    }
                    zzdel zzdelVar = this.f4197b.F;
                    if (zzdelVar != null) {
                        zzdelVar.zzdG();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f4197b;
            g gVar = new g(activity, adOverlayInfoParcel3.f1975y, adOverlayInfoParcel3.f1974x.f5213a, adOverlayInfoParcel3.D);
            this.f4205v = gVar;
            gVar.setId(zzbbs.zzq.zzf);
            p.C.e.f(activity);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f4197b;
            int i10 = adOverlayInfoParcel4.f1972v;
            if (i10 == 1) {
                I(false);
                return;
            }
            if (i10 == 2) {
                this.f4199d = new f7.k(adOverlayInfoParcel4.f1966d);
                I(false);
            } else if (i10 == 3) {
                I(true);
            } else {
                if (i10 != 5) {
                    throw new f("Could not determine ad overlay type.");
                }
                I(false);
            }
        } catch (f e) {
            i6.h.g(e.getMessage());
            this.G = 4;
            activity.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzm() {
        zzcfk zzcfkVar = this.f4198c;
        if (zzcfkVar != null) {
            try {
                this.f4205v.removeView(zzcfkVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzo() {
        l lVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f4197b;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f1965c) != null) {
            lVar.zzdk();
        }
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeR)).booleanValue() && this.f4198c != null && (!this.f4196a.isFinishing() || this.f4199d == null)) {
            this.f4198c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzp(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            zzeeb zzeebVarZze = zzeec.zze();
            zzeebVarZze.zza(this.f4196a);
            zzeebVarZze.zzb(this.f4197b.f1972v == 5 ? this : null);
            try {
                this.f4197b.G.zzf(strArr, iArr, new q7.b(zzeebVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzr() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f4197b;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f1965c) != null) {
            lVar.zzdH();
        }
        K(this.f4196a.getResources().getConfiguration());
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeR)).booleanValue()) {
            return;
        }
        zzcfk zzcfkVar = this.f4198c;
        if (zzcfkVar == null || zzcfkVar.zzaE()) {
            i6.h.g("The webview does not exist. Ignoring action.");
        } else {
            this.f4198c.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f4203t);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzt() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeR)).booleanValue()) {
            zzcfk zzcfkVar = this.f4198c;
            if (zzcfkVar == null || zzcfkVar.zzaE()) {
                i6.h.g("The webview does not exist. Ignoring action.");
            } else {
                this.f4198c.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzu() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeR)).booleanValue() && this.f4198c != null && (!this.f4196a.isFinishing() || this.f4199d == null)) {
            this.f4198c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzv() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f4197b;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f1965c) == null) {
            return;
        }
        lVar.zzdt();
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzx() {
        this.B = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzh(int i, int i10, Intent intent) {
    }
}
