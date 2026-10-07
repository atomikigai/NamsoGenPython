package j9;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f5708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s8.a f5710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f5711d;

    public a(ExpandableBehavior expandableBehavior, View view, int i, s8.a aVar) {
        this.f5711d = expandableBehavior;
        this.f5708a = view;
        this.f5709b = i;
        this.f5710c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f5708a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f5711d;
        if (expandableBehavior.f2597a == this.f5709b) {
            Object obj = this.f5710c;
            expandableBehavior.r((View) obj, view, ((FloatingActionButton) obj).f2486z.f6226a, false);
        }
        return false;
    }
}
