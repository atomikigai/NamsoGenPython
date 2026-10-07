package od;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public interface g extends t, WritableByteChannel {
    g D(long j4);

    @Override // od.t, java.io.Flushable
    void flush();

    g write(byte[] bArr);

    g writeByte(int i);

    g writeInt(int i);

    g writeShort(int i);

    g x(i iVar);

    g y(String str);
}
