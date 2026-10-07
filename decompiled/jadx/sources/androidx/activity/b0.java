package androidx.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.i0;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.ui.browser.ProfileViewerActivity;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vb.g f340b = new vb.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.fragment.app.b0 f341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f342d;
    public OnBackInvokedDispatcher e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f344g;

    public b0(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.f339a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackA = y.f417a.a(new t(this, 0), new t(this, 1), new u(this, 0), new u(this, 1));
            } else {
                onBackInvokedCallbackA = w.f412a.a(new u(this, 2));
            }
            this.f342d = onBackInvokedCallbackA;
        }
    }

    public final void a(androidx.lifecycle.r rVar, androidx.fragment.app.b0 b0Var) {
        jc.i.e(b0Var, "onBackPressedCallback");
        androidx.lifecycle.t tVarL = rVar.l();
        if (tVarL.f1093d == androidx.lifecycle.m.f1065a) {
            return;
        }
        b0Var.f848b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, tVarL, b0Var));
        d();
        b0Var.f849c = new a0(0, this, b0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
    }

    public final void b() {
        Object objPrevious;
        vb.g gVar = this.f340b;
        ListIterator listIterator = gVar.listIterator(gVar.d());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((androidx.fragment.app.b0) objPrevious).f847a);
        androidx.fragment.app.b0 b0Var = (androidx.fragment.app.b0) objPrevious;
        this.f341c = null;
        if (b0Var == null) {
            this.f339a.run();
            return;
        }
        switch (b0Var.f850d) {
            case 0:
                i0 i0Var = (i0) b0Var.e;
                i0Var.u(true);
                if (i0Var.h.f847a) {
                    i0Var.L();
                    return;
                } else {
                    i0Var.f882g.b();
                    return;
                }
            case 1:
                final l3.t tVar = (l3.t) b0Var.e;
                WebView webViewD0 = tVar.d0();
                if (webViewD0 != null && webViewD0.canGoBack()) {
                    webViewD0.goBack();
                    return;
                }
                ea.j jVar = new ea.j((Context) tVar.T(), R.style.KryptProxyDialog);
                jVar.l(R.string.viewer_exit_title);
                final int i = 0;
                jVar.j(R.string.viewer_exit_close, new DialogInterface.OnClickListener() { // from class: l3.l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        switch (i) {
                            case 0:
                                tVar.c0();
                                break;
                            default:
                                tVar.h0();
                                break;
                        }
                    }
                });
                final int i10 = 1;
                jVar.g(R.string.viewer_exit_minimize, new DialogInterface.OnClickListener() { // from class: l3.l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        switch (i10) {
                            case 0:
                                tVar.c0();
                                break;
                            default:
                                tVar.h0();
                                break;
                        }
                    }
                });
                jVar.i(R.string.cancel, null);
                jVar.m();
                return;
            default:
                final ProfileViewerActivity profileViewerActivity = (ProfileViewerActivity) b0Var.e;
                WebView webView = profileViewerActivity.L;
                if (webView == null) {
                    jc.i.i("wb");
                    throw null;
                }
                if (webView.canGoBack()) {
                    WebView webView2 = profileViewerActivity.L;
                    if (webView2 != null) {
                        webView2.goBack();
                        return;
                    } else {
                        jc.i.i("wb");
                        throw null;
                    }
                }
                ea.j jVar2 = new ea.j((Context) profileViewerActivity, R.style.KryptProxyDialog);
                jVar2.l(R.string.viewer_exit_title);
                final int i11 = 0;
                jVar2.j(R.string.viewer_exit_close, new DialogInterface.OnClickListener() { // from class: l3.i0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        int i13 = i11;
                        ProfileViewerActivity profileViewerActivity2 = profileViewerActivity;
                        switch (i13) {
                            case 0:
                                ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                                profileViewerActivity2.u();
                                break;
                            default:
                                ConcurrentHashMap concurrentHashMap2 = ProfileViewerActivity.P;
                                profileViewerActivity2.v();
                                break;
                        }
                    }
                });
                final int i12 = 1;
                jVar2.g(R.string.viewer_exit_minimize, new DialogInterface.OnClickListener() { // from class: l3.i0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i13) {
                        int i14 = i12;
                        ProfileViewerActivity profileViewerActivity2 = profileViewerActivity;
                        switch (i14) {
                            case 0:
                                ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                                profileViewerActivity2.u();
                                break;
                            default:
                                ConcurrentHashMap concurrentHashMap2 = ProfileViewerActivity.P;
                                profileViewerActivity2.v();
                                break;
                        }
                    }
                });
                jVar2.i(R.string.cancel, null);
                jVar2.m();
                return;
        }
    }

    public final void c(boolean z4) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f342d) == null) {
            return;
        }
        w wVar = w.f412a;
        if (z4 && !this.f343f) {
            wVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f343f = true;
        } else {
            if (z4 || !this.f343f) {
                return;
            }
            wVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f343f = false;
        }
    }

    public final void d() {
        boolean z4 = this.f344g;
        boolean z10 = false;
        vb.g gVar = this.f340b;
        if (gVar == null || !gVar.isEmpty()) {
            Iterator<E> it = gVar.iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.b0) it.next()).f847a) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f344g = z10;
        if (z10 == z4 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z10);
    }
}
