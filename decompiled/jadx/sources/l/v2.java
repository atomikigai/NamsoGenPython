package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f6442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f6443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f6444d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6445f;

    public v2(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f6442b = rect3;
        Rect rect4 = new Rect();
        this.f6444d = rect4;
        Rect rect5 = new Rect();
        this.f6443c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f6441a = view;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        int x4 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z10 = this.f6445f;
                if (z10 && !this.f6444d.contains(x4, y10)) {
                    z11 = z10;
                    z4 = false;
                }
            } else if (action != 3) {
                z4 = true;
                z11 = false;
            } else {
                z10 = this.f6445f;
                this.f6445f = false;
            }
            z11 = z10;
            z4 = true;
        } else if (this.f6442b.contains(x4, y10)) {
            this.f6445f = true;
            z4 = true;
        } else {
            z4 = true;
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        Rect rect = this.f6443c;
        View view = this.f6441a;
        if (!z4 || rect.contains(x4, y10)) {
            motionEvent.setLocation(x4 - rect.left, y10 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
