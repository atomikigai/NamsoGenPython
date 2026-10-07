package androidx.lifecycle;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1077a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1080d;

    public o0(t tVar, l lVar) {
        jc.i.e(tVar, "registry");
        jc.i.e(lVar, "event");
        this.f1079c = tVar;
        this.f1080d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a5.b bVar;
        int i = this.f1077a;
        Object obj = this.f1080d;
        Object obj2 = this.f1079c;
        switch (i) {
            case 0:
                if (!this.f1078b) {
                    ((t) obj2).d((l) obj);
                    this.f1078b = true;
                }
                break;
            default:
                View view = (View) obj2;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                y0.d dVar = swipeDismissBehavior.f2334a;
                if (dVar != null && dVar.f()) {
                    WeakHashMap weakHashMap = v0.f7946a;
                    q0.d0.m(view, this);
                    break;
                } else if (this.f1078b && (bVar = swipeDismissBehavior.f2335b) != null) {
                    bVar.x(view);
                    break;
                }
                break;
        }
    }

    public o0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z4) {
        this.f1080d = swipeDismissBehavior;
        this.f1079c = view;
        this.f1078b = z4;
    }
}
