package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends m1 {
    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean c(long j4, Object obj) {
        return this.f669a.getBoolean(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final byte d(long j4, Object obj) {
        return this.f669a.getByte(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final double e(long j4, Object obj) {
        return this.f669a.getDouble(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final float f(long j4, Object obj) {
        return this.f669a.getFloat(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void k(Object obj, long j4, boolean z4) {
        this.f669a.putBoolean(obj, j4, z4);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void l(Object obj, long j4, byte b10) {
        this.f669a.putByte(obj, j4, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void m(Object obj, long j4, double d10) {
        this.f669a.putDouble(obj, j4, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void n(Object obj, long j4, float f10) {
        this.f669a.putFloat(obj, j4, f10);
    }
}
