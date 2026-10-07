package a2;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.InputEvent;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.SettingsActivity;
import com.android.billingclient.api.Purchase;
import h3.a2;
import rc.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, yb.d dVar, int i) {
        super(2, dVar);
        this.f9a = i;
        this.f11c = obj;
        this.f12d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ac.i, ic.p] */
    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f9a) {
            case 0:
                return new e((jc.q) this.f12d, (n) this.e, dVar, 0);
            case 1:
                e eVar = new e((rc.q) this.f12d, (ac.i) this.e, dVar);
                eVar.f11c = obj;
                return eVar;
            case 2:
                return new e((MainActivity) this.f12d, (i3.o) this.e, dVar, 2);
            case 3:
                return new e((a2) this.f11c, (i3.f) this.f12d, (String) this.e, dVar, 3);
            case 4:
                return new e((Purchase) this.f11c, (SettingsActivity) this.f12d, (SharedPreferences) this.e, dVar, 4);
            case 5:
                return new e((v9.n) this.f12d, (SettingsActivity) this.e, dVar, 5);
            case 6:
                return new e((v9.n) this.f11c, (l3.t) this.f12d, (n3.b) this.e, dVar, 6);
            case 7:
                return new e((l3.y) this.f11c, (Purchase) this.f12d, (Context) this.e, dVar, 7);
            case 8:
                return new e((Purchase) this.f11c, (Context) this.f12d, (m3.b) this.e, dVar, 8);
            case 9:
                return new e((r1.a) this.f11c, (Uri) this.f12d, (InputEvent) this.e, dVar, 9);
            default:
                e eVar2 = new e((uc.c) this.f12d, (vc.f) this.e, dVar, 10);
                eVar2.f11c = obj;
                return eVar2;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        yb.d dVar = (yb.d) obj2;
        switch (this.f9a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return ((e) create(a0Var, dVar)).invokeSuspend(ub.k.f9073a);
    }

    /* JADX WARN: Code duplicated, block: B:166:0x039b A[Catch: all -> 0x02d1, TRY_LEAVE, TryCatch #0 {all -> 0x02d1, blocks: (B:123:0x02cb, B:151:0x032d, B:153:0x0335, B:157:0x033e, B:158:0x034d, B:160:0x0351, B:161:0x0360, B:163:0x0368, B:165:0x0373, B:166:0x039b, B:129:0x02da, B:135:0x02f7, B:137:0x02fb, B:140:0x02ff, B:142:0x0305, B:146:0x030e, B:148:0x0320, B:132:0x02e3), top: B:315:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0413  */
    /* JADX WARN: Code duplicated, block: B:199:0x0417  */
    /* JADX WARN: Code duplicated, block: B:200:0x042a  */
    /* JADX WARN: Code duplicated, block: B:202:0x042e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0432  */
    /* JADX WARN: Code duplicated, block: B:210:0x044a  */
    /* JADX WARN: Code duplicated, block: B:212:0x044e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0463  */
    /* JADX WARN: Code duplicated, block: B:215:0x0467  */
    /* JADX WARN: Code duplicated, block: B:217:0x046b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0473  */
    /* JADX WARN: Code duplicated, block: B:220:0x0477  */
    /* JADX WARN: Code duplicated, block: B:335:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0328, code lost:
    
        if (r2 == r4) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
    
        if (r3 == r2) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [ac.i, ic.p] */
    /* JADX WARN: Type inference failed for: r7v0, types: [yb.d] */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, yb.d dVar, int i) {
        super(2, dVar);
        this.f9a = i;
        this.f12d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(rc.q qVar, ic.p pVar, yb.d dVar) {
        super(2, dVar);
        this.f9a = 1;
        this.f12d = qVar;
        this.e = (ac.i) pVar;
    }
}
