package d4;

import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements w3.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2915a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2916b;

    public z(byte[] bArr) {
        p4.f.c(bArr, "Argument must not be null");
        this.f2916b = bArr;
    }

    @Override // w3.x
    public final void b() {
        int i = this.f2915a;
    }

    @Override // w3.x
    public final int d() {
        switch (this.f2915a) {
            case 0:
                return p4.n.c((Bitmap) this.f2916b);
            case 1:
                return ((byte[]) this.f2916b).length;
            default:
                return 1;
        }
    }

    @Override // w3.x
    public final Class e() {
        switch (this.f2915a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            default:
                return ((File) this.f2916b).getClass();
        }
    }

    @Override // w3.x
    public final Object get() {
        switch (this.f2915a) {
            case 0:
                return (Bitmap) this.f2916b;
            case 1:
                return (byte[]) this.f2916b;
            default:
                return (File) this.f2916b;
        }
    }

    public z(File file) {
        p4.f.c(file, "Argument must not be null");
        this.f2916b = file;
    }

    public z(Bitmap bitmap) {
        this.f2916b = bitmap;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void f() {
    }
}
