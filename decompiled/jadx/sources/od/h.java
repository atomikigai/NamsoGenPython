package od;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public interface h extends v, ReadableByteChannel {
    String A(Charset charset);

    String K();

    int L(n nVar);

    void P(long j4);

    long Q();

    i h(long j4);

    String r(long j4);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j4);
}
