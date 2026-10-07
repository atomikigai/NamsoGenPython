package q0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d2 f7905a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f7907c;

    public i0(View view, t tVar) {
        this.f7906b = view;
        this.f7907c = tVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        d2 d2VarG = d2.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        t tVar = this.f7907c;
        if (i < 30) {
            j0.a(windowInsets, this.f7906b);
            if (d2VarG.equals(this.f7905a)) {
                return tVar.k(view, d2VarG).f();
            }
        }
        this.f7905a = d2VarG;
        d2 d2VarK = tVar.k(view, d2VarG);
        if (i >= 30) {
            return d2VarK.f();
        }
        WeakHashMap weakHashMap = v0.f7946a;
        h0.c(view);
        return d2VarK.f();
    }
}
