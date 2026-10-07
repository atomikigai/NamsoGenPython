package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends n {
    m i(long j4, q qVar);

    m j(j$.time.f fVar);

    m l(long j4, s sVar);

    default m a(long j4, s sVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, sVar).l(1L, sVar) : l(-j4, sVar);
    }
}
