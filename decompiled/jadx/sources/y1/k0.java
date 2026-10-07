package y1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l[] f10469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f10470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f10471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10472d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10473f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l[] f10475s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0 f10476t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b0 f10477u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l[] lVarArr, l0 l0Var, b0 b0Var, yb.d dVar) {
        super(2, dVar);
        this.f10475s = lVarArr;
        this.f10476t = l0Var;
        this.f10477u = b0Var;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        return new k0(this.f10475s, this.f10476t, this.f10477u, dVar);
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((a2.p) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:26:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ac.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            zb.a r0 = zb.a.f11555a
            int r1 = r10.f10474r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L1c
        Lc:
            int r1 = r10.f10473f
            int r4 = r10.e
            int r5 = r10.f10472d
            y1.b0 r6 = r10.f10471c
            y1.l0 r7 = r10.f10470b
            y1.l[] r8 = r10.f10469a
            r7.g.G(r11)
            goto L58
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            r7.g.G(r11)
            y1.l[] r11 = r10.f10475s
            int r1 = r11.length
            r4 = 0
            y1.l0 r5 = r10.f10476t
            y1.b0 r6 = r10.f10477u
            r8 = r11
            r11 = r4
            r7 = r5
        L32:
            if (r4 >= r1) goto L78
            r5 = r8[r4]
            int r9 = r11 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L75
            if (r5 == r3) goto L60
            if (r5 != r2) goto L5a
            r10.f10469a = r8
            r10.f10470b = r7
            r10.f10471c = r6
            r10.f10472d = r9
            r10.e = r4
            r10.f10473f = r1
            r10.f10474r = r2
            java.lang.Object r11 = y1.l0.d(r7, r6, r11, r10)
            if (r11 != r0) goto L57
            goto L74
        L57:
            r5 = r9
        L58:
            r11 = r5
            goto L76
        L5a:
            androidx.datastore.preferences.protobuf.d1 r11 = new androidx.datastore.preferences.protobuf.d1
            r11.<init>()
            throw r11
        L60:
            r10.f10469a = r8
            r10.f10470b = r7
            r10.f10471c = r6
            r10.f10472d = r9
            r10.e = r4
            r10.f10473f = r1
            r10.f10474r = r3
            java.lang.Object r11 = y1.l0.c(r7, r6, r11, r10)
            if (r11 != r0) goto L57
        L74:
            return r0
        L75:
            r11 = r9
        L76:
            int r4 = r4 + r3
            goto L32
        L78:
            ub.k r11 = ub.k.f9073a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
