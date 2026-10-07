package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends androidx.lifecycle.p0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b9.e f909j = new b9.e(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f912g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f910d = new HashMap();
    public final HashMap e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f911f = new HashMap();
    public boolean h = false;
    public boolean i = false;

    public k0(boolean z4) {
        this.f912g = z4;
    }

    @Override // androidx.lifecycle.p0
    public final void b() {
        if (i0.D(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public final void c(s sVar) {
        if (this.i) {
            if (i0.D(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f910d.remove(sVar.e) == null || !i0.D(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + sVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f910d.equals(k0Var.f910d) && this.e.equals(k0Var.e) && this.f911f.equals(k0Var.f911f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f911f.hashCode() + ((this.e.hashCode() + (this.f910d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f910d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f911f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
