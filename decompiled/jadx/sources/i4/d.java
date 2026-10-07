package i4;

import d4.z;
import f7.l;
import h4.g;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import u3.i;
import w3.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f5204b = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5205a;

    public /* synthetic */ d(int i) {
        this.f5205a = i;
    }

    @Override // i4.a
    public final x e(x xVar, i iVar) {
        l lVar;
        byte[] bArrArray;
        switch (this.f5205a) {
            case 0:
                return xVar;
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((g) ((h4.c) xVar.get()).f4934a.f4933b).f4950a.f8582d.asReadOnlyBuffer();
                AtomicReference atomicReference = p4.b.f7790a;
                if (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) {
                    lVar = null;
                } else {
                    byte[] bArrArray2 = byteBufferAsReadOnlyBuffer.array();
                    int iArrayOffset = byteBufferAsReadOnlyBuffer.arrayOffset();
                    int iLimit = byteBufferAsReadOnlyBuffer.limit();
                    lVar = new l();
                    lVar.f3644c = bArrArray2;
                    lVar.f3642a = iArrayOffset;
                    lVar.f3643b = iLimit;
                }
                if (lVar != null && lVar.f3642a == 0 && lVar.f3643b == ((byte[]) lVar.f3644c).length) {
                    bArrArray = byteBufferAsReadOnlyBuffer.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                }
                return new z(bArrArray);
        }
    }
}
