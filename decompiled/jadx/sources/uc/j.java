package uc;

import java.util.NoSuchElementException;
import jc.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i6.e f9101a = new i6.e("NONE", 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i6.e f9102b = new i6.e("PENDING", 3);

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0053, B:28:0x0068, B:30:0x0070, B:32:0x0076, B:34:0x007c, B:37:0x008d, B:38:0x0095, B:39:0x0096, B:40:0x009d, B:20:0x0048, B:23:0x004f), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0053, B:28:0x0068, B:30:0x0070, B:32:0x0076, B:34:0x007c, B:37:0x008d, B:38:0x0095, B:39:0x0096, B:40:0x009d, B:20:0x0048, B:23:0x004f), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007c A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0053, B:28:0x0068, B:30:0x0070, B:32:0x0076, B:34:0x007c, B:37:0x008d, B:38:0x0095, B:39:0x0096, B:40:0x009d, B:20:0x0048, B:23:0x004f), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008d A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0053, B:28:0x0068, B:30:0x0070, B:32:0x0076, B:34:0x007c, B:37:0x008d, B:38:0x0095, B:39:0x0096, B:40:0x009d, B:20:0x0048, B:23:0x004f), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0096 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0053, B:28:0x0068, B:30:0x0070, B:32:0x0076, B:34:0x007c, B:37:0x008d, B:38:0x0095, B:39:0x0096, B:40:0x009d, B:20:0x0048, B:23:0x004f), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r2.c(r11, r0) == r1) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008a -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(uc.c r8, tc.p r9, boolean r10, ac.c r11) {
        /*
            boolean r0 = r11 instanceof uc.d
            if (r0 == 0) goto L13
            r0 = r11
            uc.d r0 = (uc.d) r0
            int r1 = r0.f9084f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9084f = r1
            goto L18
        L13:
            uc.d r0 = new uc.d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.e
            zb.a r1 = zb.a.f11555a
            int r2 = r0.f9084f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            boolean r10 = r0.f9083d
            tc.a r8 = r0.f9082c
            tc.p r9 = r0.f9081b
            uc.c r2 = r0.f9080a
            r7.g.G(r11)     // Catch: java.lang.Throwable -> L35
        L32:
            r11 = r8
            r8 = r2
            goto L53
        L35:
            r8 = move-exception
            goto La6
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            boolean r10 = r0.f9083d
            tc.a r8 = r0.f9082c
            tc.p r9 = r0.f9081b
            uc.c r2 = r0.f9080a
            r7.g.G(r11)     // Catch: java.lang.Throwable -> L35
            goto L68
        L4c:
            r7.g.G(r11)
            tc.a r11 = r9.iterator()     // Catch: java.lang.Throwable -> L35
        L53:
            r0.f9080a = r8     // Catch: java.lang.Throwable -> L35
            r0.f9081b = r9     // Catch: java.lang.Throwable -> L35
            r0.f9082c = r11     // Catch: java.lang.Throwable -> L35
            r0.f9083d = r10     // Catch: java.lang.Throwable -> L35
            r0.f9084f = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r11.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L64
            goto L8c
        L64:
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r7
        L68:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L35
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r11 == 0) goto L9e
            java.lang.Object r11 = r8.f8675a     // Catch: java.lang.Throwable -> L35
            i6.e r6 = tc.d.f8700p     // Catch: java.lang.Throwable -> L35
            if (r11 == r6) goto L96
            r8.f8675a = r6     // Catch: java.lang.Throwable -> L35
            i6.e r6 = tc.d.f8696l     // Catch: java.lang.Throwable -> L35
            if (r11 == r6) goto L8d
            r0.f9080a = r2     // Catch: java.lang.Throwable -> L35
            r0.f9081b = r9     // Catch: java.lang.Throwable -> L35
            r0.f9082c = r8     // Catch: java.lang.Throwable -> L35
            r0.f9083d = r10     // Catch: java.lang.Throwable -> L35
            r0.f9084f = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r11 = r2.c(r11, r0)     // Catch: java.lang.Throwable -> L35
            if (r11 != r1) goto L32
        L8c:
            return r1
        L8d:
            tc.b r8 = r8.f8677c     // Catch: java.lang.Throwable -> L35
            java.lang.Throwable r8 = r8.o()     // Catch: java.lang.Throwable -> L35
            int r11 = wc.u.f9955a     // Catch: java.lang.Throwable -> L35
            throw r8     // Catch: java.lang.Throwable -> L35
        L96:
            java.lang.String r8 = "`hasNext()` has not been invoked"
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L35
            throw r11     // Catch: java.lang.Throwable -> L35
        L9e:
            if (r10 == 0) goto La3
            r9.d(r3)
        La3:
            ub.k r8 = ub.k.f9073a
            return r8
        La6:
            throw r8     // Catch: java.lang.Throwable -> La7
        La7:
            r11 = move-exception
            if (r10 == 0) goto Lc0
            boolean r10 = r8 instanceof java.util.concurrent.CancellationException
            if (r10 == 0) goto Lb1
            r3 = r8
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        Lb1:
            if (r3 != 0) goto Lbd
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "Channel was consumed, consumer had failed"
            r3.<init>(r10)
            r3.initCause(r8)
        Lbd:
            r9.d(r3)
        Lc0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.j.a(uc.c, tc.p, boolean, ac.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(b bVar, ac.c cVar) {
        f fVar;
        q qVar;
        vc.a e;
        h3.h hVar;
        i6.e eVar = vc.c.f9318b;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.f9092d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.f9092d = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(cVar);
            }
        } else {
            fVar = new f(cVar);
        }
        Object obj = fVar.f9091c;
        Object obj2 = zb.a.f11555a;
        int i10 = fVar.f9092d;
        if (i10 == 0) {
            r7.g.G(obj);
            q qVar2 = new q();
            qVar2.f5776a = eVar;
            h3.h hVar2 = new h3.h(qVar2, 4);
            try {
                fVar.f9089a = qVar2;
                fVar.f9090b = hVar2;
                fVar.f9092d = 1;
                if (bVar.d(hVar2, fVar) == obj2) {
                    return obj2;
                }
                qVar = qVar2;
            } catch (vc.a e4) {
                qVar = qVar2;
                e = e4;
                hVar = hVar2;
                if (e.f9313a != hVar) {
                    throw e;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = fVar.f9090b;
            qVar = fVar.f9089a;
            try {
                r7.g.G(obj);
            } catch (vc.a e10) {
                e = e10;
                if (e.f9313a != hVar) {
                    throw e;
                }
            }
        }
        Object obj3 = qVar.f5776a;
        if (obj3 != eVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }
}
