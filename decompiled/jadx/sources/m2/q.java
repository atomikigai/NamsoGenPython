package m2;

import android.view.ViewGroup;
import app.namso_gen.spacehowen.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.g0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f7018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f7019c;

    static {
        a aVar = new a();
        aVar.H = new ArrayList();
        aVar.I = true;
        aVar.K = false;
        aVar.L = 0;
        aVar.I = false;
        aVar.F(new h(2));
        aVar.F(new f());
        aVar.F(new h(1));
        f7017a = aVar;
        f7018b = new ThreadLocal();
        f7019c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        ArrayList arrayList = f7019c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = v0.f7946a;
        if (g0.c(viewGroup)) {
            arrayList.add(viewGroup);
            if (mVar == null) {
                mVar = f7017a;
            }
            m mVarClone = mVar.clone();
            ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((m) obj).t(viewGroup);
                }
            }
            if (mVarClone != null) {
                mVarClone.g(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (mVarClone != null) {
                p pVar = new p();
                pVar.f7015a = mVarClone;
                pVar.f7016b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(pVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(pVar);
            }
        }
    }

    public static r.e b() {
        r.e eVar;
        ThreadLocal threadLocal = f7018b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (r.e) weakReference.get()) != null) {
            return eVar;
        }
        r.e eVar2 = new r.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}
