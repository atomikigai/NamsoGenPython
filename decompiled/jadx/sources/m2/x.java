package m2;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f7035d;

    public x(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f7035d = hVar;
        this.f7032a = viewGroup;
        this.f7033b = view;
        this.f7034c = view2;
    }

    @Override // m2.n, m2.l
    public final void a() {
        this.f7032a.getOverlay().remove(this.f7033b);
    }

    @Override // m2.l
    public final void c(m mVar) {
        this.f7034c.setTag(R.id.save_overlay_view, null);
        this.f7032a.getOverlay().remove(this.f7033b);
        mVar.u(this);
    }

    @Override // m2.n, m2.l
    public final void e() {
        View view = this.f7033b;
        if (view.getParent() == null) {
            this.f7032a.getOverlay().add(view);
            return;
        }
        h hVar = this.f7035d;
        ArrayList arrayList = hVar.f7010x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = hVar.B;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) hVar.B.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((l) arrayList3.get(i)).b();
        }
    }
}
