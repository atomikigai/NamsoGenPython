package b0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t8.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1333b;

    public /* synthetic */ f(Object obj, int i) {
        this.f1332a = i;
        this.f1333b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        switch (this.f1332a) {
            case 0:
                ((CoordinatorLayout) this.f1333b).p(0);
                break;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                m4.d dVar = (m4.d) ((WeakReference) this.f1333b).get();
                if (dVar != null) {
                    ArrayList arrayList = dVar.f7058b;
                    View view = dVar.f7057a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int i = 0;
                        int iA = dVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iA2 = dVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iA > 0 || iA == Integer.MIN_VALUE) {
                            if (iA2 > 0 || iA2 == Integer.MIN_VALUE) {
                                ArrayList arrayList2 = new ArrayList(arrayList);
                                int size = arrayList2.size();
                                while (i < size) {
                                    Object obj = arrayList2.get(i);
                                    i++;
                                    ((l4.f) ((m4.b) obj)).m(iA, iA2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(dVar.f7059c);
                                }
                                dVar.f7059c = null;
                                arrayList.clear();
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                j jVar = (j) this.f1333b;
                float rotation = jVar.f8653s.getRotation();
                if (jVar.f8649o != rotation) {
                    jVar.f8649o = rotation;
                    jVar.p();
                }
                break;
        }
        return true;
    }

    public f(m4.d dVar) {
        this.f1332a = 1;
        this.f1333b = new WeakReference(dVar);
    }
}
