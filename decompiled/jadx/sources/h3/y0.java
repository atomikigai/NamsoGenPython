package h3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f4902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4904d;
    public final /* synthetic */ ic.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(e1 e1Var, String str, boolean z4, ic.a aVar, yb.d dVar) {
        super(2, dVar);
        this.f4902b = e1Var;
        this.f4903c = str;
        this.f4904d = z4;
        this.e = aVar;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        return new y0(this.f4902b, this.f4903c, this.f4904d, this.e, dVar);
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((rc.a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.json.JSONException {
        /*
            r7 = this;
            zb.a r0 = zb.a.f11555a
            int r1 = r7.f4901a
            r2 = 2
            r3 = 1
            h3.e1 r4 = r7.f4902b
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            r7.g.G(r8)
            goto L37
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            r7.g.G(r8)
            goto L2a
        L1e:
            r7.g.G(r8)
            r7.f4901a = r3
            java.lang.Object r8 = r4.j0(r7)
            if (r8 != r0) goto L2a
            goto L36
        L2a:
            java.lang.String r8 = (java.lang.String) r8
            k3.e r1 = k3.e.f5930a
            r7.f4901a = r2
            java.lang.Object r8 = r1.c(r8, r3, r7)
            if (r8 != r0) goto L37
        L36:
            return r0
        L37:
            java.lang.Integer r8 = (java.lang.Integer) r8
            r0 = 0
            if (r8 == 0) goto L43
            int r1 = r8.intValue()
            if (r1 < 0) goto L43
            goto L44
        L43:
            r8 = r0
        L44:
            r1 = 0
            r2 = 2131951934(0x7f13013e, float:1.9540297E38)
            if (r8 == 0) goto La1
            r4.u0()
            androidx.fragment.app.w r5 = r4.g()
            boolean r6 = r5 instanceof app.namso_gen.spacehowen.MainActivity
            if (r6 == 0) goto L58
            r0 = r5
            app.namso_gen.spacehowen.MainActivity r0 = (app.namso_gen.spacehowen.MainActivity) r0
        L58:
            if (r0 == 0) goto L5d
            r0.x()
        L5d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Coin descontado (per_card): "
            r0.<init>(r5)
            java.lang.String r5 = r7.f4903c
            r0.append(r5)
            java.lang.String r5 = ". Saldo restante: "
            r0.append(r5)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "Coins"
            android.util.Log.d(r5, r0)
            int r8 = r8.intValue()
            if (r8 != 0) goto Lb8
            boolean r8 = r7.f4904d
            if (r8 == 0) goto Lb8
            r4.f4675p0 = r3
            r4.r0()
            r4.k0()
            android.content.Context r8 = r4.U()
            java.lang.String r0 = r4.v(r2)
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r1)
            r8.show()
            java.lang.String r8 = "Modo per_card: saldo agotado, lote detenido"
            android.util.Log.d(r5, r8)
            goto Lb8
        La1:
            r4.f4675p0 = r3
            r4.r0()
            r4.k0()
            android.content.Context r8 = r4.U()
            java.lang.String r0 = r4.v(r2)
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r1)
            r8.show()
        Lb8:
            ic.a r8 = r7.e
            r8.a()
            ub.k r8 = ub.k.f9073a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
