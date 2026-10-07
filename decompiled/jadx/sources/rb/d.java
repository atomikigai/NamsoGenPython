package rb;

import android.view.View;
import java.util.WeakHashMap;
import jc.i;
import q0.h0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8248a;

    public /* synthetic */ d(int i) {
        this.f8248a = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f8248a) {
            case 0:
                i.e(view, "v");
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = v0.f7946a;
                h0.c(view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f8248a) {
            case 0:
                i.e(view, "v");
                break;
        }
    }

    private final void a(View view) {
    }
}
