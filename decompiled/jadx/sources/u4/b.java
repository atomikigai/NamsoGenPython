package u4;

import android.os.Bundle;
import androidx.fragment.app.s;
import androidx.fragment.app.w;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends s implements g {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public c f8855f0;

    @Override // androidx.fragment.app.s
    public void C(Bundle bundle) {
        super.C(bundle);
        w wVarG = g();
        if (!(wVarG instanceof c)) {
            throw new IllegalStateException("Cannot use this fragment without the helper activity");
        }
        this.f8855f0 = (c) wVarG;
    }
}
