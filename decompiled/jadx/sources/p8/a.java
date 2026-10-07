package p8;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f7826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7829d;

    public a(Dialog dialog, Rect rect) {
        this.f7826a = dialog;
        this.f7827b = rect.left;
        this.f7828c = rect.top;
        this.f7829d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f7827b;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f7828c;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f7829d;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f7826a.onTouchEvent(motionEventObtain);
    }
}
