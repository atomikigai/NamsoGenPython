package a4;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f126b;

    public /* synthetic */ d(Object obj, int i) {
        this.f125a = i;
        this.f126b = obj;
    }

    @Override // a4.x
    public final boolean a(Object obj) {
        switch (this.f125a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // a4.x
    public final w b(Object obj, int i, int i10, u3.i iVar) {
        switch (this.f125a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new w(new o4.d(bArr), new s(1, bArr, (h0) this.f126b));
            case 1:
                return new w(new o4.d(obj), new f(0, obj.toString(), (h0) this.f126b));
            default:
                File file = (File) obj;
                return new w(new o4.d(file), new f(1, file, (h0) this.f126b));
        }
    }
}
