package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ContentFrameLayout {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f4069t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, j.d dVar) {
        super(dVar, null);
        this.f4069t = uVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f4069t.y(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x4 < -5 || y10 < -5 || x4 > getWidth() + 5 || y10 > getHeight() + 5) {
                u uVar = this.f4069t;
                uVar.w(uVar.D(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(com.bumptech.glide.d.r(getContext(), i));
    }
}
