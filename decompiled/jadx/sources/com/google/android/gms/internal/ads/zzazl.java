package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import d6.p;
import e6.t;
import i6.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzazl extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzazc zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzazl() {
        zzazc zzazcVar = new zzazc();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzazcVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbee.zzd.zze()).intValue();
        this.zzg = ((Long) zzbee.zza.zze()).intValue();
        this.zzh = ((Long) zzbee.zze.zze()).intValue();
        this.zzi = ((Long) zzbee.zzc.zze()).intValue();
        zzbce zzbceVar = zzbcn.zzab;
        t tVar = t.f3437d;
        this.zzj = ((Integer) tVar.f3440c.zza(zzbceVar)).intValue();
        this.zzk = ((Integer) tVar.f3440c.zza(zzbcn.zzac)).intValue();
        this.zzl = ((Integer) tVar.f3440c.zza(zzbcn.zzad)).intValue();
        this.zze = ((Long) zzbee.zzf.zze()).intValue();
        this.zzm = (String) tVar.f3440c.zza(zzbcn.zzaf);
        this.zzn = ((Boolean) tVar.f3440c.zza(zzbcn.zzag)).booleanValue();
        this.zzo = ((Boolean) tVar.f3440c.zza(zzbcn.zzah)).booleanValue();
        ((Boolean) tVar.f3440c.zza(zzbcn.zzai)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ed */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00de->B:73:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazl.run():void");
    }

    public final zzazk zza(View view, zzazb zzazbVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzazbVar.zzh(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzazk(this, 1, 0);
                }
            } else {
                if ((view instanceof WebView) && !(view instanceof zzcfk)) {
                    WebView webView = (WebView) view;
                    zzazbVar.zzf();
                    webView.post(new zzazj(this, zzazbVar, webView, globalVisibleRect));
                    return new zzazk(this, 0, 1);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i = 0;
                    int i10 = 0;
                    for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                        zzazk zzazkVarZza = zza(viewGroup.getChildAt(i11), zzazbVar);
                        i += zzazkVarZza.zza;
                        i10 += zzazkVarZza.zzb;
                    }
                    return new zzazk(this, i, i10);
                }
            }
        }
        return new zzazk(this, 0, 0);
    }

    public final void zzb(View view) {
        try {
            zzazb zzazbVar = new zzazb(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZzb = p.C.f2981f.zzb();
            if (contextZzb != null && !TextUtils.isEmpty(this.zzm)) {
                String str = (String) view.getTag(contextZzb.getResources().getIdentifier((String) t.f3437d.f3440c.zza(zzbcn.zzae), "id", contextZzb.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            zzazk zzazkVarZza = zza(view, zzazbVar);
            zzazbVar.zzj();
            if (zzazkVarZza.zza == 0 && zzazkVarZza.zzb == 0) {
                return;
            }
            int i = zzazkVarZza.zzb;
            if (i != 0) {
                if (i == 0) {
                }
                this.zzd.zza(zzazbVar);
            } else if (zzazbVar.zzb() == 0) {
                return;
            }
            if (this.zzd.zzc(zzazbVar)) {
                return;
            }
            this.zzd.zza(zzazbVar);
        } catch (Exception e) {
            h.e("Exception in fetchContentOnUIThread", e);
            p.C.f2982g.zzw(e, "ContentFetchTask.fetchContent");
        }
    }

    public final void zzc(zzazb zzazbVar, WebView webView, String str, boolean z4) {
        zzazb zzazbVar2;
        zzazbVar.zze();
        try {
            if (TextUtils.isEmpty(str)) {
                zzazbVar2 = zzazbVar;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzazbVar2 = zzazbVar;
                    zzazbVar2.zzi(strOptString, z4, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzazbVar.zzi(webView.getTitle() + "\n" + strOptString, z4, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzazbVar2 = zzazbVar;
                }
            }
            if (zzazbVar2.zzl()) {
                this.zzd.zzb(zzazbVar2);
            }
        } catch (JSONException unused) {
            h.b("Json string may be malformed.");
        } catch (Throwable th) {
            h.c("Failed to get webview content.", th);
            p.C.f2982g.zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzd() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    h.b("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            h.b("ContentFetchThread: paused, pause = true");
        }
    }
}
