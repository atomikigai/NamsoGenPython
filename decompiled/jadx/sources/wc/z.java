package wc;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rc.r0;
import rc.s0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9965b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_size");
    private volatile int _size;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0[] f9966a;

    public final void a(r0 r0Var) {
        r0Var.b((s0) this);
        r0[] r0VarArr = this.f9966a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9965b;
        if (r0VarArr == null) {
            r0VarArr = new r0[4];
            this.f9966a = r0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= r0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(r0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            jc.i.d(objArrCopyOf, "copyOf(this, newSize)");
            r0VarArr = (r0[]) objArrCopyOf;
            this.f9966a = r0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        r0VarArr[i] = r0Var;
        r0Var.f8313b = i;
        c(i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final r0 b(int i) {
        int i10;
        int i11;
        Object[] objArr;
        int i12;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f9966a;
        jc.i.b(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9965b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i13 = (i - 1) / 2;
            if (i > 0) {
                r0 r0Var = objArr2[i];
                jc.i.b(r0Var);
                Object obj2 = objArr2[i13];
                jc.i.b(obj2);
                if (r0Var.compareTo(obj2) < 0) {
                    d(i, i13);
                    c(i13);
                } else {
                    while (true) {
                        i10 = i * 2;
                        i11 = i10 + 1;
                        if (i11 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f9966a;
                        jc.i.b(objArr);
                        i12 = i10 + 2;
                        if (i12 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i12];
                            jc.i.b(comparable3);
                            obj = objArr[i11];
                            jc.i.b(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i12 = i11;
                            }
                        } else {
                            i12 = i11;
                        }
                        comparable = objArr[i];
                        jc.i.b(comparable);
                        comparable2 = objArr[i12];
                        jc.i.b(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i, i12);
                        i = i12;
                    }
                }
            } else {
                while (true) {
                    i10 = i * 2;
                    i11 = i10 + 1;
                    if (i11 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f9966a;
                    jc.i.b(objArr);
                    i12 = i10 + 2;
                    if (i12 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i12];
                        jc.i.b(comparable3);
                        obj = objArr[i11];
                        jc.i.b(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i12 = i11;
                        }
                    } else {
                        i12 = i11;
                    }
                    comparable = objArr[i];
                    jc.i.b(comparable);
                    comparable2 = objArr[i12];
                    jc.i.b(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i, i12);
                    i = i12;
                }
            }
        }
        r0 r0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        jc.i.b(r0Var2);
        r0Var2.b(null);
        r0Var2.f8313b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return r0Var2;
    }

    public final void c(int i) {
        while (i > 0) {
            r0[] r0VarArr = this.f9966a;
            jc.i.b(r0VarArr);
            int i10 = (i - 1) / 2;
            r0 r0Var = r0VarArr[i10];
            jc.i.b(r0Var);
            r0 r0Var2 = r0VarArr[i];
            jc.i.b(r0Var2);
            if (r0Var.compareTo(r0Var2) <= 0) {
                return;
            }
            d(i, i10);
            i = i10;
        }
    }

    public final void d(int i, int i10) {
        r0[] r0VarArr = this.f9966a;
        jc.i.b(r0VarArr);
        r0 r0Var = r0VarArr[i10];
        jc.i.b(r0Var);
        r0 r0Var2 = r0VarArr[i];
        jc.i.b(r0Var2);
        r0VarArr[i] = r0Var;
        r0VarArr[i10] = r0Var2;
        r0Var.f8313b = i;
        r0Var2.f8313b = i10;
    }
}
