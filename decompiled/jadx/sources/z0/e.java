package z0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f10871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b1.c f10872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10874d;
    public /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f10875f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10876r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, ArrayList arrayList, yb.d dVar) {
        super(2, dVar);
        this.f10875f = list;
        this.f10876r = arrayList;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        e eVar = new e(this.f10875f, this.f10876r, dVar);
        eVar.e = obj;
        return eVar;
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
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
            int r1 = r10.f10874d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r10.f10871a
            java.lang.Object r4 = r10.e
            java.util.List r4 = (java.util.List) r4
            r7.g.G(r11)
            goto L3c
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r1 = r10.f10873c
            b1.c r4 = r10.f10872b
            java.util.Iterator r5 = r10.f10871a
            java.lang.Object r6 = r10.e
            java.util.List r6 = (java.util.List) r6
            r7.g.G(r11)
            r9 = r6
            r6 = r4
            r4 = r9
            goto L5e
        L2f:
            r7.g.G(r11)
            java.lang.Object r11 = r10.e
            java.util.List r1 = r10.f10875f
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r10.f10876r
        L3c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L95
            java.lang.Object r5 = r1.next()
            b1.c r5 = (b1.c) r5
            r10.e = r4
            r10.f10871a = r1
            r10.f10872b = r5
            r10.f10873c = r11
            r10.f10874d = r3
            java.lang.Object r6 = r5.a(r11, r10)
            if (r6 != r0) goto L59
            goto L90
        L59:
            r9 = r1
            r1 = r11
            r11 = r6
            r6 = r5
            r5 = r9
        L5e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L93
            z0.d r11 = new z0.d
            r7 = 0
            r11.<init>(r6, r7)
            r4.add(r11)
            r10.e = r4
            r10.f10871a = r5
            r10.f10872b = r7
            r10.f10873c = r7
            r10.f10874d = r2
            c1.k r11 = r6.f1343b
            b1.e r7 = new b1.e
            ub.i r8 = r6.f1345d
            java.lang.Object r8 = r8.getValue()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.util.Set r6 = r6.e
            r7.<init>(r8, r6)
            java.lang.Object r11 = r11.b(r7, r1, r10)
            if (r11 != r0) goto L91
        L90:
            return r0
        L91:
            r1 = r5
            goto L3c
        L93:
            r11 = r1
            goto L91
        L95:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
