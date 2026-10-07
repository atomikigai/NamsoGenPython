package wc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rc.b0;
import rc.b1;
import rc.l1;
import rc.s1;
import rc.u0;
import rc.w1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i6.e f9914a = new i6.e("NO_DECISION", 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i6.e f9915b = new i6.e("CLOSED", 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i6.e f9916c = new i6.e("UNDEFINED", 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i6.e f9917d = new i6.e("REUSABLE_CLAIMED", 3);
    public static final i6.e e = new i6.e("CONDITION_FALSE", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i6.e f9918f = new i6.e("NO_THREAD_ELEMENTS", 3);

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(da.v.f(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(t tVar, long j4, ic.p pVar) {
        while (true) {
            if (tVar.f9954c >= j4 && !tVar.c()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f9925a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            i6.e eVar = f9915b;
            if (obj == eVar) {
                return eVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f9954c + 1), tVar);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                        if (tVar.c()) {
                            tVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(tVar) == null);
            }
            tVar = tVar2;
        }
    }

    public static final t c(Object obj) {
        if (obj != f9915b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, yb.i iVar) {
        Throwable runtimeException;
        Iterator it = f.f9928a.iterator();
        while (it.hasNext()) {
            try {
                ((sc.b) it.next()).S(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    p3.a.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            p3.a.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f9915b;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(yb.i iVar, Object obj) {
        if (obj == f9918f) {
            return;
        }
        if (!(obj instanceof a0)) {
            Object objG = iVar.G(null, w.f9958c);
            jc.i.c(objG, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((x) objG).a(obj);
            return;
        }
        a0 a0Var = (a0) obj;
        x[] xVarArr = a0Var.f9921c;
        int length = xVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            x xVar = xVarArr[length];
            jc.i.b(xVar);
            xVar.a(a0Var.f9920b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final void h(Object obj, yb.d dVar) {
        if (!(dVar instanceof h)) {
            dVar.resumeWith(obj);
            return;
        }
        h hVar = (h) dVar;
        rc.x xVar = hVar.f9931d;
        ac.c cVar = hVar.e;
        Throwable thA = ub.h.a(obj);
        Object sVar = thA == null ? obj : new rc.s(false, thA);
        cVar.getContext();
        if (xVar.T()) {
            hVar.f9932f = sVar;
            hVar.f8280c = 1;
            xVar.S(cVar.getContext(), hVar);
            return;
        }
        u0 u0VarA = s1.a();
        if (u0VarA.f8326c >= 4294967296L) {
            hVar.f9932f = sVar;
            hVar.f8280c = 1;
            vb.g gVar = u0VarA.e;
            if (gVar == null) {
                gVar = new vb.g();
                u0VarA.e = gVar;
            }
            gVar.addLast(hVar);
            return;
        }
        u0VarA.W(true);
        try {
            b1 b1Var = (b1) cVar.getContext().H(rc.y.f8337b);
            if (b1Var == null || b1Var.c()) {
                Object obj2 = hVar.f9933r;
                yb.i context = cVar.getContext();
                Object objM = m(context, obj2);
                w1 w1VarX = objM != f9918f ? b0.x(cVar, context, objM) : null;
                try {
                    cVar.resumeWith(obj);
                    if (w1VarX == null || w1VarX.Y()) {
                        g(context, objM);
                    }
                } catch (Throwable th) {
                    if (w1VarX == null || w1VarX.Y()) {
                        g(context, objM);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionU = ((l1) b1Var).u();
                hVar.b(sVar, cancellationExceptionU);
                hVar.resumeWith(r7.g.m(cancellationExceptionU));
            }
            while (u0VarA.Y()) {
            }
        } catch (Throwable th2) {
            try {
                hVar.h(th2, null);
            } finally {
                u0VarA.U(true);
            }
        }
    }

    public static final long j(String str, long j4, long j10, long j11) {
        String property;
        boolean z4;
        String str2;
        Long lValueOf;
        int i = v.f9956a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j4;
        }
        android.support.v4.media.session.a.c(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
        } else {
            int i10 = 0;
            char cCharAt = property.charAt(0);
            long j12 = -9223372036854775807L;
            if (jc.i.f(cCharAt, 48) < 0) {
                z4 = true;
                if (length != 1) {
                    if (cCharAt != '+') {
                        if (cCharAt == '-') {
                            j12 = Long.MIN_VALUE;
                            i10 = 1;
                        }
                        lValueOf = null;
                    } else {
                        z4 = false;
                        i10 = 1;
                    }
                }
                str2 = property;
                lValueOf = null;
            } else {
                z4 = false;
            }
            long j13 = 0;
            long j14 = -256204778801521550L;
            while (true) {
                if (i10 >= length) {
                    str2 = property;
                    lValueOf = z4 ? Long.valueOf(j13) : Long.valueOf(-j13);
                } else {
                    int iDigit = Character.digit((int) property.charAt(i10), 10);
                    if (iDigit >= 0) {
                        if (j13 < j14) {
                            if (j14 == -256204778801521550L) {
                                str2 = property;
                                j14 = j12 / ((long) 10);
                                if (j13 < j14) {
                                }
                            }
                            lValueOf = null;
                        } else {
                            str2 = property;
                        }
                        long j15 = j13 * ((long) 10);
                        long j16 = iDigit;
                        if (j15 < j12 + j16) {
                            lValueOf = null;
                        } else {
                            j13 = j15 - j16;
                            i10++;
                            property = str2;
                        }
                    }
                    str2 = property;
                    lValueOf = null;
                }
            }
        }
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int k(int i, int i10, String str) {
        return (int) j(str, i, 1, (i10 & 8) != 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2097150);
    }

    public static final Object l(yb.i iVar) {
        Object objG = iVar.G(0, w.f9957b);
        jc.i.b(objG);
        return objG;
    }

    public static final Object m(yb.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f9918f;
        }
        return obj instanceof Integer ? iVar.G(new a0(((Number) obj).intValue(), iVar), w.f9959d) : ((x) obj).b(iVar);
    }
}
