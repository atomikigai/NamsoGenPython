package k3;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputStream f5966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OutputStream f5967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InputStream f5968d;

    public /* synthetic */ q(InputStream inputStream, OutputStream outputStream, Object obj, InputStream inputStream2, int i) {
        this.f5965a = i;
        this.f5966b = inputStream;
        this.f5967c = outputStream;
        this.f5968d = inputStream2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5965a) {
            case 0:
                InputStream inputStream = this.f5966b;
                OutputStream outputStream = this.f5967c;
                InputStream inputStream2 = this.f5968d;
                try {
                    qd.b.n(inputStream, outputStream, 32768);
                    outputStream.flush();
                    break;
                } catch (Throwable unused) {
                }
                bd.n.b(outputStream);
                bd.n.b(inputStream2);
                break;
            default:
                InputStream inputStream3 = this.f5966b;
                OutputStream outputStream2 = this.f5967c;
                InputStream inputStream4 = this.f5968d;
                try {
                    qd.b.n(inputStream3, outputStream2, 32768);
                    outputStream2.flush();
                    break;
                } catch (Throwable unused2) {
                }
                try {
                    outputStream2.flush();
                    break;
                } catch (Throwable unused3) {
                }
                r.b(inputStream4);
                break;
        }
    }
}
