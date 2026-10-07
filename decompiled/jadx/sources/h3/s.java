package h3;

import app.namso_gen.spacehowen.FcmService;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4830a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4833d;
    public Serializable e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4834f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a2.l lVar, Map map, s sVar, k3.g gVar, yb.d dVar) {
        super(2, dVar);
        this.f4833d = lVar;
        this.f4832c = map;
        this.e = sVar;
        this.f4834f = gVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f4830a) {
            case 0:
                s sVar = new s((FcmService) this.f4834f, (String) this.e, dVar);
                sVar.f4832c = obj;
                return sVar;
            case 1:
                s sVar2 = new s((nb.b) this.f4834f, dVar);
                sVar2.f4832c = obj;
                return sVar2;
            case 2:
                return new s((a2.l) this.f4833d, this.f4832c, (s) this.e, (k3.g) this.f4834f, dVar);
            default:
                s sVar3 = new s((y1.l0) this.f4833d, (int[]) this.e, (String[]) this.f4834f, dVar);
                sVar3.f4832c = obj;
                return sVar3;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f4830a) {
            case 0:
                return ((s) create((rc.a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 1:
                return ((s) create((JSONObject) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 2:
                return ((s) create((rc.a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            default:
                ((s) create((uc.c) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
                return zb.a.f11555a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:146:0x02e5 A[PHI: r0 r4
      0x02e5: PHI (r0v20 jc.q) = (r0v16 jc.q), (r0v16 jc.q), (r0v22 jc.q) binds: [B:139:0x02c8, B:144:0x02e1, B:102:0x0212] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r4v25 jc.q) = (r4v20 jc.q), (r4v20 jc.q), (r4v32 jc.q) binds: [B:139:0x02c8, B:144:0x02e1, B:102:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:151:0x0302  */
    /* JADX WARN: Code duplicated, block: B:154:0x0307 A[PHI: r0
      0x0307: PHI (r0v23 jc.q) = (r0v20 jc.q), (r0v20 jc.q), (r0v31 jc.q) binds: [B:147:0x02ea, B:152:0x0303, B:101:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x030e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0324  */
    /* JADX WARN: Code duplicated, block: B:163:0x032a  */
    /* JADX WARN: Code duplicated, block: B:165:0x032d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0349  */
    /* JADX WARN: Code duplicated, block: B:171:0x034d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0369  */
    /* JADX WARN: Code duplicated, block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0325, code lost:
    
        if (r0 == r11) goto L176;
     */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.Object, java.util.Map] */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(FcmService fcmService, String str, yb.d dVar) {
        super(2, dVar);
        this.f4834f = fcmService;
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nb.b bVar, yb.d dVar) {
        super(2, dVar);
        this.f4834f = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(y1.l0 l0Var, int[] iArr, String[] strArr, yb.d dVar) {
        super(2, dVar);
        this.f4833d = l0Var;
        this.e = iArr;
        this.f4834f = strArr;
    }
}
