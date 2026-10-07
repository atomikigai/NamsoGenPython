package h6;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcaw;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f5020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5022d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f5023f;

    public j0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f5020b = activity;
        this.f5019a = view;
        this.f5023f = onGlobalLayoutListener;
    }

    public final void a() {
        View decorView;
        if (this.f5021c) {
            return;
        }
        Activity activity = this.f5020b;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f5023f;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        zzcaw zzcawVar = d6.p.C.B;
        zzcaw.zza(this.f5019a, onGlobalLayoutListener);
        this.f5021c = true;
    }
}
