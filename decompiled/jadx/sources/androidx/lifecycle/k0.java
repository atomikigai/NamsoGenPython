package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements f2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.d f1060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f1062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ub.i f1063d;

    public k0(f2.d dVar, androidx.activity.m mVar) {
        jc.i.e(dVar, "savedStateRegistry");
        this.f1060a = dVar;
        this.f1063d = new ub.i(new j0(mVar, 0));
    }

    @Override // f2.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1062c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((l0) this.f1063d.getValue()).f1064d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((h0) entry.getValue()).e.a();
            if (!jc.i.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f1061b = false;
        return bundle;
    }
}
