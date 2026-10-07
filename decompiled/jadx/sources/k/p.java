package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends FrameLayout implements j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f5894a;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f5894a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // j.b
    public final void onActionViewCollapsed() {
        this.f5894a.onActionViewCollapsed();
    }

    @Override // j.b
    public final void onActionViewExpanded() {
        this.f5894a.onActionViewExpanded();
    }
}
