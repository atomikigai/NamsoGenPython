package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f664b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f664b = i;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean c(long j4, Object obj) {
        switch (this.f664b) {
            case 0:
                if (n1.h) {
                    if (n1.g(j4, obj) == 0) {
                        return false;
                    }
                } else if (n1.h(j4, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (n1.h) {
                    if (n1.g(j4, obj) == 0) {
                        return false;
                    }
                } else if (n1.h(j4, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final byte d(long j4, Object obj) {
        switch (this.f664b) {
            case 0:
                return n1.h ? n1.g(j4, obj) : n1.h(j4, obj);
            default:
                return n1.h ? n1.g(j4, obj) : n1.h(j4, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final double e(long j4, Object obj) {
        switch (this.f664b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(j4, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final float f(long j4, Object obj) {
        switch (this.f664b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(j4, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void k(Object obj, long j4, boolean z4) {
        switch (this.f664b) {
            case 0:
                if (!n1.h) {
                    n1.l(obj, j4, z4 ? (byte) 1 : (byte) 0);
                } else {
                    n1.k(obj, j4, z4 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!n1.h) {
                    n1.l(obj, j4, z4 ? (byte) 1 : (byte) 0);
                } else {
                    n1.k(obj, j4, z4 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void l(Object obj, long j4, byte b10) {
        switch (this.f664b) {
            case 0:
                if (!n1.h) {
                    n1.l(obj, j4, b10);
                } else {
                    n1.k(obj, j4, b10);
                }
                break;
            default:
                if (!n1.h) {
                    n1.l(obj, j4, b10);
                } else {
                    n1.k(obj, j4, b10);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void m(Object obj, long j4, double d10) {
        switch (this.f664b) {
            case 0:
                p(obj, j4, Double.doubleToLongBits(d10));
                break;
            default:
                p(obj, j4, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void n(Object obj, long j4, float f10) {
        switch (this.f664b) {
            case 0:
                o(obj, j4, Float.floatToIntBits(f10));
                break;
            default:
                o(obj, j4, Float.floatToIntBits(f10));
                break;
        }
    }
}
