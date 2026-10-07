package m1;

import androidx.lifecycle.p0;
import b9.e;
import e7.d;
import r.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class b extends p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f6978f = new e(23);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f6979d = new l();
    public boolean e = false;

    @Override // androidx.lifecycle.p0
    public final void b() {
        l lVar = this.f6979d;
        int i = lVar.f8103c;
        for (int i10 = 0; i10 < i; i10++) {
            a aVar = (a) lVar.f8102b[i10];
            d dVar = aVar.f6975l;
            dVar.a();
            dVar.f3477c = true;
            ea.e eVar = aVar.f6977n;
            if (eVar != null) {
                aVar.i(eVar);
            }
            a aVar2 = dVar.f3475a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f3475a = null;
            if (eVar != null) {
                boolean z4 = eVar.f3515b;
            }
            dVar.f3478d = true;
            dVar.f3476b = false;
            dVar.f3477c = false;
            dVar.e = false;
        }
        int i11 = lVar.f8103c;
        Object[] objArr = lVar.f8102b;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        lVar.f8103c = 0;
    }
}
