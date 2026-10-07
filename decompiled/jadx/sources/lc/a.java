package lc;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends kc.a {
    @Override // kc.d
    public final int c(int i, int i10) {
        return ThreadLocalRandom.current().nextInt(i, i10);
    }

    @Override // kc.d
    public final long e(long j4, long j10) {
        return ThreadLocalRandom.current().nextLong(j4, j10);
    }

    @Override // kc.a
    public final Random f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        i.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
