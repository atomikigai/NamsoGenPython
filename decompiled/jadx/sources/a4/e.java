package a4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f131b;

    public /* synthetic */ e(Object obj, int i) {
        this.f130a = i;
        this.f131b = obj;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f130a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f131b.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        int i = this.f130a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i = this.f130a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        switch (this.f130a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.f fVar, com.bumptech.glide.load.data.d dVar) {
        switch (this.f130a) {
            case 0:
                try {
                    dVar.f(p4.b.a((File) this.f131b));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    dVar.b(e);
                    return;
                }
                break;
            default:
                dVar.f(this.f131b);
                break;
        }
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
