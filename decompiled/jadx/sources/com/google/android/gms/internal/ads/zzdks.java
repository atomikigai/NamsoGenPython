package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import e6.q3;
import e6.s;
import e6.t;
import i6.d;
import i6.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import r7.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdks {
    private final zzdpn zza;
    private final zzdoc zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdks(zzdpn zzdpnVar, zzdoc zzdocVar) {
        this.zza = zzdpnVar;
        this.zzb = zzdocVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        d dVar = s.f3427f.f3428a;
        return d.o(context, i);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzcfw {
        zzcfk zzcfkVarZza = this.zza.zza(q3.h(), null, null);
        zzcfkVarZza.zzF().setVisibility(4);
        zzcfkVarZza.zzF().setContentDescription("policy_validator");
        zzcfkVarZza.zzag("/sendMessageToSdk", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkm
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcfk) obj, map);
            }
        });
        zzcfkVarZza.zzag("/hideValidatorOverlay", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkn
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzcfk) obj, map);
            }
        });
        zzcfkVarZza.zzag("/open", new zzbkd(null, null, null, null, null));
        this.zzb.zzm(new WeakReference(zzcfkVarZza), "/loadNativeAdPolicyViolations", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdko
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                this.zza.zze(view, windowManager, (zzcfk) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzcfkVarZza), "/showValidatorOverlay", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkp
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                h.b("Show native ad policy validator overlay.");
                ((zzcfk) obj).zzF().setVisibility(0);
            }
        });
        return zzcfkVarZza.zzF();
    }

    public final /* synthetic */ void zzb(zzcfk zzcfkVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcfk zzcfkVar, Map map) {
        h.b("Hide native ad policy validator overlay.");
        zzcfkVar.zzF().setVisibility(8);
        if (zzcfkVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcfkVar.zzF());
        }
        zzcfkVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zzd(Map map, boolean z4, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", map2);
    }

    public final void zze(final View view, final WindowManager windowManager, final zzcfk zzcfkVar, final Map map) {
        zzcfkVar.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdkr
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z4, int i, String str, String str2) {
                this.zza.zzd(map, z4, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        String str = (String) map.get("validator_width");
        zzbce zzbceVar = zzbcn.zzhK;
        t tVar = t.f3437d;
        int iZzf = zzf(context, str, ((Integer) tVar.f3440c.zza(zzbceVar)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) tVar.f3440c.zza(zzbcn.zzhL)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcfkVar.zzaj(zzche.zzb(iZzf, iZzf2));
        try {
            zzcfkVar.zzG().getSettings().setUseWideViewPort(((Boolean) tVar.f3440c.zza(zzbcn.zzhM)).booleanValue());
            zzcfkVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) tVar.f3440c.zza(zzbcn.zzhN)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsK = g.K();
        layoutParamsK.x = iZzf3;
        layoutParamsK.y = iZzf4;
        windowManager.updateViewLayout(zzcfkVar.zzF(), layoutParamsK);
        final String str2 = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str2) || "2".equals(str2)) ? rect.bottom : rect.top) - iZzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdkq
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcfk zzcfkVar2 = zzcfkVar;
                        if (zzcfkVar2.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i10 = i;
                        WindowManager.LayoutParams layoutParams = layoutParamsK;
                        String str3 = str2;
                        if ("1".equals(str3) || "2".equals(str3)) {
                            layoutParams.y = rect2.bottom - i10;
                        } else {
                            layoutParams.y = rect2.top - i10;
                        }
                        windowManager.updateViewLayout(zzcfkVar2.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str3 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        zzcfkVar.loadUrl(str3);
    }
}
