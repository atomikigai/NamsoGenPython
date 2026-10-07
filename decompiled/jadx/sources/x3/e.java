package x3;

import a4.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10270b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i) {
        super(2);
        this.f10270b = i;
    }

    public final h d() {
        switch (this.f10270b) {
            case 0:
                return new d(this);
            default:
                return new j(this);
        }
    }
}
