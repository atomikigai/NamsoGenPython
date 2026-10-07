package androidx.fragment.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements f2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f988b;

    public /* synthetic */ t(w wVar, int i) {
        this.f987a = i;
        this.f988b = wVar;
    }

    @Override // f2.c
    public final Bundle a() {
        switch (this.f987a) {
            case 0:
                Bundle bundle = new Bundle();
                w wVar = (w) this.f988b;
                while (w.q(wVar.p())) {
                }
                wVar.F.d(androidx.lifecycle.l.ON_STOP);
                j0 j0VarQ = ((v) wVar.E.f113b).f999s.Q();
                if (j0VarQ != null) {
                    bundle.putParcelable("android:support:fragments", j0VarQ);
                }
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f988b));
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                ((g.g) this.f988b).r().getClass();
                return bundle3;
        }
    }

    public t(f2.d dVar) {
        this.f987a = 1;
        this.f988b = new LinkedHashSet();
        dVar.f("androidx.savedstate.Restarter", this);
    }
}
