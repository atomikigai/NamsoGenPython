package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends ac.h implements ic.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m1 f8294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f8295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8296d;
    public /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1 f8297f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, yb.d dVar) {
        super(dVar);
        this.f8297f = l1Var;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        k1 k1Var = new k1(this.f8297f, dVar);
        k1Var.e = obj;
        return k1Var;
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k1) create((oc.f) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0062 -> B:25:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ac.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            zb.a r0 = zb.a.f11555a
            int r1 = r5.f8296d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            rc.o r1 = r5.f8295c
            rc.m1 r3 = r5.f8294b
            java.lang.Object r4 = r5.e
            oc.f r4 = (oc.f) r4
            r7.g.G(r6)
            goto L76
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            r7.g.G(r6)
            goto L7b
        L24:
            r7.g.G(r6)
            java.lang.Object r6 = r5.e
            oc.f r6 = (oc.f) r6
            rc.l1 r1 = r5.f8297f
            java.lang.Object r1 = r1.A()
            boolean r4 = r1 instanceof rc.o
            if (r4 == 0) goto L3f
            rc.o r1 = (rc.o) r1
            rc.l1 r1 = r1.e
            r5.f8296d = r3
            r6.b(r1, r5)
            return r0
        L3f:
            boolean r3 = r1 instanceof rc.y0
            if (r3 == 0) goto L7b
            rc.y0 r1 = (rc.y0) r1
            rc.m1 r1 = r1.e()
            if (r1 == 0) goto L7b
            java.lang.Object r3 = r1.i()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            jc.i.c(r3, r4)
            wc.k r3 = (wc.k) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L5a:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L7b
            boolean r6 = r1 instanceof rc.o
            if (r6 == 0) goto L76
            rc.o r1 = (rc.o) r1
            rc.l1 r6 = r1.e
            r5.e = r4
            r5.f8294b = r3
            r5.f8295c = r1
            r5.f8296d = r2
            r4.b(r6, r5)
            zb.a r6 = zb.a.f11555a
            return r0
        L76:
            wc.k r1 = r1.j()
            goto L5a
        L7b:
            ub.k r6 = ub.k.f9073a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
