package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f6241b;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f6240a = i;
        this.f6241b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6240a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6241b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.H = actionBarOverlayLayout.f471d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.I);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6241b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.H = actionBarOverlayLayout2.f471d.animate().translationY(-actionBarOverlayLayout2.f471d.getHeight()).setListener(actionBarOverlayLayout2.I);
                break;
        }
    }
}
