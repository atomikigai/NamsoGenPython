package a4;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f151b = new i0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152a;

    public /* synthetic */ i0(int i) {
        this.f152a = i;
    }

    @Override // a4.x
    public final boolean a(Object obj) {
        switch (this.f152a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // a4.x
    public final w b(Object obj, int i, int i10, u3.i iVar) {
        switch (this.f152a) {
            case 0:
                return new w(new o4.d(obj), new e(obj, 1));
            case 1:
                File file = (File) obj;
                return new w(new o4.d(file), new e(file, 0));
            default:
                return null;
        }
    }
}
