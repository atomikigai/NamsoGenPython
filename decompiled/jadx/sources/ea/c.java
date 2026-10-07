package ea;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b9.e f3508c = new b9.e(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3510b;

    public c(ia.b bVar) {
        this.f3509a = bVar;
        this.f3510b = f3508c;
    }

    @Override // ea.h
    public void a(g gVar, int i) throws IOException {
        int[] iArr = (int[]) this.f3510b;
        try {
            gVar.read((byte[]) this.f3509a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            gVar.close();
        }
    }

    public c(byte[] bArr, int[] iArr) {
        this.f3509a = bArr;
        this.f3510b = iArr;
    }
}
