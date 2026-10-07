package ta;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8660a;

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        switch (this.f8660a) {
            case 0:
                throw new ra.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ra.e eVar = (ra.e) obj2;
                eVar.e(ua.f.f9052g, entry.getKey());
                eVar.e(ua.f.h, entry.getValue());
                return;
            default:
                throw new ra.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
