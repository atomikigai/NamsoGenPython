package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.common.internal.i0;
import d6.p;
import e6.a2;
import e6.a3;
import e6.f2;
import e6.k3;
import e6.q;
import e6.s;
import e6.z2;
import h6.r0;
import i6.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import n6.e;
import ta.c;
import w5.f;
import w5.g;
import w5.l;
import w5.t;
import y5.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdwh extends a2 {
    final Map zza;
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdvv zzd;
    private final zzges zze;
    private zzdvk zzf;

    public zzdwh(Context context, WeakReference weakReference, zzdvv zzdvvVar, zzdwi zzdwiVar, zzges zzgesVar) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.zza = new HashMap();
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdvvVar;
        this.zze = zzgesVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    private static g zzk() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        c cVar = new c();
        cVar.e(bundle);
        return new g(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        t responseInfo;
        f2 f2Var;
        if (obj instanceof l) {
            responseInfo = ((l) obj).e;
        } else if (obj instanceof b) {
            responseInfo = ((b) obj).getResponseInfo();
        } else if (obj instanceof j6.a) {
            responseInfo = ((j6.a) obj).getResponseInfo();
        } else if (obj instanceof r6.c) {
            responseInfo = ((r6.c) obj).getResponseInfo();
        } else if (obj instanceof s6.a) {
            responseInfo = ((s6.a) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (f2Var = responseInfo.f9668a) == null) {
            return "";
        }
        try {
            return f2Var.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzgei.zzr(this.zzf.zzb(str), new zzdwf(this, str2), this.zze);
        } catch (NullPointerException e) {
            p.C.f2982g.zzw(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzgei.zzr(this.zzf.zzb(str), new zzdwg(this, str2), this.zze);
        } catch (NullPointerException e) {
            p.C.f2982g.zzw(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // e6.b2
    public final void zze(String str, q7.a aVar, q7.a aVar2) {
        Context context = (Context) q7.b.I(aVar);
        ViewGroup viewGroup = (ViewGroup) q7.b.I(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj != null) {
            this.zza.remove(str);
        }
        if (obj instanceof AdView) {
            zzdwi.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzdwi.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void zzf(zzdvk zzdvkVar) {
        this.zzf = zzdvkVar;
    }

    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void zzh(final String str, String str2, final String str3) {
        f fVar;
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    Context contextZzj = zzj();
                    i0.j(contextZzj, "context cannot be null");
                    q qVar = s.f3427f.f3429b;
                    zzbpc zzbpcVar = new zzbpc();
                    qVar.getClass();
                    e6.i0 i0Var = (e6.i0) new e6.l(qVar, contextZzj, str, zzbpcVar).d(contextZzj, false);
                    try {
                        i0Var.zzk(new zzbsv(new e() { // from class: com.google.android.gms.internal.ads.zzdvw
                            @Override // n6.e
                            public final void onNativeAdLoaded(NativeAd nativeAd) {
                                this.zza.zzg(str, nativeAd, str3);
                            }
                        }));
                        break;
                    } catch (RemoteException e) {
                        h.h("Failed to add google native ad listener", e);
                    }
                    try {
                        i0Var.zzl(new k3(new zzdwe(this, str3)));
                        break;
                    } catch (RemoteException e4) {
                        h.h("Failed to set AdListener.", e4);
                    }
                    try {
                        fVar = new f(contextZzj, i0Var.zze());
                        break;
                    } catch (RemoteException e10) {
                        h.e("Failed to build AdLoader.", e10);
                        fVar = new f(contextZzj, new z2(new a3()));
                    }
                    fVar.a(zzk());
                    return;
                }
                return;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    j6.a.load(zzj(), str, zzk(), new zzdwb(this, str, str3));
                    return;
                }
                return;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    b.load(zzj(), str, zzk(), 1, new zzdvz(this, str, str3));
                    return;
                }
                return;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    r6.c.load(zzj(), str, zzk(), new zzdwc(this, str, str3));
                    return;
                }
                return;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    s6.a.load(zzj(), str, zzk(), new zzdwd(this, str, str3));
                    return;
                }
                return;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    AdView adView = new AdView(zzj());
                    adView.setAdSize(w5.h.h);
                    adView.setAdUnitId(str);
                    adView.setAdListener(new zzdwa(this, str, adView, str3));
                    adView.b(zzk());
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final synchronized void zzi(String str, String str2) {
        Object obj;
        try {
            Activity activityZzg = this.zzd.zzg();
            if (activityZzg != null && (obj = this.zza.get(str)) != null) {
                zzbce zzbceVar = zzbcn.zziY;
                e6.t tVar = e6.t.f3437d;
                if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() || (obj instanceof b) || (obj instanceof j6.a) || (obj instanceof r6.c) || (obj instanceof s6.a)) {
                    this.zza.remove(str);
                }
                zzn(zzl(obj), str2);
                if (obj instanceof b) {
                    ((b) obj).show(activityZzg);
                    return;
                }
                if (obj instanceof j6.a) {
                    ((j6.a) obj).show(activityZzg);
                    return;
                }
                if (obj instanceof r6.c) {
                    ((r6.c) obj).show(activityZzg, new w5.q() { // from class: com.google.android.gms.internal.ads.zzdvx
                        @Override // w5.q
                        public final void onUserEarnedReward(r6.b bVar) {
                        }
                    });
                    return;
                }
                if (obj instanceof s6.a) {
                    ((s6.a) obj).show(activityZzg, new w5.q() { // from class: com.google.android.gms.internal.ads.zzdvy
                        @Override // w5.q
                        public final void onUserEarnedReward(r6.b bVar) {
                        }
                    });
                    return;
                }
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextZzj = zzj();
                    intent.setClassName(contextZzj, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    r0 r0Var = p.C.f2979c;
                    r0.p(contextZzj, intent);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
