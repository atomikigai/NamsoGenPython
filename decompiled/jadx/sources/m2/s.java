package m2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f7024b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f7023a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7025c = new ArrayList();

    public s(View view) {
        this.f7024b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f7024b == sVar.f7024b && this.f7023a.equals(sVar.f7023a);
    }

    public final int hashCode() {
        return this.f7023a.hashCode() + (this.f7024b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbC = u.e.c("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbC.append(this.f7024b);
        sbC.append("\n");
        String strH = da.v.h(sbC.toString(), "    values:");
        HashMap map = this.f7023a;
        for (String str : map.keySet()) {
            strH = strH + "    " + str + ": " + map.get(str) + "\n";
        }
        return strH;
    }
}
