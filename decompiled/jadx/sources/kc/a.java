package kc;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends d {
    @Override // kc.d
    public final int a(int i) {
        return ((-i) >> 31) & (f().nextInt() >>> (32 - i));
    }

    @Override // kc.d
    public final int b() {
        return f().nextInt();
    }

    @Override // kc.d
    public final long d() {
        return f().nextLong();
    }

    public abstract Random f();
}
