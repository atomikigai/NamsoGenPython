package g6;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6.j f4192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4193b;

    public g(Context context, String str, String str2, String str3) {
        super(context);
        h6.j jVar = new h6.j(context);
        jVar.f5012c = str;
        this.f4192a = jVar;
        jVar.e = str2;
        jVar.f5013d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f4193b) {
            return false;
        }
        this.f4192a.a(motionEvent);
        return false;
    }
}
