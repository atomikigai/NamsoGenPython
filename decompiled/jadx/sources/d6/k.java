package d6;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import app.namso_gen.spacehowen.ui.browser.ProfileViewerActivity;
import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzfgq;
import e6.s;
import e6.z;
import java.util.concurrent.ConcurrentHashMap;
import l3.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2963b;

    public /* synthetic */ k(Object obj, int i) {
        this.f2962a = i;
        this.f2963b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z4) {
        int i = this.f2962a;
        Object obj = this.f2963b;
        switch (i) {
            case 1:
                jc.i.e(webView, "view");
                t tVar = (t) obj;
                tVar.m0(webView);
                t.b0(tVar, webView);
                break;
            case 2:
                jc.i.e(webView, "view");
                ProfileViewerActivity profileViewerActivity = (ProfileViewerActivity) obj;
                ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                profileViewerActivity.x();
                ProfileViewerActivity.t(profileViewerActivity, webView);
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z4);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        int i = this.f2962a;
        Object obj = this.f2963b;
        switch (i) {
            case 1:
                jc.i.e(webView, "view");
                t tVar = (t) obj;
                tVar.m0(webView);
                t.b0(tVar, webView);
                break;
            case 2:
                jc.i.e(webView, "view");
                ProfileViewerActivity profileViewerActivity = (ProfileViewerActivity) obj;
                ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                profileViewerActivity.x();
                ProfileViewerActivity.t(profileViewerActivity, webView);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f2962a) {
            case 0:
                o oVar = (o) this.f2963b;
                z zVar = oVar.f2974r;
                if (zVar != null) {
                    try {
                        zVar.zzf(zzfgq.zzd(1, null, null));
                    } catch (RemoteException e) {
                        i6.h.i("#007 Could not call remote method.", e);
                    }
                }
                z zVar2 = oVar.f2974r;
                if (zVar2 != null) {
                    try {
                        zVar2.zze(0);
                    } catch (RemoteException e4) {
                        i6.h.i("#007 Could not call remote method.", e4);
                        return;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f2962a) {
            case 1:
                jc.i.e(webView, "view");
                jc.i.e(webResourceRequest, "request");
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f2962a) {
            case 0:
                o oVar = (o) this.f2963b;
                Context context = oVar.f2972d;
                int iO = 0;
                if (str.startsWith(oVar.zzq())) {
                    return false;
                }
                if (!str.startsWith("gmsg://noAdLoaded")) {
                    if (str.startsWith("gmsg://scriptLoadFailed")) {
                        z zVar = oVar.f2974r;
                        if (zVar != null) {
                            try {
                                zVar.zzf(zzfgq.zzd(1, null, null));
                            } catch (RemoteException e) {
                                i6.h.i("#007 Could not call remote method.", e);
                            }
                        }
                        z zVar2 = oVar.f2974r;
                        if (zVar2 != null) {
                            try {
                                zVar2.zze(0);
                            } catch (RemoteException e4) {
                                i6.h.i("#007 Could not call remote method.", e4);
                            }
                        }
                        oVar.y(0);
                    } else if (str.startsWith("gmsg://adResized")) {
                        z zVar3 = oVar.f2974r;
                        if (zVar3 != null) {
                            try {
                                zVar3.zzi();
                            } catch (RemoteException e10) {
                                i6.h.i("#007 Could not call remote method.", e10);
                            }
                        }
                        String queryParameter = Uri.parse(str).getQueryParameter("height");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            try {
                                i6.d dVar = s.f3427f.f3428a;
                                iO = i6.d.o(context, Integer.parseInt(queryParameter));
                                break;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        oVar.y(iO);
                    } else if (!str.startsWith("gmsg://")) {
                        z zVar4 = oVar.f2974r;
                        if (zVar4 != null) {
                            try {
                                zVar4.zzc();
                                oVar.f2974r.zzh();
                            } catch (RemoteException e11) {
                                i6.h.i("#007 Could not call remote method.", e11);
                            }
                        }
                        if (oVar.f2975s != null) {
                            Uri uriZza = Uri.parse(str);
                            try {
                                uriZza = oVar.f2975s.zza(uriZza, context, null, null);
                            } catch (zzavd e12) {
                                i6.h.h("Unable to process ad data", e12);
                            }
                            str = uriZza.toString();
                        }
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(str));
                        context.startActivity(intent);
                    }
                    break;
                } else {
                    z zVar5 = oVar.f2974r;
                    if (zVar5 != null) {
                        try {
                            zVar5.zzf(zzfgq.zzd(3, null, null));
                        } catch (RemoteException e13) {
                            i6.h.i("#007 Could not call remote method.", e13);
                        }
                    }
                    z zVar6 = oVar.f2974r;
                    if (zVar6 != null) {
                        try {
                            zVar6.zze(3);
                        } catch (RemoteException e14) {
                            i6.h.i("#007 Could not call remote method.", e14);
                        }
                    }
                    oVar.y(0);
                    break;
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f2962a) {
            case 1:
                jc.i.e(webView, "view");
                jc.i.e(webResourceRequest, "request");
                String string = webResourceRequest.getUrl().toString();
                jc.i.d(string, "toString(...)");
                boolean z4 = false;
                if (!pc.o.e0(string, "http://", false) && !pc.o.e0(string, "https://", false)) {
                    z4 = true;
                    try {
                        webView.getContext().startActivity(Intent.parseUri(string, 1));
                        break;
                    } catch (Throwable unused) {
                    }
                }
                return z4;
            case 2:
                jc.i.e(webView, "v");
                jc.i.e(webResourceRequest, "request");
                String string2 = webResourceRequest.getUrl().toString();
                jc.i.d(string2, "toString(...)");
                boolean z10 = false;
                if (!pc.o.e0(string2, "http://", false) && !pc.o.e0(string2, "https://", false)) {
                    z10 = true;
                    try {
                        webView.getContext().startActivity(Intent.parseUri(string2, 1));
                        break;
                    } catch (Throwable unused2) {
                    }
                }
                return z10;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
