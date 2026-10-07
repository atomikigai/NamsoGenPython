package h3;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4789a;

    public /* synthetic */ o(int i) {
        this.f4789a = i;
    }

    @Override // ic.l
    public final Object invoke(Object obj) throws Exception {
        switch (this.f4789a) {
            case 0:
                Context context = (Context) obj;
                jc.i.e(context, "context");
                LinkedHashSet linkedHashSet = c1.l.f1728a;
                jc.i.e(linkedHashSet, "keysToMigrate");
                return jd.d.D(new b1.c(context, b1.d.f1346a, new a2.y(linkedHashSet, null, 2), new c1.k(3, null)));
            case 1:
                g2.a aVar = (g2.a) obj;
                jc.i.e(aVar, "_connection");
                g2.c cVarR = aVar.R("SELECT * FROM checker_batches WHERE gate = 'GRATIS' ORDER BY createdAt DESC");
                try {
                    int iR = r7.g.r(cVarR, "id");
                    int iR2 = r7.g.r(cVarR, "gate");
                    int iR3 = r7.g.r(cVarR, "content");
                    int iR4 = r7.g.r(cVarR, "total");
                    int iR5 = r7.g.r(cVarR, "createdAt");
                    ArrayList arrayList = new ArrayList();
                    while (cVarR.O()) {
                        arrayList.add(new i3.a((int) cVarR.getLong(iR4), cVarR.getLong(iR), cVarR.getLong(iR5), cVarR.F(iR2), cVarR.F(iR3)));
                    }
                    cVarR.close();
                    return arrayList;
                } catch (Throwable th) {
                    cVarR.close();
                    throw th;
                }
            case 2:
                g2.a aVar2 = (g2.a) obj;
                jc.i.e(aVar2, "_connection");
                g2.c cVarR2 = aVar2.R("SELECT * FROM checker_batches WHERE gate != 'GRATIS' ORDER BY createdAt DESC");
                try {
                    int iR6 = r7.g.r(cVarR2, "id");
                    int iR7 = r7.g.r(cVarR2, "gate");
                    int iR8 = r7.g.r(cVarR2, "content");
                    int iR9 = r7.g.r(cVarR2, "total");
                    int iR10 = r7.g.r(cVarR2, "createdAt");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarR2.O()) {
                        arrayList2.add(new i3.a((int) cVarR2.getLong(iR9), cVarR2.getLong(iR6), cVarR2.getLong(iR10), cVarR2.F(iR7), cVarR2.F(iR8)));
                    }
                    cVarR2.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    cVarR2.close();
                    throw th2;
                }
            case 3:
                g2.a aVar3 = (g2.a) obj;
                jc.i.e(aVar3, "_connection");
                g2.c cVarR3 = aVar3.R("DELETE FROM checker_batches WHERE gate != 'GRATIS'");
                try {
                    cVarR3.O();
                    return ub.k.f9073a;
                } finally {
                    cVarR3.close();
                }
            case 4:
                g2.a aVar4 = (g2.a) obj;
                jc.i.e(aVar4, "_connection");
                g2.c cVarR4 = aVar4.R("DELETE FROM checker_batches WHERE gate = 'GRATIS'");
                try {
                    cVarR4.O();
                    return ub.k.f9073a;
                } finally {
                    cVarR4.close();
                }
            case 5:
                g2.a aVar5 = (g2.a) obj;
                jc.i.e(aVar5, "_connection");
                g2.c cVarR5 = aVar5.R("SELECT * FROM notes ORDER BY createdAt DESC");
                try {
                    int iR11 = r7.g.r(cVarR5, "id");
                    int iR12 = r7.g.r(cVarR5, "content");
                    int iR13 = r7.g.r(cVarR5, "createdAt");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarR5.O()) {
                        arrayList3.add(new i3.f(cVarR5.getLong(iR11), cVarR5.F(iR12), cVarR5.getLong(iR13)));
                    }
                    cVarR5.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    cVarR5.close();
                    throw th3;
                }
            case 6:
                g2.a aVar6 = (g2.a) obj;
                jc.i.e(aVar6, "_connection");
                g2.c cVarR6 = aVar6.R("SELECT * FROM notifications ORDER BY receivedAt DESC");
                try {
                    int iR14 = r7.g.r(cVarR6, "notificationId");
                    int iR15 = r7.g.r(cVarR6, "title");
                    int iR16 = r7.g.r(cVarR6, "body");
                    int iR17 = r7.g.r(cVarR6, "url");
                    int iR18 = r7.g.r(cVarR6, "receivedAt");
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarR6.O()) {
                        arrayList4.add(new i3.o(cVarR6.F(iR14), cVarR6.F(iR15), cVarR6.F(iR16), cVarR6.isNull(iR17) ? null : cVarR6.F(iR17), cVarR6.getLong(iR18)));
                        break;
                    }
                    return arrayList4;
                } finally {
                    cVarR6.close();
                }
            case 7:
                g2.a aVar7 = (g2.a) obj;
                jc.i.e(aVar7, "_connection");
                g2.c cVarR7 = aVar7.R("DELETE FROM notifications");
                try {
                    cVarR7.O();
                    return ub.k.f9073a;
                } finally {
                    cVarR7.close();
                }
            case 8:
                g2.a aVar8 = (g2.a) obj;
                jc.i.e(aVar8, "_connection");
                g2.c cVarR8 = aVar8.R("SELECT * FROM temp_mail_history ORDER BY createdAt DESC");
                try {
                    int iR19 = r7.g.r(cVarR8, "email");
                    int iR20 = r7.g.r(cVarR8, "createdAt");
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarR8.O()) {
                        arrayList5.add(new i3.q(cVarR8.F(iR19), cVarR8.getLong(iR20)));
                    }
                    cVarR8.close();
                    return arrayList5;
                } catch (Throwable th4) {
                    cVarR8.close();
                    throw th4;
                }
            case 9:
                n3.c cVar = (n3.c) obj;
                jc.i.e(cVar, "it");
                String str = cVar.f7250f;
                return str != null ? str : "zz";
            case 10:
                jc.i.e((n3.c) obj, "it");
                return 0L;
            case 11:
                jc.i.e((l3.b1) obj, "row");
                return ub.k.f9073a;
            case 12:
                l3.b1 b1Var = (l3.b1) obj;
                jc.i.e(b1Var, "it");
                return Boolean.valueOf(b1Var.f6524b != 2);
            case 13:
                l3.b1 b1Var2 = (l3.b1) obj;
                jc.i.e(b1Var2, "it");
                return Long.valueOf(b1Var2.f6525c);
            case 14:
                l3.b1 b1Var3 = (l3.b1) obj;
                jc.i.e(b1Var3, "it");
                StringBuilder sb2 = new StringBuilder();
                n3.c cVar2 = b1Var3.f6523a;
                sb2.append(cVar2.f7247b);
                sb2.append(':');
                sb2.append(cVar2.f7248c);
                sb2.append(" país=");
                sb2.append(cVar2.f7250f);
                sb2.append(" v=");
                sb2.append(cVar2.i);
                return sb2.toString();
            case 15:
                l3.b1 b1Var4 = (l3.b1) obj;
                jc.i.e(b1Var4, "it");
                return b1Var4.a();
            case 16:
                return ((n3.g) obj).f7263g;
            case 17:
                n3.f fVar = (n3.f) obj;
                jc.i.e(fVar, "it");
                return fVar.f7256b + '@' + fVar.f7255a;
            case 18:
                g2.c cVar3 = (g2.c) obj;
                jc.i.e(cVar3, "it");
                return Boolean.valueOf(cVar3.O());
            default:
                g2.c cVar4 = (g2.c) obj;
                jc.i.e(cVar4, "statement");
                wb.i iVar = new wb.i();
                while (cVar4.O()) {
                    iVar.add(Integer.valueOf((int) cVar4.getLong(0)));
                }
                return n9.b.b(iVar);
        }
    }

    public /* synthetic */ o(jc.o oVar, l3.a1 a1Var, androidx.fragment.app.w wVar, ArrayList arrayList, jc.o oVar2, g.f fVar, ic.a aVar) {
        this.f4789a = 11;
    }
}
